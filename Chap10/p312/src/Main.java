public class Main {

    public static void main(String[] args) {
        m(new GraduteStrudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}

class GraduteStrudent extends Student{}
class Student extends Person{
    @Override
    public String toString() {
        return "Student";
    }
}
class Person extends Object{
    @Override
    public String toString() {
        return "Person";
    }
}