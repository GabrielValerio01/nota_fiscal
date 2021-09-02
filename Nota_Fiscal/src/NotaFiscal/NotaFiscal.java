package NotaFiscal;

import java.util.Date;
import java.util.Scanner;

public class NotaFiscal {

public static void main(String[] args) {
		int i = 0;
		//int vetorx[] = new int[6];
		String vetor[] = new String [6];
		Date HoraAtual = new Date(); 
		int opcao = 0;	
		float ValorPedido = 0;
		float TaxaEntrega = 5;
		int qtd = 0;
		Scanner leia = new Scanner(System.in);
		
			System.out.println("============================================");
			System.out.println("** PEDIDO ENTREGA **");
			System.out.println("============================================");
			
			System.out.println("============================================");
			System.out.println("Território das Bebidas");
			System.out.println("============================================");
			
			do {
			
			System.out.println("1- ASKOV VODKA QUALQUER SABOR R$ 18,00");
			System.out.println("2- ABSOLUT VODKA 1L R$ 72,00");
			System.out.println("3- VELHO BARREIRO R$ 13,00");
			System.out.println("4- AMARULA R$ 95,00");
			System.out.println("5- VINHO SECO R$ 20,00");
			System.out.println("6-VINHO SUAVE R$ 25,00");
			System.out.println("7-FECHAR PEDIDO");
			System.out.println("TAXA DE ENTREGA R$ 5,00");
			
			System.out.println("DIGITE SEU PEDIDO: ");
			opcao = leia.nextInt();
			
			
			switch(opcao) {
			case 1:
				ValorPedido = ValorPedido +18 +TaxaEntrega;
				vetor[1] = "ASKOV VODKA";
				qtd = qtd + 1;
				break;
			case 2:
				ValorPedido = ValorPedido +72 +TaxaEntrega;
				vetor[2] = "ABSOLUT VODKA";
				qtd = qtd + 1;
				break;
			case 3:
				ValorPedido = ValorPedido +13 +TaxaEntrega;
				vetor[3] = "VELHO BARREIRO";
				qtd = qtd + 1;
				break;
			case 4:
				ValorPedido = ValorPedido +95 +TaxaEntrega;
				vetor[4] = "VELHO BARREIRO";
				qtd = qtd + 1;
				break;
			case 5:
				ValorPedido = ValorPedido +20 +TaxaEntrega;
				vetor[5] = "AMARULA";
				qtd = qtd + 1;
				break;
			case 6:
				ValorPedido = ValorPedido +25 +TaxaEntrega;
				vetor[6] = "VINHO SECO";
				qtd = qtd + 1;
				break;
			case 7:
				System.out.println("============================================");
				System.out.println("** PEDIDO FECHADO **");
				System.out.println("Data Atual: "+ HoraAtual);
				System.out.println("============================================");
				break;
				}

			
			}while(opcao != 7);
			
				System.out.println("O TOTAL DA SUA COMPRA É DE: " + ValorPedido);
				System.out.println("ITENS PEDIDOS:");
				/*System.out.println(vetor[i] + " Qntd: " +  qtd);
				System.out.println(vetor[i] + " Qntd: " +  qtd);
				System.out.println(vetor[i] + " Qntd: " +  qtd);
				System.out.println(vetor[i] + " Qntd: " +  qtd);
				System.out.println(vetor[i] + " Qntd: " +  qtd);*/
			
				for (i = 0; i < 6; i++) {
					if(vetor[i] != null ) {
						System.out.println(vetor[i]);
					}
					
					
				}
				
		}	
  }
  