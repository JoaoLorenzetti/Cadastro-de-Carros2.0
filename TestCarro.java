public class TestCarro{

	public static void main(String arg[]){
		
	    Carro c1 = new Carro();
		Leitura l1 = new Leitura();

		
		c1.setPlaca(Integer.parseInt(l1.entDados("Cpf: ")));
		c1.setModelo(l1.entDados("Modelo: "));
        c1.setCor(l1.entDados("Cor: "));
		c1.getProp().setNome(l1.entDados("Nome: "));
		c1.getProp().setIdade(Integer.parseInt(l1.entDados("Idade: ")));
		c1.getProp().setCpf(Integer.parseInt(l1.entDados("Cpf: ")));


		
		System.out.println("\nPlaca: "+c1.getPlaca());
		System.out.println("\nModelo: "+c1.getModelo());
        System.out.println("\nCor: "+c1.getCor());
		System.out.println("\n================ Dados Proprietario =================");
		System.out.println("\nNome: "+c1.getProp().getNome());
		System.out.println("\nidade: "+c1.getProp().getIdade());
		System.out.println("\nCPF: "+c1.getProp().getCpf());
	}
	

}
