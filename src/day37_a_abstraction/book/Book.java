package day37_a_abstraction.book;

// Concrete class
public class Book implements Create {


    @Override
    public void read() {
        System.out.println("Reading a book");
    }

    @Override
    public void write() {
        System.out.println("Writing a book");
    }
}
