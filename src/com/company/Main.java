package com.company;


public class Main {


    public static void main(String[] args) {
        System.out.println(ageTemperatureOutdoor(21, -15));
        System.out.println(ageTemperatureOutdoor(23, 4));
        System.out.println(ageTemperatureOutdoor(25, 35));
        System.out.println(ageTemperatureOutdoor(6, 20));
        System.out.println(ageTemperatureOutdoor(46, 26));
        System.out.println(ageTemperatureOutdoor(27, 10));

        System.out.println(ageTemperatureOutdoor(generateRandomAge(), 25));
        //System.out.println("Рандомный возраст");
    }

    public static String ageTemperatureOutdoor(int age, int temperature) {

        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            return "Можно идти гулять. " + "Возраст: " + age + " " + "Температура: " + temperature;
        } else if ((age < 20) && (temperature > 0 && temperature < 28)) {
            return "Можно идти гулять. " + "Возраст: " + age + " " + "Температура: " + temperature;
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять. " + "Возраст: " + age + " " + "Температура: " + temperature;
        } else {
            return "Оставайтесь дома. " + "Возраст: " + age + " " + "Температура: " + temperature;
        }


    }

    public static int generateRandomAge() {
        int age = (int) (Math.random() * 50);


        return age;


    }

}
