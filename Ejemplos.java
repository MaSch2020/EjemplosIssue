
public class Ejemplos {

	public Ejemplos() {
	}

	public void ciclo() {
		int cont = 1;
		String mens = "Error ";
		while (cont < 11) {
			System.out.println(mens + cont);
			cont++;
		}
	}

	public static void main(String[] args) {

		Ejemplos off = new Ejemplos();
		off.ciclo();
	}

}
