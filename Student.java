class Parent {
        int age,id;
        String name;
        void naming(String name)
        {
            System.out.println("Name:"+name);
        }
    }

class Child extends Parent{
    void ageN(int age)
    {
        System.out.println("Age of student is:"+age);
    }
}
public class Student{
    public static void main(String[] er)
    {
       Child s=new Child(); //creating object of child class
       s.naming("Aashish");
       s.ageN(14);
    }
}