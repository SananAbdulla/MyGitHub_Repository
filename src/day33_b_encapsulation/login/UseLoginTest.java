package day33_b_encapsulation.login;

public class UseLoginTest {

    public static void main(String[] args) {

        Login_Test login1 = new Login_Test("sananabdulla", "Sanko541");


        System.out.println(login1.getPassword("sananabdulla"));

        login1.setPassword("sananabdulla", "sanko54");


        System.out.println(login1.getPassword("sananabdulla"));

    }
}
