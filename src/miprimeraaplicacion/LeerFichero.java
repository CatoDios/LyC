/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraaplicacion;

/**
 *
 * @author PRINCIPAL
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    public String archivo=""; 
    public String muestraContenido(String archivo2) throws FileNotFoundException, IOException {
        String cadena="";
        FileReader f = new FileReader(archivo2);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            archivo=archivo+cadena+"\n";
        }
        b.close();
        System.out.println(archivo);
        
        return archivo.toLowerCase();
    }
     
}