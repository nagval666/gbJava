package lesson5;

public class HomeWorkApp5 {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Gordon Freeman", "theoretical physicist", "black.mesa@mail.com", "66-66-66", 500000, 27);
        employeesArray[1] = new Employee("Petrov Aleksey", "Driver", "petalex@mailbox.com", "81268168", 20000, 35);
        employeesArray[2] = new Employee("Sidorov Mikhail", "Doctor", "sidmikh@mailbox.com", "882195463", 50000, 44);
        employeesArray[3] = new Employee("Kozlov Petr", "Sportsman", "kozpet@mailbox.com", "878214592", 60000, 22);
        employeesArray[4] = new Employee("Sokolov Vladimir", "Cook", "sokvlad@mailbox.com", "878312547", 10000, 41);
        System.out.println("***** over_40 *****");
        over40(employeesArray);
    }

    public static void over40(Employee[] employeesArray){
        for (int i = 0; i < employeesArray.length; i++){
            if (employeesArray[i].getAge() > 40){
                employeesArray[i].employeeData();
            }
        }
    }

}
