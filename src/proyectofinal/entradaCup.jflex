package proyectofinal;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
%ignorecase
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r\f]
saltoLinea=\n
comentarioLinea="//".*
comentarioBloque="/*"([^*]|"*"+[^/*])*"*"+"/"
ignorar={espacio}|{saltoLinea}|{comentarioLinea}|{comentarioBloque}
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Manejo de nuevas líneas */
{saltoLinea} { yycolumn = 0; }

/* Espacios en blanco */
{espacio} { yycolumn += yytext().length(); }

/* Palabras clave específicas de Java */
"main"         { yycolumn += yytext().length(); return symbol(sym.Main, yytext()); }
"System"       { yycolumn += yytext().length(); return symbol(sym.SystemClass, yytext()); }
"out"          { yycolumn += yytext().length(); return symbol(sym.Out, yytext()); }
"println"      { yycolumn += yytext().length(); return symbol(sym.Println, yytext()); }
"print"        { yycolumn += yytext().length(); return symbol(sym.Print, yytext()); }
"String"       { yycolumn += yytext().length(); return symbol(sym.String, yytext()); }
"args"         { yycolumn += yytext().length(); return symbol(sym.Args, yytext()); }

/* Palabras clave de control de flujo */
"if"            { yycolumn += yytext().length(); return symbol(sym.If, yytext()); }
"else"          { yycolumn += yytext().length(); return symbol(sym.Else, yytext()); }
"switch"        { yycolumn += yytext().length(); return symbol(sym.Switch, yytext()); }
"case"          { yycolumn += yytext().length(); return symbol(sym.Case, yytext()); }
"default"       { yycolumn += yytext().length(); return symbol(sym.Default, yytext()); }
"while"         { yycolumn += yytext().length(); return symbol(sym.While, yytext()); }
"do"            { yycolumn += yytext().length(); return symbol(sym.Do, yytext()); }
"for"           { yycolumn += yytext().length(); return symbol(sym.For, yytext()); }
"break"         { yycolumn += yytext().length(); return symbol(sym.Break, yytext()); }
"continue"      { yycolumn += yytext().length(); return symbol(sym.Continue, yytext()); }
"return"        { yycolumn += yytext().length(); return symbol(sym.Return, yytext()); }

/* Palabras clave de declaración y definición */
"class"         { yycolumn += yytext().length(); return symbol(sym.Class, yytext()); }
"interface"     { yycolumn += yytext().length(); return symbol(sym.Interface, yytext()); }
"extends"       { yycolumn += yytext().length(); return symbol(sym.Extends, yytext()); }
"implements"    { yycolumn += yytext().length(); return symbol(sym.Implements, yytext()); }
"void"          { yycolumn += yytext().length(); return symbol(sym.Void, yytext()); }
"new"           { yycolumn += yytext().length(); return symbol(sym.New, yytext()); }
"Integer"       { yycolumn += yytext().length(); return symbol(sym.Integer, yytext()); }
"static"        { yycolumn += yytext().length(); return symbol(sym.Static, yytext()); }
"private"       { yycolumn += yytext().length(); return symbol(sym.Private, yytext()); }
"public"        { yycolumn += yytext().length(); return symbol(sym.Public, yytext()); }

/* Tipos de datos primitivos */
"int"           { yycolumn += yytext().length(); return symbol(sym.Int, yytext()); }
"long"          { yycolumn += yytext().length(); return symbol(sym.Long, yytext()); }
"short"         { yycolumn += yytext().length(); return symbol(sym.Short, yytext()); }
"byte"          { yycolumn += yytext().length(); return symbol(sym.Byte, yytext()); }
"float"         { yycolumn += yytext().length(); return symbol(sym.Float, yytext()); }
"double"        { yycolumn += yytext().length(); return symbol(sym.Double, yytext()); }
"boolean"       { yycolumn += yytext().length(); return symbol(sym.Boolean, yytext()); }
"char"          { yycolumn += yytext().length(); return symbol(sym.Char, yytext()); }

/* Manejo de excepciones */
"try"           { yycolumn += yytext().length(); return symbol(sym.Try, yytext()); }
"catch"         { yycolumn += yytext().length(); return symbol(sym.Catch, yytext()); }
"finally"       { yycolumn += yytext().length(); return symbol(sym.Finally, yytext()); }

/* Referencias y control de memoria */
"this"          { yycolumn += yytext().length(); return symbol(sym.This, yytext()); }
"super"         { yycolumn += yytext().length(); return symbol(sym.Super, yytext()); }
"null"          { yycolumn += yytext().length(); return symbol(sym.Null, yytext()); }

/* Operadores */
"&&"           { yycolumn += yytext().length(); return symbol(sym.OpLogico, "Y"); }
"||"           { yycolumn += yytext().length(); return symbol(sym.OpLogico, "O"); }
"!"            { yycolumn += yytext().length(); return symbol(sym.OpLogico, "NO"); }
"=="|"!="|">"|"<"|">="|"<=" { yycolumn += yytext().length(); return symbol(sym.OpComparacion, yytext()); }
"+"|"-"|"*"|"/"|"%" { yycolumn += yytext().length(); return symbol(sym.OpAritmetico, yytext()); }
"++"|"--"       { yycolumn += yytext().length(); return symbol(sym.OpIncremento, yytext()); }
"="|"+="|"-="|"*="|"/=" { yycolumn += yytext().length(); return symbol(sym.OpAsignacion, yytext()); }

/* Símbolos */
"("             { yycolumn += yytext().length(); return symbol(sym.ParentesisAbierto, yytext()); }
")"             { yycolumn += yytext().length(); return symbol(sym.ParentesisCerrado, yytext()); }
"{"             { yycolumn += yytext().length(); return symbol(sym.LlaveAbierta, yytext()); }
"}"             { yycolumn += yytext().length(); return symbol(sym.LlaveCerrada, yytext()); }
"["             { yycolumn += yytext().length(); return symbol(sym.CorcheteAbierto, yytext()); }
"]"             { yycolumn += yytext().length(); return symbol(sym.CorcheteCerrado, yytext()); }
";"             { yycolumn += yytext().length(); return symbol(sym.PuntoComa, yytext()); }
"."             { yycolumn += yytext().length(); return symbol(sym.Punto, yytext()); }
","             { yycolumn += yytext().length(); return symbol(sym.Coma, yytext()); }
":"             { yycolumn += yytext().length(); return symbol(sym.DosPuntos, yytext()); }

/* Números */
{D}+            { yycolumn += yytext().length(); return symbol(sym.NumeroEntero, yytext()); }
{D}+"."{D}+     { yycolumn += yytext().length(); return symbol(sym.NumeroDecimal, yytext()); }

/* Length */
"length"        { yycolumn += yytext().length(); return symbol(sym.Length, yytext()); }

/* Identificadores */
{L}({L}|{D})*   { yycolumn += yytext().length(); return symbol(sym.Identificador, yytext()); }

/* Cadenas de texto */
\"([^\"\\]|\\.)*\" { yycolumn += yytext().length(); return symbol(sym.CadenaTexto, yytext()); }

/* Comentarios */
"//".*         { /* Ignorar comentarios de línea */ }
"/*"([^*]|"*"+[^*/])*"*"+"/" { /* Ignorar comentarios multilínea */ }

/* Anotaciones */
"@Override"     { yycolumn += yytext().length(); return symbol(sym.Override, yytext()); }

/* Ignorar espacios y comentarios */
{ignorar}     { /* Ignorar */ }

/* Agregar manejo de espacios y caracteres especiales */
"{"           { return symbol(sym.LlaveAbierta); }
"}"           { return symbol(sym.LlaveCerrada); }
"["           { return symbol(sym.CorcheteAbierto); }
"]"           { return symbol(sym.CorcheteCerrado); }
"("           { return symbol(sym.ParentesisAbierto); }
")"           { return symbol(sym.ParentesisCerrado); }
";"           { return symbol(sym.PuntoComa); }
"."           { return symbol(sym.Punto); }
","           { return symbol(sym.Coma); }
"="           { return symbol(sym.OpAsignacion); }
"+"           { return symbol(sym.OpAritmetico); }
"-"           { return symbol(sym.OpAritmetico); }
"*"           { return symbol(sym.OpAritmetico); }
"/"           { return symbol(sym.OpAritmetico); }
"++"          { return symbol(sym.OpIncremento); }
"--"          { return symbol(sym.OpIncremento); }
">"           { return symbol(sym.OpComparacion); }
"<"           { return symbol(sym.OpComparacion); }
">="          { return symbol(sym.OpComparacion); }
"<="          { return symbol(sym.OpComparacion); }
"=="          { return symbol(sym.OpComparacion); }
"!="          { return symbol(sym.OpComparacion); }

/* Agregar reglas para números negativos */
-?[0-9]+      { return symbol(sym.NumeroEntero); }
-?[0-9]+\.[0-9]+ { return symbol(sym.NumeroDecimal); }

