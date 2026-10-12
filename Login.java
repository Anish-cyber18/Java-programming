
class Login {

    void login(String username) {
        System.out.println("Login with Username: " + username);
    }

    void login(String username, String password) {
        System.out.println("Login with Username and Password");
    }

    void login(String username, String password, int otp) {
        System.out.println("Login with Username, Password and OTP");
    }

    public static void main(String[] args) {
        Login l = new Login();

        l.login("Anish");
        l.login("Anish", "abc123");
        l.login("Anish", "abc123", 1234);
    }
}

