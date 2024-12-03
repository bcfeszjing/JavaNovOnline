public class Assignment4 {
    public static void main(String[] args) {
           
        String [][] cars = new String[3][3];

        cars[0][0] = "Tesla X"; cars[0][1] = "Tesla Y"; cars[0][2] = "Tesla Z"; 
        cars[1][0] = "Toyota Vios"; cars[1][1] = "Toyota SUV"; cars[1][2] = "Toyota Camry"; 
        cars[2][0] = "Proton Saga"; cars[2][1] = "Proton X70"; cars[2][2] = "Proton X50";

        double [][] carsPrice = new double[3][3];

        carsPrice[0][0] = 55000; carsPrice[0][1] = 40000; carsPrice[0][2] = 60000; 
        carsPrice[1][0] = 30000; carsPrice[1][1] = 40000; carsPrice[1][2] = 70000; 
        carsPrice[2][0] = 10000; carsPrice[2][1] = 60000; carsPrice[2][2] = 65000;

        for(int i=0; i < carsPrice.length; i++){
            for(int j=0; j < carsPrice[i].length; j++){
                if (carsPrice[i][j] >= 50000) {
                    System.out.println(cars[i][j] + " is " + carsPrice[i][j]);
                }
            }
        }
    }
}
