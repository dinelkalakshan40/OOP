package lk.ijse.oop;

class Employee {
    int id;
    String name;
    double salary;
    static String ceoName;
}

class Main {
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Sithum";
        e1.salary = 1000;
        e1.ceoName = "Gemunu";

        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "Naveen";
        e2.salary = 2500;

        System.out.println("e1.ceoName: " + e1.ceoName);
        System.out.println("e2.ceoName: " + e2.ceoName);
        System.out.println("Employee.ceoName: " + Employee.ceoName);

        e2.ceoName = "Palitha";

        System.out.println("\nchange the ceo name");

        System.out.println("\ne1.ceoName: " + e1.ceoName);
        System.out.println("e2.ceoName: " + e2.ceoName);
        System.out.println("Employee.ceoName: " + Employee.ceoName);
    }
}







