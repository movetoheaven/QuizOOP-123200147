/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;
import quiz.quizz.*;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int choose, choose2;
        
        
            System.out.println("REGISTRATION FORM FOR PT. JUAN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Choose  : ");
        choose = input.nextInt();
        
        System.out.println("REGISTRATION FORM");
            System.out.print("Input NIM   : ");
            String nim = input.nextLine();
            input.nextLine();
            
            System.out.print("Input name  : "); 
            String name = input.nextLine();
            
            System.out.print("Input Writing Exam Score  : ");
            double inputwrite = input.nextDouble();
            
            System.out.print("Input Coding Test Score : ");
            double inputcode = input.nextDouble();
            
            System.out.print("Input Interview Test Score  : ");
            double inputinterview = input.nextDouble();
            
        if (choose == 1) {
            Android AndroDev = new Android(name, nim, inputwrite, inputcode, inputinterview);
            do {
            AndroDev.calculate();
            System.out.println("Menu");
            System.out.println("1. Edit");
            System.out.println("2. Output");
            System.out.println("3. Exit ");
            System.out.print("Choose  : ");
            choose2 = input.nextInt();
            switch (choose2) {
                case 1:
                    System.out.println("EDIT FORM");
                    System.out.print("Input Writing Exam Score  : ");
                    inputwrite = input.nextDouble();
                    AndroDev.setWrite(inputwrite);
                    
                    System.out.print("Input Coding Test Score : ");
                    inputcode = input.nextDouble();
                    AndroDev.setCode(inputcode);
                    
                    System.out.print("Input Interview Test Score  : ");
                    inputinterview = input.nextDouble();
                    AndroDev.setInterview(inputinterview);
                    
                    break;
                case 2:
                    System.out.println("Final Score : " + AndroDev.calculate());
                    if (AndroDev.calculate() >= 85) {
                        System.out.println("INFORMATION: SUCCESS");
                        System.out.println("Congrats to "+AndroDev.getName() + " has been accepted in Android Dev");
                        
                    }else{
                        System.out.println("INFORMATION: FAILED");
                        System.out.println("Sorry to"+AndroDev.getName()+"has been denied");
                    }
                    break;
                case 3:
                    System.exit(0); 
                default:
                    System.out.println("Choose the right one");
            }
            } while (true);
            
            
            
            
        }else if (choose == 2) {
            Web WebDev = new Web(name, nim, inputwrite, inputcode, inputinterview);
            do {
                System.out.println("Menu");
            System.out.println("1. Edit");
            System.out.println("2. Output");
            System.out.println("3. Exit ");
            System.out.print("Choose  : ");
            choose2 = input.nextInt();
            switch (choose2) {
                case 1:
                    System.out.println("EDIT FORM");
                    System.out.print("Input Writing Exam Score  : ");
                    inputwrite = input.nextDouble();
                    WebDev.setWrite(inputwrite);
                    
                    System.out.print("Input Coding Test Score : ");
                    inputcode = input.nextDouble();
                    WebDev.setCode(inputcode);
                    
                    System.out.print("Input Interview Test Score  : ");
                    inputinterview = input.nextDouble();
                    WebDev.setInterview(inputinterview);
                    
                    break;
                case 2:
                    System.out.println("Final Score : " + WebDev.calculate());
                    if (WebDev.calculate() >= 85) {
                        System.out.println("INFORMATION: SUCCESS");
                        System.out.println("Congrats to "+WebDev.getName() + " has been accepted in Web Dev");
                        
                    }else{
                        System.out.println("INFORMATION: FAILED");
                        System.out.println("Sorry to"+WebDev.getName()+"has been denied");
                    }
                    break;
                case 3:
                    System.exit(0); 
                default:
                    System.out.println("Choose the right one");
            }
            } while (true);
            
            
                
            }
            
        
        
    }
    
}
