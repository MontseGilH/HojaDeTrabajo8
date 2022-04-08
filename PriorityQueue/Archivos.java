import java.io.File;
import java.util.PriorityQueue;
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
     * Utiliza el priorityqueue de java
     * @param archivo direccion del archivo
     * @return pac lista de pacientes
     * @throws Exception
     */
   public PriorityQueue<Paciente> pacientes(String archivo) throws Exception{
    PriorityQueue<Paciente> pac =  new PriorityQueue<Paciente>();
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
