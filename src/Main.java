// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //object
        Airpurifier a = new Airpurifier("one","1234a");
        a.turnOn();
        a.turnOff();
        int aqi=101;
        a.autoOpen(aqi);
        System.out.println("Model of a : "+a.getModel());
        System.out.println("Serial number of a : "+a.getSerialNo());
        //class
        Airpurifier b = new Airpurifier("one","1234b");
        Airpurifier c = new Airpurifier("one","1234c");
        Airpurifier d = new Airpurifier("two","1234d");
        Airpurifier e = new Airpurifier("two","1234e");
        System.out.println("Amount of model one : "+Airpurifier.getModelCount("one"));
        System.out.println("Amount of model two : "+Airpurifier.getModelCount("two"));
        System.out.println("Popular model is "+Airpurifier.mostPopularModel());
    }
}