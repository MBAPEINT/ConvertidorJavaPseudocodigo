package proyectofinal;
import static proyectofinal.Tokens.*;
%%
%class Lexer
%type Tokens
%unicode
%line
%column
%public
%char
%ignorecase
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r\n]+
%{
    public String lexeme;
%}
%%

/* Palabras clave específicas de Java */
"main"         {lexeme=yytext(); return Main;}
"System"       {lexeme=yytext(); return SystemClass;}
"out"          {lexeme=yytext(); return Out;}
"println"      {lexeme=yytext(); return Println;}
"print"        {lexeme=yytext(); return Print;}
"String"       {lexeme=yytext(); return String;}
"args"         {lexeme=yytext(); return Args;}

/* Palabras clave de control de flujo */
"if"           {lexeme=yytext(); return If;}
"else"         {lexeme=yytext(); return Else;}
"switch"       {lexeme=yytext(); return Switch;}
"case"         {lexeme=yytext(); return Case;}
"default"      {lexeme=yytext(); return Default;}
"while"        {lexeme=yytext(); return While;}
"do"           {lexeme=yytext(); return Do;}
"for"          {lexeme=yytext(); return For;}
"break"        {lexeme=yytext(); return Break;}
"continue"     {lexeme=yytext(); return Continue;}
"return"       {lexeme=yytext(); return Return;}

/* Palabras clave de declaración y definición */
"class"        {lexeme=yytext(); return Class;}
"interface"    {lexeme=yytext(); return Interface;}
"extends"      {lexeme=yytext(); return Extends;}
"implements"   {lexeme=yytext(); return Implements;}
"enum"         {lexeme=yytext(); return Enum;}
"package"      {lexeme=yytext(); return Package;}
"import"       {lexeme=yytext(); return Import;}
"void"         {lexeme=yytext(); return Void;}
"new"          {lexeme=yytext(); return New;}

/* Modificadores de acceso y otros modificadores */
"public"       {lexeme=yytext(); return Public;}
"private"      {lexeme=yytext(); return Private;}
"protected"    {lexeme=yytext(); return Protected;}
"static"       {lexeme=yytext(); return Static;}
"final"        {lexeme=yytext(); return Final;}
"abstract"     {lexeme=yytext(); return Abstract;}
"synchronized" {lexeme=yytext(); return Synchronized;}
"volatile"     {lexeme=yytext(); return Volatile;}
"transient"    {lexeme=yytext(); return Transient;}

/* Tipos de datos primitivos */
"int"           {lexeme=yytext(); return Int;}
"long"          {lexeme=yytext(); return Long;}
"short"         {lexeme=yytext(); return Short;}
"byte"          {lexeme=yytext(); return Byte;}
"float"         {lexeme=yytext(); return Float;}
"double"        {lexeme=yytext(); return Double;}
"boolean"       {lexeme=yytext(); return Boolean;}
"char"          {lexeme=yytext(); return Char;}

/* Manejo de excepciones */
"try"           {lexeme=yytext(); return Try;}
"catch"         {lexeme=yytext(); return Catch;}
"finally"       {lexeme=yytext(); return Finally;}
"throw"         {lexeme=yytext(); return Throw;}
"throws"        {lexeme=yytext(); return Throws;}

/* Referencias y control de memoria */
"this"          {lexeme=yytext(); return This;}
"super"         {lexeme=yytext(); return Super;}
"null"          {lexeme=yytext(); return Null;}
"instanceof"    {lexeme=yytext(); return InstanceOf;}

/* Operadores */
"&&"|"||"       {lexeme=yytext(); return OpLogico;}
"!"             {lexeme=yytext(); return OpNot;}
"=="|"!="|">"|"<"|">="|"<=" {lexeme=yytext(); return OpComparacion;}
"+"|"-"|"*"|"/"|"%" {lexeme=yytext(); return OpAritmetico;}
"++"|"--"       {lexeme=yytext(); return OpIncremento;}
"="|"+="|"-="|"*="|"/=" {lexeme=yytext(); return OpAsignacion;}

/* Símbolos */
"("             {lexeme=yytext(); return ParentesisAbierto;}
")"             {lexeme=yytext(); return ParentesisCerrado;}
"{"             {lexeme=yytext(); return LlaveAbierta;}
"}"             {lexeme=yytext(); return LlaveCerrada;}
"["             {lexeme=yytext(); return CorcheteAbierto;}
"]"             {lexeme=yytext(); return CorcheteCerrado;}
";"             {lexeme=yytext(); return PuntoComa;}
"."             {lexeme=yytext(); return Punto;}
","             {lexeme=yytext(); return Coma;}
":"             {lexeme=yytext(); return DosPuntos;}

/* Números */
{D}+           {lexeme=yytext(); return NumeroEntero;}
{D}+"."{D}+    {lexeme=yytext(); return NumeroDecimal;}

/* Length */
"length"        {lexeme=yytext(); return Length;}

/* Identificadores */
{L}({L}|{D})*  {lexeme=yytext(); return Identificador;}

/* Cadenas de texto */
\"([^\"\\]|\\.)*\" {lexeme=yytext(); return CadenaTexto;}

/* Comentarios */
"//".*         { /* Ignorar comentarios de línea */ }
"/*"([^*]|"*"+[^*/])*"*"+"/" { /* Ignorar comentarios multilínea */ }

/* Espacios en blanco */
{espacio}      { /* Ignorar */ }

/* Error */
.              {return ERROR;}

/* Anotaciones */
"@Override"     {lexeme=yytext(); return Override;}
