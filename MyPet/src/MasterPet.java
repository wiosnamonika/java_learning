public class MasterPet {
    public static void main(String[] args) {
        String petReaction;
        Pet myPet = new Pet(); //stworzyliśmy instancję (kopię) obiektu Pet;
        myPet.eat();
        petReaction = myPet.talk("OK!");

        System.out.println(petReaction);
        myPet.sleep();
    }
}
