public class Assignment1 {

    // private fields

    private int carYear;
    private double carPrice;
    private String carName;

    {/*
        These are my new changes
        to the private fields
    */}
    public Assignment1(int carYear, double carPrice, String carName){
        this.carYear = carYear;
        this.carPrice = carPrice;
        this.carName = carName;
    }

    public void displayDetails(){
        double value = (carPrice * carYear) / 1000;
        System.out.println(carName + " value is " + value);
    }

    public static void main(String[] args) {
        Assignment1 car = new Assignment1(2018,200000,"Tesla");
        car.displayDetails();
    }
}
