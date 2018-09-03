public class Fish extends Pet {
    int currentDepth = 0; //currentDepth store and update depth every time dive method is being called

    public int dive(int howDeep) {

        currentDepth = currentDepth + howDeep;
        System.out.println("diving for " + howDeep + " feet");
        System.out.println("I'm at " + currentDepth + " feet below sea level");
        return currentDepth;
    }
    public String talk(String something) {
        return "Don't you know that fish font talk?";
    }
}
