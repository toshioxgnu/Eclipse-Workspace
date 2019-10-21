package stack;

import java.util.Stack;

public class promedio {
	public static void main(String[] args) {
		Stack notas = new Stack();
		
		
		notas.push(5.7);
		notas.push(2.3);
		notas.push(4.3);
		notas.push(4.1);
		
		float sum=0,p;
		System.out.println("Notas: ");
		for(int i=0; i<notas.size();i++){
			System.out.println(notas.get(i));
			
		}
		double nts[]=new double[notas.size()];
		for (int i=0;i<notas.size();i++) {
			nts[i]=(double)notas.get(i);
			sum +=nts[i];
		}
		p=sum/5;
		if (p>=4.0) {
			System.out.println("Promedio: "+p);
			System.out.println("Alumno reprobado ;C");
		}else {
			System.out.println("Promedio: "+p);
			System.out.println("Alumno Aprobado");
		}
	}

}
