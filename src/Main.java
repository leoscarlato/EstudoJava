import entities.Product;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do produto: ");
        product.name = sc.next();

        System.out.println("Insira o preço do produto: ");
        product.price = sc.nextDouble();

        System.out.println("Insira a quantidade do produto no estoque: ");
        product.quantity = sc.nextInt();

//        System.out.println(product.name + ", " + product.price + ", " + product.quantity);


        System.out.println("Product data: " + product);

        System.out.println();


        System.out.println("Enter the number of products to be added in stock: ");
        int extra_qtd = sc.nextInt();
        product.addProducts(extra_qtd);

        System.out.println();

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        int qtd = sc.nextInt();
        product.removeProducts(qtd);

        System.out.println();

        System.out.println("Updated data: " + product);





    }
}