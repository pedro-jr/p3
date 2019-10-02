package questao02;

import java.util.Arrays;

public class GonzagaList {

	private int posAtual = 1;
	private static final int MAX = 10;
	private boolean imparLotado = false;
	private int tamanho;
	private Object[] lista;

	public GonzagaList() {
		lista = new Object[MAX];
	}

	public boolean paridade() {
		if (posAtual % 2 == 0) {
			return true;
		} else
			return false;
	}

	public void add(Object elemento) throws ListaLotadaException {
		if (!(paridade())) {
			if (!(imparLotado)) {
				if (posAtual > 9) {
					imparLotado = true;
					posAtual = 0;
				}
				lista[posAtual] = elemento; // recebe elemento na pos 1.
				posAtual += 2; // fica com 3 // fica c 5
				tamanho++;
			}
		} else if (paridade()) {
			try {
				lista[posAtual] = elemento; // recebe elemento na pos 1.
				posAtual += 2; // fica com 3 // fica c 5
				tamanho++;
			} catch (Exception e) {
				throw new ListaLotadaException();
			}
		}
	}

	public int tamanho() {
		return tamanho;
	}

	@Override
	public String toString() {
		return "GonzagaList [lista=" + Arrays.toString(lista) + "]";
	}
}
