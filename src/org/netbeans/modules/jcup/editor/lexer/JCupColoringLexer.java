/* The following code was generated by JFlex 1.4.3 on 12/7/22 5:53 PM */

   /*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2016 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2016 Sun Microsystems, Inc.
 */

package org.netbeans.modules.jcup.editor.lexer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.netbeans.spi.lexer.LexerInput;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.netbeans.modules.jcup.editor.common.ByteStack;

@org.netbeans.api.annotations.common.SuppressWarnings({"SF_SWITCH_FALLTHROUGH", "URF_UNREAD_FIELD", "DLS_DEAD_LOCAL_STORE", "DM_DEFAULT_ENCODING", "EI_EXPOSE_REP"})

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/7/22 5:53 PM from the specification file
 * <tt>C:/Users/bhaidu.PENTALOG/Documents/NetBeansProjects/JCup/tools/JCupColoringLexer.flex</tt>
 */
public class JCupColoringLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = LexerInput.EOF;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ST_JCUP_TERMINAL_DECLARATION = 6;
  public static final int ST_JCUP_SCRIPT_STATEMENT = 10;
  public static final int YYINITIAL = 0;
  public static final int ST_JCUP_JAVA_CODE = 2;
  public static final int ST_JCUP_PRECEDENCE = 8;
  public static final int ST_JCUP_RESULT_JAVA_CODE = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\10\1\6\1\16\1\10\1\6\23\10\1\20\11\10\1\17\3\10"+
    "\1\57\1\15\12\11\1\4\1\14\1\0\1\64\3\0\1\24\1\12"+
    "\1\26\1\52\1\34\1\61\1\32\1\63\1\36\1\12\1\30\1\56"+
    "\1\40\1\54\1\42\1\22\1\12\1\44\1\50\1\46\1\66\5\12"+
    "\4\0\1\13\1\0\1\23\1\7\1\25\1\51\1\33\1\60\1\31"+
    "\1\62\1\35\1\7\1\27\1\55\1\37\1\53\1\41\1\21\1\7"+
    "\1\43\1\47\1\45\1\65\5\7\1\3\1\0\1\5\1\0\53\1"+
    "\1\1\12\1\1\1\4\1\1\1\5\1\27\1\1\1\37\1\1\1"+
    "\10\1\u01c2\1\4\0\14\1\16\0\5\1\7\0\1\1\1\0\1\1"+
    "\201\0\5\1\1\0\2\1\2\0\4\1\10\0\1\1\1\0\3\1"+
    "\1\0\1\1\1\0\24\1\1\0\123\1\1\0\213\1\10\0\236\1"+
    "\11\0\46\1\2\0\1\1\7\0\47\1\110\0\33\1\5\0\3\1"+
    "\55\0\53\1\25\0\12\2\4\0\2\1\1\0\143\1\1\0\1\1"+
    "\17\0\2\1\7\0\2\1\12\2\3\1\2\0\1\1\20\0\1\1"+
    "\1\0\36\1\35\0\131\1\13\0\1\1\16\0\12\2\41\1\11\0"+
    "\2\1\4\0\1\1\5\0\26\1\4\0\1\1\11\0\1\1\3\0"+
    "\1\1\27\0\31\1\107\0\1\1\1\0\13\1\127\0\66\1\3\0"+
    "\1\1\22\0\1\1\7\0\12\1\4\0\12\2\1\0\7\1\1\0"+
    "\7\1\5\0\10\1\2\0\2\1\2\0\26\1\1\0\7\1\1\0"+
    "\1\1\3\0\4\1\3\0\1\1\20\0\1\1\15\0\2\1\1\0"+
    "\3\1\4\0\12\2\2\1\23\0\6\1\4\0\2\1\2\0\26\1"+
    "\1\0\7\1\1\0\2\1\1\0\2\1\1\0\2\1\37\0\4\1"+
    "\1\0\1\1\7\0\12\2\2\0\3\1\20\0\11\1\1\0\3\1"+
    "\1\0\26\1\1\0\7\1\1\0\2\1\1\0\5\1\3\0\1\1"+
    "\22\0\1\1\17\0\2\1\4\0\12\2\25\0\10\1\2\0\2\1"+
    "\2\0\26\1\1\0\7\1\1\0\2\1\1\0\5\1\3\0\1\1"+
    "\36\0\2\1\1\0\3\1\4\0\12\2\1\0\1\1\21\0\1\1"+
    "\1\0\6\1\3\0\3\1\1\0\4\1\3\0\2\1\1\0\1\1"+
    "\1\0\2\1\3\0\2\1\3\0\3\1\3\0\14\1\26\0\1\1"+
    "\25\0\12\2\25\0\10\1\1\0\3\1\1\0\27\1\1\0\12\1"+
    "\1\0\5\1\3\0\1\1\32\0\2\1\6\0\2\1\4\0\12\2"+
    "\25\0\10\1\1\0\3\1\1\0\27\1\1\0\12\1\1\0\5\1"+
    "\3\0\1\1\40\0\1\1\1\0\2\1\4\0\12\2\1\0\2\1"+
    "\22\0\10\1\1\0\3\1\1\0\51\1\2\0\1\1\20\0\1\1"+
    "\21\0\2\1\4\0\12\2\12\0\6\1\5\0\22\1\3\0\30\1"+
    "\1\0\11\1\1\0\1\1\2\0\7\1\72\0\60\1\1\0\2\1"+
    "\14\0\7\1\11\0\12\2\47\0\2\1\1\0\1\1\2\0\2\1"+
    "\1\0\1\1\2\0\1\1\6\0\4\1\1\0\7\1\1\0\3\1"+
    "\1\0\1\1\1\0\1\1\2\0\2\1\1\0\4\1\1\0\2\1"+
    "\11\0\1\1\2\0\5\1\1\0\1\1\11\0\12\2\2\0\4\1"+
    "\40\0\1\1\37\0\12\2\26\0\10\1\1\0\44\1\33\0\5\1"+
    "\163\0\53\1\24\0\1\1\12\2\6\0\6\1\4\0\4\1\3\0"+
    "\1\1\3\0\2\1\7\0\3\1\4\0\15\1\14\0\1\1\1\0"+
    "\12\2\6\0\46\1\1\0\1\1\5\0\1\1\2\0\53\1\1\0"+
    "\u014d\1\1\0\4\1\2\0\7\1\1\0\1\1\1\0\4\1\2\0"+
    "\51\1\1\0\4\1\2\0\41\1\1\0\4\1\2\0\7\1\1\0"+
    "\1\1\1\0\4\1\2\0\17\1\1\0\71\1\1\0\4\1\2\0"+
    "\103\1\45\0\20\1\20\0\125\1\14\0\u026c\1\2\0\21\1\1\0"+
    "\32\1\5\0\113\1\25\0\15\1\1\0\4\1\16\0\22\1\16\0"+
    "\22\1\16\0\15\1\1\0\3\1\17\0\64\1\43\0\1\1\4\0"+
    "\1\1\3\0\12\2\46\0\12\2\6\0\130\1\10\0\51\1\1\0"+
    "\1\1\5\0\106\1\12\0\35\1\51\0\12\2\36\1\2\0\5\1"+
    "\13\0\54\1\25\0\7\1\10\0\12\2\46\0\27\1\11\0\65\1"+
    "\53\0\12\2\6\0\12\2\15\0\1\1\135\0\57\1\21\0\7\1"+
    "\4\0\12\2\51\0\36\1\15\0\2\1\12\2\54\1\32\0\44\1"+
    "\34\0\12\2\3\0\3\1\12\2\44\1\153\0\4\1\1\0\4\1"+
    "\3\0\2\1\11\0\300\1\100\0\u0116\1\2\0\6\1\2\0\46\1"+
    "\2\0\6\1\2\0\10\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\37\1\2\0\65\1\1\0\7\1\1\0\1\1\3\0\3\1"+
    "\1\0\7\1\3\0\4\1\2\0\6\1\4\0\15\1\5\0\3\1"+
    "\1\0\7\1\164\0\1\1\15\0\1\1\20\0\15\1\145\0\1\1"+
    "\4\0\1\1\2\0\12\1\1\0\1\1\3\0\5\1\6\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\4\1\1\0\13\1\2\0\4\1"+
    "\5\0\5\1\4\0\1\1\64\0\2\1\u0a7b\0\57\1\1\0\57\1"+
    "\1\0\205\1\6\0\4\1\3\0\2\1\14\0\46\1\1\0\1\1"+
    "\5\0\1\1\2\0\70\1\7\0\1\1\20\0\27\1\11\0\7\1"+
    "\1\0\7\1\1\0\7\1\1\0\7\1\1\0\7\1\1\0\7\1"+
    "\1\0\7\1\1\0\7\1\120\0\1\1\u01d5\0\2\1\52\0\5\1"+
    "\5\0\2\1\4\0\126\1\6\0\3\1\1\0\132\1\1\0\4\1"+
    "\5\0\51\1\3\0\136\1\21\0\33\1\65\0\20\1\u0200\0\u19b6\1"+
    "\112\0\u51cd\1\63\0\u048d\1\103\0\56\1\2\0\u010d\1\3\0\20\1"+
    "\12\2\2\1\24\0\57\1\20\0\31\1\10\0\106\1\61\0\11\1"+
    "\2\0\147\1\2\0\4\1\1\0\4\1\14\0\13\1\115\0\12\1"+
    "\1\0\3\1\1\0\4\1\1\0\27\1\35\0\64\1\16\0\62\1"+
    "\34\0\12\2\30\0\6\1\3\0\1\1\4\0\12\2\34\1\12\0"+
    "\27\1\31\0\35\1\7\0\57\1\34\0\1\1\12\2\46\0\51\1"+
    "\27\0\3\1\1\0\10\1\4\0\12\2\6\0\27\1\3\0\1\1"+
    "\5\0\60\1\1\0\1\1\3\0\2\1\2\0\5\1\2\0\1\1"+
    "\1\0\1\1\30\0\3\1\2\0\13\1\7\0\3\1\14\0\6\1"+
    "\2\0\6\1\2\0\6\1\11\0\7\1\1\0\7\1\221\0\43\1"+
    "\15\0\12\2\6\0\u2ba4\1\14\0\27\1\4\0\61\1\u2104\0\u016e\1"+
    "\2\0\152\1\46\0\7\1\14\0\5\1\5\0\1\1\1\0\12\1"+
    "\1\0\15\1\1\0\5\1\1\0\1\1\1\0\2\1\1\0\2\1"+
    "\1\0\154\1\41\0\u016b\1\22\0\100\1\2\0\66\1\50\0\14\1"+
    "\164\0\5\1\1\0\207\1\23\0\12\2\7\0\32\1\6\0\32\1"+
    "\13\0\131\1\3\0\6\1\2\0\6\1\2\0\6\1\2\0\3\1"+
    "\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\2\1\1\2\15\1\3\3\1\4\11\1\2\0"+
    "\1\1\2\0\5\1\1\5\5\1\2\0\1\3\3\6"+
    "\1\0\1\6\1\0\1\6\1\0\1\7\1\10\1\0"+
    "\1\6\4\0\15\1\1\0\1\11\1\0\1\6\1\0"+
    "\1\6\1\12\1\13\1\0\1\14\2\0\5\1\1\15"+
    "\1\14\2\1\1\14\3\1\1\0\2\16\1\17\6\1"+
    "\1\0\5\1\2\20\1\0\1\1\1\14\1\1\1\0"+
    "\2\1\1\0\1\1\1\21\1\0\1\1\1\0\1\22"+
    "\2\0\1\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[143];
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
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\u0181"+
    "\0\u01b8\0\u01ef\0\u0226\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339"+
    "\0\u0370\0\u03a7\0\u03de\0\u0415\0\u044c\0\u0483\0\u04ba\0\u04f1"+
    "\0\u0528\0\u014a\0\u055f\0\u0596\0\u05cd\0\u0604\0\u063b\0\u0672"+
    "\0\u06a9\0\u06e0\0\u0717\0\u0181\0\u074e\0\u0785\0\u07bc\0\u07f3"+
    "\0\u082a\0\u0861\0\u0898\0\u08cf\0\u0906\0\u014a\0\u093d\0\u0974"+
    "\0\u09ab\0\u09e2\0\u0a19\0\u0a50\0\u0a87\0\u0abe\0\u0af5\0\u0b2c"+
    "\0\u055f\0\u0b63\0\u0b9a\0\u0bd1\0\u0c08\0\u0672\0\u014a\0\u014a"+
    "\0\u0c3f\0\u0c76\0\u0cad\0\u0ce4\0\u0d1b\0\u0d52\0\u0d89\0\u0dc0"+
    "\0\u0df7\0\u0e2e\0\u0e65\0\u0e9c\0\u0ed3\0\u0f0a\0\u0f41\0\u0f78"+
    "\0\u0faf\0\u0fe6\0\u101d\0\u1054\0\u0a87\0\u108b\0\u10c2\0\u10f9"+
    "\0\u1130\0\u014a\0\u014a\0\u1167\0\u014a\0\u119e\0\u11d5\0\u120c"+
    "\0\u1243\0\u127a\0\u12b1\0\u12e8\0\u074e\0\u0339\0\u131f\0\u1356"+
    "\0\u03de\0\u138d\0\u13c4\0\u13fb\0\u1432\0\u014a\0\u055f\0\u014a"+
    "\0\u1469\0\u14a0\0\u14d7\0\u150e\0\u1545\0\u157c\0\u15b3\0\u15ea"+
    "\0\u1621\0\u1658\0\u168f\0\u16c6\0\u03de\0\u014a\0\u16fd\0\u1734"+
    "\0\u074e\0\u176b\0\u17a2\0\u17d9\0\u1810\0\u1847\0\u187e\0\u074e"+
    "\0\u18b5\0\u18ec\0\u1923\0\u074e\0\u195a\0\u1991\0\u014a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[143];
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
    "\1\7\1\10\4\7\1\11\1\12\2\7\1\12\1\10"+
    "\1\7\1\13\2\7\1\11\2\14\12\12\2\15\6\12"+
    "\2\16\4\12\2\17\2\12\1\7\4\12\1\7\2\12"+
    "\4\20\1\21\1\7\7\20\1\22\51\20\4\23\1\21"+
    "\1\7\7\23\1\24\25\23\1\25\1\26\22\23\1\7"+
    "\1\27\4\7\1\11\1\30\2\7\1\31\1\27\1\32"+
    "\3\7\1\11\1\30\1\31\1\30\1\31\1\30\1\31"+
    "\1\30\1\31\1\30\1\31\1\30\1\31\1\30\1\31"+
    "\1\30\1\31\1\30\1\31\1\30\1\31\1\30\1\31"+
    "\1\30\1\31\1\30\1\31\1\30\1\31\1\30\1\31"+
    "\1\7\1\30\1\31\1\30\1\31\1\7\1\30\1\31"+
    "\6\7\1\11\3\7\1\33\1\7\1\32\3\7\1\11"+
    "\1\7\1\33\1\7\1\33\1\7\1\33\1\7\1\33"+
    "\1\7\1\33\1\7\1\33\1\7\1\33\1\7\1\33"+
    "\1\7\1\33\1\34\1\35\1\7\1\33\1\7\1\33"+
    "\1\7\1\33\1\7\1\33\1\36\1\37\2\7\1\33"+
    "\1\7\1\33\2\7\1\33\1\7\1\40\1\7\1\41"+
    "\1\42\1\7\1\11\1\40\2\7\1\43\1\40\1\7"+
    "\1\13\2\7\1\11\1\40\1\43\1\40\1\43\1\40"+
    "\1\43\1\40\1\43\1\40\1\43\1\40\1\43\1\40"+
    "\1\43\1\40\1\43\1\40\1\43\1\40\1\43\1\40"+
    "\1\43\1\40\1\43\1\40\1\43\1\40\1\43\1\40"+
    "\1\43\1\7\1\40\1\43\1\40\1\43\1\7\1\40"+
    "\1\43\70\0\2\44\3\0\1\45\1\44\1\0\3\44"+
    "\4\0\1\45\36\44\1\0\4\44\1\0\2\44\6\0"+
    "\1\11\11\0\1\11\47\0\2\44\3\0\1\45\1\12"+
    "\1\0\2\12\1\44\4\0\1\45\36\12\1\46\4\12"+
    "\1\0\2\12\15\0\1\47\1\0\1\50\50\0\2\44"+
    "\3\0\1\45\1\12\1\0\2\12\1\44\4\0\1\45"+
    "\2\12\2\51\16\12\2\52\12\12\1\46\4\12\1\0"+
    "\2\12\1\0\2\44\3\0\1\45\1\12\1\0\2\12"+
    "\1\44\4\0\1\45\16\12\2\53\16\12\1\46\4\12"+
    "\1\0\2\12\1\0\2\44\3\0\1\45\1\12\1\0"+
    "\2\12\1\44\4\0\1\45\12\12\2\54\22\12\1\46"+
    "\4\12\1\0\2\12\1\0\2\44\3\0\1\45\1\12"+
    "\1\0\2\12\1\44\4\0\1\45\20\12\2\55\14\12"+
    "\1\46\4\12\1\0\2\12\4\20\2\0\61\20\5\0"+
    "\1\56\61\0\4\20\2\0\7\20\1\57\1\20\1\60"+
    "\47\20\4\23\2\0\36\23\1\0\26\23\2\0\7\23"+
    "\1\61\1\23\1\62\24\23\1\0\26\23\2\0\25\23"+
    "\2\63\7\23\1\0\22\23\33\0\2\64\33\0\2\27"+
    "\4\0\1\27\1\0\3\27\5\0\36\27\1\0\4\27"+
    "\1\0\2\27\1\0\2\27\3\0\1\65\1\66\1\65"+
    "\2\66\1\27\1\0\4\65\36\66\1\65\4\66\1\0"+
    "\2\66\1\0\2\27\3\0\1\65\1\66\1\65\2\67"+
    "\1\70\1\0\4\65\1\66\1\67\1\66\1\67\1\66"+
    "\1\67\1\66\1\67\1\66\1\67\1\66\1\67\1\66"+
    "\1\67\1\66\1\67\1\66\1\67\1\66\1\67\1\66"+
    "\1\67\1\66\1\67\1\66\1\67\1\66\1\67\1\66"+
    "\1\67\1\65\1\66\1\67\1\66\1\67\1\0\1\66"+
    "\1\67\11\0\3\71\6\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\2\0\1\71\1\0\1\71\2\0\1\71\35\0"+
    "\2\72\41\0\3\71\6\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\72"+
    "\1\73\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\2\0\1\71\1\0\1\71\2\0\1\71\33\0"+
    "\2\74\43\0\3\71\6\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\74\1\75\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\2\0\1\71\1\0\1\71\2\0\1\71\1\0"+
    "\2\76\1\0\1\77\2\0\1\76\1\0\3\76\2\0"+
    "\1\77\1\0\1\77\36\76\1\0\4\76\1\0\2\76"+
    "\4\0\1\100\66\0\1\101\63\0\2\76\1\0\1\77"+
    "\2\0\1\76\1\0\3\102\2\0\1\77\1\0\1\77"+
    "\1\76\1\102\1\76\1\102\1\76\1\102\1\76\1\102"+
    "\1\76\1\102\1\76\1\102\1\76\1\102\1\76\1\102"+
    "\1\76\1\102\1\76\1\102\1\76\1\102\1\76\1\102"+
    "\1\76\1\102\1\76\1\102\1\76\1\102\1\0\1\76"+
    "\1\102\1\76\1\102\1\0\1\76\1\102\4\0\1\103"+
    "\1\0\1\45\11\0\1\45\55\0\1\46\1\0\2\46"+
    "\6\0\43\46\1\0\2\46\16\104\1\0\50\104\17\105"+
    "\1\106\47\105\1\0\2\44\3\0\1\45\1\12\1\0"+
    "\2\12\1\44\4\0\1\45\4\12\2\107\14\12\2\110"+
    "\12\12\1\46\4\12\1\0\2\12\1\0\2\44\3\0"+
    "\1\45\1\12\1\0\2\12\1\44\4\0\1\45\12\12"+
    "\2\111\22\12\1\46\4\12\1\0\2\12\1\0\2\44"+
    "\3\0\1\45\1\12\1\0\2\12\1\44\4\0\1\45"+
    "\2\112\34\12\1\46\4\12\1\0\2\12\1\0\2\44"+
    "\3\0\1\45\1\12\1\0\2\12\1\44\4\0\1\45"+
    "\22\12\2\113\12\12\1\46\4\12\1\0\2\12\1\0"+
    "\2\44\3\0\1\45\1\12\1\0\2\12\1\44\4\0"+
    "\1\45\32\12\2\114\2\12\1\46\4\12\1\0\2\12"+
    "\4\115\2\104\10\115\1\20\50\115\4\116\2\105\11\116"+
    "\1\117\47\116\4\120\2\104\10\120\1\23\25\120\1\104"+
    "\22\120\4\121\2\105\11\121\1\122\24\121\1\105\22\121"+
    "\4\23\2\0\36\23\1\0\2\23\2\123\16\23\47\0"+
    "\2\124\24\0\5\65\2\0\3\65\1\125\43\65\1\0"+
    "\2\65\1\0\2\27\3\0\1\65\1\66\1\65\2\66"+
    "\1\27\1\0\3\65\1\125\36\66\1\65\4\66\1\0"+
    "\2\66\1\0\2\27\3\0\1\65\1\66\1\65\2\67"+
    "\1\70\1\0\3\65\1\125\1\66\1\67\1\66\1\67"+
    "\1\66\1\67\1\66\1\67\1\66\1\67\1\66\1\67"+
    "\1\66\1\67\1\66\1\67\1\66\1\67\1\66\1\67"+
    "\1\66\1\67\1\66\1\67\1\66\1\67\1\66\1\67"+
    "\1\66\1\67\1\65\1\66\1\67\1\66\1\67\1\0"+
    "\1\66\1\67\1\0\2\27\4\0\1\27\1\0\3\70"+
    "\5\0\1\27\1\70\1\27\1\70\1\27\1\70\1\27"+
    "\1\70\1\27\1\70\1\27\1\70\1\27\1\70\1\27"+
    "\1\70\1\27\1\70\1\27\1\70\1\27\1\70\1\27"+
    "\1\70\1\27\1\70\1\27\1\70\1\27\1\70\1\0"+
    "\1\27\1\70\1\27\1\70\1\0\1\27\1\70\31\0"+
    "\2\126\45\0\3\71\6\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\126\1\127\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\2\0\1\71\1\0\1\71\2\0\1\71\60\0"+
    "\2\130\16\0\3\71\6\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\71\1\0\1\71\1\0\1\71\1\0"+
    "\1\71\1\0\1\130\1\131\1\0\1\71\2\0\1\71"+
    "\64\0\1\132\3\0\2\76\1\0\1\133\2\0\1\76"+
    "\1\0\3\102\2\0\1\133\1\0\1\133\1\76\1\102"+
    "\1\76\1\102\1\76\1\102\1\76\1\102\1\76\1\102"+
    "\1\76\1\102\1\76\1\102\1\76\1\102\1\76\1\102"+
    "\1\76\1\102\1\76\1\102\1\76\1\102\1\76\1\102"+
    "\1\76\1\102\1\76\1\102\1\0\1\76\1\102\1\76"+
    "\1\102\1\0\1\76\1\102\4\0\1\134\62\0\16\104"+
    "\1\135\50\104\17\105\1\136\47\105\15\0\1\137\1\0"+
    "\1\106\50\0\2\44\3\0\1\45\1\12\1\0\2\12"+
    "\1\44\4\0\1\45\6\12\2\140\26\12\1\46\4\12"+
    "\1\0\2\12\1\0\2\44\3\0\1\45\1\12\1\0"+
    "\2\12\1\44\4\0\1\45\26\12\2\141\6\12\1\46"+
    "\4\12\1\0\2\12\1\0\2\44\3\0\1\45\1\12"+
    "\1\0\2\12\1\44\4\0\1\45\4\12\2\142\30\12"+
    "\1\46\4\12\1\0\2\12\1\0\2\44\3\0\1\45"+
    "\1\12\1\0\2\12\1\44\4\0\1\45\20\12\2\143"+
    "\14\12\1\46\4\12\1\0\2\12\1\0\2\44\3\0"+
    "\1\45\1\12\1\0\2\12\1\44\4\0\1\45\16\12"+
    "\2\144\16\12\1\46\4\12\1\0\2\12\1\0\2\44"+
    "\3\0\1\45\1\12\1\0\2\12\1\44\4\0\1\145"+
    "\36\12\1\46\4\12\1\0\2\12\4\115\2\104\10\115"+
    "\1\146\50\115\4\116\2\105\11\116\1\147\47\116\4\20"+
    "\2\0\7\20\1\150\1\20\1\117\47\20\4\120\2\104"+
    "\10\120\1\151\25\120\1\104\22\120\4\121\2\105\11\121"+
    "\1\152\24\121\1\105\22\121\4\23\2\0\7\23\1\153"+
    "\1\23\1\122\24\23\1\0\26\23\2\0\36\23\1\0"+
    "\20\23\2\154\65\0\2\155\62\0\2\130\14\0\3\71"+
    "\6\0\1\71\1\0\1\71\1\0\1\71\1\0\1\71"+
    "\1\0\1\71\1\0\1\71\1\0\1\71\1\0\1\71"+
    "\1\0\1\71\1\0\1\71\1\0\1\71\1\0\1\71"+
    "\1\0\1\71\1\0\1\71\1\0\1\71\2\0\1\71"+
    "\1\130\1\131\2\0\1\71\45\0\2\156\31\0\3\71"+
    "\6\0\1\71\1\0\1\71\1\0\1\71\1\0\1\71"+
    "\1\0\1\71\1\0\1\71\1\0\1\71\1\0\1\71"+
    "\1\0\1\71\1\0\1\71\1\156\1\157\1\0\1\71"+
    "\1\0\1\71\1\0\1\71\1\0\1\71\2\0\1\71"+
    "\1\0\1\71\2\0\1\71\64\0\1\160\2\0\15\105"+
    "\1\137\1\105\1\136\47\105\16\0\1\135\1\0\1\137"+
    "\47\0\2\44\3\0\1\45\1\12\1\0\2\12\1\44"+
    "\4\0\1\45\2\12\2\161\32\12\1\46\4\12\1\0"+
    "\2\12\1\0\2\44\3\0\1\45\1\12\1\0\2\12"+
    "\1\44\4\0\1\45\12\12\2\162\22\12\1\46\4\12"+
    "\1\0\2\12\1\0\2\44\3\0\1\45\1\12\1\0"+
    "\2\12\1\44\4\0\1\45\12\12\2\163\22\12\1\46"+
    "\4\12\1\0\2\12\1\0\2\44\3\0\1\45\1\12"+
    "\1\0\2\12\1\44\4\0\1\45\22\12\2\164\12\12"+
    "\1\46\4\12\1\0\2\12\1\0\2\44\3\0\1\45"+
    "\1\12\1\0\2\12\1\44\4\0\1\45\14\12\2\165"+
    "\20\12\1\46\4\12\1\0\2\12\4\116\2\105\7\116"+
    "\1\150\1\116\1\147\47\116\4\20\2\0\10\20\1\146"+
    "\1\20\1\150\46\20\4\121\2\105\7\121\1\153\1\121"+
    "\1\152\24\121\1\105\22\121\4\23\2\0\10\23\1\151"+
    "\1\23\1\153\23\23\1\0\26\23\2\0\36\23\1\0"+
    "\10\23\2\166\10\23\55\0\2\167\11\0\2\44\3\0"+
    "\1\45\1\12\1\0\2\12\1\44\4\0\1\45\10\12"+
    "\2\170\24\12\1\46\4\12\1\0\2\12\1\0\2\44"+
    "\3\0\1\45\1\12\1\0\2\12\1\44\4\0\1\45"+
    "\22\12\2\171\12\12\1\46\4\12\1\0\2\12\1\0"+
    "\2\44\3\0\1\45\1\12\1\0\2\12\1\44\4\0"+
    "\1\45\30\12\2\172\4\12\1\46\4\12\1\0\2\12"+
    "\1\0\2\44\3\0\1\45\1\12\1\0\2\12\1\44"+
    "\4\0\1\45\24\12\2\173\10\12\1\46\4\12\1\0"+
    "\2\12\1\0\2\44\3\0\1\45\1\12\1\0\2\12"+
    "\1\44\4\0\1\45\32\12\2\174\2\12\1\46\4\12"+
    "\1\0\2\12\4\23\2\0\36\23\1\0\2\175\20\23"+
    "\45\0\2\176\21\0\2\44\3\0\1\45\1\12\1\0"+
    "\2\12\1\44\4\0\1\45\12\12\2\173\22\12\1\46"+
    "\4\12\1\0\2\12\1\0\2\44\3\0\1\45\1\12"+
    "\1\0\2\12\1\44\4\0\1\177\36\12\1\46\4\12"+
    "\1\0\2\12\1\0\2\44\3\0\1\45\1\12\1\0"+
    "\2\12\1\44\4\0\1\45\12\12\2\200\22\12\1\46"+
    "\4\12\1\0\2\12\1\0\2\44\3\0\1\45\1\12"+
    "\1\0\2\12\1\44\4\0\1\201\36\12\1\46\4\12"+
    "\1\0\2\12\1\0\2\44\3\0\1\45\1\12\1\0"+
    "\2\12\1\44\4\0\1\45\2\12\2\202\32\12\1\46"+
    "\4\12\1\0\2\12\4\0\1\103\1\0\1\45\11\0"+
    "\1\45\4\0\2\203\41\0\2\44\3\0\1\45\1\12"+
    "\1\0\2\12\1\44\4\0\1\45\32\12\2\204\2\12"+
    "\1\46\4\12\1\0\2\12\1\0\2\44\3\0\1\45"+
    "\1\12\1\0\2\12\1\44\4\0\1\45\34\12\2\205"+
    "\1\46\4\12\1\0\2\12\41\0\2\206\25\0\2\44"+
    "\3\0\1\45\1\12\1\0\2\12\1\44\4\0\1\45"+
    "\4\12\2\207\30\12\1\46\4\12\1\0\2\12\1\0"+
    "\2\44\3\0\1\45\1\12\1\0\2\12\1\44\4\0"+
    "\1\210\36\12\1\46\4\12\1\0\2\12\51\0\2\211"+
    "\15\0\2\44\3\0\1\45\1\12\1\0\2\12\1\44"+
    "\4\0\1\45\12\12\2\212\22\12\1\46\4\12\1\0"+
    "\2\12\33\0\2\213\33\0\2\44\3\0\1\45\1\12"+
    "\1\0\2\12\1\44\4\0\1\214\36\12\1\46\4\12"+
    "\1\0\2\12\6\0\1\215\11\0\1\215\51\0\1\216"+
    "\2\0\1\215\11\0\1\215\52\0\1\217\62\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6600];
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
    "\6\0\1\11\22\1\1\11\11\1\2\0\1\1\2\0"+
    "\5\1\1\11\5\1\2\0\4\1\1\0\1\1\1\0"+
    "\1\1\1\0\2\11\1\0\1\1\4\0\15\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\2\11\1\0\1\11"+
    "\2\0\15\1\1\0\1\11\1\1\1\11\6\1\1\0"+
    "\6\1\1\11\1\0\3\1\1\0\2\1\1\0\2\1"+
    "\1\0\1\1\1\0\1\1\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[143];
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

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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
  private boolean zzAtEOF = false;

  /* user code: */
    private ByteStack stack = new ByteStack();
    private LexerInput input;
    private int pushBackCount = 0;
    private int curlyBalance = 0;
    private int curlyBalanceExpr = 0;
    private boolean hasExpression = false;
    private boolean inExpression = false;
    private boolean typeAdded = false;
    private boolean nonTerminal = false;
    private String expression; 

    public JCupColoringLexer(LexerRestartInfo info) {
        this.input = info.input();
        if(info.state() != null) {
            //reset state
            setState((LexerState) info.state());
        } else {
            //initial state
            stack.push(YYINITIAL);
            zzState = YYINITIAL;
            zzLexicalState = YYINITIAL;
        }

    }

    public static final class LexerState  {
        final ByteStack stack;
        /** the current state of the DFA */
        final int zzState;
        /** the current lexical state */
        final int zzLexicalState;

        LexerState(ByteStack stack, int zzState, int zzLexicalState) {
            this.stack = stack;
            this.zzState = zzState;
            this.zzLexicalState = zzLexicalState;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
            LexerState state = (LexerState) obj;
            return (this.stack.equals(state.stack)
                && (this.zzState == state.zzState)
                );
        }

        @Override
        public int hashCode() {
            int hash = 11;
            hash = 31 * hash + this.zzState;
            hash = 31 * hash + this.zzLexicalState;
            if (stack != null) {
                hash = 31 * hash + this.stack.hashCode();
            }
            return hash;
        }
    }

    public LexerState getState() {
        return new LexerState(stack.copyOf(), zzState, zzLexicalState);
    }

    public void setState(LexerState state) {
        this.stack.copyFrom(state.stack);
        this.zzState = state.zzState;
        this.zzLexicalState = state.zzLexicalState;
    }

    protected int getZZLexicalState() {
        return zzLexicalState;
    }

    //other functions

    protected void pushBack(int i) {
        yypushback(i);
    }

    protected void popState() {
        yybegin(stack.pop());
    }

    protected void pushState(final int state) {
        stack.push(getZZLexicalState());
        yybegin(state);
    }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public JCupColoringLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public JCupColoringLexer(java.io.InputStream in) {
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
    while (i < 1722) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
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
    return input.readText().toString();
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
     return input.readText().charAt(pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return input.readLength();
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

    input.backup(number);
    //zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public JCupTokenId findNextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    //int zzCurrentPosL;
    //int zzMarkedPosL;
    //int zzEndReadL = zzEndRead;
    //char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      //zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      //zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
      int tokenLength = 0;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
            zzInput = input.read();
            
            if(zzInput == LexerInput.EOF) {
                //end of input reached
                zzInput = YYEOF;
                break zzForAction;
                //notice: currently LexerInput.EOF == YYEOF
            }

          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            tokenLength = input.readLength();
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      if(zzInput != YYEOF) {
         input.backup(input.readLength() - tokenLength);
      }

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { return JCupTokenId.T_RESULT;
          }
        case 20: break;
        case 17: 
          { pushState(ST_JCUP_TERMINAL_DECLARATION);
    yypushback(1);
    typeAdded = false;
    return JCupTokenId.T_JCUP_TERMINAL;
          }
        case 21: break;
        case 11: 
          { yypushback(1);
    return JCupTokenId.T_TOKEN_NAME;
          }
        case 22: break;
        case 14: 
          { return JCupTokenId.T_JCUP_KEYWORD;
          }
        case 23: break;
        case 9: 
          { yypushback(1);
    if (typeAdded) {
        return ((nonTerminal) ? JCupTokenId.T_IDENTIFIER : JCupTokenId.T_TOKEN_NAME);
    }
    typeAdded = true;
    return JCupTokenId.T_JAVA;
          }
        case 24: break;
        case 2: 
          { return JCupTokenId.T_WHITESPACE;
          }
        case 25: break;
        case 8: 
          { pushState(ST_JCUP_RESULT_JAVA_CODE);
    return JCupTokenId.T_DECLARATION_CURLY;
          }
        case 26: break;
        case 6: 
          { return JCupTokenId.T_TOKEN_NAME;
          }
        case 27: break;
        case 18: 
          { pushState(ST_JCUP_PRECEDENCE);
    yypushback(1);
    return JCupTokenId.T_PRECEDENCE;
          }
        case 28: break;
        case 13: 
          { nonTerminal = true;
    yypushback(1);
    return JCupTokenId.T_JCUP_KEYWORD;
          }
        case 29: break;
        case 19: 
          { pushState(ST_JCUP_JAVA_CODE);
    return JCupTokenId.T_PARSER_DECLARATION_TAG;
          }
        case 30: break;
        case 5: 
          { popState();
    return JCupTokenId.T_DECLARATION_CURLY;
          }
        case 31: break;
        case 7: 
          { yypushback(1);
    return JCupTokenId.T_IDENTIFIER;
          }
        case 32: break;
        case 15: 
          { int spaceCount = 0;
    for (char c : yytext().toCharArray()) {
        if (c == ' ') {
             spaceCount++;
        }
    }
    pushState(ST_JCUP_SCRIPT_STATEMENT);
    yypushback("::=".length() + spaceCount);
    return JCupTokenId.T_IDENTIFIER;
          }
        case 33: break;
        case 10: 
          { return JCupTokenId.T_SCRIPT_DEFINITION_OPERATOR;
          }
        case 34: break;
        case 4: 
          { popState();
    nonTerminal = false;
    return JCupTokenId.T_SEMI_COLON;
          }
        case 35: break;
        case 12: 
          { yypushback(1);
    return JCupTokenId.T_JAVA;
          }
        case 36: break;
        case 1: 
          { return JCupTokenId.T_JAVA;
          }
        case 37: break;
        case 3: 
          { return JCupTokenId.T_IDENTIFIER;
          }
        case 38: break;
        default: 
          if (zzInput == YYEOF) 
            //zzAtEOF = true;
              {         if(input.readLength() > 0) {
            String yytext = yytext();
            // backup eof
            input.backup(1);
            //and return the text as error token
             return JCupTokenId.T_JAVA;
        } else {
            return null;
        }
 }
          
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
