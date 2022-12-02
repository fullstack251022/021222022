public class Dog extends Animal{

    boolean isColorBlind;

    public Dog(String color, int weight, float height, String name, int age, boolean isColorBlind ) {
        super(4, color, weight, height, name, age);
        this.isColorBlind=isColorBlind;
    }


}
