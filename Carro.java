public class Carro{

    private int placa;
    private String modelo;
    private String cor;
    private Proprietario prop;

    public Carro(){
      System.out.println("\nMetodo Construtor Default\n\n");
      placa = 0;
      modelo ="";
      cor ="";
      prop = new Proprietario();
    }

    public Carro(int placa, String modelo, String Cor, Proprietario prop){
         System.out.println("\nMetodo Construtor -> Sobrec -1\n\n");
         this.placa = placa;
         this.nome = nome;
         this.cor = cor;
         this.prop = prop;
    }

    public Proprietario getProp(){
		return prop;		
	}
	public void setProp(Proprietario prop){
		this.prop = prop;
	}


 public int getPlaca(){
    return placa;
 }

 public String getModelo(){
    return modelo;
 }
 public String getCor(){
    return cor;
 }

 public void setPlaca(int placa){
    this.placa = placa;
 }

 public void setModelo(String modelo){
    this.modelo = modelo;
 }

 public void setCor(String cor){
    this.cor = cor;
 }


}

