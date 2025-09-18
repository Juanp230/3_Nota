package semana04.carro;

public class Main {
    String brand = "Toyota";
    int year = 2022;

    public void ShowInfo(){
        System.out.println("la marca es" + brand " y el año de salida es " + year);
    }

    public static void main(String[] args) {
        Main auto= new Main();
        auto.ShowInfo();
    }
    
}
