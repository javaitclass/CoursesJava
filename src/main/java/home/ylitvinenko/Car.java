package home.ylitvinenko;

public class Car{
     int a = 5;
     public Car(String model){

        // Это конструктор и у него один параметр, name.
        System.out.println("Передаваемая модель:" + model );
    }
    public static void main(String []args){
        // Создание объекта myCar.
        Car myCar = new Car( "Таврия" );
    }
}