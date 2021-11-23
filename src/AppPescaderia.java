import java.util.Arrays;

public class AppPescaderia {

	public static void main(String[] args) {

		Tienda tienda01 = new Tienda();

		Cliente cliente01 = new Cliente("Alex");
		System.out.println(cliente01.getTurno());
		System.out.println(cliente01.getTurno());

		Turno turno06 = new Turno();
		System.out.println(turno06);
		tienda01.setClientes(Arrays.asList(new Cliente("Ana"), new Cliente("Juan"), new Cliente("Pepe")));
		turno06.primerTurnoAleatorio();
		System.out.println(turno06);
		Turno turno10 = new Turno();
		System.out.println(turno10);
	}
}


