public class Paciente implements Comparable<Paciente>{
    private String nombre;
    private String sintoma;
    private String codigo;

    public Paciente(String nom, String sin, String cod){
        this.setNombre(nom);
        this.setSintoma(sin);
        this.setCodigo(cod);
    }

    public int compareTo(Paciente otro){
        return this.codigo.compareTo(otro.getCodigo());
    }

    public String toString(){
        return this.nombre + ", "+this.sintoma +", "+this.codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getSintoma() {
        return sintoma;
    }
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
