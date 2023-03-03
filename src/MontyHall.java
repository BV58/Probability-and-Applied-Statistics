import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MontyHall {

    public void input(){
        Random ran = new Random();


        double count = 0;
        for(int i = 0; i < 10000; i++) {
            count += montyHall("y", ran.nextInt(3)+1);
        }
        double changeRatio = (count/10000);
         count = 0;
        for(int i = 0; i < 10000; i++) {
            count += montyHall("n", ran.nextInt(3)+1);
        }
        double stayRatio = (count/10000);
        DecimalFormat decFormat = new DecimalFormat("#%");

        System.out.println("The success rate of changing the door when given the option is: "+decFormat.format(changeRatio));

        System.out.println("The success rate of staying with your original choice is: "+decFormat.format(stayRatio));


    }

    public int montyHall(String input, int doorNumber){
        Random random = new Random();
        HashMap<Integer, String> doors = new HashMap<>();

        ArrayList<String> options = new ArrayList<>();
        options.add("goat");
        options.add("goat");
        options.add("car");

        int count = 1;
        while(options.size() != 0){
            int ranInt = random.nextInt(options.size());
            String temp = options.get(ranInt);
            doors.put(count,temp);
            options.remove(options.indexOf(temp));
            count++;
        }

        String finalChoice = doors.get(doorNumber);
        if(input.equals("y")){
            doors.remove(doorNumber);
            AtomicInteger goat = new AtomicInteger();
            AtomicInteger car = new AtomicInteger();
            doors.forEach((key, value) -> {
                if(value.equals("goat")){
                    goat.getAndIncrement();
                }else{
                    car.getAndIncrement();
                }
            });
            if(goat.intValue() == 2){
                finalChoice = "goat";
            }else{
                finalChoice = "car";
            }
        }
        
        if(finalChoice.equals("car")){
            return 1;
        }else{
            return 0;
        }
    }






}
