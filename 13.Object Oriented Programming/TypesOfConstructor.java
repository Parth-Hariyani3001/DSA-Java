public class TypesOfConstructor {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Parth");
        Student s3 = new Student(90);
        // Student s4 = new Student("aman",90) -> Will give error because constructor is not matching 
    
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}

class Student{
    String name;
    int roll;

    //we can have multiple constructor and is called as contructor overloading and is called as polymorphism
    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
