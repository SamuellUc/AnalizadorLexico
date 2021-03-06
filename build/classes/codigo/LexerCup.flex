
package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r\n]+

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolum, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolum);
    }
%}
%%

/*Espacios en blanco*/
{espacio} {/*Ignore*/}

/*Comentarios*/
"~".* {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}


/*Tipos de datos*/
(ENT ) {return new Symbol(sym.Int, yychar, yyline, yytext());}
( DEC ) {return new Symbol(sym.Double, yychar, yyline, yytext());}
( CAR ) {return new Symbol(sym.Char, yychar, yyline, yytext());}
( CAD ) {return new Symbol(sym.String, yychar, yyline, yytext());}
( BOOL ) {return new Symbol(sym.Booleano, yychar, yyline, yytext());}
( VAC ) {return new Symbol(sym.Void, yychar, yyline, yytext());}
( CONLEER ) {return new Symbol(sym.Lectura, yychar, yyline, yytext());}
( CONESC ) {return new Symbol(sym.Escritura, yychar, yyline, yytext());}

/* Palabra reservada If */
( SI ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Elseif */
( OSI ) {return new Symbol(sym.Elseif, yychar, yyline, yytext());}

/* Palabra reservada Else */
( SINO ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada While */
( MIENTRAS ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( HASTA ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}
/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division*/
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operador Modulo */
( "%" ) {return new Symbol(sym.Modulo, yychar, yyline, yytext());}




INIFUNC {return new Symbol(sym.INIFUNC, yychar, yyline, yytext());}
FINFUNC {return new Symbol(sym.FINFUNC, yychar, yyline, yytext());}
FUNC {return new Symbol(sym.FUNC, yychar, yyline, yytext());} 
RET {return new Symbol(sym.RET, yychar, yyline, yytext());}
CLASE {return new Symbol(sym.CLASE, yychar, yyline, yytext());}
INIOBJ {return new Symbol(sym.INIOBJ, yychar, yyline, yytext());}
NVO {return new Symbol(sym.NVO, yychar, yyline, yytext());}
MISM {return new Symbol(sym.MISM, yychar, yyline, yytext());}
INIVAR {return new Symbol(sym.INIVAR, yychar, yyline, yytext());}
FINVAR {return new Symbol(sym.FINVAR, yychar, yyline, yytext());}
INIEJEC {return new Symbol(sym.INIEJEC, yychar, yyline, yytext());}
FINEJEC {return new Symbol(sym.FINEJEC, yychar, yyline, yytext());}



("$") {return new Symbol(sym.Op_accerder, yychar, yyline, yytext());}

/*Operadores logicos*/

("|") {return new Symbol(sym.Or, yychar, yyline, yytext());}
("&") {return new Symbol(sym.And, yychar, yyline, yytext());}
("!") {return new Symbol(sym.Not, yychar, yyline, yytext());}
("=/=") {return new Symbol(sym.Diferencia_logica, yychar, yyline, yytext());}
(":=") {return new Symbol(sym.Igualdad_logica, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}
( "--" ) {return new Symbol(sym.Op_decremento, yychar, yyline, yytext());}

/*Operadores relacionales*/
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "=" | "-="  | "*=" | "/=" | "%=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( VER ) {return new Symbol(sym.True, yychar, yyline, yytext());}
( FAL ) {return new Symbol(sym.False, yychar, yyline, yytext());}


("#") {return new Symbol(sym.Fin_de_linea, yychar, yyline, yytext());}
("|>") {return new Symbol(sym.Inicio_de_programa, yychar, yyline, yytext());}  
("<|") {return new Symbol(sym.Fin_de_programa, yychar, yyline, yytext());}  
("[") {return new Symbol(sym.Inicio_de_delimitador_de_bloque, yychar, yyline, yytext());}
("]") {return new Symbol(sym.Fin_de_delimitador_de_bloque, yychar, yyline, yytext());}  
("{") {return new Symbol(sym.Inicio_de_delimitador_de_argumentos, yychar, yyline, yytext());} 
("}") {return new Symbol(sym.Fin_de_delimitador_de_argumentos, yychar, yyline, yytext());} 

/*Identificador*/
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/*Regex Tipos de datos*/
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
^({D}([.]{D})?)$ {return new Symbol(sym.NumeroDecimal, yychar, yyline, yytext());}
[a-zA-Z] {return new Symbol(sym.Caracter, yychar, yyline, yytext());}
{L}({L}|{D})* {return new Symbol(sym.Caracteres, yychar, yyline, yytext());}

/*Error*/
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}

