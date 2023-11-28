package lojadotutu.repository;
import lojadotutu.model.Celular;

public interface CelularRepository {
	
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrar(Celular celular);
	public void atualizar(Celular celular);
	public void deletar(int numero);

}
