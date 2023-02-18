
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente joao = new Cliente();
		//conta.titular = joao;
		joao.setNome("joao da silva");
		
		conta.setTitular(joao);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		//agora em duas linhas: 
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(joao);
		System.out.println(conta.getTitular());
	}
}
