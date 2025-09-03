public class TestCarro{

	public static void main(String arg[]){
		
		Carro c1; 
		c1 = new Carro();
		
		c1.setPlaca(25000);
		c1.setModelo("camaro");
        c1.setCor("amarelo");
		c1.getProp().setNome("joao");
		c1.getProp().setIdade(20);
		c1.getProp().setCpf(148176002);
		
		System.out.println("\nPlaca: "+c1.getPlaca());
		System.out.println("\nModelo: "+c1.getModelo());
        System.out.println("\nCor: "+c1.getCor());
		System.out.println("\n================ Dados Proprietario =================");
		System.out.println("\nNome: "+c1.getProp().getNome());
		System.out.println("\nidade: "+c1.getProp().getIdade());
		System.out.println("\nCPF: "+c1.getProp().getCpf());
	}
	
}