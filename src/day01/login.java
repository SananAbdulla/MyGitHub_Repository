package day01;

public class login {
    public static void main(String[] args) {


        Credentials obj = new Credentials ();
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

    }
}

class Credentials {
    private String usrname = "AngryBird";
    private String password = "WoodenSpoon";

    public String getUsername () {
        return usrname;
    }
    public String getPassword () {
        return password;
    }
}
