public class Cliente {

	Turno turno;
	String nombre;

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Turno getTurno() {
		return turno;
	}

	public String getNombre() {
		return nombre;
	}

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
}