import java.util.Arrays;

public class AppPescaderia {

	public static void main(String[] args) {

		Tienda tienda01 = new Tienda();

		Cliente cliente01 = new Cliente("Alex");
		System.out.println(cliente01.getTurno());
		System.out.println(cliente01.getTurno());
		Turno turno01 = new Turno();
		cliente01.setTurno(turno01);
		System.out.println(cliente01.getTurno() + "\n");
		cliente01.setNumeroTurno(2);
		System.out.println(cliente01.getTurno() + "\n");
		System.out.println(cliente01.getNombre());
		
		Cliente cliente02 = new Cliente("Ana");
		Turno turno02 = new Turno();
		cliente02.setTurno(turno02);
		System.out.println(cliente02.getTurno());
		cliente01.turnoSiguiente(cliente02); 
		//METER SI ES NULL!!!
		System.out.println(cliente01.getTurno() + "\n");

		Cliente cliente03 = new Cliente("Paco");
		Turno turno07 = new Turno();
		cliente03.setTurno(turno07);
		System.out.println(cliente03.getTurno());
		System.out.println("De prueba");
//		cliente03.turnoSiguiente(turno07);
		
		Turno turno06 = new Turno();
		System.out.println(turno06);
		
		tienda01.setClientes(Arrays.asList(new Cliente("Ana"), new Cliente("Juan"), new Cliente("Pepe")));
		
		turno06.primerTurnoAleatorio();
		
		System.out.println(turno06);
		
		Turno turno10 = new Turno();
		System.out.println(turno10);
		System.out.println(turno10.turnoSiguiente());
		
		Cliente cliente10 = new Cliente("Juanma");
		Turno turno20 = new Turno();
		cliente10.setTurno(turno20);
		
		Cliente cliente11 = new Cliente("Pedrito");
		Turno turno21 = new Turno();
		cliente11.setTurno(turno21);		
		cliente10.turnoSiguiente(cliente11);
		System.out.println(turno20);
		turno20.turnoSiguiente();
		System.out.println(turno20);
		
		Tienda tienda02 = new Tienda();
		System.out.println("Antes de dar turno: " + cliente10.getTurno());
		tienda02.darTurno(cliente10);
		System.out.println("Después de dar turno: " + cliente10.getTurno());
		tienda02.darTurnoConsecutivo(cliente10, cliente11);
		System.out.println("Al dar el consecutivo " + cliente11.getTurno());

//		Cliente cliente02 = new Cliente("Alex");
//		Cliente cliente03 = new Cliente("Fermín");
//		tienda01.darTurno(cliente02);
//		System.out.println("\n" + cliente02.getTurno());
//		tienda01.darTurnoConsecutivo(cliente02, cliente03);
//		System.out.println(cliente02.getTurno());
//		System.out.println(cliente03.getTurno());
//		
	}
}


