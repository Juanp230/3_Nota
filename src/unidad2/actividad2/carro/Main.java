package unidad2.actividad2.carro;

public class Main {
    String brand = "Toyota";
    int year = 2022;

    /**
     * 
     */
    public void ShowInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("la marca es");
        stringBuilder.append(brand);
        stringBuilder.append(year);
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Main auto= new Main();
        auto.ShowInfo();
    }
    
}
