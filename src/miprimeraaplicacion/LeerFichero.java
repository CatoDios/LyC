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
    String archivo=""; 
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            archivo=archivo+cadena;
        }
        b.close();
        System.out.println(archivo);
    }

    public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Users\\yaren\\Desktop\\hola.txt");
    }
   
}