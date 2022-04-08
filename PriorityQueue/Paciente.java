/**
 * Ultima modificacion: 8/04/2022
 * 
 * Clase Paciente 
 * @file Paciente.java
 * @author Montserrat Gil
 * @author Gabriela Archila
 */

public class Paciente implements Comparable<Paciente>{
    private String nombre;
    private String sintoma;
    private String codigo;
    
    /**
     * Constructor de pacientes
     * @param nombre
     * @param sintoma
     * @param codigo
     */
    public Paciente(String nom, String sin, String cod){
        this.setNombre(nom);
        this.setSintoma(sin);
        this.setCodigo(cod);
    }

     /**
     * Metodo que compara este paciente con otro
     * @param otro paciente
     * @return int, -1 menor, 0 igual, 1 mayor
     */
    public int compareTo(Paciente otro){
        return this.codigo.compareTo(otro.getCodigo());
    }

    /**
     * Metodo que transforma el paciente en un string
     * @return String
     */
    public String toString(){
        return this.nombre + ", "+this.sintoma +", "+this.codigo;
    }
    
    /**
     * Metodo que obtiene el nombre del paciente
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que obtiene el codigo del paciente
     * @return String
     */
    public String getCodigo() {
        return codigo;
    }
    /**
     * Metodo que establece el codigo del paciente
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * Metodo que obtiene el sintoma del paciente
     * @return String
     */
    public String getSintoma() {
        return sintoma;
    }
    /**
     * Metodo que establece el sintoma del paciente
     * @param sintoma
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    /**
     * Metodo que establece el nombre del paciente
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}