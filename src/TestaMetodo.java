
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		contaDoJoao.saldo = 100;
		contaDoJoao.deposita(50);
		
		System.out.println(contaDoJoao.saldo);
		
		contaDoJoao.saca(20);
		System.out.println(contaDoJoao.saldo);
		
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(1000);
		
		contaDaAna.transfere(300, contaDoJoao);
		
		System.out.println(contaDaAna.saldo);
		System.out.println(contaDoJoao.saldo);
	}
	
}
