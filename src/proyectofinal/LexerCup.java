/* The following code was generated by JFlex 1.4.3 on 15/12/24, 6:34 */

package proyectofinal;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 15/12/24, 6:34 from the specification file
 * <tt>/home/mbapeint/Documentos/Netbeans Projects/ProyectoFinal/src/proyectofinal/entradaCup.jflex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  4,  0,  3,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 32, 48,  0,  0, 37, 30,  0, 38, 39,  6, 35, 46, 36, 45,  5, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 47, 44, 34, 33, 34,  0, 
    50,  8, 26, 23, 25, 14, 21, 20, 24,  9,  1, 27, 19,  7, 10, 15, 
    17,  1, 18, 11, 13, 16, 29, 22, 28, 12,  1, 42, 49, 43,  0,  1, 
     0,  8, 26, 23, 25, 14, 21, 20, 24,  9,  1, 27, 19,  7, 10, 15, 
    17,  1, 18, 11, 13, 16, 29, 22, 28, 12,  1, 40, 31, 41,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\5\21\1\2\0"+
    "\1\6\1\7\1\10\3\5\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\3\0\1\23"+
    "\1\0\1\7\4\1\1\24\32\1\1\25\4\1\1\26"+
    "\1\27\1\10\1\30\1\31\1\32\2\0\1\33\1\0"+
    "\3\1\1\34\1\35\7\1\1\36\3\1\1\37\6\1"+
    "\1\40\15\1\2\0\1\41\1\42\1\43\2\1\1\44"+
    "\6\1\1\45\1\46\6\1\1\47\3\1\1\50\3\1"+
    "\1\51\2\1\1\52\2\1\1\53\1\54\1\0\6\1"+
    "\1\55\1\1\1\56\2\1\1\57\4\1\1\60\1\61"+
    "\1\62\1\1\1\63\3\1\1\64\1\0\3\1\1\65"+
    "\1\66\1\67\1\70\1\1\1\71\2\1\1\72\1\73"+
    "\3\1\1\74\1\1\1\0\2\1\1\75\1\76\1\77"+
    "\1\100\1\101\1\1\1\102\1\103\1\0\2\1\1\104"+
    "\1\0\1\1\1\105\1\106\1\107";

  private static int [] zzUnpackAction() {
    int [] result = new int[234];
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
    "\0\0\0\63\0\146\0\231\0\231\0\314\0\377\0\u0132"+
    "\0\u0165\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297\0\u02ca"+
    "\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\u042f\0\u0462"+
    "\0\u0495\0\u04c8\0\u04fb\0\u04fb\0\u04fb\0\u052e\0\u0561\0\231"+
    "\0\231\0\231\0\231\0\231\0\231\0\231\0\231\0\231"+
    "\0\231\0\231\0\u0594\0\u05c7\0\u05fa\0\u062d\0\u0660\0\231"+
    "\0\u0693\0\u06c6\0\u06f9\0\u072c\0\63\0\u075f\0\u0792\0\u07c5"+
    "\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7\0\u092a\0\u095d"+
    "\0\u0990\0\u09c3\0\u09f6\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5"+
    "\0\u0b28\0\u0b5b\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27\0\u0c5a\0\u0c8d"+
    "\0\u0cc0\0\u0cf3\0\u0d26\0\u0d59\0\231\0\231\0\231\0\231"+
    "\0\u0d8c\0\231\0\u0dbf\0\u0df2\0\u05fa\0\u0e25\0\u0e58\0\u0e8b"+
    "\0\u0ebe\0\u0ef1\0\63\0\u0f24\0\u0f57\0\u0f8a\0\u0fbd\0\u0ff0"+
    "\0\u1023\0\u1056\0\63\0\u1089\0\u10bc\0\u10ef\0\63\0\u1122"+
    "\0\u1155\0\u1188\0\u11bb\0\u11ee\0\u1221\0\63\0\u1254\0\u1287"+
    "\0\u12ba\0\u12ed\0\u1320\0\u1353\0\u1386\0\u13b9\0\u13ec\0\u141f"+
    "\0\u1452\0\u1485\0\u14b8\0\u14eb\0\u151e\0\231\0\63\0\63"+
    "\0\u1551\0\u1584\0\63\0\u15b7\0\u15ea\0\u161d\0\u1650\0\u1683"+
    "\0\u16b6\0\63\0\63\0\u16e9\0\u171c\0\u174f\0\u1782\0\u17b5"+
    "\0\u17e8\0\63\0\u181b\0\u184e\0\u1881\0\63\0\u18b4\0\u18e7"+
    "\0\u191a\0\63\0\u194d\0\u1980\0\63\0\u19b3\0\u19e6\0\63"+
    "\0\u14eb\0\u1a19\0\u1a4c\0\u1a7f\0\u1ab2\0\u1ae5\0\u1b18\0\u1b4b"+
    "\0\63\0\u1b7e\0\63\0\u1bb1\0\u1be4\0\u1c17\0\u1c4a\0\u1c7d"+
    "\0\u1cb0\0\u1ce3\0\63\0\63\0\63\0\u1d16\0\63\0\u1d49"+
    "\0\u1d7c\0\u1daf\0\63\0\u1de2\0\u1e15\0\u1e48\0\u1e7b\0\63"+
    "\0\63\0\63\0\63\0\u1eae\0\63\0\u1ee1\0\u1f14\0\63"+
    "\0\63\0\u1f47\0\u1f7a\0\u1fad\0\63\0\u1fe0\0\u2013\0\u2046"+
    "\0\u2079\0\63\0\63\0\63\0\63\0\63\0\u20ac\0\63"+
    "\0\63\0\u20df\0\u2112\0\u2145\0\63\0\u2178\0\u21ab\0\63"+
    "\0\231\0\63";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[234];
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
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\2\1\15\1\16\1\17"+
    "\1\2\1\20\1\21\1\22\1\2\1\23\1\24\1\25"+
    "\1\2\1\26\1\27\2\2\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\0\1\54\1\0\2\2\4\0\27\2\27\0\1\3"+
    "\52\0\1\55\75\0\1\56\1\57\32\0\1\60\62\0"+
    "\1\60\22\0\2\2\4\0\1\2\1\61\25\2\26\0"+
    "\2\2\4\0\13\2\1\62\13\2\26\0\2\2\4\0"+
    "\1\63\2\2\1\64\12\2\1\65\10\2\26\0\2\2"+
    "\4\0\7\2\1\66\1\2\1\67\15\2\26\0\2\2"+
    "\4\0\5\2\1\70\1\71\2\2\1\72\5\2\1\73"+
    "\1\2\1\74\5\2\26\0\2\2\4\0\13\2\1\75"+
    "\5\2\1\76\5\2\26\0\2\2\4\0\14\2\1\77"+
    "\10\2\1\100\1\2\26\0\2\2\4\0\11\2\1\101"+
    "\15\2\26\0\2\2\4\0\11\2\1\102\1\2\1\103"+
    "\13\2\26\0\2\2\4\0\7\2\1\104\17\2\26\0"+
    "\2\2\4\0\7\2\1\105\1\106\16\2\26\0\2\2"+
    "\4\0\2\2\1\107\5\2\1\110\3\2\1\111\12\2"+
    "\26\0\2\2\4\0\21\2\1\112\5\2\26\0\2\2"+
    "\4\0\1\2\1\113\6\2\1\114\3\2\1\115\4\2"+
    "\1\116\5\2\26\0\2\2\4\0\7\2\1\117\1\120"+
    "\16\2\26\0\2\2\4\0\5\2\1\121\2\2\1\122"+
    "\2\2\1\123\13\2\26\0\2\2\4\0\10\2\1\124"+
    "\16\2\63\0\1\125\63\0\1\126\64\0\1\127\62\0"+
    "\1\60\1\0\1\130\21\0\1\131\36\0\1\60\2\0"+
    "\1\130\16\0\60\53\1\132\1\133\1\53\17\0\1\134"+
    "\45\0\1\135\60\0\4\56\1\0\56\56\6\57\1\136"+
    "\54\57\1\0\2\2\4\0\2\2\1\137\24\2\26\0"+
    "\2\2\4\0\15\2\1\140\11\2\26\0\2\2\4\0"+
    "\12\2\1\141\14\2\26\0\2\2\4\0\6\2\1\142"+
    "\20\2\26\0\2\2\4\0\17\2\1\143\7\2\26\0"+
    "\2\2\4\0\14\2\1\144\12\2\26\0\2\2\4\0"+
    "\4\2\1\145\22\2\26\0\2\2\4\0\1\2\1\146"+
    "\11\2\1\147\13\2\26\0\2\2\4\0\12\2\1\150"+
    "\14\2\26\0\2\2\4\0\2\2\1\151\24\2\26\0"+
    "\2\2\4\0\10\2\1\152\16\2\26\0\2\2\4\0"+
    "\5\2\1\153\21\2\26\0\2\2\4\0\2\2\1\154"+
    "\24\2\26\0\2\2\4\0\4\2\1\155\22\2\26\0"+
    "\2\2\4\0\6\2\1\156\20\2\26\0\2\2\4\0"+
    "\6\2\1\157\20\2\26\0\2\2\4\0\23\2\1\160"+
    "\3\2\26\0\2\2\4\0\2\2\1\161\24\2\26\0"+
    "\2\2\4\0\6\2\1\162\20\2\26\0\2\2\4\0"+
    "\3\2\1\163\23\2\26\0\2\2\4\0\3\2\1\164"+
    "\23\2\26\0\2\2\4\0\3\2\1\165\23\2\26\0"+
    "\2\2\4\0\13\2\1\166\13\2\26\0\2\2\4\0"+
    "\10\2\1\167\16\2\26\0\2\2\4\0\2\2\1\170"+
    "\24\2\26\0\2\2\4\0\4\2\1\171\1\2\1\172"+
    "\20\2\26\0\2\2\4\0\3\2\1\173\23\2\26\0"+
    "\2\2\4\0\1\2\1\174\25\2\26\0\2\2\4\0"+
    "\1\2\1\175\25\2\26\0\2\2\4\0\16\2\1\176"+
    "\10\2\26\0\2\2\4\0\11\2\1\177\15\2\26\0"+
    "\2\2\4\0\6\2\1\200\20\2\26\0\2\2\4\0"+
    "\10\2\1\201\16\2\26\0\2\2\4\0\7\2\1\202"+
    "\17\2\26\0\2\2\4\0\2\2\1\203\24\2\27\0"+
    "\1\131\52\0\1\204\5\0\4\53\1\0\56\53\35\0"+
    "\1\205\25\0\5\57\1\206\1\136\54\57\1\0\2\2"+
    "\4\0\3\2\1\207\23\2\26\0\2\2\4\0\4\2"+
    "\1\210\22\2\26\0\2\2\4\0\14\2\1\211\12\2"+
    "\26\0\2\2\4\0\7\2\1\212\17\2\26\0\2\2"+
    "\4\0\14\2\1\213\12\2\26\0\2\2\4\0\6\2"+
    "\1\214\20\2\26\0\2\2\4\0\6\2\1\215\20\2"+
    "\26\0\2\2\4\0\2\2\1\216\24\2\26\0\2\2"+
    "\4\0\7\2\1\217\17\2\26\0\2\2\4\0\6\2"+
    "\1\220\20\2\26\0\2\2\4\0\13\2\1\221\13\2"+
    "\26\0\2\2\4\0\4\2\1\222\22\2\26\0\2\2"+
    "\4\0\7\2\1\223\17\2\26\0\2\2\4\0\7\2"+
    "\1\224\17\2\26\0\2\2\4\0\14\2\1\225\12\2"+
    "\26\0\2\2\4\0\3\2\1\226\22\2\1\227\26\0"+
    "\2\2\4\0\11\2\1\230\15\2\26\0\2\2\4\0"+
    "\15\2\1\231\11\2\26\0\2\2\4\0\15\2\1\232"+
    "\11\2\26\0\2\2\4\0\1\2\1\233\25\2\26\0"+
    "\2\2\4\0\1\2\1\234\25\2\26\0\2\2\4\0"+
    "\14\2\1\235\12\2\26\0\2\2\4\0\7\2\1\236"+
    "\17\2\26\0\2\2\4\0\20\2\1\237\6\2\26\0"+
    "\2\2\4\0\6\2\1\240\20\2\26\0\2\2\4\0"+
    "\4\2\1\241\22\2\26\0\2\2\4\0\13\2\1\242"+
    "\13\2\26\0\2\2\4\0\1\2\1\243\25\2\26\0"+
    "\2\2\4\0\23\2\1\244\3\2\26\0\2\2\4\0"+
    "\7\2\1\245\17\2\26\0\2\2\4\0\14\2\1\246"+
    "\12\2\26\0\2\2\4\0\1\2\1\247\25\2\26\0"+
    "\2\2\4\0\22\2\1\250\4\2\27\0\1\251\76\0"+
    "\1\252\45\0\2\2\4\0\7\2\1\253\17\2\26\0"+
    "\2\2\4\0\13\2\1\254\1\2\1\255\11\2\26\0"+
    "\2\2\4\0\7\2\1\256\17\2\26\0\2\2\4\0"+
    "\2\2\1\257\24\2\26\0\2\2\4\0\3\2\1\260"+
    "\23\2\26\0\2\2\4\0\13\2\1\261\13\2\26\0"+
    "\2\2\4\0\20\2\1\262\6\2\26\0\2\2\4\0"+
    "\6\2\1\263\20\2\26\0\2\2\4\0\3\2\1\264"+
    "\23\2\26\0\2\2\4\0\2\2\1\265\24\2\26\0"+
    "\2\2\4\0\6\2\1\266\20\2\26\0\2\2\4\0"+
    "\1\2\1\267\25\2\26\0\2\2\4\0\13\2\1\270"+
    "\13\2\26\0\2\2\4\0\6\2\1\271\20\2\26\0"+
    "\2\2\4\0\14\2\1\272\12\2\26\0\2\2\4\0"+
    "\6\2\1\273\20\2\26\0\2\2\4\0\7\2\1\274"+
    "\17\2\26\0\2\2\4\0\21\2\1\275\5\2\26\0"+
    "\2\2\4\0\2\2\1\276\24\2\26\0\2\2\4\0"+
    "\4\2\1\277\22\2\26\0\2\2\4\0\11\2\1\300"+
    "\15\2\26\0\2\2\4\0\14\2\1\301\12\2\26\0"+
    "\2\2\4\0\7\2\1\302\17\2\26\0\2\2\4\0"+
    "\24\2\1\303\2\2\47\0\1\304\41\0\2\2\4\0"+
    "\1\305\26\2\26\0\2\2\4\0\16\2\1\306\10\2"+
    "\26\0\2\2\4\0\7\2\1\307\17\2\26\0\2\2"+
    "\4\0\1\310\26\2\26\0\2\2\4\0\20\2\1\311"+
    "\6\2\26\0\2\2\4\0\15\2\1\312\11\2\26\0"+
    "\2\2\4\0\21\2\1\313\5\2\26\0\2\2\4\0"+
    "\22\2\1\314\4\2\26\0\2\2\4\0\20\2\1\315"+
    "\6\2\26\0\2\2\4\0\14\2\1\316\12\2\26\0"+
    "\2\2\4\0\6\2\1\317\20\2\26\0\2\2\4\0"+
    "\3\2\1\320\23\2\26\0\2\2\4\0\21\2\1\321"+
    "\5\2\26\0\2\2\4\0\14\2\1\322\12\2\26\0"+
    "\2\2\4\0\3\2\1\323\23\2\26\0\2\2\4\0"+
    "\14\2\1\324\12\2\26\0\2\2\4\0\7\2\1\325"+
    "\17\2\26\0\2\2\4\0\1\2\1\326\25\2\47\0"+
    "\1\327\41\0\2\2\4\0\7\2\1\330\17\2\26\0"+
    "\2\2\4\0\1\2\1\331\25\2\26\0\2\2\4\0"+
    "\13\2\1\332\13\2\26\0\2\2\4\0\4\2\1\333"+
    "\22\2\26\0\2\2\4\0\3\2\1\334\23\2\26\0"+
    "\2\2\4\0\7\2\1\335\17\2\26\0\2\2\4\0"+
    "\5\2\1\336\21\2\26\0\2\2\4\0\11\2\1\337"+
    "\15\2\26\0\2\2\4\0\6\2\1\340\20\2\26\0"+
    "\2\2\4\0\3\2\1\341\23\2\36\0\1\342\52\0"+
    "\2\2\4\0\3\2\1\343\23\2\26\0\2\2\4\0"+
    "\20\2\1\344\6\2\26\0\2\2\4\0\7\2\1\345"+
    "\17\2\56\0\1\346\32\0\2\2\4\0\6\2\1\347"+
    "\20\2\26\0\2\2\4\0\7\2\1\350\17\2\43\0"+
    "\1\351\45\0\2\2\4\0\4\2\1\352\22\2\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8670];
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
    "\1\0\2\1\2\11\23\1\2\0\5\1\13\11\3\0"+
    "\1\1\1\0\1\11\44\1\4\11\1\1\1\11\2\0"+
    "\1\1\1\0\45\1\2\0\1\11\43\1\1\0\31\1"+
    "\1\0\22\1\1\0\12\1\1\0\3\1\1\0\2\1"+
    "\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[234];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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
        case 46: 
          { yycolumn += yytext().length(); return symbol(sym.Short, yytext());
          }
        case 72: break;
        case 7: 
          { yycolumn += yytext().length(); return symbol(sym.OpAsignacion, yytext());
          }
        case 73: break;
        case 60: 
          { yycolumn += yytext().length(); return symbol(sym.Double, yytext());
          }
        case 74: break;
        case 22: 
          { yycolumn += yytext().length(); return symbol(sym.OpLogico, "Y");
          }
        case 75: break;
        case 14: 
          { yycolumn += yytext().length(); return symbol(sym.CorcheteCerrado, yytext());
          }
        case 76: break;
        case 13: 
          { yycolumn += yytext().length(); return symbol(sym.CorcheteAbierto, yytext());
          }
        case 77: break;
        case 8: 
          { yycolumn += yytext().length(); return symbol(sym.OpComparacion, yytext());
          }
        case 78: break;
        case 27: 
          { yycolumn += yytext().length(); return symbol(sym.NumeroDecimal, yytext());
          }
        case 79: break;
        case 17: 
          { yycolumn += yytext().length(); return symbol(sym.Coma, yytext());
          }
        case 80: break;
        case 61: 
          { yycolumn += yytext().length(); return symbol(sym.Integer, yytext());
          }
        case 81: break;
        case 28: 
          { yycolumn += yytext().length(); return symbol(sym.Int, yytext());
          }
        case 82: break;
        case 18: 
          { yycolumn += yytext().length(); return symbol(sym.DosPuntos, yytext());
          }
        case 83: break;
        case 63: 
          { yycolumn += yytext().length(); return symbol(sym.Println, yytext());
          }
        case 84: break;
        case 42: 
          { yycolumn += yytext().length(); return symbol(sym.Byte, yytext());
          }
        case 85: break;
        case 25: 
          { return symbol(sym.NumeroEntero);
          }
        case 86: break;
        case 48: 
          { yycolumn += yytext().length(); return symbol(sym.Float, yytext());
          }
        case 87: break;
        case 68: 
          { yycolumn += yytext().length(); return symbol(sym.Continue, yytext());
          }
        case 88: break;
        case 45: 
          { yycolumn += yytext().length(); return symbol(sym.Super, yytext());
          }
        case 89: break;
        case 35: 
          { yycolumn += yytext().length(); return symbol(sym.Args, yytext());
          }
        case 90: break;
        case 26: 
          { yycolumn += yytext().length(); return symbol(sym.CadenaTexto, yytext());
          }
        case 91: break;
        case 3: 
          { yycolumn += yytext().length();
          }
        case 92: break;
        case 30: 
          { yycolumn += yytext().length(); return symbol(sym.Try, yytext());
          }
        case 93: break;
        case 20: 
          { yycolumn += yytext().length(); return symbol(sym.If, yytext());
          }
        case 94: break;
        case 57: 
          { yycolumn += yytext().length(); return symbol(sym.Public, yytext());
          }
        case 95: break;
        case 36: 
          { yycolumn += yytext().length(); return symbol(sym.Null, yytext());
          }
        case 96: break;
        case 34: 
          { yycolumn += yytext().length(); return symbol(sym.Main, yytext());
          }
        case 97: break;
        case 50: 
          { yycolumn += yytext().length(); return symbol(sym.Catch, yytext());
          }
        case 98: break;
        case 38: 
          { yycolumn += yytext().length(); return symbol(sym.Else, yytext());
          }
        case 99: break;
        case 67: 
          { yycolumn += yytext().length(); return symbol(sym.Boolean, yytext());
          }
        case 100: break;
        case 52: 
          { yycolumn += yytext().length(); return symbol(sym.Break, yytext());
          }
        case 101: break;
        case 62: 
          { yycolumn += yytext().length(); return symbol(sym.Extends, yytext());
          }
        case 102: break;
        case 19: 
          { /* Ignorar comentarios de línea */
          }
        case 103: break;
        case 16: 
          { yycolumn += yytext().length(); return symbol(sym.Punto, yytext());
          }
        case 104: break;
        case 71: 
          { yycolumn += yytext().length(); return symbol(sym.Implements, yytext());
          }
        case 105: break;
        case 66: 
          { yycolumn += yytext().length(); return symbol(sym.Default, yytext());
          }
        case 106: break;
        case 10: 
          { yycolumn += yytext().length(); return symbol(sym.ParentesisCerrado, yytext());
          }
        case 107: break;
        case 12: 
          { yycolumn += yytext().length(); return symbol(sym.LlaveCerrada, yytext());
          }
        case 108: break;
        case 9: 
          { yycolumn += yytext().length(); return symbol(sym.ParentesisAbierto, yytext());
          }
        case 109: break;
        case 11: 
          { yycolumn += yytext().length(); return symbol(sym.LlaveAbierta, yytext());
          }
        case 110: break;
        case 1: 
          { yycolumn += yytext().length(); return symbol(sym.Identificador, yytext());
          }
        case 111: break;
        case 69: 
          { yycolumn += yytext().length(); return symbol(sym.Interface, yytext());
          }
        case 112: break;
        case 43: 
          { yycolumn += yytext().length(); return symbol(sym.Void, yytext());
          }
        case 113: break;
        case 70: 
          { yycolumn += yytext().length(); return symbol(sym.Override, yytext());
          }
        case 114: break;
        case 49: 
          { yycolumn += yytext().length(); return symbol(sym.While, yytext());
          }
        case 115: break;
        case 24: 
          { yycolumn += yytext().length(); return symbol(sym.OpIncremento, yytext());
          }
        case 116: break;
        case 58: 
          { yycolumn += yytext().length(); return symbol(sym.Return, yytext());
          }
        case 117: break;
        case 32: 
          { yycolumn += yytext().length(); return symbol(sym.For, yytext());
          }
        case 118: break;
        case 47: 
          { yycolumn += yytext().length(); return symbol(sym.Print, yytext());
          }
        case 119: break;
        case 2: 
          { yycolumn += yytext().length(); return symbol(sym.NumeroEntero, yytext());
          }
        case 120: break;
        case 39: 
          { yycolumn += yytext().length(); return symbol(sym.Long, yytext());
          }
        case 121: break;
        case 51: 
          { yycolumn += yytext().length(); return symbol(sym.Class, yytext());
          }
        case 122: break;
        case 65: 
          { yycolumn += yytext().length(); return symbol(sym.Finally, yytext());
          }
        case 123: break;
        case 40: 
          { yycolumn += yytext().length(); return symbol(sym.Case, yytext());
          }
        case 124: break;
        case 29: 
          { yycolumn += yytext().length(); return symbol(sym.New, yytext());
          }
        case 125: break;
        case 64: 
          { yycolumn += yytext().length(); return symbol(sym.Private, yytext());
          }
        case 126: break;
        case 54: 
          { yycolumn += yytext().length(); return symbol(sym.Static, yytext());
          }
        case 127: break;
        case 44: 
          { return symbol(sym.NumeroDecimal);
          }
        case 128: break;
        case 4: 
          { yycolumn = 0;
          }
        case 129: break;
        case 55: 
          { yycolumn += yytext().length(); return symbol(sym.String, yytext());
          }
        case 130: break;
        case 15: 
          { yycolumn += yytext().length(); return symbol(sym.PuntoComa, yytext());
          }
        case 131: break;
        case 6: 
          { yycolumn += yytext().length(); return symbol(sym.OpLogico, "NO");
          }
        case 132: break;
        case 37: 
          { yycolumn += yytext().length(); return symbol(sym.This, yytext());
          }
        case 133: break;
        case 33: 
          { /* Ignorar comentarios multilínea */
          }
        case 134: break;
        case 31: 
          { yycolumn += yytext().length(); return symbol(sym.Out, yytext());
          }
        case 135: break;
        case 56: 
          { yycolumn += yytext().length(); return symbol(sym.Switch, yytext());
          }
        case 136: break;
        case 59: 
          { yycolumn += yytext().length(); return symbol(sym.Length, yytext());
          }
        case 137: break;
        case 23: 
          { yycolumn += yytext().length(); return symbol(sym.OpLogico, "O");
          }
        case 138: break;
        case 53: 
          { yycolumn += yytext().length(); return symbol(sym.SystemClass, yytext());
          }
        case 139: break;
        case 21: 
          { yycolumn += yytext().length(); return symbol(sym.Do, yytext());
          }
        case 140: break;
        case 41: 
          { yycolumn += yytext().length(); return symbol(sym.Char, yytext());
          }
        case 141: break;
        case 5: 
          { yycolumn += yytext().length(); return symbol(sym.OpAritmetico, yytext());
          }
        case 142: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
