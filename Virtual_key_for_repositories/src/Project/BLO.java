package Project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BLO {
    int y;
    ArrayList<String> aList=new ArrayList<String>();
    //Add a file
    public void add_file()throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the file name you want to add:");
        String f=sc.nextLine();
        File file=new File("C:\\Users\\naman\\IdeaProjects\\Virtual_key_for_repositories\\file folder",f);
        if(file.createNewFile()){
            System.out.println("\nFile added.");
            aList.add(f);
        }
        else {
            System.out.println("\nFile already exists.");
        }
    }
    //Delete a file
    public void delete_file()throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the file name you want to delete");
        String f=sc.nextLine();
        File file=new File("C:\\Users\\naman\\IdeaProjects\\Virtual_key_for_repositories\\file folder",f);
        if(file.delete()){
            System.out.println("\nFile deleted.");
            aList.remove(f);
        }
        else {
            System.out.println("\nFile does not exist.");
        }
    }
    //Search a file
    public void search_file()throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the file name you want to search:");
        String f=sc.nextLine();
        File file=new File("C:\\Users\\naman\\IdeaProjects\\Virtual_key_for_repositories\\file folder",f);
        if(file.isFile()){
            System.out.println("\nEntered file found.");
        }
        else {
            System.out.println("\nEntered file does not found.");
        }
    }
    //Display file names
    public void display_list()throws IOException {
        File file=new File("C:\\Users\\naman\\IdeaProjects\\Virtual_key_for_repositories\\file folder");
        String[] files=file.list();
        Arrays.sort(files);
        if(files.length==0){
            System.out.println("****Empty Directory****");
        }
        else {
            for(String string:files) {
                System.out.println(string);

            }
        }
        System.out.println();
    }
    //Operations to be performed
    public void operations() throws IOException {
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("\nBusiness Level operations:");
            System.out.println("\n***************");
            System.out.println("Press 1 to add a new file.");
            System.out.println("press 2 to search an existing file.");
            System.out.println("Press 3 to delete an existing file.");
            System.out.println("Press 4 to go to main menu.");
            System.out.println("***************\n");
            System.out.println("Enter your option between 1-4 only!");
            try {
                y=sc.nextInt();
                System.out.println();
                switch (y){
                    case 1:
                        add_file();
                        break;
                    case 2:
                        search_file();
                        break;
                    case 3:
                        delete_file();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("\nWrong input, pleas enter from 1-4 only\n");
                        break;
                }
            }catch (Exception e){
                System.out.println("\nPleas give an Integer input!\n");
                sc.nextLine();
            }
        }while (y!=4);
    }
}
