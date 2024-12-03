import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [][] vipCars = new String[5][4];
        String [][] cheapCars = new String[5][4];
        int vipIndex = 0;
        int cheapIndex = 0;

        for(int i = 0; i < 5; i++) {
            System.out.print("Price of car " + (i+1) + ": ");
            int price = scan.nextInt();

            if (price > 70000) {
                if (vipIndex < vipCars.length) {
                    vipCars[vipIndex][0] = String.valueOf(price);
                    vipCars[vipIndex][1] = "VIP";
                    vipCars[vipIndex][2] = "2024";
                    vipCars[vipIndex][3] = "pre-order";
                    vipIndex++;
                }
            } else {
                if (cheapIndex < cheapCars.length) {
                    cheapCars[cheapIndex][0] = String.valueOf(price);
                    cheapCars[cheapIndex][1] = "Cheap";
                    cheapCars[cheapIndex][2] = "old";
                    cheapCars[cheapIndex][3] = "for sale";
                    cheapIndex++;
                }
            }
        }

        System.out.println("Vip Cars:");
        boolean hasVipCars = false;

        for (int i = 0; i < vipCars.length; i++) {
            if (vipCars[i][0] != null) {
                for (int j = 0; j < vipCars[i].length; j++) {
                    System.out.print(vipCars[i][j] + " ");
                }
                System.out.println();
            }

            if (!hasVipCars) {
                System.out.println("No vip cars available.");
            }

        }

        System.out.println("Cheap Cars:");
        boolean hasCheapCars = false;

        for (int i = 0; i < cheapCars.length; i++) {
            if (cheapCars[i][0] == null) ;
                hasCheapCars = true;
                for (int j = 0; j < cheapCars[i].length; j++) {
                    System.out.print(cheapCars[i][j] + " ");
                }
                System.out.println();
        }
        
            if (!hasCheapCars) {
                System.out.println("No cheap cars available.");
            }

        scan.close();
    }
}
