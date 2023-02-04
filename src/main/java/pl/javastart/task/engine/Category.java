package pl.javastart.task.engine;

public class Category {

    public float calculateFinalPrice(Product product) {
        return (product.getPrice() * (1 + getVatRate(product.getCategory())));
    }

    public float getVatRate(String category) {
        float vatRate;

        switch (category) {
            case "Spożywcze", "Dziecięce":
                vatRate =  0.07F;
                break;
            case "Biurowe":
                vatRate = 0.14F;
                break;
            default:
                vatRate = 0.23F;
        }
        return vatRate;
    }

}