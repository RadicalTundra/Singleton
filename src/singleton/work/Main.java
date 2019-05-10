package singleton.work;

public class Main {

    public static void main(String[] args) {
        EnumCalcTool calc1 = EnumCalcTool.INSTANCE;
        calc1.calcBMI(70, 195, MeasurementSystem.ENGLISH);
        //enum
        System.out.println("\n=================");
        System.out.println("Enum Version");
        System.out.println("=================\n");
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + calc1.calcBMI(70, 195, MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + calc1.calcBMI(1.7, 84, MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + calc1.calcBMI(63, 135, MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + calc1.calcBMI(2.1, 141, MeasurementSystem.METRIC));
        
        
        ThreadSafeCalcTool calc2 = new ThreadSafeCalcTool();
        ThreadSafeCalcTool calc3 = new ThreadSafeCalcTool();
        ThreadSafeCalcTool calc4 = new ThreadSafeCalcTool();
        ThreadSafeCalcTool calc5 = new ThreadSafeCalcTool();
        //threadsafe
        System.out.println("\n===================");
        System.out.println("Thread-Safe version");
        System.out.println("===================\n");
//        System.out.print("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of ");
      double average1 =  calc2.calcBMI(70, 195, MeasurementSystem.ENGLISH, "Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of ");
        //System.out.print("\nChristy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of ");
        double average2 = calc3.calcBMI(1.7, 84, MeasurementSystem.METRIC, "\nChristy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of ");
       // System.out.print("\nSue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of ");
       double average3 = calc4.calcBMI(63, 135, MeasurementSystem.ENGLISH, "\nSue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of ");
       // System.out.print("\nRicky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of ");
       double average4 = calc5.calcBMI(2.1, 141, MeasurementSystem.METRIC, "\nRicky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of ");

       //this is seriously ugly, but hey, it works!
        System.out.println("\nThe Average BMI Calcuated in this Run is " + (calc1.averageBMI() + average1 + average2+ average3+ average4)/5);
    }
}
