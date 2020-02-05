//Uma classe abstrata pode ter atributos? Sim! S�o eles que ser�o herdados pelas classes filhas. 
//Ela pode ter construtores? Sim! Estes construtores n�o s�o herdados diretamente, 
//mas podem ser chamados em classes filhas por meio do super. 
//A classe abstrata pode ter m�todos? Sim! E os filhos herdam estas funcionalidades.
//Tudo continua v�lido, a �nica veda��o � o instanciamento de objetos do tipo da classe abstrata.

public abstract class Conta {

	// Usando encapsulamento, a pr�pria classe consegue controlar os atributos por meio
	// dos getters e setters. Isso � bom quando houver mudan�as de regras de neg�cio
	// porque n�o precisar�amos procurar todos os lugares em que o atributo � setado ou recuperado
	// � s� alterar no pr�prio m�todo get/set da classe.
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// Static: � global, n�o s� da classe
	private static int total = 0;
	
	// Construtor padr�o, j� existe sempre quando n�o h� mais nenhum especificado
	public Conta() {
		
	}
	
	public Conta (int agencia, int numero) {
		System.out.println("Estou criando a conta " + numero);
		total++;
		System.out.println("Total de contas: " + total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita (double valor);
	//{
	//	this.saldo = this.saldo + valor;
	//}
	
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
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <=0) {
			System.out.println("N�o pode valor negativo");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <=0) {
			System.out.println("N�o pode valor negativo");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	// M�todo est�tico n�o tem acesso a atributos n�o est�ticos
	public static int getTotal() {
		return total;
	}

}
