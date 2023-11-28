package lojadotutu.model;

public class Iphone extends Celular {
private float versaoIos;
	public Iphone(String nome, int tela, int ram, int armazenamento, int numero, float preco, int marca, float versaoIos) {
		super(nome, tela, ram, armazenamento, numero, preco, marca);
		
	}
	public float getVersaoIos() {
		return versaoIos;
	}
	public void setVersaoIos(float versaoIos) {
		this.versaoIos = versaoIos;
	}
public void visualizar() {
	super.visualizar();
	System.out.println("Versão do iPhone: " + this.versaoIos);
}
}