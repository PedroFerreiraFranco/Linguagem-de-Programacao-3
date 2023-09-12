package view;

import model.Product;
import model.Tax;

public class Main {

	public static void main(String[] args) throws Exception {
		Product arroz = new Product("arroz",100,30);
		
		Tax IPI = new Tax("IPI", "Imposto Prod. Industrializado", 8);
		Tax ISS = new Tax("ISS", "ISS", 12);

		arroz.addTax(IPI);
		arroz.addTax(ISS);
		
		System.out.println(arroz.getName()+ " R$"+arroz.calculateSalePrice());
	}
}
