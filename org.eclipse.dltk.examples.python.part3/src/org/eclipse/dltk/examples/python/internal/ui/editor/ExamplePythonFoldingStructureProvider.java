/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.eclipse.dltk.examples.python.internal.ui.editor;

import org.eclipse.core.runtime.ILog;
import org.eclipse.dltk.examples.internal.python.core.ExamplePythonNature;
import org.eclipse.dltk.examples.python.internal.ExamplePythonUI;
import org.eclipse.dltk.ui.text.folding.AbstractASTFoldingStructureProvider;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;

public class ExamplePythonFoldingStructureProvider extends
		AbstractASTFoldingStructureProvider {

	public String getCommentPartition() {
		return IExamplePythonPartitions.PYTHON_COMMENT;
	}

	protected ILog getLog() {
		return ExamplePythonUI.getDefault().getLog();
	}

	protected String getPartition() {
		return IExamplePythonPartitions.PYTHON_PARTITIONING;
	}

	protected IPartitionTokenScanner getPartitionScanner() {
		return ExamplePythonUI.getDefault().getTextTools()
				.getPartitionScanner();
	}

	protected String[] getPartitionTypes() {
		return IExamplePythonPartitions.PYTHON_PARITION_TYPES;
	}

	protected String getNatureId() {
		return ExamplePythonNature.PYTHON_NATURE;
	}
}
