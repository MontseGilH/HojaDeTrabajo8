
import java.io.File;
import java.util.Scanner;
/**
 * Ultima modificacion: 31/03/2022
 * 
 * Clase archivos que controla los archivos
 * @file Archivos.java
 * @author Montserrat Gil
 * @author Gabriela Archila
 */

public class Archivos {

      /**
     * Metodo que obtiene los pacientes de un archivo txt 
     * Utiliza un vectorHeap 
     * @param archivo direccion del archivo
     * @return pac lista de pacientes
     * @throws Exception
     */
   public VectorHeap<Paciente> pacientes(String archivo) throws Exception{
     VectorHeap<Paciente> pac =  new VectorHeap<Paciente>();
     try{
         File file = new File(archivo);
         Scanner s = new Scanner(file);
         while (s.hasNextLine()){
            String[] items = s.nextLine().split(",");
            pac.add(new Paciente(items[0],items[1],items[2].replaceAll(" ","")));
         }
         s.close();
     } catch (Exception e){
         throw new Exception ("Error al leer el archivo");
     }
     return pac;
   }
}
