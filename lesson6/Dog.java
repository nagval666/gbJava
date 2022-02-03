package lesson6;

public class Dog extends Animal{

    public static int countDog = 0;
    public Dog (String kindOfAnimal, String Name)
    {super (kindOfAnimal, Name); ++countDog;}

    public void run(int distance){
        if (distance <= 500 ){
            System.out.println(kindOfAnimal +" "+ Name + " ran " + distance + " meters");
        } else {
            System.out.println(kindOfAnimal +" "+ Name + " run " + distance + " meters");
        };
    }

    public void swim(int distance){
        if (distance <= 10 ){
            System.out.println(kindOfAnimal +" "+ Name + " swam " + distance + " meters");
        } else {
            System.out.println(kindOfAnimal +" "+ Name + " can't swim " + distance + " meters");
        };
    }
}