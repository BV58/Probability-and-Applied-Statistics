import java.util.ArrayList;
import java.util.Scanner;

public class Birthday {
    //Goal: Determine the probability of any 2 people sharing a birthday in the class ofx people.
    //Have user input for number of random people to create.
    //Make Person class, with int birthday. can use MM/DD, dont have to consider leap years
    //Make sure you can configure the number of runs without touching your loop
        //Your main method should be able to control the run, determine class size (# of people), and number of runs
    //Main method in another class

   public void userInput(){
       Scanner scan = new Scanner(System.in);
       System.out.println("For both questions please input a whole integer with no words.");
       System.out.println("How many people are in the class?");
       int numberOfPeople = scan.nextInt();
       System.out.println("How many runs?");
       int numberOfRuns = scan.nextInt();

       birthdayChecker(numberOfPeople, numberOfRuns);
   }

   private static void birthdayChecker(int people, int runs){
       ArrayList<Person> personArray = new ArrayList<>();
       for(int i = 0; i < people; i++){
          //personArray.add(new Person(null)); //need to put a random generator of a mm/dd
       }

       for(int i = 0; i < runs; i++){

       }





   }

}
