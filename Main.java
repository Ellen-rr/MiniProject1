import java.util.Scanner;//import scanner
import java.util.Random;//import random number

class Main {//main method
  public static void main(String[] args) {
  System.out.println("Welcome to the guessing games!");//print welcome message
  System.out.println("Please enter any positive whole number: ");//ask for whole number

  Scanner s = new Scanner(System.in);//create new scanner
  Random r = new Random();//create random classes

  int storeNumber = s.nextInt();// put user's number into the <storeNumber>
  
  //System.out.println(storeNumber);

  int randomInt = r.nextInt(storeNumber);//system random pick a number to let user guess
  System.out.println("A random number to guess has been generated");//print out the guess number has been generated

 // System.out.println(randomInt);

  playGame (randomInt,storeNumber);//recal the method
  }
//guessNumber - system gives the number to let user guess
//inputNumber - user's original input
//userGuess - user input number
  static void playGame (int guessNumber, int inputNumber) {//method named playGame
    System.out.println("Please guess a number between 0 and " + inputNumber);//print lets guess the number between 0 and <inputNumber>

    Scanner ss = new Scanner (System.in);//Create a new scanner
    int userGuess =ss.nextInt();//store userGuess number from the command line. 

    int countTimes = 1;//count = count +1
    while (guessNumber != userGuess) {//if <guessNumber> is not equal to <userGuess> 
      if (guessNumber > userGuess) {
        System.out.println("Guess Higher!");//print guess higher
        System.out.println("Enter your new guess: ");//print enter the new number
        userGuess = ss.nextInt();//store the new number
        countTimes ++;//count = count + 1 
      }
      else {//else <guess number < userGuess
        System.out.println("Guess Lower!");//print guess lower
        System.out.println("Enter your new guess: ");//print enter the new number
        userGuess = ss.nextInt();//store the new number
        countTimes ++;//count= count +1
      }
      
    }
     
    System.out.println ("Great, you win! It took you " + countTimes + " tries!");//print how many times user tried. 
    

  }
}