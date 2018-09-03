
//klasa Pet przechowuje wartości i atrybuty
public class Pet {
    int age;
    float height;
    float weight;
    String color;

    public void sleep() {
        //użylismy słówka public, dzięki czemu możemy przywołać tę metodę z każdej innej klasy Java
        System.out.println("Good nihjt, see you tomorrow"); //nie przyjmuje argumentow i nie zwarca wartosci
    }

    public void eat() {
        System.out.println("I'm so hungry, let me have a snack like nachos!");
    }
    public String talk(String phrase) {
        //ta metoda także moze być przywołana z każdje innej kalsy jab=vy ALE musi zwróić text
        String petResponse = "OK!! OK!!" + phrase;
        return petResponse;
    }
}



