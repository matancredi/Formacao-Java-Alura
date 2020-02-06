package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta{
	
	// Se eu n�o colocar nenhum construtor aqui, ele ir� chamar o construtor padr�o da classe-m�e
	// Que no caso, � o Conta().
	
	// Quando uma classe herda da outra, ela n�o recebe seus construtores, � necess�rio usar o "super"
	// S� herda m�todos e atributos
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

}
