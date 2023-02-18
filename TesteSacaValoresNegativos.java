
public class TesteSacaValoresNegativos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(10);
		System.out.println(conta.saca(200));
		
		conta.saca(100);
		System.out.println(conta.getSaldo());
		
	}
}
