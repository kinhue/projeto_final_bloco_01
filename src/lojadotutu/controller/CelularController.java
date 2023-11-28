package lojadotutu.controller;

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

}

