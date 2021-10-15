package desafio3;

public class Product {
	
	public String eletronic;
	public String book;
	public double valueEletronic;
	public double valueBook;
	public double tax;
	
	public double TotalValue() {
		return (valueEletronic + valueBook) + tax; 
	}
	
	public void DiscountProductUm(double percentage) {
		valueEletronic -= valueEletronic * percentage/100;
	}
	
	public void DiscountProductDois(double percentage) {
		valueBook -= valueBook * percentage/100;
	}
	
	public String toString() {
		return "Nome do primeiro produto:" + eletronic
			+ ", "
			+ "Nome do segundo produto: " + book
			+ ", "
			+ String.format("O valor total é de: R$ %.2f%n", TotalValue());
		
   }
}
