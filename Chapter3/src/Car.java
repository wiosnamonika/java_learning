public class Car {

    public void start() {
        System.out.println("Lets start");
    }

    public void stop() {
        System.out.println("Stop!");

    }
    public int drive(int howlong) {
            int distance = howlong * 60;
            return distance;
    }

}
