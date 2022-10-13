package avengerHours.week4;

import com.github.javafaker.*;
import org.testng.annotations.*;

public class FakerPractice {

    @Test
    public void test1(){


        Faker faker = new Faker();

        System.out.println(faker.animal().name());
        System.out.println(faker.friends().quote());
        System.out.println(faker.name().fullName());
        System.out.println(faker.internet().emailAddress());
    }
}
