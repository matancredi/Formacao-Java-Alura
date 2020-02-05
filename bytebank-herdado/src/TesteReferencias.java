
public class TesteReferencias {

	public static void main(String args[]) {
		// Como gerente � funcion�rio, � poss�vel fazer assim:
		Funcionario func = new Gerente();
		
		// Mas n�o � poss�vel fazer o contr�rio, j� que gerente � mais espec�fico que funcion�rio.
		// Gerente a = new Funcionario();
		
		Gerente g1 = new Gerente();
		g1.setNome("Mariana");
		String nome = g1.getNome();
		System.out.println(nome);
		g1.setSalario(1000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
//		Funcionario agora � uma classe abstrata e n�o permite ser instaciada
//		Funcionario f = new Funcionario();
//		f.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(1500);
		
		Designer d = new Designer();
		d.setSalario(100.0);
		
//		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		System.out.println(controle.getSoma());
		
		
	}
	
}
