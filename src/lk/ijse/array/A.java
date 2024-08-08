package lk.ijse.array;

class Student {
    String id;
    double prfMark;
    double dbmMark;
    boolean status;

    Student() {
        System.out.println("Student()");
    }

    Student(int i) {
        System.out.println("Student(int i)");
    }

    public void student() {

    }
    public void student(int i) {

    }
}

class Main {
    public static void main(String args[]) {
        Student s1 = new Student();	//constructor calling

        Student s2 = new Student(10);	//constructor calling
    }
}
