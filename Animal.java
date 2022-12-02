public class Animal {
    //instance variables
    int legs;
    String color;
    int weight;
    float height;
    String name;
    int age;

    public Animal(int legs, String color, int weight, float height, String name, int age) {
        this.legs = legs;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.age = age;
    }


    public void eat(){
        System.out.println("I am animal and I am eating");
    }

    public void printAnimalData(){
        System.out.println("legs: "+this.legs+ " color: "+this.color+" age: "+this.age+" name: "+this.name);
    }


}
