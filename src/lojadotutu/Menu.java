package lojadotutu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import lojadotutu.controller.*;

import lojadotutu.model.Xiaomi;
import lojadotutu.model.Iphone;


public class Menu {
	
		
	public static void main(String[] args) {
		
		CelularController celulares = new CelularController();	
		
		
				
		
		float caixa = 1000, precoCel = 0;
		Scanner leia = new Scanner(System.in);
		String nome;
		int opcao, tela, ram, armazenamento, numero = 0, marca;
		float preco, versaoIos, versaoAndroid;
		
						
		while(true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Eletrônicos do Tutu                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Novo aparelho                        ");
			System.out.println("            2 - Listar aparelhos                     ");
			System.out.println("            3 - Buscar aparelho                      ");
			System.out.println("            4 - Comprar aparelho                     ");
			System.out.println("            5 - Vender aparelho                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");	
			System.out.println("                                                     ");
			
			try {
			opcao = leia.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\n Opção inválida!!!!");
				leia.nextLine();
				opcao = 0;
			}
			if (opcao == 6) {
				System.out.println("Obrigado por usar!");
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Novo aparelho \n\n");
				
				System.out.println("Digite o nome do aparelho: ");
				nome = leia.next();
				System.out.println("Qual o tamanho da tela? ");
				tela = leia.nextInt();
				System.out.println("Quanto de RAM o celular possui? ");
				ram = leia.nextInt();
				System.out.println("Quanto de armazenamento o celular possui? ");
				armazenamento = leia.nextInt();
				System.out.println("Qual o preço do celular? ");
				preco = leia.nextFloat();
				numero = celulares.gerarNumero();				
				
				do {
				System.out.println("Qual a marca do celular? 1- Xiaomi 2- Apple");
				marca = leia.nextInt();
				}while (marca <1 && marca >2);
				
				switch(marca) {
					case 1 ->{
						System.out.println("Qual a versão do seu Android?");
						versaoAndroid = leia.nextFloat();
						
						celulares.cadastrar(new Xiaomi(nome, tela, ram, armazenamento,numero, preco, marca,  versaoAndroid));
					}
			
					case 2 ->{
						System.out.println("Qual a versão do seu Iphone");
						versaoIos = leia.nextFloat();
						celulares.cadastrar(new Iphone (nome, tela, ram, armazenamento,numero, preco,marca, versaoIos));
						break;
					}
				  }
				
				
				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os aparelhos \n\n");
				celulares.listarTodos();
				
				
				
				keyPress();
				break;
			case 3:
				System.out.println("Consultar aparelho por índice de chegada \n\n");
				
				System.out.println("Digite o número do aparelho: ");
				numero = leia.nextInt();
				
				celulares.procurarPorNumero(numero);						
				
				
				keyPress();
				break;
			
			case 4:
				System.out.println("Comprar aparelho\n\n");
				System.out.println("Qual o valor do aparelho? ");
				precoCel = leia.nextFloat();
				if (precoCel > caixa) {
					System.out.println("Não é possível comprar o celular, falta valores no caixa!");
				}else {
					caixa = caixa - precoCel;
					System.out.println("O celular foi comprado! Novo valor de caixa: "+ caixa);
				}
				keyPress();
				break;
			case 5:
				System.out.println("Vender aparelho\n\n");
				System.out.println("Qual o preço do celular?");
				precoCel = leia.nextFloat();
				
				if (precoCel > 0){
					caixa = precoCel + caixa;
				}
				System.out.println("Valor atual de caixa: "+ caixa);
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
		}
		}
	}
		
		
		


	private static void keyPress() {
					try {
				System.out.println("\nPressione Enter para continuar ");
				System.in.read();
			}catch (IOException e) {
				System.out.println("Você pressinou algo além do Enter");
			}
		}
		
	}
	

			
			
		
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		