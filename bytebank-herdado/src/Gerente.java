//A heran�a m�ltipla n�o � utilizada no Java porque poderia gerar confus�o. 
//Imaginemos que a classe Funcionario tem uma senha, e um m�todo setSenha(), como sabemos, 
//a classe Autenticavel possui exatamente isto. Se o Gerente estender ambas, qual dos dois prevalece? 
//Para evitar este tipo de problema, no Java, n�o h� heran�a m�ltipla.

public class Gerente extends Funcionario implements Autenticavel{
	
	// private String nome;
	// private String cpf;
	// private double salario;
	//private int senha;
//	
//	public Gerente () {
//		
//	}
//	
//	public boolean autentica(int senha) {
//		if (this.senha == senha) {
//			return true;
//		}
//		return false;
//	}
	
	//Sobrecarga de m�todos: M�todo com mesmo nome mas que recebe outros par�metros
	
//	public boolean autentica (String login, int senha) {
//		// TODO: Colocar outra implementa��o aqui
//		return true;
//	}
//	
//	public void setSenha(int senha){
//		this.senha = senha;
//	}
	
	//Mesma assinatura do m�todo na classe-m�e
	public double getBonificacao() {
		System.out.println("m�todo bonifica��o gerente");
		//Colocar super porque sal�rio � da classe-m�e, n�o da classe Gerente
		//Ao utilizar os m�todos get, n�o � necess�rio que o atributo seja protected, ele pode ser private
		return super.getSalario() * 0.2;
	 }
	
	private AutenticacaoUtil autenticador;
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}
