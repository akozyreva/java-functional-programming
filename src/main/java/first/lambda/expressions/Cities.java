package first.lambda.expressions;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        // check, if 'Chicago' is in the list of cities
        // old-fashioned way
        boolean found = false;
        List<String> cities = new ArrayList<String>();
        cities.add("New York");
        cities.add("Chicago");
            for(String city: cities)
        {
            if(city.equals("Chicago")){
                found = true;
                break;
            }
        }
        System.out.println("Found Chicago? " + found);

        // more convenient:
        System.out.println("Found Chicago? " + cities.contains("Chicago"));
    }



}
