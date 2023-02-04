package pl.javastart.task.engine;

public class Category {

    public double calculateFinalPrice(Product product) {
        double result;

        switch (product.getCategory()) {
            case "Spożywcze", "Dziecięce":
                result = product.getPrice() * 1.07;
                System.out.println("Stawka VAT wynosi 7%");
                break;
            case "Biurowe":
                result = product.getPrice() * 1.14;
                System.out.println("Stawka VAT wynosi 14%");
                break;
            default:
                result = product.getPrice() * 1.23;
                System.out.println("Stawka VAT wynosi 23%");
        }
        return result;
    }
}