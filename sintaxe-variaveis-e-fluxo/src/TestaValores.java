
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		// N�o substitui o local/refer�ncia de mem�ria
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo);
	}
	
}
