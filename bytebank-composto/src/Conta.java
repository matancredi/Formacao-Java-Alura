public class Conta {

	//double saldo;
	private double saldo;
	int agencia;
	int numero;
	
	//Funcionaria mas n�o � pertinente �s regras de neg�cio:
	// Cliente titular = new Cliente();
	
	Cliente titular;
	
	public void deposita (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			contaDestino.deposita(valor);
			return true;
		} else {
			return false;
		}
		
	}
	
	// Agora que os atributos s�o privados, � necess�rio ter os m�todos get e set
	public double getSaldo(){
		return this.saldo;
	}
	
}
