
public class Ejemplos {

	public Ejemplos() {
	}

	public void ciclo() {
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10}; 
		for(int c: intArray) {
			System.out.println("Error " + c);
		}
	}

	public static void main(String[] args) {

		Ejemplos off = new Ejemplos();
		off.ciclo();
	}

}
