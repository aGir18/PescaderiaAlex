public class Turno {

	int valor = 0;

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void actualizaValor(int numeroInicial) {
		if (++numeroInicial >= 100) {
			setValor(0);
		} else {
			setValor(numeroInicial);
		}
	}
	
	public int primerTurnoAleatorio() {
			int valorDado = (int) Math.floor(Math.random()*100);
			setValor(valorDado);
//			System.out.println("Probando turno = " + getValor());
		return getValor();
	}
	
//	public int turnoSiguiente() {}
	
	public Turno() {
		primerTurnoAleatorio();
	}
	
	public Turno(int numeroInicial) {
		this.actualizaValor(numeroInicial);
	}

	@Override
	public String toString() {
		return "" + valor;
	}
}
