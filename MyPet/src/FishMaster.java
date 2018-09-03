public class FishMaster {
    public static void main(String[] args) {
        //metoda main kopiuje obiekt Fish i przywołuje jego metodę dive dwukrotnie z różnymi argumentami
        //następnie przywołuje metodę sleep
        Fish myFish = new Fish();

        myFish.dive(2);
        myFish.dive(3);
        myFish.sleep();

        String fishReaction;
        fishReaction = myFish.talk("hello");
        System.out.println(fishReaction);
    }
}
