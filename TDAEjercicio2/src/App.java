import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) throws Exception {
        

        Deque<String> paginas = new ArrayDeque<>();
        paginas.push("Youtube.com");
        paginas.push("Albion.com");
        paginas.push("ArenaBreakout.com");

        for(String historial : paginas){
            System.out.println(historial);

        }
        System.out.println("\n-------------------------------------");
        paginas.pop();
        System.out.println(paginas);

        System.out.println("Estas en la pagina: "+paginas.peek());

        paginas.push("Facebook.com");

        System.out.println("\n-------------------------------------");
       for(String historial : paginas ){
        System.out.println(historial);

       }
    }
}
