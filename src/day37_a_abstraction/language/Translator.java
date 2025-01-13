package day37_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {


          // Cannot create object for interface
       // Language obj = new Language();

        Turkish turk = new Turkish();
        turk.SayHello();
        turk.sayGoodbye();


    }
}
