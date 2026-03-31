class Car {

    
    private String brand;
    private int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }
}

public class GetterSetter {
    public static void main(String[] args) {

        Car c1 = new Car();

    
        c1.setBrand("Toyota");
        c1.setSpeed(180);


        System.out.println("Car Brand: " + c1.getBrand());
        System.out.println("Car Speed: " + c1.getSpeed());
    }
}