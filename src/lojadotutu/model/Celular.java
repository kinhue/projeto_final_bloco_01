package lojadotutu.model;



public class Celular {
private String nome;
private int tela;
private int ram;
private int armazenamento;
private int numero;
private float preco;
private int marca;
public float caixa = 15000;

public Celular(String nome, int tela, int ram, int armazenamento, int numero, float preco, int marca) {
	this.nome = nome;
	this.tela = tela;
	this.ram = ram;
	this.armazenamento = armazenamento;
	this.preco = preco;
	this.numero= numero;
	this.marca = marca;
	
	
	//criando caixa
}
public int getMarca() {
	return marca;
}
public void setMarca(int marca) {
	this.marca = marca;
}
public void setCaixa(float caixa) {
	this.caixa = caixa;
}

public float getCaixa() {
	return caixa;
}


public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
//criando abas do celular
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getTela() {
	return tela;
}

public void setTela(int tela) {
	this.tela = tela;
}

public int getRam() {
	return ram;
}

public void setRam(int ram) {
	this.ram = ram;
}

public int getArmazenamento() {
	return armazenamento;
}

public void setArmazenamento(int armazenamento) {
	this.armazenamento = armazenamento;
}

public float getPreco() {
	return preco;
}


public void setPreco(float preco) {
	this.preco = preco;
}

public boolean comprar(float preco) {
	if (this.getCaixa() < preco) {
		System.out.println("Não é possível comprar, não há valor no caixa suficiente, faça alguma venda primeiro!");
		return false;
	}
	this.setCaixa(this.getCaixa() - preco);
	System.out.println("O calular foi comprado! Saldo de caixa atual: "+this.caixa);
	return true;
}
public void visualizar() {

	String marca = "";
	
	switch (this.marca) {
	case 1:
		marca = "Android";
		break;
	case 2:
		marca = "Apple";
		break;
	}
	
	
	
	System.out.println("-------------------------------------------------");
	System.out.println("Especificações celular: ");
	System.out.println("-------------------------------------------------");
	System.out.println("Nome: " + this.nome);
	System.out.println("Tela: " + this.tela + " cm");
	System.out.println("Ram: " + this.ram + " GB");
	System.out.println("Armazenamento: " + this.armazenamento + " GB");
	System.out.println("Preço: R$ " + this.preco);
	System.out.println("Ordem do celular: " + this.numero);
	System.out.println("Marca do celular: " + marca);
	
}

public void vender(float preco) {
	this.setCaixa(this.getCaixa() + preco);
	
}

}


