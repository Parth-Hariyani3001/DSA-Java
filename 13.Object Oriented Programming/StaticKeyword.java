public class StaticKeyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "SVP";

        Student s2 = new Student();
        System.out.println(s2.schoolName);  //SVP

        Student s3 = new Student();
        s3.schoolName = "SVIS";

        Student s4 = new Student();
        System.out.println(s4.schoolName);  //SVIS
    }
}

class Student{
    String name;
    int roll;

    //static variable
    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    //static method
    static int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem)/3;
    }
}