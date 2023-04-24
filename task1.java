//program for number guessing game
import java.util.*;
class NumberGuessing
{
    public static void main(String args[])
    {

        int enteredNumber;
        int score=100;
        int guessNo = 0;
        Random rdm = new Random();     
        int randomNumber = rdm.nextInt(100);
        System.out.println("Hey!! WElcome to Number Guessing Game" + "\nCan you guess the number that i am thinking");
        System.out.println("Okay!! Lemme give you a clue"+"\nThe number is between 1 and 100");
        System.out.println("Start guesing the number");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter Your NUmber:");
            enteredNumber = sc.nextInt();
            guessNo++;
            if(randomNumber == enteredNumber)
            {
                System.out.println("Hey!! You guessed it"+"\nThe number is " + randomNumber);
                System.out.println("Your Score is:"+score);
                System.out.println("No of Guesses are: "+guessNo);
            }
            else if(enteredNumber > randomNumber){
                System.out.println("Your Number is higher than my Number");
                score -= 10;
            }
            else{
                System.out.println("Your Number is lower than my Number");
                score -= 10;
            }
        }while(enteredNumber != randomNumber && score>0);
        sc.close();
        if(score<=0)
        {
            System.out.println("Game Over!! You have no points remained");
        }
    }


}

