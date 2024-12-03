public class TryCatch {
    public static void main(String[] args) {
        try {
            int [] number = {1,2,3};
            System.out.println(number[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        } finally {
            System.out.println("This is the finally block");
        } 
        System.out.println("This is the end of the program");
    }
}
