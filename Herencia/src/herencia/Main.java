package herencia;

public class Main {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Jose", "Gonzalez",26,11125, (float)4.5);
		
		System.out.println("\nCodigo: "+estudiante.getCodEstudiante()
				+ "\nNombre: "+ estudiante.getNombre()+
				"\n Apellido: " + estudiante.getApellido()+
				"\n Edad: "+ estudiante.getEdad()+
				"\n Nota Final: "+estudiante.getNotaFinal() );

	}

}
