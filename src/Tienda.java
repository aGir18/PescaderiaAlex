import java.util.Arrays;
import java.util.List;

public class Tienda {
	String nombre;
	private List<Cliente> clientes = Arrays.asList(new Cliente("Ana"), new Cliente("Juan"));

	public Turno darTurno(Cliente clienteParaTurno) {
		clienteParaTurno.setTurno(new Turno());
		return clienteParaTurno.getTurno();
	}

	public void darTurnoConsecutivo(Cliente cliente01, Cliente cliente02) {
		cliente02.turnoSiguiente(cliente01);
	}
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public Tienda() {}
}



//
//public Turno darTurnoConNumero(Cliente clienteParaTurno, int numero) {
//	clienteParaTurno.setTurno(new Turno(numero));
//	return clienteParaTurno.getTurno();
//}

//private List<Turno> turnos = Arrays.asList(null);
//// NO sé

//public void darTurnoConsecutivo(Cliente cliente01, Cliente cliente02) {
//	cliente02.turnoSiguiente(cliente01.getTurno());
//	
//}

//public void darTurnoTodaLaTienda() {
//for (Cliente cliente : clientes) {
//	this.darTurnoConsecutivo(cliente, cliente);
//}
//}