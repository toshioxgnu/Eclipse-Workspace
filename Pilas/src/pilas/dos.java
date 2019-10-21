package pilas;
import java.util.Stack;
public class dos {
    public static void main(String[] args) {
        Stack notas = new Stack();
        
        
        notas.push(5.9);
        notas.push(6.0);
        notas.push(6.3);
        notas.push(7.0);
        
        System.out.println("Notas: ");
        
        for (int i = 0; i < notas.size(); i++) 
            
            System.out.println(notas.get(i));
    }
}
