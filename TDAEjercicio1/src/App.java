import java.util.ArrayList;
import java.util.List;

public class App {
    
    
    public static void main(String[] args) throws Exception {
        
        Alumno alumno1 = new Alumno(1, "Usiel", 3);
        Alumno alumno2 = new Alumno(2, "Mireya", 9);
        Alumno alumno3 = new Alumno(3, "Luna", 8);
        Alumno alumno4 = new Alumno(4, "Sofia", 4);
        Alumno alumno5 = new Alumno(5, "Kvothe", 10);
        Alumno alumno6 = new Alumno(6, "Dena", 8);

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);

        for(Alumno u : alumnos){
            u.mostrarInfo();
        }

        for(int i = 0; i<alumnos.size(); i++){
            if (alumnos.get(i).calificacion <6){
                alumnos.remove(i);
                continue;
            }
        }
        System.out.println("\n\nNueva lista: ");

        for(Alumno u : alumnos){
            u.mostrarInfo();
        }

    }
}
