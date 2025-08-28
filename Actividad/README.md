prueba 1 - variables en actividad 1 :
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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