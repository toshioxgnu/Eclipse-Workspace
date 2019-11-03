package Facultad;

public class main {
	public static void main (String[] args){
		
		Estudiante estudiante = new Estudiante("Juan Alberto",22,"Ingenieria");
		Docente docente = new Docente("Pedro Lobos", 45, "Medicina");
		Funcionario funcionario = new Funcionario("Juan Alberto",33,"comedor");
		
		System.out.println("\nEstudiante: " +"\n Nombre: "+ estudiante.getNombre() + 
				"\nEdad : "+ estudiante.getEdad() + "\nCarrera: "+estudiante.getCarrera());
		System.out.println("\nDocente: " +"\n Nombre: "+ docente.getNombre() + 
				"\nEdad : "+ docente.getEdad() + "\nCarrera: "+docente.getCarrera());
		System.out.println("\nFuncionario: " +"\n Nombre: "+ funcionario.getNombre() + 
				"\nEdad : "+ funcionario.getEdad() + "\nFuncion: "+funcionario.getFuncion());
		
	}
}
