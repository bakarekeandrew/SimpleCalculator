package package1;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        
    
   Scanner  scanner = new Scanner(System.in);
    System.out.println("SIMPLE CALCULATOR!!!!!!!!\n\n");    
    
    System.out.print("Enter the first number: ");
    double firstNumber = scanner.nextDouble();

    System.out.print("Enter operation (+, -, *, /): ");
    char operation = scanner.next().charAt(0);    

    System.out.print("Enter the second number: ");
    double secondNumber = scanner.nextDouble();

    double result; 

    switch(operation)   {
        case '+':
         result = firstNumber + secondNumber;
         break;
         
        case '-' :
          result = firstNumber - secondNumber;
          break;

        case '*':
          result = firstNumber * secondNumber;
          break;
        
        case '/':
           if (secondNumber != 0){
             result = firstNumber / secondNumber;
           }
           else{
             System.out.println("You can't divide with a zero value");
             return;
           }
           break;
           
        default :
          System.out.println("invalid operation "+operation);     
          return;
    }
    System.out.println("Result "+result);

    scanner.close();

}

}
