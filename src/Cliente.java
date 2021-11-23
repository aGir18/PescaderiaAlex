public class Cliente {

	Turno turno;
	String nombre;

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	public void setNumeroTurno(int numeroTurno) {
		this.turno.setValor(numeroTurno);
	}

	public Turno getTurno() {
		return turno;
	}

	public String getNombre() {
		return nombre;
	}

	public void turnoSiguiente(Cliente clienteAnterior) {
		int iniciando = 0;
		if (clienteAnterior.getTurno() != null) {
			this.setNumeroTurno(clienteAnterior.getTurno().turnoSiguiente()); 
		} else {
			this.setNumeroTurno(iniciando);
		}
	}
		
	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
}


//public int turnoSiguiente(Turno turnoAnterior) {
//		this.turno.valor = turnoAnterior.turnoSiguiente();
//	return turno.valor + 1;
//}
