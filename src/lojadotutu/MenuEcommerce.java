package lojadotutu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuEcommerce {
		
	public static void main(String[] args) {
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
			System.out.println("            6 - Sair                                 ");
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

			if (opcao == 6) {
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
			
		default: 
			System.out.println("Por favor, recomece e insira uma opção válida! 1-5");
			break;
			
			
		}
		
		
		
		
		
		
		
		
}
}
