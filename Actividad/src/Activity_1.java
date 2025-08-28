public class Activity_1 {
    public static void main(String[] args) {
        Product producto1 = new Product("Mouse Inalámbrico", 25.99, 50);
        Product producto2 = new Product("Teclado", 45.00, 30);

        producto1.showProduct();
        producto1.sell(10);
        producto1.restock(20);
        producto1.sell(100);
        producto1.showProduct();

        producto2.showProduct();
        producto2.sell(5);
        producto2.restock(10);
        producto2.showProduct();
    }
}

// Clase Product SIN la palabra 'public'
class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Se vendieron " + amount + " unidades de " + name + ".");
        } else {
            System.out.println("No hay suficiente stock para vender " + amount + " unidades de " + name + ".");
        }
    }

    public void restock(int amount) {
        quantity += amount;
        System.out.println("Se repusieron " + amount + " unidades de " + name + ".");
    }

    public void showProduct() {
        System.out.println("Producto: " + name);
        System.out.println("Precio: $" + price);
        System.out.println("Cantidad en stock: " + quantity);
        System.out.println("---------------------------");
    }
}
