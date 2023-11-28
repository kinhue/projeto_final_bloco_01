package lojadotutu.Controller;

import java.util.ArrayList;

import lojadotutu.model.Celular;
import lojadotutu.repository.CelularRepository;

public class CelularController implements CelularRepository {

	private ArrayList<Celular> listaCelulares = new ArrayList<Celular>();
	int numero = 0;
	
	
	
	
	
	@Override
	public void listarTodos() {
		for (var celular : listaCelulares) {
			celular.visualizar();
		}
	}

	@Override
	public void cadastrar(Celular celular) {
		
		listaCelulares.add(celular);
		System.out.println("\nO celular número: " +celular.getNumero() + " foi adicionado com sucesso");
	}

	

	@Override
	public void deletar(int numero) {
		/*var celular = procurarPorNumero(numero);
		if (celular != null) {
			if (listaCelulares.remove(celular) == true);
				System.out.println("\nO celular numero: "+ numero+ "foi deletado com sucesso");
				
		}else
			System.out.println("\nA conta número : "+numero+ " não foi encontrada");
		
		*/
		
		
	}
public int gerarNumero() {
	return ++ numero;
}

@Override
public void procurarPorNumero(int numero) {
	for (var celulares : listaCelulares) {
		if (celulares.getNumero() == numero) {
		  celulares.visualizar();			
		}else {
			System.out.println("Não foi encontrado o celular de número: "+numero);
		}
	}
	
	}

@Override
public void atualizar(Celular celular) {
	/*var buscaCel = procurarPorNumero(celular.getNumero());
	
	if (buscaCel != null) {
		listaCelulares.set(listaCelulares.indexOf(buscaCel), celular);
		System.out.println("\nO celular de índice "+celular.getNumero() + " foi atualizado com sucesso!");
		
	}else
		System.out.println("\nO celular de indice " +celular.getNumero() + " não foi encontrado");
	*/
}
}


