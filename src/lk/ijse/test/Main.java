package lk.ijse.test;


class Student {
    String name = "Supun";

    {
        name = "Kamal";
        age = 20;
    }

    int age = 30;

    Student() {
        name = "Supun";
        name = "Kamal";

        age = 20;
        age = 30;
    }
}

class Main {
    public static void main(String args[]){
        Student s1 = new Student();

        System.out.println("name: " + s1.name);	//?
        System.out.println("age: " + s1.age);	//?
    }
}
























