package lesson6;

public class Cat extends Animal{

    public static int countCat = 0;
    public Cat (String kindOfAnimal, String Name)
    {super (kindOfAnimal, Name); ++countCat;}

    public void run(int distance){
        if (distance <= 200 ){
            System.out.println(kindOfAnimal +" "+ Name + " ran " + distance + " meters");
        } else {
            System.out.println(kindOfAnimal +" "+ Name + " can't run " + distance + " meters");
        };
    }

    public void swim(int distance){
        System.out.println(kindOfAnimal +" "+ Name + " does not swim");
    }
}
