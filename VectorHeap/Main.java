import java.util.Scanner;
/**
 * Ultima modificacion: 8/04/2022
 * 
 * Clase main que interactua con el usuario
 * Utilizando vectorHeap
 * @file Main.java
 * @author Montserrat Gil
 * @author Gabriela Archila
 */
public class Main {
    public static void main(String[] args){
        Archivos arch = new Archivos();
        Scanner scan = new Scanner(System.in);
        try {
            //se obtiene la lista de pacientes
            VectorHeap<Paciente> pacientes = arch.pacientes("pacientes.txt");

            //se sacan pacientes hasta que se acaben
            while (!pacientes.isEmpty()){
                System.out.println("Ingrese cualquier caracter y enter para sacar un paciente de la cola");
                String s = scan.nextLine();
                if (s.equalsIgnoreCase("1")){
                    System.out.println(pacientes.remove().toString());
                } else {
                    System.out.println(pacientes.remove().toString());
                }
            }
            System.out.println("\nPrograma finalizado\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        scan.close();

    }
}
