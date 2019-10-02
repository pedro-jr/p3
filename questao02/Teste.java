package questao02;

public class Teste {

	public static void main(String[] args) {
		GonzagaList lista = new GonzagaList();
		
		try {
			lista.add(1);
			lista.add(1);
			lista.add(1);
			System.out.println(lista.tamanho());
			lista.add(1);
			lista.add(1);
			lista.add(0);
			lista.add(0);
			System.out.println(lista.tamanho());
			lista.add(0);
			lista.add(0);
			lista.add(0);
			System.out.println(lista.tamanho());
			System.out.println(lista);
			lista.add(0);
			
			
			
		} catch (ListaLotadaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
