package controllers;

import db.Seeds;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.SparkBase.staticFileLocation;

public class MainController {

    public static void main(String[] args) {
        staticFileLocation("/public");
        BookingController bookingController = new BookingController();
        //RestaurantController restaurantController = new RestaurantController();
        CustomerController customerController = new CustomerController();
        Seeds.seedData();
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }

}
