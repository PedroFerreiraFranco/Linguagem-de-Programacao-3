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
		
        imoposto.menu();
        
        do {
            System.out.println("Digite a opção de imposto (1 a 6, 0 para sair): ");
            opImpostos = scanner.nextInt();

            if (opImpostos >= 1 && opImpostos <= 6) {
            	imoposto.calcularImposto(opImpostos);
            } else if (opImpostos != 0) {
                System.out.println("Opção de imposto inválida!");
            }
        } while (opImpostos != 0);
        System.out.println("Taxa acumulada: " + imoposto.getTaxa());
		
		double precoFinal = produto.calcularPrecoFinal(imoposto);
		System.out.println("\nO preço final do produto " 
		+ produto.getNomeProduto() + " é: R$" + precoFinal);
		
	}
}
