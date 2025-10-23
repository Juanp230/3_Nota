package unidad2.actividad2.carro;

public class Car {
    String brand;
    int year;
    public Car (String brand, int year){
    this.brand= brand;
    this.year = year;
    }
    public void ShowInfo(String[] args) {
        System.out.println("La marca es: " + brand + "el año del auto es :"+ year);
        
    }
}
