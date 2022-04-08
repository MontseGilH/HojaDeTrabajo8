import java.io.File;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Archivos {
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
