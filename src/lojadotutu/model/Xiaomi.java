package lojadotutu.model;

public class Xiaomi extends Celulares{
	
	private float versaoAndroid;

	public Xiaomi(String nome, int ram, float tela, float preco, float versaoAndroid) {
		super(nome, ram, tela, preco);
		
		this.versaoAndroid = versaoAndroid;
	}

	public float getVersaoAndroid() {
		return versaoAndroid;
	}

	public void setVersaoAndroid(float versaoAndroid) {
		this.versaoAndroid = versaoAndroid;
	}

	@Override
	public boolean atualizarAndroid(float versaoAndroid) {
		if(this.getVersaoAndroid() > 10) {
			System.out.println("Não é possível atualizar seu Android! Ele já está na última versão");
			return false;
		}
		this.setVersaoAndroid(versaoAndroid);
		System.out.println("Seu android foi atualizado para a versão: "+versaoAndroid);
		return false;
		
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Versão do android: "+this.versaoAndroid);
	}
}
