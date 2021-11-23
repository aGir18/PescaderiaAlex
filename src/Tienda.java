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