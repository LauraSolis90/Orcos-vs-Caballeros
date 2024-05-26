

public class Ciudad_main {

	public static void main(String[] args) {

		//Esto es un comentario que he añadido yo, Amin para la practica de entornos
		// Creación de objetos Ciudad
		Ciudad Toledo = new Ciudad("Toledo", (int) (Math.random() * 10 + 6), (int) (Math.random() * 5 + 1));
		Toledo.SetResumen(null);

		Ciudad Madrid = new Ciudad("Madrid", (int) (Math.random() * 10 + 6), (int) (Math.random() * 5 + 1));
		Madrid.SetResumen(null);

		Ciudad Leon = new Ciudad("Leon", (int) (Math.random() * 10 + 6), (int) (Math.random() * 5 + 1));
		Leon.SetResumen(null);

		System.out.println("La ciudad de Toledo inicialmente se encuentra " + Toledo.GetEstado());
		System.out.println("La ciudad de Madrid inicialmente se encuentra " + Madrid.GetEstado());
		System.out.println("La ciudad de León inicialmente se encuentra " + Leon.GetEstado());

		System.out.println("");

		for (int i = 0; i <= 4; i++) {
			Toledo.SetRefuerzos((int) (Math.random() * 5) + 3);
			Toledo.SetHorda((int) (Math.random() * 3) + 2);
			Toledo.SetTrifulca();
		}

		for (int i = 0; i <= 4; i++) {
			Madrid.SetRefuerzos((int) (Math.random() * 5) + 3);
			Madrid.SetHorda((int) (Math.random() * 3) + 2);
			Madrid.SetTrifulca();
		}

		for (int i = 0; i <= 4; i++) {
			Leon.SetRefuerzos((int) (Math.random() * 5) + 3);
			Leon.SetHorda((int) (Math.random() * 3) + 2);
			Leon.SetTrifulca();
		}

		// Mostramos el estado final de las ciudades
		System.out.println(Toledo.GetResumen());
		System.out.println(Madrid.GetResumen());
		System.out.println(Leon.GetResumen());

	}

}
