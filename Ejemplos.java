
public class Ejemplos {

	public Ejemplos() {
	}

	public void ciclo() {
		String mens = "Error ";
		for(int c =1; c < 11; c++) {
			System.out.println(mens + c);
		}
	}

	public static void main(String[] args) {

		Ejemplos off = new Ejemplos();
		off.ciclo();
	}

}
