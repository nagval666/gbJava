package lesson5;

public class Employee {

    private String fullName;
    private String post;
    private String eMail;
    private String phone;
    private float salary;
    private int age;

    public Employee(String fullName, String post, String eMail, String phone, float salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        employeeData();
    }

    void employeeData(){
        System.out.println(fullName + " | " + post + " | " + eMail + " | " + phone + " | " + salary + " | " + age);
    }

    int getAge() {
        return age;
    }
}

