package org.eclipse.dltk.examples.python.internal.ui.editor.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

import java.io.*;
import org.yaml.snakeyaml.Yaml;




public class ExamplePythonCodeScanner extends AbstractScriptScanner {
//    FileInputStream in = null;
    Yaml yaml = new Yaml();
	List<String> fgKeywords = new ArrayList<String>();
    {	
		try { 
			Map<String, ArrayList <String>> values = (Map<String, ArrayList<String>>) yaml.load(new FileInputStream(new File("/home/shayaan/work/org.eclipse.dltk.examples/eclipsecon08/org.eclipse.dltk.examples.python.part3/src/org/eclipse/dltk/examples/python/internal/ui/editor/text/config.yaml")));
			/*in = new FileInputStream("/home/shayaan/work/org.eclipse.dltk.examples/eclipsecon08/org.eclipse.dltk.examples.python.part3/src/org/eclipse/dltk/examples/python/internal/ui/editor/text/input.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null)   {
				System.out.println(strLine);
			  fgKeywords.add(strLine);
			}*/
			for (String key : values.keySet()) {
				fgKeywords = values.get(key);
			}
		}
		
		catch(FileNotFoundException f){
    	   f.printStackTrace();
    	}
		catch(IOException ex){
	        System.out.println (ex.toString());
		}
	}
	
//	private static String[] fgKeywords = { "and", "del", "for", "is", "raise",
//			"assert", "elif", "from", "lambda", "break", "else", "global",
//			"not", "try", "class", "except", "if", "or", "while", "continue",
//			"exec", "import", "pass", "yield", "def", "finally", "in", "print",
//			"self", "return" };
	
	
	
	private static String fgTokenProperties[] = new String[] {
			IExamplePythonColorConstants.PYTHON_COMMENT,
			IExamplePythonColorConstants.PYTHON_DEFAULT,
			IExamplePythonColorConstants.PYTHON_KEYWORD };

	public ExamplePythonCodeScanner(IColorManager manager, IPreferenceStore store) {
		super(manager, store);
		this.initialize();
	}

	protected String[] getTokenProperties() {
		return fgTokenProperties;
	}

	protected List createRules() {
		List rules = new ArrayList ();
		IToken keyword = this.getToken(IExamplePythonColorConstants.PYTHON_KEYWORD);
		IToken comment = this.getToken(IExamplePythonColorConstants.PYTHON_COMMENT);
		IToken other = this.getToken(IExamplePythonColorConstants.PYTHON_DEFAULT);
	
		rules.add(new EndOfLineRule("#", comment));
	
		rules.add(new WhitespaceRule(new ExamplePythonWhitespaceDetector()));
		
		WordRule wordRule = new WordRule(new ExamplePythonWordDetector(), other);
		for (int i = 0; i < fgKeywords.size(); i++) {
			wordRule.addWord(fgKeywords.get(i), keyword);
		}
		rules.add(wordRule);
		this.setDefaultReturnToken(other);
		return rules;
	}
	public class ExamplePythonWhitespaceDetector implements IWhitespaceDetector {
		public boolean isWhitespace(char character) {
			return Character.isWhitespace(character);
		}
	}
	public class ExamplePythonWordDetector implements IWordDetector {
		public boolean isWordPart(char character) {
			return Character.isJavaIdentifierPart(character);
		}
		public boolean isWordStart(char character) {
			return Character.isJavaIdentifierStart(character);
		}
	}
}
