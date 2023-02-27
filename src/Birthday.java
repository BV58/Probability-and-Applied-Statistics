import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Birthday {

   public void userInput(){
       Scanner scan = new Scanner(System.in);
       System.out.println("For both questions please input a whole integer with no words.");
       System.out.println("How many people are in the class?");
       int numberOfPeople = scan.nextInt();
       System.out.println("How many runs?");
       int numberOfRuns = scan.nextInt();

       output(numberOfPeople, numberOfRuns);
   }

   private static void output(int people, double runs){
       double success = 0;
       for(int i = 0; i < runs; i++){
           success += birthdayCheck(people);
       }

       DecimalFormat decFormat = new DecimalFormat("#%");
       double ratio = success/runs;
       System.out.println("Percentage of times two people in the class had the same birthday: " +decFormat.format(ratio));
   }

   private static double birthdayCheck(int people){

       Random ran = new Random();
       ArrayList<Person> classroom = new ArrayList<>();
       for(int i = 0; i < people; i++){
           classroom.add(new Person(ran.nextInt(365)+1));
       }
       ArrayList<Integer> birthdays = new ArrayList<>();
       for(Person person : classroom){
           birthdays.add(person.getBirthday());
       }

       for(Person person : classroom){
           if(Collections.frequency(birthdays, person.getBirthday()) > 1){
               return 1;
           }
       }

       return 0;
   }

}
