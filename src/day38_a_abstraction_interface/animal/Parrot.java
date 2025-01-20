package day38_a_abstraction_interface.animal;

import day37_a_abstraction.language.Language;

public class Parrot extends Bird implements Flyable, Language {

    @Override
    public void useWings() {
        System.out.println("Bird is eating");


    }

    @Override
    public void eact() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void SayHello() {

    }

    @Override
    public void sayGoodbye() {

    }
}
