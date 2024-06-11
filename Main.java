import java.util.*;

import classes.UserManager;

public interface Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); 
        boolean run=true;
        while (run) {
            System.out.println("Enter Operation youre going to perform\n1.Register\n2.Login\n3.log out\n6.exit");
            int option=sc.nextInt();
            sc.nextLine();
            if(option==6){
                UserManager manager= UserManager.getInstance();
                if(manager.logoutUser().equals("No user is currently logged in."))
                {
                    run=false;
                }
                else{
                    System.out.println("logout user first");
                }
            }
            else if(option==1){
                System.out.println("Enter UserName");
                String username=sc.nextLine();
                System.out.println("Enter password");
                String password=sc.nextLine();
                UserManager manager= UserManager.getInstance();
                System.out.println(manager.registerUser(username,password));
            }
            else if(option==2){
                UserManager manager= UserManager.getInstance();
                System.out.println("Enter UserName");
                String username=sc.nextLine();
                System.out.println("Enter password");
                String password=sc.nextLine();
                System.out.println(manager.loginUser(username,password));
            }
            else if(option==3){
                UserManager manager= UserManager.getInstance();
                System.out.println(manager.logoutUser());
            }
            else if(option==4){
            UserManager manager= UserManager.getInstance();
                if(manager.getuser()!=null){
                    

                }
                else{
                    System.out.println("Youre not logged in");
                }
            }
            else if(option==5){
                UserManager manager= UserManager.getInstance();
                if(manager.getuser()!=null){
                   
                }
                else{
                    System.out.println("Youre not logged in");
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        }
    }
}
