import java.util.Arrays;
import java.util.List;

public class Tienda {

	private List<Cliente> clientes = Arrays.asList(new Cliente("Ana"), new Cliente("Juan"));

	public Turno darTurno(Cliente clienteParaTurno) {
		clienteParaTurno.setTurno(new Turno());
		return clienteParaTurno.getTurno();
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}

//public Turno darTurno(Cliente clienteParaTurno, int numeroInicial) {
//	clienteParaTurno.setTurno(new Turno(numeroInicial));
//	return clienteParaTurno.getTurno();
//}

//public void turnosTodaLaTienda(int numeroInicial) {
//	for (Cliente cliente : clientes) {
//		this.darTurno(cliente, numeroInicial);
//		System.out.println("El turno de " + cliente + " es el " + cliente.getTurno());
//		numeroInicial++;
//	}
//}