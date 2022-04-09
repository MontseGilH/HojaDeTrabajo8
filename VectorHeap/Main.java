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
                System.out.println("Ingrese la opcion a realizar:\n1. Sacar paciente de la cola\n2. Ingresar paciente a la cola\n3. Salir\n");
                String s = scan.nextLine();
                if (s.equalsIgnoreCase("1")){
                    //sacar paciente
                    System.out.println(pacientes.remove().toString()+"\n");
                } else if (s.equalsIgnoreCase("2")){ 
                    System.out.println("\nIngrese el nombre del paciente:");
                    String nom = scan.nextLine();
                    System.out.println("\nIngrese el sintoma del paciente:");
                    String sin = scan.nextLine();
                    System.out.println("\nIngrese el codigo de emergencia del paciente:");
                    String cod = scan.nextLine();
                    pacientes.add(new Paciente(nom, sin, cod.toUpperCase()));
                    System.out.println("\nPaciente agregado\n");
                } else if (s.equalsIgnoreCase("3")){ 
                    break;
                } else {
                    System.out.println("\nOpcion no valida\n");
                }
            }
            System.out.println("\nPrograma finalizado\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        scan.close();

    }
}
