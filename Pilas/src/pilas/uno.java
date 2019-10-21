package pilas;
import java.util.Stack;
public class uno {
    public static void main(String[] args) {
        Stack musica = new Stack();
        
        musica.push("The Cure");
        musica.push("Pearl Jam");
        musica.push("Arcade Fire");        
        musica.push("Radiohead");
        musica.push("Janes Addiction");
        
        System.out.println("La cantidad de elementos de la pila es: "
                + musica.size());
        System.out.println("");
        
        System.out.println("El elemento que está en la cima es: " 
                +  musica.peek());
        System.out.println("");
        
        System.out.println("¿Cuál es la posición de la banda Pearl Jam? "
                + musica.search("Pearl Jam"));
        System.out.println("");
        
        System.out.println("¿Está (en la pila) la banda Rolling Stone? ");
        System.out.println("");
        
        if(musica.search("Rolling Stone") == -1)
            System.out.println("La banda NO está en la pila");
                
        System.out.println("Eliminando la banda " + musica.pop() + " de la pila");
        
        System.out.println("¿La pila de bandas está vacía?");
        
        if(musica.empty())
            System.out.println("Sí, está vacía");
        
        else
            System.out.println("No, no está vacía y sus elementos son: " 
                    + musica);    
           
    }
}
