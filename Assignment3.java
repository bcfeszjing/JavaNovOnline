public class Assignment3 {
    public static void main(String[] args) {
        for (int i = 1; i < 30; i++){
            //Break
            if (i == 26) {
                break;
            }

            //Continue
            if (i == 14) {
                continue;
            }
            System.out.println("i" + i);
        }
    }
}
