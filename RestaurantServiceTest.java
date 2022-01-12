import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantServiceTest {
    public void check_if_it_does_not_return_the_expected_restaurant_details() {

        Restaurant restaurant = new Restaurant();
        String name;

        assertEquals(null, restaurant.getName("HGG"));

        assertEquals("HGG", restaurant.getName("HGG"));

        }






    }


}