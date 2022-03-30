/*
Chapter 10 Programming excercise 07
Riky Hernandez
10/05/21
Description: Using Account class from 9.7, ATM Machine
                Using 10 arrays to store 10 ids,useing a menu to display,balance, withraw and deposit all that
                        take and recieve menu
      ____
     /___/\_                               
    _\   \/_/\__                          
  __\       \/_/\                       
  \   __    __ \ \                    
 __\  \_\   \_\ \ \   __               
/_/\\   __   __  \ \_/_/\           
\_\/_\__\/\__\/\__\/_\_\/         
   \_\/_/\       /_\_\/             
      \_\/       \_\/
*/
package chapter10_07;

import java.util.Scanner;


public class Chapter10_07 {
    
      public static void main(String[] args) {
         
          
 Scanner input = new Scanner (System.in);
          Account [] accounts = new Account[10];        //nter specific number of arrays/ids
          for(int i = 1; i<10;i++){
          accounts[i-1] = new Account(i, 100);              //enter specific amount of balance, subtract 1, cause it goes from 0-9
      }
  
          System.out.print("Enter an ID: 1-10: ");              //user inputs an id betwwen 1-10
          int id = input.nextInt();
          
           while (id < 1 || id > 10) {
            System.out.print("Please enter a valid id: ");              //if user inut anything besides 1-10, will prompt the same question
            id = input.nextInt();
            System.out.println();
        }
           
            while (true) {                                      
           System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
            System.out.println("Enter a choice: ");
            int choice = input.nextInt();                                       //user will enter what menu they would like

            if (choice == 4) {
                System.out.println("Enter an id (1 - 10): ");
                id = input.nextInt();                                               //if they chose 4 it will make them choose another id
                
                while (id < 1 || id > 10) {
            System.out.println("Please enter a valid id: ");
            id = input.nextInt();
             System.out.print("\n");
                                            }
                                }
              switch (choice) {
            case 1: 
                System.out.println("The balance is: " +                             // checks the balance of it unique array
                                 accounts[id - 1].getBalance());
                System.out.print("\n");
                break;
            case 2:
                System.out.println("Enter the amount to withdraw: ");               //will be able to subtract from the balance
                accounts[id - 1].withdraw(input.nextDouble());
                 System.out.print("\n");
                break;
            case 3:
                System.out.println("Enter the amount to deposit: ");                     //will be able to add from the balance
                accounts[id - 1].deposit(input.nextDouble());
                 System.out.print("\n");
                break;
            default:
                break;
        }
    }          
                    }
            
          
 }


