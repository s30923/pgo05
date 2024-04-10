public class Product {
    private double price;
    private String name;
    private String code;
    private int quantity;

    public Product(double price, String name, String code, int quantity) {
        this.price = price;
        this.name = name;
        this.code = code;
        this.quantity = quantity;
    }

    public Product(double price, String name, String code) {
        this.price = price;
        this.name = name;
        this.code = code;
        this.quantity = 0;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product: ");
        sb.append("{ Name: ");
        sb.append(this.getName());
        sb.append(", Price: ");
        sb.append(this.getPrice());
        sb.append(", Code: ");
        sb.append(this.getCode());
        sb.append(", Quantity: ");
        sb.append(this.getQuantity());
        return sb.toString();
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0) {
            throw new IllegalArgumentException("Cena produktu nie moze byc mniejsza niz 0");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<0) {
            throw new IllegalArgumentException("Liczba produktow na stanie nie moze byc mniejsza niz 0");
        }
        this.quantity = quantity;
    }
}
