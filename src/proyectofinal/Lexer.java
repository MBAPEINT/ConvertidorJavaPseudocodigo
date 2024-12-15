/* The following code was generated by JFlex 1.4.3 on 15/12/24, 6:34 */

package proyectofinal;
import static proyectofinal.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 15/12/24, 6:34 from the specification file
 * <tt>/home/mbapeint/Documentos/Netbeans Projects/ProyectoFinal/src/proyectofinal/entrada.jflex</tt>
 */
public class Lexer {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\62\2\0\1\3\22\0\1\3\1\36\1\60\2\0"+
    "\1\45\1\34\1\0\1\46\1\47\1\43\1\41\1\56\1\42\1\55"+
    "\1\44\12\2\1\57\1\54\1\40\1\37\1\40\1\0\1\63\1\5"+
    "\1\27\1\24\1\26\1\13\1\22\1\21\1\25\1\6\1\1\1\30"+
    "\1\20\1\4\1\7\1\14\1\16\1\1\1\17\1\10\1\12\1\15"+
    "\1\32\1\23\1\31\1\11\1\33\1\52\1\61\1\53\1\0\1\1"+
    "\1\0\1\5\1\27\1\24\1\26\1\13\1\22\1\21\1\25\1\6"+
    "\1\1\1\30\1\20\1\4\1\7\1\14\1\16\1\1\1\17\1\10"+
    "\1\12\1\15\1\32\1\23\1\31\1\11\1\33\1\50\1\35\1\51"+
    "\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\21\2\2\1\1\5"+
    "\1\6\1\7\5\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\2\1\1\0\5\2"+
    "\1\23\34\2\1\24\4\2\1\25\1\7\1\6\1\26"+
    "\1\0\1\27\1\0\1\30\2\0\1\31\5\2\1\32"+
    "\1\33\11\2\1\34\5\2\1\35\10\2\1\36\16\2"+
    "\2\0\1\37\1\40\5\2\1\41\10\2\1\42\1\2"+
    "\1\43\1\44\10\2\1\45\3\2\1\46\3\2\1\47"+
    "\2\2\1\50\2\2\1\51\1\2\1\52\1\0\11\2"+
    "\1\53\1\2\1\54\1\2\1\55\3\2\1\56\4\2"+
    "\1\57\1\60\1\61\1\62\1\2\1\63\3\2\1\64"+
    "\1\2\1\0\1\2\1\65\4\2\1\66\1\67\1\70"+
    "\1\71\1\2\1\72\2\2\1\73\3\2\1\74\1\75"+
    "\3\2\1\76\2\2\1\0\6\2\1\77\1\100\1\101"+
    "\1\102\1\2\1\103\1\2\1\104\1\105\1\2\1\0"+
    "\1\106\6\2\1\107\1\110\1\0\2\2\1\111\1\2"+
    "\1\112\1\113\1\114\1\115\1\116\2\2\1\117";

  private static int [] zzUnpackAction() {
    int [] result = new int[289];
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
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478\0\u04ac"+
    "\0\u04e0\0\u04e0\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\64\0\64"+
    "\0\64\0\64\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8"+
    "\0\u071c\0\u0750\0\150\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854"+
    "\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4"+
    "\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94"+
    "\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\u0d34"+
    "\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\64\0\64\0\64\0\64"+
    "\0\u0e38\0\u0e6c\0\u05e4\0\64\0\u0ea0\0\u0ed4\0\u064c\0\u0f08"+
    "\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c\0\150\0\u1040\0\u1074"+
    "\0\u10a8\0\u10dc\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\150"+
    "\0\u1214\0\u1248\0\u127c\0\u12b0\0\u12e4\0\150\0\u1318\0\u134c"+
    "\0\u1380\0\u13b4\0\u13e8\0\u141c\0\u1450\0\u1484\0\150\0\u14b8"+
    "\0\u14ec\0\u1520\0\u1554\0\u1588\0\u15bc\0\u15f0\0\u1624\0\u1658"+
    "\0\u168c\0\u16c0\0\u16f4\0\u1728\0\u175c\0\u1790\0\u17c4\0\150"+
    "\0\150\0\u17f8\0\u182c\0\u1860\0\u1894\0\u18c8\0\150\0\u18fc"+
    "\0\u1930\0\u1964\0\u1998\0\u19cc\0\u1a00\0\u1a34\0\u1a68\0\150"+
    "\0\u1a9c\0\150\0\150\0\u1ad0\0\u1b04\0\u1b38\0\u1b6c\0\u1ba0"+
    "\0\u1bd4\0\u1c08\0\u1c3c\0\150\0\u1c70\0\u1ca4\0\u1cd8\0\150"+
    "\0\u1d0c\0\u1d40\0\u1d74\0\150\0\u1da8\0\u1ddc\0\150\0\u1e10"+
    "\0\u1e44\0\150\0\u1e78\0\64\0\u1eac\0\u1ee0\0\u1f14\0\u1f48"+
    "\0\u1f7c\0\u1fb0\0\u1fe4\0\u2018\0\u204c\0\u2080\0\150\0\u20b4"+
    "\0\150\0\u20e8\0\u211c\0\u2150\0\u2184\0\u21b8\0\u21ec\0\u2220"+
    "\0\u2254\0\u2288\0\u22bc\0\u22f0\0\150\0\150\0\150\0\u2324"+
    "\0\150\0\u2358\0\u238c\0\u23c0\0\150\0\u23f4\0\u2428\0\u245c"+
    "\0\150\0\u2490\0\u24c4\0\u24f8\0\u252c\0\150\0\150\0\150"+
    "\0\150\0\u2560\0\150\0\u2594\0\u25c8\0\150\0\u25fc\0\u2630"+
    "\0\u2664\0\150\0\150\0\u2698\0\u26cc\0\u2700\0\150\0\u2734"+
    "\0\u2768\0\u279c\0\u27d0\0\u2804\0\u2838\0\u286c\0\u28a0\0\u28d4"+
    "\0\150\0\150\0\150\0\150\0\u2908\0\150\0\u293c\0\150"+
    "\0\150\0\u2970\0\u29a4\0\150\0\u29d8\0\u2a0c\0\u2a40\0\u2a74"+
    "\0\u2aa8\0\u2adc\0\150\0\150\0\u2b10\0\u2b44\0\u2b78\0\150"+
    "\0\u2bac\0\150\0\150\0\64\0\150\0\150\0\u2be0\0\u2c14"+
    "\0\150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[289];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\3\1\13\1\14\1\15\1\3\1\16\1\17"+
    "\1\20\1\3\1\21\1\22\1\23\1\3\1\24\1\25"+
    "\2\3\1\26\1\3\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\2\1\5\1\54\65\0\2\3\1\0\30\3\32\0"+
    "\1\4\52\0\1\55\11\0\1\5\56\0\1\5\2\0"+
    "\2\3\1\0\1\3\1\56\26\3\31\0\2\3\1\0"+
    "\13\3\1\57\7\3\1\60\4\3\31\0\2\3\1\0"+
    "\1\61\2\3\1\62\12\3\1\63\11\3\31\0\2\3"+
    "\1\0\7\3\1\64\1\3\1\65\16\3\31\0\2\3"+
    "\1\0\5\3\1\66\1\67\2\3\1\70\5\3\1\71"+
    "\1\3\1\72\6\3\31\0\2\3\1\0\13\3\1\73"+
    "\5\3\1\74\6\3\31\0\2\3\1\0\3\3\1\75"+
    "\10\3\1\76\10\3\1\77\2\3\31\0\2\3\1\0"+
    "\11\3\1\100\16\3\31\0\2\3\1\0\1\3\1\101"+
    "\7\3\1\102\1\3\1\103\14\3\31\0\2\3\1\0"+
    "\7\3\1\104\20\3\31\0\2\3\1\0\7\3\1\105"+
    "\1\106\17\3\31\0\2\3\1\0\2\3\1\107\5\3"+
    "\1\110\3\3\1\111\13\3\31\0\2\3\1\0\21\3"+
    "\1\112\6\3\31\0\2\3\1\0\1\3\1\113\6\3"+
    "\1\114\3\3\1\115\4\3\1\116\6\3\31\0\2\3"+
    "\1\0\7\3\1\117\1\120\17\3\31\0\2\3\1\0"+
    "\5\3\1\121\2\3\1\122\2\3\1\123\14\3\31\0"+
    "\2\3\1\0\10\3\1\124\17\3\64\0\1\125\64\0"+
    "\1\125\65\0\1\126\63\0\1\127\1\0\1\130\61\0"+
    "\1\127\2\0\1\130\60\0\1\127\63\0\1\127\3\0"+
    "\1\131\1\132\17\0\60\133\1\134\1\135\2\133\14\0"+
    "\1\136\51\0\1\137\62\0\2\3\1\0\2\3\1\140"+
    "\25\3\31\0\2\3\1\0\15\3\1\141\12\3\31\0"+
    "\2\3\1\0\4\3\1\142\23\3\31\0\2\3\1\0"+
    "\12\3\1\143\15\3\31\0\2\3\1\0\4\3\1\144"+
    "\1\3\1\145\21\3\31\0\2\3\1\0\17\3\1\146"+
    "\10\3\31\0\2\3\1\0\14\3\1\147\13\3\31\0"+
    "\2\3\1\0\3\3\1\150\1\151\23\3\31\0\2\3"+
    "\1\0\1\3\1\152\11\3\1\153\14\3\31\0\2\3"+
    "\1\0\12\3\1\154\15\3\31\0\2\3\1\0\2\3"+
    "\1\155\25\3\31\0\2\3\1\0\10\3\1\156\17\3"+
    "\31\0\2\3\1\0\1\3\1\157\3\3\1\160\22\3"+
    "\31\0\2\3\1\0\2\3\1\161\10\3\1\162\14\3"+
    "\31\0\2\3\1\0\11\3\1\163\16\3\31\0\2\3"+
    "\1\0\4\3\1\164\23\3\31\0\2\3\1\0\6\3"+
    "\1\165\21\3\31\0\2\3\1\0\6\3\1\166\21\3"+
    "\31\0\2\3\1\0\20\3\1\167\7\3\31\0\2\3"+
    "\1\0\23\3\1\170\4\3\31\0\2\3\1\0\2\3"+
    "\1\171\5\3\1\172\17\3\31\0\2\3\1\0\6\3"+
    "\1\173\21\3\31\0\2\3\1\0\3\3\1\174\24\3"+
    "\31\0\2\3\1\0\3\3\1\175\24\3\31\0\2\3"+
    "\1\0\3\3\1\176\24\3\31\0\2\3\1\0\13\3"+
    "\1\177\14\3\31\0\2\3\1\0\10\3\1\200\17\3"+
    "\31\0\2\3\1\0\2\3\1\201\25\3\31\0\2\3"+
    "\1\0\4\3\1\202\1\3\1\203\21\3\31\0\2\3"+
    "\1\0\3\3\1\204\24\3\31\0\2\3\1\0\1\3"+
    "\1\205\26\3\31\0\2\3\1\0\1\3\1\206\26\3"+
    "\31\0\2\3\1\0\16\3\1\207\11\3\31\0\2\3"+
    "\1\0\11\3\1\210\16\3\31\0\2\3\1\0\6\3"+
    "\1\211\21\3\31\0\2\3\1\0\10\3\1\212\17\3"+
    "\31\0\2\3\1\0\7\3\1\213\20\3\31\0\2\3"+
    "\1\0\2\3\1\214\11\3\1\215\13\3\30\0\43\131"+
    "\1\216\20\131\62\132\1\0\1\132\62\133\1\0\1\133"+
    "\32\0\1\217\32\0\2\3\1\0\3\3\1\220\24\3"+
    "\31\0\2\3\1\0\4\3\1\221\23\3\31\0\2\3"+
    "\1\0\6\3\1\222\21\3\31\0\2\3\1\0\10\3"+
    "\1\223\3\3\1\224\13\3\31\0\2\3\1\0\6\3"+
    "\1\225\21\3\31\0\2\3\1\0\7\3\1\226\20\3"+
    "\31\0\2\3\1\0\14\3\1\227\13\3\31\0\2\3"+
    "\1\0\20\3\1\230\7\3\31\0\2\3\1\0\6\3"+
    "\1\231\21\3\31\0\2\3\1\0\6\3\1\232\21\3"+
    "\31\0\2\3\1\0\2\3\1\233\25\3\31\0\2\3"+
    "\1\0\7\3\1\234\20\3\31\0\2\3\1\0\6\3"+
    "\1\235\21\3\31\0\2\3\1\0\13\3\1\236\14\3"+
    "\31\0\2\3\1\0\3\3\1\237\24\3\31\0\2\3"+
    "\1\0\4\3\1\240\23\3\31\0\2\3\1\0\10\3"+
    "\1\241\17\3\31\0\2\3\1\0\1\242\27\3\31\0"+
    "\2\3\1\0\7\3\1\243\20\3\31\0\2\3\1\0"+
    "\7\3\1\244\20\3\31\0\2\3\1\0\24\3\1\245"+
    "\3\3\31\0\2\3\1\0\14\3\1\246\13\3\31\0"+
    "\2\3\1\0\3\3\1\247\22\3\1\250\1\3\31\0"+
    "\2\3\1\0\6\3\1\251\21\3\31\0\2\3\1\0"+
    "\11\3\1\252\16\3\31\0\2\3\1\0\15\3\1\253"+
    "\12\3\31\0\2\3\1\0\15\3\1\254\12\3\31\0"+
    "\2\3\1\0\1\3\1\255\26\3\31\0\2\3\1\0"+
    "\1\3\1\256\26\3\31\0\2\3\1\0\14\3\1\257"+
    "\13\3\31\0\2\3\1\0\7\3\1\260\20\3\31\0"+
    "\2\3\1\0\20\3\1\261\7\3\31\0\2\3\1\0"+
    "\6\3\1\262\21\3\31\0\2\3\1\0\4\3\1\263"+
    "\23\3\31\0\2\3\1\0\13\3\1\264\14\3\31\0"+
    "\2\3\1\0\1\3\1\265\26\3\31\0\2\3\1\0"+
    "\23\3\1\266\4\3\31\0\2\3\1\0\7\3\1\267"+
    "\20\3\31\0\2\3\1\0\14\3\1\270\13\3\31\0"+
    "\2\3\1\0\1\3\1\271\26\3\31\0\2\3\1\0"+
    "\22\3\1\272\5\3\31\0\2\3\1\0\1\3\1\273"+
    "\26\3\30\0\43\131\1\216\1\274\17\131\13\0\1\275"+
    "\51\0\2\3\1\0\13\3\1\276\14\3\31\0\2\3"+
    "\1\0\13\3\1\277\14\3\31\0\2\3\1\0\7\3"+
    "\1\300\20\3\31\0\2\3\1\0\1\3\1\301\26\3"+
    "\31\0\2\3\1\0\13\3\1\302\14\3\31\0\2\3"+
    "\1\0\21\3\1\303\6\3\31\0\2\3\1\0\7\3"+
    "\1\304\20\3\31\0\2\3\1\0\2\3\1\305\25\3"+
    "\31\0\2\3\1\0\3\3\1\306\24\3\31\0\2\3"+
    "\1\0\13\3\1\307\14\3\31\0\2\3\1\0\20\3"+
    "\1\310\7\3\31\0\2\3\1\0\6\3\1\311\21\3"+
    "\31\0\2\3\1\0\4\3\1\312\23\3\31\0\2\3"+
    "\1\0\17\3\1\313\10\3\31\0\2\3\1\0\3\3"+
    "\1\314\24\3\31\0\2\3\1\0\1\3\1\315\26\3"+
    "\31\0\2\3\1\0\2\3\1\316\25\3\31\0\2\3"+
    "\1\0\6\3\1\317\21\3\31\0\2\3\1\0\1\3"+
    "\1\320\26\3\31\0\2\3\1\0\7\3\1\321\20\3"+
    "\31\0\2\3\1\0\13\3\1\322\14\3\31\0\2\3"+
    "\1\0\6\3\1\323\21\3\31\0\2\3\1\0\14\3"+
    "\1\324\13\3\31\0\2\3\1\0\6\3\1\325\21\3"+
    "\31\0\2\3\1\0\7\3\1\326\20\3\31\0\2\3"+
    "\1\0\21\3\1\327\6\3\31\0\2\3\1\0\2\3"+
    "\1\330\25\3\31\0\2\3\1\0\4\3\1\331\23\3"+
    "\31\0\2\3\1\0\11\3\1\332\16\3\31\0\2\3"+
    "\1\0\14\3\1\333\13\3\31\0\2\3\1\0\7\3"+
    "\1\334\20\3\31\0\2\3\1\0\24\3\1\335\3\3"+
    "\31\0\2\3\1\0\6\3\1\336\21\3\47\0\1\337"+
    "\45\0\2\3\1\0\1\3\1\340\26\3\31\0\2\3"+
    "\1\0\6\3\1\341\21\3\31\0\2\3\1\0\1\342"+
    "\27\3\31\0\2\3\1\0\3\3\1\343\24\3\31\0"+
    "\2\3\1\0\16\3\1\344\11\3\31\0\2\3\1\0"+
    "\13\3\1\345\14\3\31\0\2\3\1\0\1\346\27\3"+
    "\31\0\2\3\1\0\20\3\1\347\7\3\31\0\2\3"+
    "\1\0\15\3\1\350\12\3\31\0\2\3\1\0\21\3"+
    "\1\351\6\3\31\0\2\3\1\0\2\3\1\352\25\3"+
    "\31\0\2\3\1\0\4\3\1\353\23\3\31\0\2\3"+
    "\1\0\22\3\1\354\5\3\31\0\2\3\1\0\15\3"+
    "\1\355\12\3\31\0\2\3\1\0\20\3\1\356\7\3"+
    "\31\0\2\3\1\0\14\3\1\357\13\3\31\0\2\3"+
    "\1\0\6\3\1\360\21\3\31\0\2\3\1\0\20\3"+
    "\1\361\7\3\31\0\2\3\1\0\3\3\1\362\24\3"+
    "\31\0\2\3\1\0\21\3\1\363\6\3\31\0\2\3"+
    "\1\0\14\3\1\364\13\3\31\0\2\3\1\0\3\3"+
    "\1\365\24\3\31\0\2\3\1\0\14\3\1\366\13\3"+
    "\31\0\2\3\1\0\7\3\1\367\20\3\31\0\2\3"+
    "\1\0\1\3\1\370\26\3\31\0\2\3\1\0\2\3"+
    "\1\371\25\3\47\0\1\372\45\0\2\3\1\0\20\3"+
    "\1\373\7\3\31\0\2\3\1\0\7\3\1\374\20\3"+
    "\31\0\2\3\1\0\20\3\1\375\7\3\31\0\2\3"+
    "\1\0\1\3\1\376\26\3\31\0\2\3\1\0\10\3"+
    "\1\377\17\3\31\0\2\3\1\0\7\3\1\u0100\20\3"+
    "\31\0\2\3\1\0\4\3\1\u0101\23\3\31\0\2\3"+
    "\1\0\7\3\1\u0102\20\3\31\0\2\3\1\0\3\3"+
    "\1\u0103\24\3\31\0\2\3\1\0\7\3\1\u0104\20\3"+
    "\31\0\2\3\1\0\6\3\1\u0105\21\3\31\0\2\3"+
    "\1\0\5\3\1\u0106\22\3\31\0\2\3\1\0\11\3"+
    "\1\u0107\16\3\31\0\2\3\1\0\6\3\1\u0108\21\3"+
    "\31\0\2\3\1\0\3\3\1\u0109\24\3\31\0\2\3"+
    "\1\0\14\3\1\u010a\13\3\36\0\1\u010b\56\0\2\3"+
    "\1\0\6\3\1\u010c\21\3\31\0\2\3\1\0\3\3"+
    "\1\u010d\24\3\31\0\2\3\1\0\7\3\1\u010e\20\3"+
    "\31\0\2\3\1\0\20\3\1\u010f\7\3\31\0\2\3"+
    "\1\0\3\3\1\u0110\24\3\31\0\2\3\1\0\3\3"+
    "\1\u0111\24\3\31\0\2\3\1\0\7\3\1\u0112\20\3"+
    "\31\0\2\3\1\0\7\3\1\u0113\20\3\31\0\2\3"+
    "\1\0\7\3\1\u0114\20\3\56\0\1\u0115\36\0\2\3"+
    "\1\0\6\3\1\u0116\21\3\31\0\2\3\1\0\10\3"+
    "\1\u0117\17\3\31\0\2\3\1\0\7\3\1\u0118\20\3"+
    "\31\0\2\3\1\0\2\3\1\u0119\25\3\31\0\2\3"+
    "\1\0\6\3\1\u011a\21\3\31\0\2\3\1\0\22\3"+
    "\1\u011b\5\3\43\0\1\u011c\51\0\2\3\1\0\4\3"+
    "\1\u011d\23\3\31\0\2\3\1\0\16\3\1\u011e\11\3"+
    "\31\0\2\3\1\0\27\3\1\u011f\31\0\2\3\1\0"+
    "\7\3\1\u0120\20\3\31\0\2\3\1\0\22\3\1\u0121"+
    "\5\3\30\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11336];
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
    "\1\0\1\11\35\1\13\11\2\1\1\0\47\1\4\11"+
    "\1\0\1\1\1\0\1\11\2\0\57\1\2\0\54\1"+
    "\1\11\1\0\41\1\1\0\32\1\1\0\20\1\1\0"+
    "\11\1\1\0\6\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[289];
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
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
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
    while (i < 182) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
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
        case 49: 
          { lexeme=yytext(); return While;
          }
        case 80: break;
        case 5: 
          { lexeme=yytext(); return OpNot;
          }
        case 81: break;
        case 58: 
          { lexeme=yytext(); return Throws;
          }
        case 82: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 83: break;
        case 65: 
          { lexeme=yytext(); return Println;
          }
        case 84: break;
        case 52: 
          { lexeme=yytext(); return Break;
          }
        case 85: break;
        case 72: 
          { lexeme=yytext(); return Volatile;
          }
        case 86: break;
        case 36: 
          { lexeme=yytext(); return Else;
          }
        case 87: break;
        case 32: 
          { lexeme=yytext(); return Args;
          }
        case 88: break;
        case 18: 
          { lexeme=yytext(); return DosPuntos;
          }
        case 89: break;
        case 8: 
          { lexeme=yytext(); return OpAritmetico;
          }
        case 90: break;
        case 10: 
          { lexeme=yytext(); return ParentesisCerrado;
          }
        case 91: break;
        case 31: 
          { lexeme=yytext(); return Main;
          }
        case 92: break;
        case 53: 
          { lexeme=yytext(); return Import;
          }
        case 93: break;
        case 73: 
          { lexeme=yytext(); return Interface;
          }
        case 94: break;
        case 38: 
          { lexeme=yytext(); return Case;
          }
        case 95: break;
        case 34: 
          { lexeme=yytext(); return This;
          }
        case 96: break;
        case 43: 
          { lexeme=yytext(); return Super;
          }
        case 97: break;
        case 56: 
          { lexeme=yytext(); return String;
          }
        case 98: break;
        case 3: 
          { lexeme=yytext(); return NumeroEntero;
          }
        case 99: break;
        case 21: 
          { lexeme=yytext(); return OpLogico;
          }
        case 100: break;
        case 67: 
          { lexeme=yytext(); return Finally;
          }
        case 101: break;
        case 66: 
          { lexeme=yytext(); return Private;
          }
        case 102: break;
        case 54: 
          { lexeme=yytext(); return SystemClass;
          }
        case 103: break;
        case 50: 
          { lexeme=yytext(); return Catch;
          }
        case 104: break;
        case 25: 
          { lexeme=yytext(); return NumeroDecimal;
          }
        case 105: break;
        case 74: 
          { lexeme=yytext(); return Transient;
          }
        case 106: break;
        case 69: 
          { lexeme=yytext(); return Boolean;
          }
        case 107: break;
        case 1: 
          { return ERROR;
          }
        case 108: break;
        case 23: 
          { /* Ignorar comentarios de línea */
          }
        case 109: break;
        case 27: 
          { lexeme=yytext(); return New;
          }
        case 110: break;
        case 17: 
          { lexeme=yytext(); return Coma;
          }
        case 111: break;
        case 51: 
          { lexeme=yytext(); return Class;
          }
        case 112: break;
        case 29: 
          { lexeme=yytext(); return Out;
          }
        case 113: break;
        case 20: 
          { lexeme=yytext(); return Do;
          }
        case 114: break;
        case 11: 
          { lexeme=yytext(); return LlaveAbierta;
          }
        case 115: break;
        case 78: 
          { lexeme=yytext(); return InstanceOf;
          }
        case 116: break;
        case 41: 
          { lexeme=yytext(); return Void;
          }
        case 117: break;
        case 26: 
          { lexeme=yytext(); return Int;
          }
        case 118: break;
        case 61: 
          { lexeme=yytext(); return Length;
          }
        case 119: break;
        case 24: 
          { lexeme=yytext(); return CadenaTexto;
          }
        case 120: break;
        case 47: 
          { lexeme=yytext(); return Final;
          }
        case 121: break;
        case 63: 
          { lexeme=yytext(); return Extends;
          }
        case 122: break;
        case 15: 
          { lexeme=yytext(); return PuntoComa;
          }
        case 123: break;
        case 13: 
          { lexeme=yytext(); return CorcheteAbierto;
          }
        case 124: break;
        case 22: 
          { lexeme=yytext(); return OpIncremento;
          }
        case 125: break;
        case 46: 
          { lexeme=yytext(); return Print;
          }
        case 126: break;
        case 55: 
          { lexeme=yytext(); return Static;
          }
        case 127: break;
        case 77: 
          { lexeme=yytext(); return Implements;
          }
        case 128: break;
        case 76: 
          { lexeme=yytext(); return Override;
          }
        case 129: break;
        case 79: 
          { lexeme=yytext(); return Synchronized;
          }
        case 130: break;
        case 48: 
          { lexeme=yytext(); return Float;
          }
        case 131: break;
        case 60: 
          { lexeme=yytext(); return Return;
          }
        case 132: break;
        case 30: 
          { lexeme=yytext(); return For;
          }
        case 133: break;
        case 37: 
          { lexeme=yytext(); return Long;
          }
        case 134: break;
        case 16: 
          { lexeme=yytext(); return Punto;
          }
        case 135: break;
        case 19: 
          { lexeme=yytext(); return If;
          }
        case 136: break;
        case 71: 
          { lexeme=yytext(); return Continue;
          }
        case 137: break;
        case 33: 
          { lexeme=yytext(); return Null;
          }
        case 138: break;
        case 62: 
          { lexeme=yytext(); return Double;
          }
        case 139: break;
        case 45: 
          { lexeme=yytext(); return Throw;
          }
        case 140: break;
        case 9: 
          { lexeme=yytext(); return ParentesisAbierto;
          }
        case 141: break;
        case 68: 
          { lexeme=yytext(); return Default;
          }
        case 142: break;
        case 59: 
          { lexeme=yytext(); return Public;
          }
        case 143: break;
        case 35: 
          { lexeme=yytext(); return Enum;
          }
        case 144: break;
        case 28: 
          { lexeme=yytext(); return Try;
          }
        case 145: break;
        case 64: 
          { lexeme=yytext(); return Package;
          }
        case 146: break;
        case 39: 
          { lexeme=yytext(); return Char;
          }
        case 147: break;
        case 12: 
          { lexeme=yytext(); return LlaveCerrada;
          }
        case 148: break;
        case 57: 
          { lexeme=yytext(); return Switch;
          }
        case 149: break;
        case 6: 
          { lexeme=yytext(); return OpAsignacion;
          }
        case 150: break;
        case 42: 
          { /* Ignorar comentarios multilínea */
          }
        case 151: break;
        case 75: 
          { lexeme=yytext(); return Protected;
          }
        case 152: break;
        case 44: 
          { lexeme=yytext(); return Short;
          }
        case 153: break;
        case 14: 
          { lexeme=yytext(); return CorcheteCerrado;
          }
        case 154: break;
        case 70: 
          { lexeme=yytext(); return Abstract;
          }
        case 155: break;
        case 4: 
          { /* Ignorar */
          }
        case 156: break;
        case 7: 
          { lexeme=yytext(); return OpComparacion;
          }
        case 157: break;
        case 40: 
          { lexeme=yytext(); return Byte;
          }
        case 158: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
