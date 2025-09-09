public class Carro{

    private int placa = 0;
    private String modelo ="";
    private String cor ="";
    private Proprietario prop = new Proprietario();


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
