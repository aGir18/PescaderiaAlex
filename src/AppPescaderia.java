import java.util.Arrays;

public class AppPescaderia {

	public static void main(String[] args) {

		Tienda tienda01 = new Tienda();

//		Turno turno01 = new Turno(34);
//		Turno turno02 = new Turno(98);
//		Turno turno03 = new Turno(99);
//		Turno turno04 = new Turno(100);
//		Turno turno05 = new Turno(345);
//		System.out.println(turno01.getValor());
//		System.out.println(turno02.getValor());
//		System.out.println(turno03.getValor());
//		System.out.println(turno04.getValor());
//		System.out.println(turno05.getValor());
//		System.out.println(turno01);

		Cliente cliente01 = new Cliente("Alex");
		System.out.println(cliente01.getTurno());
//		tienda01.darTurno(cliente01, 20);
		System.out.println(cliente01.getTurno());

		Turno turno06 = new Turno();
		System.out.println(turno06);
		tienda01.setClientes(Arrays.asList(new Cliente("Ana"), new Cliente("Juan"), new Cliente("Pepe")));
//		tienda01.turnosTodaLaTienda(3);
		turno06.primerTurnoAleatorio();
		System.out.println(turno06);
		Turno turno10 = new Turno();
		System.out.println(turno10);
	}
}

//  for (int i = 0; i < 100; i++) {
//	int valorDado;
//	valorDado = (int) Math.floor(Math.random()*5);
//	System.out.println(valorDado);
//}
//
