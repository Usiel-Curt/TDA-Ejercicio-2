
public class Alumno {
    protected int id;
    protected String nombre;
    protected double calificacion;

    public int getId() { return id;}
    public void setId() { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre() { this.nombre = nombre; }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion() { this.calificacion = calificacion; }

    public Alumno(int id, String nombre, double calificacion){
        this.id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public void mostrarInfo(){
        System.out.println(this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Calificacion: " + this.calificacion);
        System.out.println("---------------------------------");
    }
}
