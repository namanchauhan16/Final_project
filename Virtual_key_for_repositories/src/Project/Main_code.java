package Project;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class Main_code {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to LockedMe");
        System.out.printf("Developed by xyz\n"+"from LockedMe.com");
        System.out.println("\n***************\n");
        BLO blo=new BLO();
        int y;
        do {
            System.out.println("Main Menu:");
            System.out.println("\n***************");
            System.out.println("Press 1 to print all the present files in ascending order.");
            System.out.println("Press 2 to perform business level operations.");
            System.out.println("Press 3 to exit the application.");
            System.out.println("***************\n");
            System.out.println("Enter your option between 1-3 only!");
            try {
                y=sc.nextInt();
                System.out.println();
                switch (y){
                    case 1:
                        blo.display_list();
                        break;
                    case 2:
                        blo.operations();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nWrong input, pleas enter from 1-3 only\n");
                }
            }catch (Exception e){
                System.out.println("\nPleas give an Integer input!\n");
                sc.nextLine();
            }
        }while (true);
    }
}
