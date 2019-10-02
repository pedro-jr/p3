package questao01;

public class ListaEncadeada {

	private Conta inicio;
	private int inseridos;

	public void addLast(Conta con) {
		// sem ninguem, ainda:
		if (inicio == null) {
			inicio = con;
		} else { // se já tem alguem:
			// temporaria é um obj de conta
			Conta temporaria = inicio; // criou um temp primeiro para receber o vaslor de inicio.
			while (temporaria.proximo != null) {
				temporaria = temporaria.proximo;
			}
			temporaria.proximo = con;
			inseridos++;
		}

	}
	
	public void addFront(Conta con) {
		Conta temporaria = inicio;
		inicio = con;
		inicio.proximo = temporaria;
		inseridos++;
	}
	
}