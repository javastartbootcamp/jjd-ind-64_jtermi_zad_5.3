package pl.javastart.task;

import pl.javastart.task.engine.Product;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Mleko", "Prosto od krowy", 20F, "Spożywcze");
        Product product2 = new Product("Pasta", "Colgate", 5F, "Środki do higieny");
        Product product3 = new Product("Pieluchy", "Pampers", 15F, "Dziecięce");

        System.out.println(product1.getProductInformation());
        System.out.printf(product1.getFinalPrice());

        System.out.println(product2.getProductInformation());
        System.out.println(product2.getFinalPrice());

        System.out.println(product3.getProductInformation());
        System.out.println(product3.getFinalPrice());

    }
}
