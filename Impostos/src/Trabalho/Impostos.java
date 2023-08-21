package Trabalho;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Impostos {
    private double taxa;
    private List<Integer> impostosEscolhidos;
    
    public Impostos() {
    	this.taxa = 0.0;
    	this.impostosEscolhidos = new ArrayList<>();    
    	}

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    public void calcularImposto(int opImpostos) {
    	
    	if (impostosEscolhidos.contains(opImpostos)) {
              System.out.println("Não é possível repetir impostos");
              return;
    	}
              
        switch (opImpostos) {
            case 1:
                // ICMS: 7%
                taxa += 0.07;
                break;

            case 2:
                // Confins: 12%
                taxa += 0.12;
                break;

            case 3:
                // IPI: 8%
                taxa += 0.08;
                break;

            case 4:
                // ISS: 5%
                taxa += 0.05;
                break;

            case 5:
                // Cide: 10%
                taxa += 0.1;
                break;

            case 6:
                // CSLL: 4%
                taxa += 0.04;
                break;
        }
        	impostosEscolhidos.add(opImpostos);
}
    
    public void menu() {
    	System.out.println("\nImpostos necessarios para o produto: ");
		System.out.println("1- ICMS: 7%");
		System.out.println("2- Confins: 12%");
		System.out.println("3- IPI: 8%");
		System.out.println("4- ISS: 5%");
		System.out.println("5- Cide: 10%");
		System.out.println("6- CSLL: 4%");
    }
}
