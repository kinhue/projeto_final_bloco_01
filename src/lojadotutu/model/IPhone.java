package lojadotutu.model;

public class IPhone extends Celulares{
	
private float versaoIos;

	public IPhone(String nome, int ram, float tela, float preco, float versaoIos) {
		super(nome, ram, tela, preco);
		
		this.versaoIos = versaoIos;
	}

	public float getVersaoIos() {
		return versaoIos;
	}

	public void setVersaoIos(float versaoIos) {
		this.versaoIos = versaoIos;
	}
	
	@Override
	public boolean atualizarIos(float versaoIos) {
		if(this.getVersaoIos() > 10) {
			System.out.println("Não é possível atualizar seu Ios! Ele já está na última versão");
			return false;
		}
		this.setVersaoIos(versaoIos);
		System.out.println("Seu android foi atualizado para a versão: "+versaoIos);
		return false;
	
}
	public void visualizar() {
		super.visualizar();
		System.out.println("Versão do IOS: "+this.versaoIos);
}
}
