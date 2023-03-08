/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator_program;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        Calculator objCalculator = new Calculator();
        objCalculator.calculation();
        
    }
    
}

class Calculator {
    public void calculation(){
        Scanner s_obj1 = new Scanner(System.in);
        System.out.println("Enter a first number ");
        int num1 = s_obj1.nextInt();
        
        System.out.println("Enter an operator ");
        String operator = s_obj1.next();
        
        System.out.println("Enter a second number ");
        int num2 = s_obj1.nextInt();
      
       
        switch(operator){
            case "+" :
                int result = num1+num2;
                System.out.println(result);
                break;
            
            case "-":
                int result2 = num1-num2;
                System.out.println(result2);
                break;
                
            case "*":
               int result3 = num1*num2;
               System.out.println(result3);
               break;
               
            case "/":
               int  result4 = num1/num2;
               System.out.println(result4);
               break;
               
               default:
                   System.out.println("no values supplied");
                   break;
                
        }
    }
}