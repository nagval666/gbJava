package lesson6;

public abstract class Animal {

    protected String kindOfAnimal;
    protected String Name;
    public static int countAnimal = 0;

    public Animal(String kindOfAnimal, String Name) {
        this.kindOfAnimal = kindOfAnimal;
        this.Name = Name;
        ++countAnimal;
    }
}
