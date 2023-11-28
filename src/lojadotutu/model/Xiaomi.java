package lojadotutu.model;

public class Xiaomi extends Celular {
private float versaoAndroid;
	
	public Xiaomi(String nome, int tela, int ram, int armazenamento, int numero, float preco,int marca, float versaoAndroid) {
		super(nome, tela, ram, armazenamento, numero, preco, marca);
		this.versaoAndroid = versaoAndroid;
	}

	public float getVersaoAndroid() {
		return versaoAndroid;
	}

	public void setVersaoAndroid(float versaoAndroid) {
		this.versaoAndroid = versaoAndroid;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Versão do Android: ");
	}
}