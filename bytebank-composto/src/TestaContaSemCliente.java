
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		// Gera exce��o
		//conta.titular.nome = "Mariana";
		//System.out.println(conta.titular.nome);
		
		conta.titular = new Cliente();
		conta.titular.nome = "Mariana";
		System.out.println(conta.titular.nome);
	}
}
