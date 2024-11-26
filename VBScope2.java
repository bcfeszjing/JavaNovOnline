public class VBScope2 {
    
    int instAge = 22;
    String instName = "Evan Tan";
    double isntHeight = 1.75;

    static int sAge = 22;
    static String sName = "Evan Tan";
    static double stHeight = 1.75;

    public void showLocalVarible(){
        int lAge = 22;
        String lName = "Evan Tan";
        double lHeight = 1.75;
        
        System.out.println("Local age: " + lAge);
        System.out.println("Local name: " + lName);
        System.out.println("Local height: " + lHeight);
    }

    public void showInstanceVariable(){
        System.out.println("Instance age: " + instAge);
        System.out.println("Instance name: " + instName);
        System.out.println("Instance height: " + isntHeight);
    }

    public void showStaticVariable(){
        System.out.println("Static age: " + sAge);
        System.out.println("Static name: " + sName);
        System.out.println("Static height: " + stHeight);
    }

    public static void main(String[] args) {
        VBScope2 vb = new VBScope2();
        vb.showLocalVarible();
        vb.showInstanceVariable();
        vb.showStaticVariable();
    }
}
