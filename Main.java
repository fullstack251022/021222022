public class Main {
    public static void main(String[] args) {
    //targil:
    //1) create a class Transport, add few parameters that all transports have in common such as
    //Weight, speed ...
    //2) create 2 sub classes that extends from Transport class Car and Airplane and paramaters to them that
    //only they has.





        Animal animal1 = new Animal(0,"Green",7,3.7f,"Kobra",5);
        Cat cat1 = new Cat("black",7,0.45f,"British",2);
        Dog dog1 = new Dog("White",15,1.2f,"labrador",3,true);

//        snake.eat();
//        cat.eat();
        dog1.printAnimalData();
        animal1.printAnimalData();
        cat1.printAnimalData();

        cat1.tailLength = 8f;
    }
}
