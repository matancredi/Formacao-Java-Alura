
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("Meu sal�rio � " + salario);
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		//O resultado da divis�o � truncado caso a vari�vel seja int
		int outraDivisao = 5/2;
		System.out.println(outraDivisao);
		
		//Mesmo se for double e os n�meros usados forem inteiros
		double maisUmaDivisao = 5/2;
		System.out.println(maisUmaDivisao);
		
		//Agora sim
		double divisaoCerta = 5.0/2;
		System.out.println(divisaoCerta);
		
		//Assim tamb�m
		double divisaoCerta2 = 5/2.0;
		System.out.println(divisaoCerta2);
		
	}
	
}
