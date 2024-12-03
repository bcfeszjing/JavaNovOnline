public class LoopComparison {
    public static void main(String[] args) {
        
        // for loop -- we have the specific start and end, execute things inside
        System.out.println("for loop:");
        for (int  counter = 1; counter <= 5; counter++) {
            System.out.println("For Loop Counter " + counter);
        }

        // while loop -- we dont have specific data, infinite loop 
        System.out.println("While loop:");
        int counter =1;
        while (counter <= 5) {
            System.out.println("While Loop Counter " + counter);
            counter++;
        }

        // do-while loop -- we got beginner and ending
        counter = 1;
        do {
            System.out.println("Do while loop counter " + counter);
            counter++;
        }while (counter <= 5);
    }
}
