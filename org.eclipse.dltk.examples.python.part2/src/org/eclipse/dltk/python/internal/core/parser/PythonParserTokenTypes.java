/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
// $ANTLR : "python.g" -> "PythonLexer.java"$
 package org.eclipse.dltk.python.internal.core.parser;
  
public interface PythonParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int NEWLINE = 4;
	int LITERAL_def = 5;
	int NAME = 6;
	int COLON = 7;
	int LPAREN = 8;
	int RPAREN = 9;
	int COMMA = 10;
	int STAR = 11;
	int DOUBLESTAR = 12;
	int ASSIGN = 13;
	int SEMI = 14;
	int PLUSEQUAL = 15;
	int MINUSEQUAL = 16;
	int STAREQUAL = 17;
	int SLASHEQUAL = 18;
	int PERCENTEQUAL = 19;
	int AMPEREQUAL = 20;
	int VBAREQUAL = 21;
	int CIRCUMFLEXEQUAL = 22;
	int LEFTSHIFTEQUAL = 23;
	int RIGHTSHIFTEQUAL = 24;
	int DOUBLESTAREQUAL = 25;
	int DOUBLESLASHEQUAL = 26;
	int LITERAL_print = 27;
	int RIGHTSHIFT = 28;
	int LITERAL_del = 29;
	int LITERAL_pass = 30;
	int LITERAL_break = 31;
	int LITERAL_continue = 32;
	int LITERAL_return = 33;
	int LITERAL_yield = 34;
	int LITERAL_raise = 35;
	int LITERAL_import = 36;
	int LITERAL_from = 37;
	int DOT = 38;
	int LITERAL_global = 39;
	int LITERAL_exec = 40;
	int LITERAL_in = 41;
	int LITERAL_assert = 42;
	int LITERAL_if = 43;
	int LITERAL_elif = 44;
	int LITERAL_else = 45;
	int LITERAL_while = 46;
	int LITERAL_for = 47;
	int LITERAL_try = 48;
	int LITERAL_finally = 49;
	int LITERAL_except = 50;
	int INDENT = 51;
	int DEDENT = 52;
	int LITERAL_or = 53;
	int LITERAL_and = 54;
	int LITERAL_not = 55;
	int LESS = 56;
	int GREATER = 57;
	int EQUAL = 58;
	int GREATEREQUAL = 59;
	int LESSEQUAL = 60;
	int ALT_NOTEQUAL = 61;
	int NOTEQUAL = 62;
	int LITERAL_is = 63;
	int VBAR = 64;
	int CIRCUMFLEX = 65;
	int AMPER = 66;
	int LEFTSHIFT = 67;
	int PLUS = 68;
	int MINUS = 69;
	int SLASH = 70;
	int PERCENT = 71;
	int DOUBLESLASH = 72;
	int TILDE = 73;
	int LBRACK = 74;
	int RBRACK = 75;
	int LCURLY = 76;
	int RCURLY = 77;
	int BACKQUOTE = 78;
	int INT = 79;
	int LONGINT = 80;
	int FLOAT = 81;
	int COMPLEX = 82;
	int STRING = 83;
	int LITERAL_lambda = 84;
	int LITERAL_class = 85;
	int NUMBER = 86;
	int Int = 87;
	int NonZeroDigit = 88;
	int FloatTrailer = 89;
	int Exponent = 90;
	int Name = 91;
	int STRING_OR_NAME = 92;
	int String = 93;
	int ESC = 94;
	int CONTINUED_LINE = 95;
	int LEADING_WS = 96;
	int COMMENT = 97;
	int SPECIAL = 98;
	int WS = 99;
}
