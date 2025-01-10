package day34_c_inheritence.animal;
// Animal is the parent class which inherits all
// accessible child classes like dog and cat
public class Animal {

    String type;
    int numOfLegs;
    private int age;

    public void walk () {
        System.out.println( type + " is walking" );
    }

    public void setAge (int age) {
       this.age = age;
    }
    public int getAge() {
        return age;
    }
}
