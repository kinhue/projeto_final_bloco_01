package lojadotutu.model;

public class Celulares {
	private String celular;
	private String nome;
	private int ram;
	private float tela;
	private float preco;
	
	public Celulares(String nome, int ram, float tela, float preco) {
		this.nome = nome;
		this.ram = ram;
		this.tela = tela;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public String celular() {
		return celular;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public float getTela() {
		return tela;
	}

	public void setTela(float tela) {
		this.tela = tela;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public boolean vender(float dinheiro) {
		if(this.getPreco() < dinheiro) {
			System.out.println("Você não possui o valor correto para a compra do celular");
			return false;
		}
		this.setPreco(this.getPreco() - dinheiro);
		System.out.println("O celular: " +celular+ "foi comprado! Obrigado pela compra, seu troco foi de: "+dinheiro);
		return true;
	}
	
	public void visualizar() {
		
		System.out.println("**************************");
		System.out.println("Especificações: ");
		System.out.println("**************************");
		System.out.println("Nome do celular: " +this.nome);
		System.out.println("RAM do celular: " + this.ram + "GB");
		System.out.println("Tamanho da tela do celular: " +this.tela + "cm");
		System.out.println("Preço do celular R$: " +this.preco);
		
	}

	public boolean atualizarAndroid(float versaoAndroid) {
		
		return false;
		
	}
public boolean atualizarIos(float versaoIos) {
		
		return false;
}
	
}
