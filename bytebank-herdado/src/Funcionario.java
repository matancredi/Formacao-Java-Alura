
// Funcion�rio � abstrata j� que n�o existe nenhuma pessoa na empresa que seja s� funcion�rio
// Mas sim gerente, designer, etc. Ent�o n�o deve ser poss�vel instanciar um objeto do tipo funcion�rio
// Funcion�rio � um conceito abstrato

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	protected double salario;
	
	public Funcionario () {
		
	}
	
	// Cada classe concreta sobreescrever� esse m�todo, mas ele ainda precisa existir aqui
	// Se classe tem um m�todo abstrato, ela dever� ser abstrata
	public abstract double getBonificacao();
		// System.out.println("m�todo bonifica��o funcion�rio");
		// return this.salario * 0.1;
	// }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	

}
