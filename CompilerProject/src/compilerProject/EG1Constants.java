/* Generated By:JavaCC: Do not edit this line. EG1Constants.java */
package compilerProject;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface EG1Constants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int OPENCOM = 6;
  /** RegularExpression Id. */
  int CLOSECOM = 7;
  /** RegularExpression Id. */
  int ADD = 8;
  /** RegularExpression Id. */
  int SUB = 9;
  /** RegularExpression Id. */
  int MUL = 10;
  /** RegularExpression Id. */
  int DIV = 11;
  /** RegularExpression Id. */
  int MOD = 12;
  /** RegularExpression Id. */
  int EXP = 13;
  /** RegularExpression Id. */
  int EQU = 14;
  /** RegularExpression Id. */
  int AND = 15;
  /** RegularExpression Id. */
  int OR = 16;
  /** RegularExpression Id. */
  int NOT = 17;
  /** RegularExpression Id. */
  int NUMBER = 18;
  /** RegularExpression Id. */
  int LOGIC_CONSTANT = 19;
  /** RegularExpression Id. */
  int DIGIT = 20;
  /** RegularExpression Id. */
  int GREATERTHAN = 21;
  /** RegularExpression Id. */
  int LESSERTHAN = 22;
  /** RegularExpression Id. */
  int LESSERTHANEQUAL = 23;
  /** RegularExpression Id. */
  int GREATERTHANEQUAL = 24;
  /** RegularExpression Id. */
  int EQUAL = 25;
  /** RegularExpression Id. */
  int NOTEQUAL = 26;
  /** RegularExpression Id. */
  int IF = 27;
  /** RegularExpression Id. */
  int THEN = 28;
  /** RegularExpression Id. */
  int FOR = 29;
  /** RegularExpression Id. */
  int ELSE = 30;
  /** RegularExpression Id. */
  int INPUT = 31;
  /** RegularExpression Id. */
  int PRINT = 32;
  /** RegularExpression Id. */
  int DELIM = 33;
  /** RegularExpression Id. */
  int OPENPAR = 34;
  /** RegularExpression Id. */
  int CLOSEPAR = 35;
  /** RegularExpression Id. */
  int VARIABLE = 36;
  /** RegularExpression Id. */
  int LETTER = 37;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"(?:#.(?:[^*]|(?:\\\\*+[^*/]))*.#)\"",
    "\"#.\"",
    "\".#\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"^\"",
    "\"=\"",
    "\"&&\"",
    "\"||\"",
    "\"!\"",
    "<NUMBER>",
    "<LOGIC_CONSTANT>",
    "<DIGIT>",
    "\">\"",
    "\"<\"",
    "\"<=\"",
    "\">=\"",
    "\"==\"",
    "\"!=\"",
    "\"if\"",
    "\"then\"",
    "\"for\"",
    "\"else\"",
    "\"input\"",
    "\"print\"",
    "\";\"",
    "\"(\"",
    "\")\"",
    "<VARIABLE>",
    "<LETTER>",
  };

}
