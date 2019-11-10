package Facultad;

public class Funcionario extends Persona {
	String funcion;

	public Funcionario(String nombre, int edad, String funcion) {
		super(nombre, edad);
		this.funcion = funcion;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

}
