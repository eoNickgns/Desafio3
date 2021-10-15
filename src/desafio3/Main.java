package desafio3;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Nome do primeiro produto: ");
		product.eletronic = sc.nextLine();
		System.out.print("Valor do primeiro produto: ");
		product.valueEletronic = sc.nextDouble();
		System.out.print("Nome do segundo produto: ");
		sc.nextLine();
		product.book = sc.nextLine();
		System.out.print("Valor do segundo produto: ");
		product.valueBook = sc.nextDouble();
		System.out.print("Valor da taxa: ");
		product.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print(product);
		
		System.out.println();
		
		System.out.print("Desconto produto: ");
		double percentage = sc.nextDouble();
		product.DiscountProductUm(percentage);
		product.DiscountProductDois(percentage);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		sc.close();
	}

}
