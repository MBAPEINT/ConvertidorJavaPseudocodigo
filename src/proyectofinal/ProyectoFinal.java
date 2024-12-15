/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Jose
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        generarLexer();
        generarParser();
        inicio();
    }
    
    public static void inicio(){
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }
    
    public static void generarLexer(){
        String ruta = "/home/mbapeint/Documentos/Netbeans Projects/ProyectoFinal/src/proyectofinal/entrada.jflex";
        File archivo= new File(ruta);
        JFlex.Main.generate(archivo);
    }
    
    public static void generarParser() throws IOException, Exception{
        String path0="/home/mbapeint/Documentos/Netbeans Projects/ProyectoFinal/";
        String path=path0+"src/proyectofinal/";
        String rutaC=path+"entradaCup.jflex";
        String fileG="Syntactic.java";
        String[] rutaS = {"-parser","Syntactic", path+"Grammar.cup"};
        File archivo;
        archivo = new File(rutaC);
        JFlex.Main.generate(archivo);
        System.out.println("Fin Lexico");
        java_cup.Main.main(rutaS);
        System.out.println("ruta---");
        Path rutaSym = Paths.get(path+"sym.java");
        if (Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get(path0+"sym.java"),
                Paths.get(path+"sym.java")
        );
        Path rutaSin = Paths.get(path+fileG);
        if (Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get(path0+fileG),
                Paths.get(path+fileG)
        );
    }
    
}
