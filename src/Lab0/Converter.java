package Lab0;

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

    public static void main(String [] args){
        Converter c= new Converter();
        System.out.println(c.celsiusToFahrenheit(180));
        System.out.println(c.fahrenheitToCelsius(250));

    }

}
