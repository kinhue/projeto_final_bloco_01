package lojadotutu.repository;

import lojadotutu.model.Celulares;

public interface RepositoryCelulares {
	
	//CRUD DA LOJA
	
	public void listarCelulares();
	public void deletar(String nome);
	public void atualizar(Celulares celular);
	public void cadastrar(Celulares celular);
	public void buscar(String nome);
	
	
	//METODOS LOJA
	
	public void vender(float preco, float dinheiro);
	public void atualizarAndroid(float versaoAndroid);
	public void atualizarIos(float Ios);
	
}
