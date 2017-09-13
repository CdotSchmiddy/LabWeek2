package lab.week2.favapps;

import java.util.Scanner;

public class LabWeek2FavApps {

    public static void main(String[] args) {
         String app1, app2, app3, apps;
        
         Scanner keyboard = new Scanner(System.in);
        
         System.out.print("1. Enter your favourtie app: ");
         app1 = keyboard.nextLine();
         
         System.out.print("2. Enter your favourtie app: ");
         app2 = keyboard.nextLine();
         
         System.out.print("3. Enter your favourtie app: ");
         app3 = keyboard.nextLine();
         
         apps = (app1 + ", " + app2 + " and " + app3 + ".");
         
         System.out.printf("Your favourite apps are %s%n", apps);
    }
    
}
