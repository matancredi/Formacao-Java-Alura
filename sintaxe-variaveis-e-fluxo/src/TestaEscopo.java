
public class TestaEscopo {

	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;
		//boolean acompanhado = false;
		
		//Outra op��o:
		//acompanhado = quantidadePessoas >= 2;
		
		// Inicializar fora do condicional, sen�o ela s� ser� vis�vel l� dentro
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		}
		else {
			acompanhado = false;
		}

		// Funciona sem chaves quando s� tem uma linha
		if ((idade >= 18 || quantidadePessoas >= 2) && acompanhado)
			System.out.println("Seja bem vindo");
		else {

			System.out.println("Infelizmente voc� n�o pode entrar");
		}
	}
	
	
}
