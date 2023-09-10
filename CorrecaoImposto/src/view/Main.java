package view;

import model.Product;
import model.Tax;

public class Main {

    public static void main(String[] args) throws Exception {
       
        Product arroz = new Product("arroz", 7, 20, "nacional");

        Tax IPI = new Tax("IPI", "Imposto Prod. Industrializado", 8);
        Tax ISS = new Tax("ISS", "ISS", 5);
        Tax ICMS = new Tax("ICMS", "ICMS", 5);

        arroz.addTax(ICMS);
        arroz.addTax(ISS);

        double totalPrice = arroz.calculateSalePrice();

        System.out.println(arroz.getName() + " - Preço de venda com impostos:");
        System.out.printf("Preço Total: R$%.2f\n",totalPrice);
    }
}
