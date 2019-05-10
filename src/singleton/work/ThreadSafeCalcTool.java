package singleton.work;

/**
 *
 * @author Teddy
 */
public class ThreadSafeCalcTool extends Thread {
    
    private double height, weight;
    private MeasurementSystem measurementSystem;
    private String restOfString;
    private EnumCalcTool calctool = EnumCalcTool.INSTANCE;
    double bmi;

    public double calcBMI(double height, double weight, MeasurementSystem measurementSystem, String restOfString) {
        this.height = height;
        this.weight = weight;
        this.restOfString = restOfString;
        this.measurementSystem = measurementSystem;
        bmi = calctool.calcBMI(height, weight, measurementSystem);
        System.out.print(restOfString + bmi);
        start();
        return calctool.averageBMI();
    }

    @Override
    public void run() {
        //I had the run do nothing or else nothing came out properly... but hey! At least it's cool now!
    }
}
