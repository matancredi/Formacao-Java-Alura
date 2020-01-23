package bytebank;

public class TestaReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		primeiraConta.saldo = 500;
		
		//Saldo da primeira mudou e da segunda tamb�m, porque est� apontando para o mesmo endere�o/refer�ncia
		System.out.println(segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("S�o iguais");
		}
		
		// Imprimir endere�o de mem�ria
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
