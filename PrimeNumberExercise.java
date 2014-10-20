import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PrimeNumberExercise
{

public static void main(String[] args){

//creates a new Scanner object for reading user input from the command line
Scanner inputScanner = new Scanner(System.in);

System.out.println("Please enter a number from 0 to 100.");

try{
int userInput = 0;
userInput = inputScanner.nextInt();

if(userInput >= 0 && userInput <= 100){
boolean isPrime = PrimeNumberHelper.isNumberPrime(userInput);

System.out.println(String.format("%d is%s a Prime number.", userInput, isPrime ? "" : " not"));
 }
}

catch(InputMismatchException e){
System.out.println("Please enter only numbers.");
}

finally{
inputScanner.close(); //free up resources used
 }
}

 private static class PrimeNumberHelper
 {
 public PrimeNumberHelper(){}

 public static boolean isNumberPrime(int number){

    if ((number % 2) == 0){
		return false;
	}

    for(int check = 3; (check * check) <= number; check += 2) {
        if((number % check) == 0){
            return false;
		}
    }
    return true;
  }
 }
}
