package org.example;

import java.util.Map;

public class EnvironmentVariables {
    public static void main(String[] args) {

        // Retrieving value for single environment variable
        String home = System.getenv("HOME");
        System.out.println(home);

        // Retrieving all environment variables and printing them
        Map<String, String> env = System.getenv();
        env.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}