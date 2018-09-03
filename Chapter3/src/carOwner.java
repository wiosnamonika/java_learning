public class carOwner {
    public static void main(String[] args) {
        Car myCar = new Car();
        int carDistance;
        myCar.start();
        myCar.stop();
        carDistance = myCar.drive(60);
        System.out.println(carDistance);
    }
}
