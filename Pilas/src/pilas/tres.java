package pilas;
import java.util.Stack;
public class tres {
    public static void main(String[] args) {
        Stack notas = new Stack();
        
        notas.push(6.8);
        notas.push(5.9);
        notas.push(6.0);
        notas.push(6.3);
        notas.push(7.0);
        
        System.out.println("Notas: ");
        
        for (int i = 0; i < notas.size(); i++) 
            
            System.out.println(notas.get(i));
        
        //------- Fin del segundo ejercicio -------\\
        
        double nts[] = new double[notas.size()];
        double sum = 0;
        
        for (int i = 0; i < notas.size(); i++) 
        { 
            nts[i] = (double) notas.get(i); //casting explícito
            sum += nts[i];
        }  
        System.out.println("El promedio es: " + (sum / notas.size()));

    }
}
