package pl.javastart.task.engine;

public class Product {

    private String name;
    private String description;
    private double price;
    private String category;

    public Product(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void productInformation() {
        System.out.printf("Nazwa produktu: %s\n", name);
        System.out.printf("Opis Produktu: %s\n", description);
        System.out.printf("Cena netto: %.2f PLN\n", price);
        System.out.printf("Produkt należy do kategorii: %s \n", category);
    }

}
