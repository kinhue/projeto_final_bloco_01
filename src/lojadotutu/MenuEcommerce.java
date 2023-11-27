package lojadotutu;

import java.util.InputMismatchException;
import java.util.Scanner;
import lojadotutu.model.Celulares;
import lojadotutu.model.IPhone;
import lojadotutu.model.Xiaomi;


public class MenuEcommerce {
		
	public static void main(String[] args) {
		//TESTE GERAL CELULAR
		Celulares a1 = new Celulares ("Iphone", 4, 15, 4000.0f);
		a1.visualizar();
		//TESTE GERAL XIAOMI
		Xiaomi x1 = new Xiaomi("Xiaomi 10", 5, 15, 2000.0f, 15);
		x1.visualizar();
		//TESTE GERAL IPHONE
		IPhone i1 = new IPhone("Iphone 10", 6, 17, 4500.0f, 12);
		i1.visualizar();
		
		
		
		
		
		
		Scanner	leia = new Scanner(System.in);	
		int opcao , ram;
		String nome;
		float tela, preco;
		
		
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Eletrônicos do Tutu                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Novo aparelho                        ");
			System.out.println("            2 - Listar aparelhos                     ");
			System.out.println("            3 - Buscar aparelho por nome             ");
			System.out.println("            4 - Atualizar dados do aparelho          ");
			System.out.println("            5 - Apagar aparelho                      ");
			System.out.println("            6 - Comprar aparelho                     ");
			System.out.println("            7 - Atualizar aparelho                   ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");			
			
			
			try {
				opcao=leia.nextInt();
				
			}catch(InputMismatchException e){
				System.out.println("\nDigite o número da opção!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 8) {
				System.out.println("Até a próxima!");
				leia.close();
				System.exit(0);
	
			}

		switch (opcao) {
		case 1:
			System.out.println("\nVamos digitar as informações do aparelho: ");
			System.out.println("\nQual o nome do aparelho? ");
			nome = leia.next();
			System.out.println("\n Quanto de RAM o aparelho possui? ");
			ram = leia.nextInt();
			System.out.println("\nQual o tamanho da tela? ");
			tela = leia.nextFloat();
			System.out.println("Qual o preço desse aparelho? ");
			preco = leia.nextFloat();		
			System.out.println("O produto de nome " + nome + " possui: " + ram + " GB de RAM, tem a tela com " + tela + " cm e, tem seu preço de R$ " + preco);
			
			break;
		
		
		case 2: 
			System.out.println("Esses são os aparelhos ativos na loja no momento: ");
					
			break;
		case 3: 
			System.out.println("Qual o nome do aparelho que deseja? ");
			
			break;
		
		case 4:
			System.out.println("Informe as mudanças do aparelho: ");
			
			break;
			
		case 5:
			System.out.println("Digite o nome do aparelho a ser apagado: ");
			
			break;
			
		case 6:
			System.out.println("Digite o nome do aparelho a ser comprado: ");
			
			break;
			
		case 7:
			System.out.println("Qual aparelho deseja comprar?");
			
			break;
			
		
		default: 
			System.out.println("Por favor, recomece e insira uma opção válida! 1-6");
			break;
			
			
		}
		
		
		
		
		
		
		
		
}
}