import java.util.Scanner;
public class day3_login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "admin123";
        
        System.out.println("Enter username");
        String inputUsername = sc.nextLine();
        
        System.out.println("Enter password");
        String inputPassword = sc.nextLine();
        
        if(username.equals(inputUsername) && password.equals(inputPassword))
        {
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("Invalid username or password");
        }
        
    }
}
