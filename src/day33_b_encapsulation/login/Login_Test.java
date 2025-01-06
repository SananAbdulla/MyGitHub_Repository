package day33_b_encapsulation.login;

public class Login_Test {

    // TODO remember

    private String username;
    private String password;


    // Constructor
    public Login_Test (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setPassword (String username, String password) {

        if (username.equalsIgnoreCase(this.username)) {
            if (password.length() >=8) {
                this.password = password;
            } else {
                System.out.println("Password is less than 8 " +
                        "characters");
            }

        } else  {
            System.out.println("Wrong Username");
        }

    }

    public String getPassword (String username) {

        String result = "";

        if (username.equalsIgnoreCase(this.username)) {

            result = password;
        }
        else {
            System.out.println("Wrong username");
        }
        return result;
    }


}
