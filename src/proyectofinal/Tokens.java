/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author Jose
 */
public enum Tokens {
    // Palabras clave de control de flujo
    If, Else, Switch, Case, Default, While, Do, For, Break, Continue, Return,
    
    // Palabras clave de declaración y definición
    Class, Interface, Extends, Implements, Enum, Package, Import, Void, New,
    
    // Palabras clave de acceso y modificadores
    Public, Private, Protected, Static, Final, Abstract, Synchronized, Volatile, Transient,
    
    // Tipos de datos primitivos
    Int, Long, Short, Byte, Float, Double, Boolean, Char,
    
    // Palabras clave de manejo de excepciones
    Try, Catch, Finally, Throw, Throws,
    
    // Palabras clave de control de memoria y referencia
    This, Super, Null, InstanceOf,
    
    // Operadores
    OpLogico,        // &&, ||
    OpNot,           // !
    OpComparacion,   // ==, !=, >, <, >=, <=
    OpAritmetico,    // +, -, *, /, %
    OpIncremento,    // ++, --
    OpAsignacion,    // =, +=, -=, etc.
    
    // Símbolos
    ParentesisAbierto,
    ParentesisCerrado,
    LlaveAbierta,
    LlaveCerrada,
    CorcheteAbierto,
    CorcheteCerrado,
    PuntoComa,
    Punto,
    Coma,
    DosPuntos,
    
    // Otros elementos
    Length,  // Para array.length
    Identificador,
    NumeroEntero,
    NumeroDecimal,
    CadenaTexto,
    Comentario,
    ERROR,
    
    // Palabras clave específicas de Java
    Main, SystemClass, Out, Println, Print, String, Args,
    
    // Palabras clave específicas de Java
    Override,  // Para @Override
}
