
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Dec 06 10:29:23 EST 2021
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Dec 06 10:29:23 EST 2021
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\046\000\002\002\004\000\002\002\015\000\002\002" +
    "\013\000\002\003\004\000\002\003\003\000\002\003\004" +
    "\000\002\003\003\000\002\003\004\000\002\003\003\000" +
    "\002\003\004\000\002\003\003\000\002\003\004\000\002" +
    "\003\003\000\002\004\005\000\002\004\007\000\002\004" +
    "\007\000\002\004\006\000\002\004\006\000\002\004\010" +
    "\000\002\004\010\000\002\004\011\000\002\004\010\000" +
    "\002\013\003\000\002\013\005\000\002\013\005\000\002" +
    "\013\005\000\002\013\006\000\002\013\007\000\002\006" +
    "\011\000\002\010\020\000\002\007\027\000\002\011\011" +
    "\000\002\012\011\000\002\014\011\000\002\014\011\000" +
    "\002\005\005\000\002\005\004\000\002\005\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\164\000\004\041\004\001\002\000\004\015\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\010\004\013\005\012\016\015\001\002\000\016\004" +
    "\ufff9\005\ufff9\016\ufff9\026\ufff9\030\ufff9\043\ufff9\001\002" +
    "\000\016\004\ufffd\005\ufffd\016\ufffd\026\ufffd\030\ufffd\043" +
    "\ufffd\001\002\000\004\047\151\001\002\000\006\035\134" +
    "\047\135\001\002\000\010\004\013\005\012\016\124\001" +
    "\002\000\004\025\116\001\002\000\020\004\ufff5\005\ufff5" +
    "\016\ufff5\026\ufff5\030\ufff5\043\ufff5\045\064\001\002\000" +
    "\020\004\ufff7\005\ufff7\016\ufff7\026\ufff7\030\ufff7\043\ufff7" +
    "\045\046\001\002\000\020\004\ufffb\005\ufffb\016\ufffb\026" +
    "\ufffb\030\ufffb\043\ufffb\045\021\001\002\000\006\036\023" +
    "\047\024\001\002\000\004\046\035\001\002\000\006\040" +
    "\uffeb\046\uffeb\001\002\000\004\033\025\001\002\000\012" +
    "\006\027\036\030\047\031\050\026\001\002\000\006\040" +
    "\uffe9\046\uffe9\001\002\000\006\006\032\047\033\001\002" +
    "\000\006\040\uffea\046\uffea\001\002\000\006\040\uffe8\046" +
    "\uffe8\001\002\000\006\040\uffe7\046\uffe7\001\002\000\004" +
    "\006\034\001\002\000\006\040\uffe6\046\uffe6\001\002\000" +
    "\004\043\036\001\002\000\006\004\013\005\012\001\002" +
    "\000\010\004\013\005\012\043\044\001\002\000\016\004" +
    "\ufffe\005\ufffe\016\ufffe\026\ufffe\030\ufffe\043\ufffe\001\002" +
    "\000\020\004\ufffc\005\ufffc\016\ufffc\026\ufffc\030\ufffc\043" +
    "\ufffc\045\021\001\002\000\016\004\ufffa\005\ufffa\016\ufffa" +
    "\026\ufffa\030\ufffa\043\ufffa\001\002\000\020\004\ufff6\005" +
    "\ufff6\016\ufff6\026\ufff6\030\ufff6\043\ufff6\045\064\001\002" +
    "\000\020\004\uffe5\005\uffe5\016\uffe5\026\uffe5\030\uffe5\043" +
    "\uffe5\045\uffe5\001\002\000\020\004\ufff8\005\ufff8\016\ufff8" +
    "\026\ufff8\030\ufff8\043\ufff8\045\046\001\002\000\006\036" +
    "\023\047\024\001\002\000\004\046\050\001\002\000\004" +
    "\043\051\001\002\000\006\004\013\005\012\001\002\000" +
    "\010\004\013\005\012\043\053\001\002\000\020\004\uffe2" +
    "\005\uffe2\016\uffe2\026\uffe2\030\uffe2\043\uffe2\045\uffe2\001" +
    "\002\000\004\045\021\001\002\000\004\045\056\001\002" +
    "\000\006\036\023\047\024\001\002\000\004\046\060\001" +
    "\002\000\004\043\061\001\002\000\006\004\013\005\012" +
    "\001\002\000\010\004\013\005\012\043\063\001\002\000" +
    "\020\004\uffe4\005\uffe4\016\uffe4\026\uffe4\030\uffe4\043\uffe4" +
    "\045\uffe4\001\002\000\006\004\065\047\066\001\002\000" +
    "\004\047\110\001\002\000\004\007\074\001\002\000\004" +
    "\046\070\001\002\000\004\043\071\001\002\000\006\004" +
    "\013\005\012\001\002\000\010\004\013\005\012\043\073" +
    "\001\002\000\020\004\uffe1\005\uffe1\016\uffe1\026\uffe1\030" +
    "\uffe1\043\uffe1\045\uffe1\001\002\000\004\050\075\001\002" +
    "\000\004\040\076\001\002\000\006\036\023\047\024\001" +
    "\002\000\004\040\100\001\002\000\006\035\101\047\102" +
    "\001\002\000\004\047\107\001\002\000\006\034\104\035" +
    "\105\001\002\000\004\046\uffdf\001\002\000\004\050\106" +
    "\001\002\000\004\046\uffdd\001\002\000\004\046\uffde\001" +
    "\002\000\004\046\uffdc\001\002\000\004\007\111\001\002" +
    "\000\004\040\112\001\002\000\006\036\023\047\024\001" +
    "\002\000\004\040\114\001\002\000\006\035\101\047\102" +
    "\001\002\000\004\046\uffe0\001\002\000\004\026\117\001" +
    "\002\000\004\027\120\001\002\000\006\004\013\005\012" +
    "\001\002\000\010\004\013\005\012\030\122\001\002\000" +
    "\004\042\123\001\002\000\004\002\uffff\001\002\000\004" +
    "\025\125\001\002\000\006\004\013\005\012\001\002\000" +
    "\010\004\013\005\012\026\127\001\002\000\004\027\130" +
    "\001\002\000\006\004\013\005\012\001\002\000\010\004" +
    "\013\005\012\030\132\001\002\000\004\042\133\001\002" +
    "\000\004\002\000\001\002\000\004\047\147\001\002\000" +
    "\012\007\141\034\137\035\140\040\136\001\002\000\016" +
    "\004\ufff4\005\ufff4\016\ufff4\026\ufff4\030\ufff4\043\ufff4\001" +
    "\002\000\004\050\145\001\002\000\004\040\144\001\002" +
    "\000\004\050\142\001\002\000\004\040\143\001\002\000" +
    "\016\004\ufff2\005\ufff2\016\ufff2\026\ufff2\030\ufff2\043\ufff2" +
    "\001\002\000\016\004\ufff1\005\ufff1\016\ufff1\026\ufff1\030" +
    "\ufff1\043\ufff1\001\002\000\004\040\146\001\002\000\016" +
    "\004\ufff3\005\ufff3\016\ufff3\026\ufff3\030\ufff3\043\ufff3\001" +
    "\002\000\004\040\150\001\002\000\016\004\ufff0\005\ufff0" +
    "\016\ufff0\026\ufff0\030\ufff0\043\ufff0\001\002\000\006\007" +
    "\153\034\152\001\002\000\004\006\161\001\002\000\004" +
    "\006\154\001\002\000\006\006\155\047\156\001\002\000" +
    "\004\040\160\001\002\000\004\006\157\001\002\000\016" +
    "\004\uffec\005\uffec\016\uffec\026\uffec\030\uffec\043\uffec\001" +
    "\002\000\016\004\uffee\005\uffee\016\uffee\026\uffee\030\uffee" +
    "\043\uffee\001\002\000\006\006\162\047\163\001\002\000" +
    "\004\040\166\001\002\000\004\006\164\001\002\000\004" +
    "\040\165\001\002\000\016\004\uffed\005\uffed\016\uffed\026" +
    "\uffed\030\uffed\043\uffed\001\002\000\016\004\uffef\005\uffef" +
    "\016\uffef\026\uffef\030\uffef\043\uffef\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\164\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\016\003\013\004\010" +
    "\006\017\010\007\011\016\012\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\004\037\006\040\010\041\011\044\012\042\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\021\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\036\004\010\006" +
    "\017\010\007\011\016\012\015\001\001\000\014\004\037" +
    "\006\040\010\041\011\044\012\042\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\006\053\010\054\001\001\000\002\001\001\000" +
    "\004\013\046\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\003\051\004\010\006\017\010\007\011\016\012" +
    "\015\001\001\000\014\004\037\006\040\010\041\011\044" +
    "\012\042\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\013\056\001\001\000\002\001\001" +
    "\000\002\001\001\000\016\003\061\004\010\006\017\010" +
    "\007\011\016\012\015\001\001\000\014\004\037\006\040" +
    "\010\041\011\044\012\042\001\001\000\002\001\001\000" +
    "\004\014\066\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\003\071\004" +
    "\010\006\017\010\007\011\016\012\015\001\001\000\014" +
    "\004\037\006\040\010\041\011\044\012\042\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\013\076\001\001\000\002\001\001\000\004\005\102\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\013\112\001\001\000\002\001\001\000\004\005\114\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\003\120\004\010\006\017\010\007\011\016\012" +
    "\015\001\001\000\014\004\037\006\040\010\041\011\044" +
    "\012\042\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\016\003\125\004\010\006\017\010\007" +
    "\011\016\012\015\001\001\000\014\004\037\006\040\010" +
    "\041\011\044\012\042\001\001\000\002\001\001\000\016" +
    "\003\130\004\010\006\017\010\007\011\016\012\015\001" +
    "\001\000\014\004\037\006\040\010\041\011\044\012\042" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // DECLARACION_HASTA ::= Op_incremento Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_HASTA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // DECLARACION_HASTA ::= Identificador Op_incremento 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_HASTA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // DECLARACION_HASTA ::= Identificador Op_atribucion Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_HASTA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SENTENCIA_HASTA ::= Identificador Igual Numero Fin_de_linea SENTENCIA_BOOLEANA Fin_de_linea DECLARACION_HASTA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_HASTA",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SENTENCIA_HASTA ::= T_dato Identificador Igual Fin_de_linea SENTENCIA_BOOLEANA Fin_de_linea DECLARACION_HASTA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_HASTA",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // HASTA ::= HASTA Inicio_de_delimitador_de_argumentos SENTENCIA_HASTA Fin_de_delimitador_de_argumentos Inicio_de_delimitador_de_bloque SENTENCIA Inicio_de_delimitador_de_bloque 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("HASTA",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // MIENTRAS ::= MIENTRAS Inicio_de_delimitador_de_argumentos SENTENCIA_BOOLEANA Fin_de_delimitador_de_argumentos Inicio_de_delimitador_de_bloque SENTENCIA Inicio_de_delimitador_de_bloque 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("MIENTRAS",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SINO ::= SI Inicio_de_delimitador_de_argumentos SENTENCIA_BOOLEANA Fin_de_delimitador_de_argumentos Inicio_de_delimitador_de_bloque SENTENCIA Inicio_de_delimitador_de_bloque OSI Inicio_de_delimitador_de_argumentos SENTENCIA_BOOLEANA Fin_de_delimitador_de_argumentos Inicio_de_delimitador_de_bloque SENTENCIA Inicio_de_delimitador_de_bloque SINO Inicio_de_delimitador_de_argumentos SENTENCIA_BOOLEANA Fin_de_delimitador_de_argumentos Inicio_de_delimitador_de_bloque SENTENCIA Inicio_de_delimitador_de_bloque 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SINO",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-20)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // OSI ::= SI Inicio_de_delimitador_de_argumentos SENTENCIA_BOOLEANA Fin_de_delimitador_de_argumentos Inicio_de_delimitador_de_bloque SENTENCIA Inicio_de_delimitador_de_bloque OSI Inicio_de_delimitador_de_argumentos SENTENCIA_BOOLEANA Fin_de_delimitador_de_argumentos Inicio_de_delimitador_de_bloque SENTENCIA Inicio_de_delimitador_de_bloque 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OSI",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-13)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SI ::= SI Inicio_de_delimitador_de_argumentos SENTENCIA_BOOLEANA Fin_de_delimitador_de_argumentos Inicio_de_delimitador_de_bloque SENTENCIA Inicio_de_delimitador_de_bloque 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SI",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= Cadena Identificador Igual Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Identificador Comillas Fin_de_linea 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= Cadena Identificador Igual Comillas Comillas Fin_de_linea 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Comillas Fin_de_linea 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION ::= T_dato Op_incremento Identificador Fin_de_linea 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= T_dato Identificador Op_incremento Fin_de_linea 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARACION ::= T_dato Identificador Igual Numero Fin_de_linea 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DECLARACION ::= T_dato Identificador Op_atribucion Numero Fin_de_linea 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DECLARACION ::= T_dato Identificador Fin_de_linea 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= HASTA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= SENTENCIA HASTA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= MIENTRAS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= SENTENCIA MIENTRAS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= OSI 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= SENTENCIA OSI 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= SI 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= SENTENCIA SI 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Inicio_de_programa INIFUNC FINFUNC INIVAR FINVAR INIEJEC SENTENCIA FINEJEC Fin_de_programa 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Inicio_de_programa INIFUNC SENTENCIA FINFUNC INIVAR SENTENCIA FINVAR INIEJEC SENTENCIA FINEJEC Fin_de_programa 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

