import java.util.*;

public class guessnum{
   public static void main(String[] args){
      //random number generator
      Random num = new Random();
      int random_num = num.nextInt(100) + 1;
      
      //start of scanner
     // Scanner scanner = new Scanner(System.in);
     // System.out.print("Pick a number between 1 and 100: ");
     // int guess = scanner.nextInt();
      
      //int i
      int guessCounter = 0;
      while(guessCounter < 5){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Pick a number between 1 and 100: ");
         int guess = scanner.nextInt();

         while(guess >100 || guess < 1){
            System.out.print("Your guess is not between 1 and 100, please try again: ");
            guess = scanner.nextInt();
         }
          if(guess > random_num){
          System.out.print("Please pick a lower number: ");
          //guess = scanner.nextInt();
         }else if(guess < random_num){
          System.out.print("Please pick a higher number: ");
          //guess = scanner.nextInt();
         }else if(guess == random_num){
          System.out.print("You Win!!");
          System.exit(0);
         }
      guessCounter++;
      }//end of while
      
           
      System.out.println("You LOSE!!");
      System.out.println("The number to guess was:" + random_num );
     
   }//main

}//class