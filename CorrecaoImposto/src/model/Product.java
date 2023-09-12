package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private double costPrice;
	private double profit;
	private List<Tax> taxes;
	
	public Product(String name, double costPrice, double profit) throws Exception{
		setName(name);
		setCostPrice(costPrice);
		setProfit(profit);
		this.taxes = new ArrayList<Tax>();
	}
	
	public boolean addTax(Tax tax) throws Exception{
		//Devemos validar todos os atributos
		if(tax == null)
			throw new Exception("Imposto não pode ser nulo");
		
		if(taxes.contains(tax))
			return false;
		else taxes.add(tax);
		
		return true;
	}
	
	public double calculateSalePrice() {
		//Calcular o valor dos impostos
		double taxesSum = 0;
		for(Tax tax : taxes) {
			taxesSum += tax.calculate(this);
		}
		
		//Somar preço de custo
		double finalCost = this.costPrice+taxesSum;
		
		//Calcular valor final
		double finalPrice = finalCost + (finalCost * profit);
		
		//Retornando valor final do produto
		return finalPrice;
	}
	
	public double getCostPrice() {
		return this.costPrice;
	}
	
	private void setProfit(double profit) throws Exception{
		if(profit<=0)
			throw new Exception("Margem de lucro inválida");
		
		this.profit = profit/100;
	}

	private void setCostPrice(double costPrice) throws Exception{
		if(costPrice<=0)
			throw new Exception("Preço de custo inválido");
		
		this.costPrice = costPrice;
		
	}

	private void setName(String name) throws Exception{
		if(name == null || name.equals("")) 
			throw new Exception("Nome inválido");
		
		this.name = name;
	}
	
	public String getName() {
		return  this.name;
	}
}
