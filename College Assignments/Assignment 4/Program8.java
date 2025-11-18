//Write a Java program to create a class Product with private attributes id, name, and price. Provide public 
//getter and setter methods to access and update these attributes.
class Product {
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Program8 {
    public static void main(String[] args) {
        Product p = new Product();
        p.setId(101);
        p.setName("Laptop");
        p.setPrice(99999);

        System.out.println("Product: " + p.getName());
        System.out.println("ID: " + p.getId());
        System.out.println("Price: " + p.getPrice());
    }
}
