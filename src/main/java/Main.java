public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.maxSpeed = 300;
        car1.model = "Ferrari";

        Car car2 = new Car();
        car2.model = "Ferrari";
        car2.maxSpeed = 300;

        System.out.println(car1.hashCode() + " "+ car2.hashCode());
    }
}
