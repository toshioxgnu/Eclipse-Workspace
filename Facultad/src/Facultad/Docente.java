package Facultad;

public class Docente extends Persona {
	String carrera;

	public Docente(String nombre, int edad, String carrera) {
		super(nombre, edad);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
