
import java.io.File;
import java.util.Scanner;

public class Archivos {
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
