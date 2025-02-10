import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Chevy");
        System.out.println(cars);
        cars.remove(2);
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);



    }
}
