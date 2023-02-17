
public class TestaBanco {
	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.nome = "joao da silva";
		joao.cpf = "111.111.111-1";
		joao.profissao = "engenheiro";
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(100);
		
		contaDoJoao.titular = joao;
		System.out.println(contaDoJoao.titular.nome);
	}
}
