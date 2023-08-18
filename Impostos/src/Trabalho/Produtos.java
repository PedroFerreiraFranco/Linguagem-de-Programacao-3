package Trabalho;

public class Produtos{
	private String nomeProduto;
	private double precoCusto;
	private double margemLucro;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getMargemLucro() {
		return margemLucro;
	}
	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
    public double calcularPrecoFinal(Impostos impostos) {
        double valorImpostos = getPrecoCusto() * impostos.getTaxa();
        double valorComImpostos = getPrecoCusto() + valorImpostos;
        double precoFinal = valorComImpostos+(valorComImpostos * (getMargemLucro() / 100));
        return precoFinal;
    }
}
