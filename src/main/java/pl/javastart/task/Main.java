package pl.javastart.task;

import pl.javastart.task.engine.Category;
import pl.javastart.task.engine.Product;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Mleko", "Prosto od krowy", 20, "Spożywcze");
        Product product2 = new Product("Pasta", "Colgate", 5, "Środki do higieny");
        Product product3 = new Product("Pieluchy", "Pampers", 15, "Dziecięce");

        Category category = new Category();

        product1.productInformation();
        System.out.printf("Cena brutto produktu wynosi: %.2f PLN\n\n", category.calculateFinalPrice(product1));

        product2.productInformation();
        System.out.printf("Cena brutto produktu wynosi: %.2f PLN\n\n", category.calculateFinalPrice(product2));

        product3.productInformation();
        System.out.printf("Cena brutto produktu wynosi: %.2f PLN\n\n", category.calculateFinalPrice(product3));

    }

}
