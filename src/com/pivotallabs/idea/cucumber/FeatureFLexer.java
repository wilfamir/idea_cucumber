/* The following code was generated by JFlex 1.4.1 on 4/27/09 10:04 PM */

package com.pivotallabs.idea.cucumber;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.pivotallabs.idea.cucumber.FeatureTokenTypes;


/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 4/27/09 10:04 PM from the specification file
 * <tt>cucumber.flex</tt>
 */
final class FeatureFlexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 1;
  public static final int YYINITIAL = 0;

  /**
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED =
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\26\1\0\1\43"+
    "\1\4\14\0\1\5\11\6\7\0\1\42\1\15\2\0\1\31\1\7"+
    "\1\36\7\0\1\27\3\0\1\24\1\40\7\0\1\44\4\0\1\11"+
    "\1\0\1\16\1\23\1\10\1\0\1\20\1\41\1\25\1\0\1\17"+
    "\1\30\1\33\1\22\1\21\1\34\1\0\1\14\1\35\1\12\1\13"+
    "\1\37\1\0\1\32\uff87\0";

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\1\2\3\7\1\1\4\1\5"+
    "\1\6\1\7\11\0\1\10\1\11\1\12\1\13\2\0"+
    "\1\14\4\0\1\15\5\0\1\16\4\0\1\17\4\0"+
    "\1\20\4\0\1\21\1\22\2\0\1\23\1\24\6\0"+
    "\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[73];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\112\0\157\0\112\0\224\0\112\0\271"+
    "\0\336\0\u0103\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\112"+
    "\0\u01e1\0\112\0\u0206\0\224\0\u022b\0\u0250\0\u0275\0\u029a"+
    "\0\u02bf\0\u02e4\0\u0309\0\u032e\0\112\0\112\0\112\0\112"+
    "\0\u0353\0\u0378\0\112\0\u039d\0\u03c2\0\u03e7\0\u040c\0\112"+
    "\0\u0431\0\u0456\0\u047b\0\u04a0\0\u04c5\0\112\0\u04ea\0\u050f"+
    "\0\u0534\0\u0559\0\112\0\u057e\0\u05a3\0\u05c8\0\u05ed\0\112"+
    "\0\u0612\0\u0637\0\u065c\0\u0681\0\u06a6\0\112\0\u06cb\0\u06f0"+
    "\0\112\0\112\0\u0715\0\u073a\0\u075f\0\u0784\0\u07a9\0\u07ce"+
    "\0\112";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[73];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\11\5\3"+
    "\1\12\6\3\1\13\1\3\1\5\2\3\1\14\4\3"+
    "\1\15\1\3\1\16\1\3\1\17\1\20\1\3\1\21"+
    "\2\3\40\21\1\22\1\23\47\0\1\5\42\0\1\24"+
    "\1\4\1\5\42\24\5\0\2\10\46\0\1\25\45\0"+
    "\1\26\1\0\1\27\47\0\1\30\60\0\1\31\37\0"+
    "\1\32\60\0\1\33\25\0\1\34\22\0\1\21\2\0"+
    "\40\21\14\0\1\35\1\0\1\36\5\0\1\37\20\0"+
    "\1\40\12\0\1\41\51\0\1\42\40\0\1\43\42\0"+
    "\1\44\45\0\1\45\72\0\1\46\15\0\1\47\57\0"+
    "\1\50\33\0\1\51\51\0\1\52\47\0\1\53\55\0"+
    "\1\54\21\0\1\55\56\0\1\56\35\0\1\57\51\0"+
    "\1\60\35\0\1\61\67\0\1\62\32\0\1\63\36\0"+
    "\1\64\44\0\1\65\44\0\1\66\60\0\1\67\24\0"+
    "\1\70\55\0\1\71\50\0\1\72\27\0\1\73\47\0"+
    "\1\74\52\0\1\75\60\0\1\76\31\0\1\77\50\0"+
    "\1\100\6\0\1\101\32\0\1\102\50\0\1\103\30\0"+
    "\1\104\43\0\1\105\62\0\1\106\41\0\1\107\41\0"+
    "\1\110\32\0\1\111\34\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2035];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\1\1\1\11\10\1\1\11"+
    "\1\1\1\11\1\1\11\0\4\11\2\0\1\11\4\0"+
    "\1\11\5\0\1\11\4\0\1\11\4\0\1\11\4\0"+
    "\1\1\1\11\2\0\2\11\6\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[73];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private int braceCounter = 0;

  StringBuffer string = new StringBuffer();
                          
  FeatureFlexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  FeatureFlexLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /**
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 108) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  // For Demetra compatibility
  public void reset(CharSequence buffer, int initialState){
    zzBuffer = buffer;
    zzBufferArray = null;
    zzCurrentPos = zzMarkedPos = zzStartRead = 0;
    zzPushbackPos = 0;
    zzAtEOF = false;
    zzAtBOL = true;
    zzEndRead = buffer.length();
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = zzLexicalState;


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15:
          { return FeatureTokenTypes.GIVEN;
          }
        case 22: break;
        case 20:
          { return FeatureTokenTypes.BACKGROUND;
          }
        case 23: break;
        case 10:
          { string.append('\n');
          }
        case 24: break;
        case 5:
          { string.append( yytext() );
          }
        case 25: break;
        case 12:
          { return FeatureTokenTypes.BUT;
          }
        case 26: break;
        case 17:
          { return FeatureTokenTypes.SCENARIO;
          }
        case 27: break;
        case 21:
          { return FeatureTokenTypes.SCENARIO_OUTLINE;
          }
        case 28: break;
        case 7:
          { string.append('\\');
          }
        case 29: break;
        case 14:
          { return FeatureTokenTypes.THEN;
          }
        case 30: break;
        case 16:
          { return FeatureTokenTypes.FEATURE;
          }
        case 31: break;
        case 4:
          { string.setLength(0); yybegin(STRING);
          }
        case 32: break;
        case 1:
          { throw new Error("Illegal character <"+
                                                    yytext()+">");
          }
        case 33: break;
        case 9:
          { string.append('\r');
          }
        case 34: break;
        case 18:
          { return FeatureTokenTypes.EXAMPLES;
          }
        case 35: break;
        case 6:
          { yybegin(YYINITIAL);
                                   return FeatureTokenTypes.STRING_LITERAL;
          }
        case 36: break;
        case 11:
          { string.append('\"');
          }
        case 37: break;
        case 13:
          { return FeatureTokenTypes.AND;
          }
        case 38: break;
        case 19:
          { return FeatureTokenTypes.SCENARIOS;
          }
        case 39: break;
        case 3:
          { return FeatureTokenTypes.INTEGER_LITERAL;
          }
        case 40: break;
        case 2:
          { /* ignore */
          }
        case 41: break;
        case 8:
          { string.append('\t');
          }
        case 42: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}