package day33_a_static;

public class Practice {

    String mentor;

    static int batchNumber;
    static int courseLengthInMonth;
    static String schoolName;
    static String [] teachers;


    public Practice(String mentor) {
        this.mentor = mentor;
    }


    static {
        System.out.println("Static Block is Running");
        batchNumber = 4;
        courseLengthInMonth = 6;
        schoolName = "Cydeo";
        teachers = new String [] {"Nadir", "Feyruz"};
    }

    @Override
    public String toString() {
        return "Practice: " +
                "\n\tmentor: " + mentor;
    }
}
