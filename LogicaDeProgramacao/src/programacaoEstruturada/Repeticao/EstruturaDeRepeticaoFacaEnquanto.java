package programacaoEstruturada.Repeticao;

public class EstruturaDeRepeticaoFacaEnquanto {

	public static void main(String[] args) {

		int contador = 1, somador = 0;
		
		do {
			
			somador += contador;
			contador++;
			
		}
		while (contador <= 100);

		System.out.println(somador);
	}

}
