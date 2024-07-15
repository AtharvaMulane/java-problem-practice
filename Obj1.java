package FirstAss;

class Car{
    String color;
    String model;
    int speed;

    Car(String color, String model, int speed){

        this.color = color;
        this.model = model;
        this.speed = speed;
    }
    public void accelerate(int increment){
        speed += increment;
    }
    void display(){
        System.out.println("Car color = "+color+", Car Model = "+model+", Car Speed = "+speed);
    }
}
public class Obj1 {
    public static void main(String[] args){
        
        Car mycar = new Car("Blue", "XUV", 0);
        
        mycar.accelerate(50);
        mycar.display();
    }
}
