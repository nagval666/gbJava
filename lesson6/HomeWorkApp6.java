package lesson6;

public class HomeWorkApp6 {

    public static void main (String[] args){

        Dog dog1 = new Dog("Dog", "Sam");
        Dog dog2 = new Dog("Dog", "Tishka");
        Cat cat1 = new Cat("Cat", "Mars");
        dog1.run(300);
        dog1.swim(11);
        dog2.run(600);
        dog2.swim(100);
        cat1.run(400);
        cat1.swim(10);
        System.out.println("All animals = " + Animal.countAnimal + "\nAll dogs = " + Dog.countDog + "\nAll cats = " + Cat.countCat);
    }

}
