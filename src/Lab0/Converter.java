package Lab0;

// This is the Development Branch

public class Converter {

    /**
     * @Author Brandon Coombe
     *
     */

    private double celsiusToFahrenheit(double C){
        return C*9/5+32;
    }

    private double fahrenheitToCelsius(double F){
        return (F-32)*5/9;
    }

    public double kilometersToMiles(double kilometers){
        return kilometers*0.62137;
    }

    public static void main(String [] args){
        Converter c= new Converter();
        System.out.println(c.celsiusToFahrenheit(180));
        System.out.println(c.fahrenheitToCelsius(250));
        System.out.println(c.kilometersToMiles(30));

    }

}
