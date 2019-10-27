package herencia;

public class Estudiante extends Persona {
	private int codEstudiante;
	private float notaFinal;
	
	
	public Estudiante(String nombre, String apellido, int edad, int codEstudiante, float notaFinal) {
		super(nombre, apellido, edad);
		this.codEstudiante = codEstudiante;
		this.notaFinal = notaFinal;
	}


	public int getCodEstudiante() {
		return codEstudiante;
	}


	public void setCodEstudiante(int codEstudiante) {
		this.codEstudiante = codEstudiante;
	}


	public float getNotaFinal() {
		return notaFinal;
	}


	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
}
