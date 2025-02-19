package src;
import java.util.Scanner;
public class userinput_substring_exercise {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String user_email;

        System.out.println("What is your email? ");
        user_email = sc.nextLine();
        while (!user_email.contains("@")) {
            System.out.println("the emails must contain @");
            System.out.println("What is your email? ");
            user_email = sc.nextLine();
        }
        if(user_email.contains("@")){
            System.out.println("Do you want me to suggest a username to you? y/n ");
            String choice = sc.nextLine();
            int randomNum = (int)(Math.random() * 900) + 100;
            String username= user_email.substring(0, user_email.indexOf("@")) + randomNum;;
            while(choice.toUpperCase().equals("Y"))
            {
                // Generate a random number between 100 and 999 for the username
                randomNum = (int)(Math.random() * 900) + 100;
                username = user_email.substring(0, user_email.indexOf("@")) + randomNum;

                System.out.println("Do you want " + username + " to be your username or do you want me to change it? y/n ");
                choice = sc.nextLine();


            }
            System.out.println("fine, then your username will be "+ username);
            System.out.println("and your domain is ");
            String domain = user_email.substring(user_email.indexOf("@")+ 1);
            System.out.println(domain);
        }


        sc.close();
    }
}