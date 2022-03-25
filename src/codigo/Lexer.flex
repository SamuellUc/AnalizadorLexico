package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%
/*Espacios en blanco*/
{espacio} {/*Ignore*/}

/*Comentarios*/
"~".* {/*Ignore*/}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/*Tipos de datos*/
( ENT ) {lexeme=yytext(); return Int;}
( DEC ) {lexeme=yytext(); return Double;}
( CAR ) {lexeme=yytext(); return Char;}
( CAD ) {lexeme=yytext(); return String;}
( BOOL ) {lexeme=yytext(); return Booleano;}
( VAC ) {lexeme=yytext(); return Void;}
( CONLEER ) {lexeme=yytext(); return Lectura;}
( CONESC ) {lexeme=yytext(); return Escritura;}

/* Palabra reservada If */
( SI ) {lexeme=yytext(); return If;}

/* Palabra reservada Elseif */
( OSI ) {lexeme=yytext(); return Elseif;}

/* Palabra reservada Else */
( SINO ) {lexeme=yytext(); return Else;}

/* Palabra reservada While */
( MIENTRAS ) {lexeme=yytext(); return While;}

/* Palabra reservada For */
( HASTA ) {lexeme=yytext(); return For;}

/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division*/
( "/" ) {lexeme=yytext(); return Division;}

/* Operador Modulo */
( "%" ) {lexeme=yytext(); return Modulo;}




INIFUNC {lexeme=yytext(); return INIFUNC;}
FINFUNC {lexeme=yytext(); return FINFUNC;}
FUNC {lexeme=yytext(); return FUNC;}
RET {lexeme=yytext(); return RET;}
CLASE {lexeme=yytext(); return CLASE;}
INIOBJ {lexeme=yytext(); return INIOBJ;}
NVO {lexeme=yytext(); return NVO;}
MISM {lexeme=yytext(); return MISM;}
INIVAR {lexeme=yytext(); return INIVAR;}
FINVAR {lexeme=yytext(); return FINVAR;}
INIEJEC {lexeme=yytext(); return INIEJEC;}
FINEJEC {lexeme=yytext(); return FINEJEC;}



"$" {lexeme=yytext(); return Accerder;}

/*Operadores logicos*/
("|") {lexeme=yytext(); return Or;}
("&") {lexeme=yytext(); return And;}
("!") {lexeme=yytext(); return Not;}
("=/=") {lexeme=yytext(); return Diferencia_logica;}
(":=") {lexeme=yytext(); return Igualdad_logica;}

/*Operadores relacionales*/
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" ) {lexeme = yytext(); return Op_incremento;}
( "--" ) {lexeme = yytext(); return Op_decremento;}

/*Operadores Booleanos*/
( VER ) {lexeme = yytext(); return True;}
( FAL ) {lexeme = yytext(); return False;}

/*Salto de linea*/
("\n") {return Line;}

("#") {lexeme=yytext(); return Fin_de_linea;}
("|>") {lexeme=yytext(); return Inicio_de_programa;}  
("<|") {lexeme=yytext(); return Fin_de_programa;}  
("[") {lexeme=yytext(); return Inicio_de_delimitador_de_bloque;}
("]") {lexeme=yytext(); return Fin_de_delimitador_de_bloque;}  
("{") {lexeme=yytext(); return Inicio_de_delimitador_de_argumentos;} 
("}") {lexeme=yytext(); return Fin_de_delimitador_de_argumentos;} 

/*Identificador*/
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/*Regex Tipos de datos*/
("(-"{D}")")|{D} {lexeme=yytext(); return Numero;}
^({D}([.]{D})?)$ {lexeme=yytext(); return NumeroDecimal;}
[a-zA-Z] {lexeme=yytext(); return Caracter;}
{L}({L}|{D})* {lexeme=yytext(); return Caracteres;}


 . {return ERROR;}

