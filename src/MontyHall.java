import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MontyHall {


    //ALSO ANSWER 2.20 IN COMMENTS HERE PRETTY PLEASE BRENDY

    public void input(){
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to choose your own door or let the program to? (own/program)");
        String ownOrProgram = scan.nextLine();
        int doorNum = 0;
        if(ownOrProgram.equals("own")){
            System.out.println("What door would you like to choose? (1-3)");
            doorNum = Integer.parseInt(scan.nextLine());
        } else if (ownOrProgram.equals("program")) {
            doorNum = ran.nextInt(3)+1;
        }else{
            doorNum = ran.nextInt(3)+1;
            System.out.println("Invalid input. Defaulting to program.");
        }
        System.out.println("Would you like the program to change the door number when given the option? (y/n)");
        String choice = scan.nextLine();
        if(choice.equals("y") == false && choice.equals("n") == false){
            System.out.println("Invalid input, defaulting choice to n");
            choice = "n";
        }

        System.out.println("How many times would you like the program to run?");
        double runs = Double.parseDouble(scan.nextLine());

        double count = 0;
        for(int i = 0; i <=runs; i++) {
            count += montyHall(choice, doorNum);
        }
        double ratio = (count/runs);
        DecimalFormat decFormat = new DecimalFormat("#%");
        if (choice.trim().equals("y")){
            System.out.println("The success rate of changing the door when given the option is: "+decFormat.format(ratio));
        }else if(choice.trim().equals("n")){
            System.out.println("The success rate of staying with your original choice is: "+decFormat.format(ratio));
        }

    }

    public int montyHall(String input, int doorNumber){
        Random random = new Random();
        ArrayList<String> doors = new ArrayList<>();
        ArrayList<String> options = new ArrayList<>();
        options.add("goat");
        options.add("goat");
        options.add("car");

        while(options.size() != 0){
            int ranInt = random.nextInt(options.size());
            String temp = options.get(ranInt);
            doors.add(temp);
            options.remove(options.indexOf(temp));
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.remove(numbers.indexOf(doorNumber));


        int finalChoice = doorNumber;
        if(input.equals("y")){
            int ranInt = random.nextInt(numbers.size());
            finalChoice = numbers.get(ranInt);
        }

        if(doors.get(finalChoice-1).equals("car")){
            return 1;
        }else{
            return 0;
        }
    }






}
