package Trabalho;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Produtos produto = new Produtos();
		Impostos imoposto = new Impostos();
		int opImpostos;
		double taxa=0;
		
		System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        produto.setNomeProduto(nomeProduto);
		
        System.out.print("Digite o preço de custo: ");
        double precoCusto = scanner.nextDouble();
        produto.setPrecoCusto(precoCusto);

        System.out.print("Digite a margem de lucro (%): ");
        double margemLucro = scanner.nextDouble();
        produto.setMargemLucro(margemLucro);		
		
		System.out.println("\nImpostos necessarios para o produto: ");
		System.out.println("1- ICMS: 7%");
		System.out.println("2- Confins: 12%");
		System.out.println("3- IPI: 8%");
		System.out.println("4- ISS: 5%");
		System.out.println("5- Cide: 10%");
		System.out.println("6- CSLL: 4%");
		System.out.println("0- SAIR");
		System.out.print("Desejado: ");
		do {
			opImpostos = scanner.nextInt();
			
			switch(opImpostos) {
			
			case 1: 
				//ICMS: 7%
				taxa += 0.07;
			break;	
			
			case 2: 
				//Confins: 12%
				taxa += 0.12;
			break;	
			
			case 3: 
				//IPI: 8%
				taxa += 0.08;
			break;	
			
			case 4: 
				//ISS: 5%
				taxa += 0.05;
			break;	
			
			case 5: 
				//Cide: 10%
				taxa += 0.1;
			break;	
			
			case 6: 
				//CSLL: 4%
				taxa += 0.04;
			break;	
			}
		}while(opImpostos!=0);
		
		double precoFinal = produto.calcularPrecoFinal(imoposto);
		System.out.println("\nTaxa: "+taxa*100+"%");
		System.out.println("\nO preço final do produto " 
		+ produto.getNomeProduto() + " é: " + precoFinal);
		
	}
}
