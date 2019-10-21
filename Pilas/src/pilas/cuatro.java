package pilas;
import java.util.Stack;
public class cuatro {
    public static void main(String[] args) {
        Stack pelis = new Stack();
        
        pelis.push("Snach");
        pelis.push("Club de la pelea");
        pelis.push("Avatar");
        pelis.push("Insterestelar");
        pelis.push("Wall-e");

        
        while(! pelis.empty())        
            System.out.println("Eliminando... " + pelis.pop());
        
        if(pelis.empty())
            System.out.println("La pila está vacía.");
        else
            System.out.println("Aún quedan elementos.");
    }
}
