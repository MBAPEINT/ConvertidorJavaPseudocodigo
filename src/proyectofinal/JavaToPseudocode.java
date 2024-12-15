package proyectofinal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaToPseudocode {
    
    public static String convert(String javaCode) {
        StringBuilder pseudocode = new StringBuilder();
        String[] lines = javaCode.split("\n");
        int indentLevel = 0;
        boolean inMultilineComment = false;
        
        for (String line : lines) {
            line = line.trim();
            
            // Manejar comentarios multilínea
            if (line.contains("/*")) {
                inMultilineComment = true;
                line = "// " + line.substring(line.indexOf("/*") + 2).trim();
            }
            if (line.contains("*/")) {
                inMultilineComment = false;
                line = "// " + line.substring(0, line.indexOf("*/")).trim();
            }
            if (inMultilineComment) {
                line = "// " + line;
            }
            
            // Mantener comentarios de una línea
            if (line.startsWith("//")) {
                pseudocode.append("    ".repeat(Math.max(0, indentLevel)));
                pseudocode.append(line).append("\n");
                continue;
            }
            
            // Ignorar líneas vacías
            if (line.isEmpty()) {
                continue;
            }
            
            // Ajustar nivel de indentación
            if (line.contains("}")) {
                indentLevel--;
            }
            
            // Convertir la línea
            String convertedLine = convertLine(line);
            if (!convertedLine.isEmpty()) {
                // Aplicar indentación
                pseudocode.append("    ".repeat(Math.max(0, indentLevel)));
                pseudocode.append(convertedLine).append("\n");
            }
            
            // Ajustar nivel de indentación para la siguiente línea
            if (line.contains("{")) {
                indentLevel++;
            }
        }
        
        return pseudocode.toString();
    }
    
    private static String convertLine(String line) {
        // Convertir valores booleanos (mover al principio)
        line = line.replaceAll("\\btrue\\b", "VERDADERO");
        line = line.replaceAll("\\bfalse\\b", "FALSO");
        
        // Remover punto y coma al final
        line = line.replaceAll(";$", "");
        
        // Convertir declaraciones de clase
        if (line.matches(".*class\\s+\\w+.*")) {
            return "INICIO CLASE " + extractClassName(line);
        }
        
        // Convertir declaraciones de método con public/private/protected
        if (line.matches("(public|private|protected).*\\s+\\w+\\s*\\(.*\\)\\s*\\{?")) {
            return "PROCEDIMIENTO " + extractMethodName(line) + extractParameters(line);
        }
        
        // Convertir asignaciones de llamadas a métodos (MODIFICADO)
        if (line.matches("\\s*(\\w+)\\s*=\\s*\\w+\\s*\\(.*\\).*")) {
            Pattern pattern = Pattern.compile("(\\w+)\\s*=\\s*(\\w+)\\s*\\(([^)]*?)\\)");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String var = matcher.group(1);
                String method = matcher.group(2);
                String args = matcher.group(3);
                return var + " <- " + method + "(" + args + ")";
            }
        }
        
        // Convertir llamadas a métodos simples
        if (line.matches("\\w+\\s*\\([^)]*\\)\\s*$")) {
            Pattern pattern = Pattern.compile("(\\w+)\\s*\\(([^)]*?)\\)");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find() && !line.startsWith("if") && !line.startsWith("while") && !line.startsWith("for")) {
                String method = matcher.group(1);
                String args = matcher.group(2);
                return method + "(" + args + ")";
            }
        }
        
        // Convertir System.out.println
        if (line.contains("System.out.println")) {
            return "ESCRIBIR CON SALTO " + extractPrintArgument(line);
        }
        
        // Convertir System.out.print
        if (line.contains("System.out.print(") && !line.contains("println")) {
            return "ESCRIBIR SIN SALTAR " + extractPrintArgument(line);
        }
        
        // Convertir declaraciones de arrays
        if (line.matches(".*\\[\\].*=.*new.*\\[.*\\].*")) {
            Pattern pattern = Pattern.compile("(\\w+)\\[\\]\\s+(\\w+)\\s*=\\s*new\\s+\\w+\\[(.*?)\\]");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String name = matcher.group(2);
                String size = matcher.group(3);
                return "DIMENSION " + name + "[" + size + "]";
            }
        }
        
        // Convertir inicialización de arrays
        if (line.matches(".*\\[\\].*=.*\\{.*\\}.*")) {
            Pattern pattern = Pattern.compile("(\\w+)\\[\\]\\s+(\\w+)\\s*=\\s*\\{(.+)\\}");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String name = matcher.group(2);
                String values = matcher.group(3);
                return name + " <- {" + values + "}";
            }
        }
        
        // Convertir for-each
        if (line.matches(".*for\\s*\\(\\s*\\w+\\s+\\w+\\s*:\\s*\\w+\\s*\\).*")) {
            Pattern pattern = Pattern.compile("for\\s*\\((\\w+)\\s+(\\w+)\\s*:\\s*(\\w+)\\s*\\)");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String var = matcher.group(2);
                String array = matcher.group(3);
                return "PARA CADA " + var + " EN " + array + " HACER";
            }
        }
        
        // Convertir for tradicional
        if (line.startsWith("for")) {
            return convertForLoop(line);
        }
        
        // Convertir estructuras de control
        if (line.startsWith("if")) {
            return "SI " + convertCondition(line) + " ENTONCES";
        }
        
        // Convertir else if con llaves y operadores de comparación
        if (line.contains("else if")) {
            // Primero limpiar las llaves y paréntesis
            line = line.replaceAll("\\}\\s*", "");  // Quitar llave de cierre
            line = line.replaceAll("\\s*\\{", "");  // Quitar llave de apertura
            
            // Convertir la estructura else if
            line = line.replaceAll("else\\s+if\\s*\\(", "SINO SI ");
            line = line.replaceAll("\\)", " ENTONCES");
            
            // Convertir los operadores de comparación
            if (line.contains("<=")) {
                line = line.replace("<=", " ES MENOR O IGUAL QUE ");
            }
            if (line.contains(">=")) {
                line = line.replace(">=", " ES MAYOR O IGUAL QUE ");
            }
            if (line.contains("==")) {
                line = line.replace("==", " ES IGUAL A ");
            }
            if (line.contains("!=")) {
                line = line.replace("!=", " ES DIFERENTE DE ");
            }
            if (line.contains(">")) {
                line = line.replace(">", " ES MAYOR QUE ");
            }
            if (line.contains("<")) {
                line = line.replace("<", " ES MENOR QUE ");
            }
            if (line.contains("&&")) {
                line = line.replace("&&", " Y ");
            }
            if (line.contains("||")) {
                line = line.replace("||", " O ");
            }
            
            // Limpiar cualquier residuo
            line = line.replaceAll("\\s+", " ").trim();
            
            return line;
        }
        
        if (line.startsWith("else") || line.contains("} else {")) {
            return "SINO";
        }
        if (line.startsWith("while")) {
            return "MIENTRAS " + convertCondition(line) + " HACER";
        }
        
        // Convertir incrementos/decrementos
        if (line.matches(".*\\+\\+.*")) {
            return line.replaceAll("(\\w+)\\+\\+", "$1 <- $1 + 1");
        }
        if (line.matches(".*--.*")) {
            return line.replaceAll("(\\w+)--", "$1 <- $1 - 1");
        }
        
        // Convertir asignaciones
        if (line.contains("=") && !line.contains("==")) {
            return line.replaceAll("=", "<-");
        }
        
        // Convertir return
        if (line.startsWith("return")) {
            return "RETORNAR " + line.substring(6).trim();
        }
        
        // Manejar llaves de cierre
        if (line.equals("}")) {
            return "FIN";
        }
        
        // Convertir comentarios multilínea
        if (line.contains("/*") || line.contains("*/")) {
            return "// " + line.replaceAll("/\\*|\\*/", "").trim();
        }
        
        // Mejorar la detección de length en arrays
        if (line.contains("length")) {
            // Reemplazar referencias directas a length
            line = line.replaceAll("(\\w+)\\.length", "$1.length");
            
            // Corregir expresiones que usan length en bucles
            Pattern pattern = Pattern.compile("(\\w+)\\s*-\\s*1");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String arrayName = matcher.group(1);
                if (!arrayName.contains(".length")) {
                    line = line.replaceAll(arrayName + "\\s*-\\s*1", arrayName + ".length - 1");
                }
            }
        }
        
        // Convertir do-while
        if (line.trim().equals("do {")) {
            return "HACER";
        }
        if (line.contains("} while")) {
            Pattern pattern = Pattern.compile("\\}\\s*while\\s*\\((.*?)\\)");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String condition = matcher.group(1);
                return "MIENTRAS " + convertCondition(condition);
            }
        }
        
        
        
        return line;
    }
    
    private static String extractClassName(String line) {
        Pattern pattern = Pattern.compile("class\\s+(\\w+)");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
    
    private static String extractMethodName(String line) {
        Pattern pattern = Pattern.compile("\\s+(\\w+)\\s*\\(");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
    
    private static String extractParameters(String line) {
        Pattern pattern = Pattern.compile("\\((.*?)\\)");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            String params = matcher.group(1).trim();
            if (params.isEmpty()) {
                return "";
            }
            return "(" + params + ")";
        }
        return "";
    }
    
    private static String extractPrintArgument(String line) {
        Pattern pattern = Pattern.compile("print(?:ln)?\\((.+)\\)");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
    
    private static String convertForLoop(String line) {
        Pattern pattern = Pattern.compile("for\\s*\\((.*?);(.*?);(.*?)\\)");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            String init = matcher.group(1).trim();
            String condition = matcher.group(2).trim();
            
            // Remover "int" de la inicialización
            init = init.replaceAll("^int\\s+", "");
            
            // Extraer el nombre de la variable y el valor inicial
            Pattern varPattern = Pattern.compile("(\\w+)\\s*=\\s*(.+)");
            Matcher varMatcher = varPattern.matcher(init);
            if (varMatcher.find()) {
                String varName = varMatcher.group(1);
                String initValue = varMatcher.group(2);
                
                // Convertir la condición
                condition = condition.replaceAll(varName + "\\s*<\\s*", "HASTA ");
                
                // Si hay un .length en la condición, agregar el -1
                if (condition.contains(".length")) {
                    condition += " - 1";
                }
                
                return "PARA " + varName + " <- " + initValue + " " + condition + " HACER";
            }
        }
        return line;
    }
    
    private static String convertCondition(String condition) {
        // Manejar Math.abs específicamente
        if (condition.contains("Math.abs")) {
            Pattern pattern = Pattern.compile("Math\\.abs\\((.*?)\\)\\s*==\\s*(\\d+)");
            Matcher matcher = pattern.matcher(condition);
            if (matcher.find()) {
                String expression = matcher.group(1);
                String value = matcher.group(2);
                return "Math.abs(" + expression + ") ES IGUAL A " + value;
            }
        }
        
        if (condition.contains("(")) {
            Pattern pattern = Pattern.compile("\\((.*?)\\)");
            Matcher matcher = pattern.matcher(condition);
            if (matcher.find()) {
                condition = matcher.group(1);
            }
        }
        condition = condition.replace("&&", " Y ");
        condition = condition.replace("||", " O ");
        condition = condition.replace("==", " ES IGUAL A ");
        condition = condition.replace("!=", " ES DIFERENTE DE ");
        condition = condition.replace(">=", " ES MAYOR O IGUAL QUE ");
        condition = condition.replace("<=", " ES MENOR O IGUAL QUE ");
        condition = condition.replace(">", " ES MAYOR QUE ");
        condition = condition.replace("<", " ES MENOR QUE ");
        return condition;
    }
} 