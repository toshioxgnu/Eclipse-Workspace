package clase3;
import java.util.Scanner;

public class Operacion {
	Scanner sc = new Scanner(System.in);
	int valor1;
	int valor2;
	int res;
	
	
	public void setValor1() {
		System.out.println("Ingrese primer valor");
		valor1 = sc.nextInt();
	}
	
	public void setValor2() {
		System.out.println("Ingrese valor 2");
		valor2 = sc.nextInt();
	}
	
	private int getResult() {
		return res;
	}
}
