

public class Ciudad {

	// Atributos
	private String nombre, estado;
	private int numCaballeros, numOrcos;
	private String resumen;

	// Método constructor con solo un parámetro
	public Ciudad(String nombre) {
		estado = "defendida";
		numCaballeros = 0;
		numOrcos = 0;

	}

	// Método constructor 2 con 3 parámetros
	public Ciudad(String nombre, int numCaballeros, int numOrcos) {
		this.nombre = nombre;
		this.numCaballeros = numCaballeros;
		this.numOrcos = numOrcos;
		estado = "Defendida";

	}

	// SETTER
	public void SetNombre(String nombre) {
		this.nombre = nombre;

	}

	public void SetEstado(String estado) {
		this.estado = estado;

	}

	public void SetNumcaballeros(int numCaballeros) {
		this.numCaballeros = numCaballeros;

	}

	public void SetNumOrcos(int numOrcos) {
		this.numOrcos = numOrcos;

	}

	public void SetRefuerzos(int numRefuerzos) {
		if (estado.equalsIgnoreCase("Defendida"))
			numCaballeros += numRefuerzos;
	}

	public void SetHorda(int numHorda) {
		if (estado.equalsIgnoreCase("Defendida"))
			numOrcos += numHorda;
	}

	public void SetResumen(String resumen) {
		this.resumen = resumen;
	}

	public void SetTrifulca() {

		while (numOrcos > 0 && numCaballeros > 0) {
			numCaballeros -= 2;
			numOrcos--;
		}

		if (numOrcos >= 0 && numCaballeros <= 0) {
			estado = "Invadida";
		}
		/*
		 * : si el número de caballeros o de orcos resultantes después de una trifulca
		 * es negativo, cámbialo por 0
		 */
		if (numCaballeros < 0) {
			numCaballeros = 0;
		}
		if (numOrcos < 0) {
			numOrcos = 0;
		}
	}

	// GETTER para extraer
	public String GetNombre() {
		return nombre;
	}

	public String GetEstado() {
		return estado;
	}

	public int GetNumCaballeros() {
		return numCaballeros;
	}

	public int GetNumOrcos() {
		return numOrcos;
	}

	public String GetResumen() {
		return "La ciudad " + nombre + " se encuentra en estado " + estado + " tiene " + numCaballeros
				+ " caballeros y " + numOrcos + " orcos. Estado: " + estado;
	}
}
