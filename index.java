import java.util.*;

public class index{
    public static void main(String[] args){
        String yes = "Y";
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cash4Sound - The Transpaent Microphone: We Listen, You Earn");
        System.out.println("Please login or create an account. Do you have a login? (Y/n)");
        String login = input.nextLine();
        while(login == yes){
            System.out.print("Please enter your email address.");
            String email = input.next();
            System.out.println("Please enter your password.");
            //Load UI 
            
            }
            System.out.println("Please enter your first name:");
            String first = input.nextLine();
            System.out.println("Enter your last name: ");
            String last = input.nextLine();
            System.out.println("Enter your email address: ");
            String email = input.nextLine();
            System.out.println("Enter a password: ");
            String password = input.nextLine();
            System.out.println("Confirm your password: ");
            String password2 = input.nextLine();
            while(password != password2){
                System.out.println("Your password didn't match. Please re-confirm your password: ");
                String reconfirm = input.nextLine();
            }

        }
    }
