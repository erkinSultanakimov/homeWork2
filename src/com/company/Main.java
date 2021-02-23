package com.company;


public class Main {

    //int age1;
    public static void main(String[] args) {
        System.out.println(ageTemperatureOutdoor( 16,  25 ));
        System.out.println(ageTemperatureOutdoor(23, 4));
        System.out.println(ageTemperatureOutdoor(25,35));
        System.out.println(ageTemperatureOutdoor(6,20));
        System.out.println(ageTemperatureOutdoor(46,26));
        System.out.println(generateRandomAge(40));
    }
   public static String ageTemperatureOutdoor(int age, int temperature){
       System.out.println("Возраст " + age + "; " + "Температура на улице " +temperature);

       if ((age > 20 && age <45) && (temperature >20 && temperature <30)){
           System.out.println("Можно идти гулять");}
           else if ((age < 20) && (temperature >0 && temperature <28))
           {
               System.out.println("Можно идти гулять");
           }
        if (age>45 && temperature > -10 && temperature < 25)
        {
            System.out.println("Можно идти гулять");
        }
       if (((temperature >30 && temperature < 20) || age > 20 && age <45) || (age<20 && (temperature < 0 || temperature > 28)) || (age > 45 && (temperature < -10 || temperature > 25)) )
       { System.out.println("Оставайтесь дома"); }
        return " ";

   }
   public static String generateRandomAge(int temperature)
   { int age = (int)(Math.random()*50);
       System.out.println("Возраст " + age + "; " + "Температура на улице " +temperature);
       if ((age > 20 && age <45) && (temperature >20 && temperature <30)){
           System.out.println("Можно идти гулять");}
       else if ((age < 20) && (temperature >0 && temperature <28))
       {
           System.out.println("Можно идти гулять");
       }
       if (age>45 && temperature > -10 && temperature < 25)
       {
           System.out.println("Можно идти гулять");
       }
       if (((temperature >30 && temperature < 20) || age > 20 && age <45) || (age<20 && (temperature < 0 || temperature > 28)) || (age > 45 && (temperature < -10 || temperature > 25)) )
       { System.out.println("Оставайтесь дома"); }
   return age + " Рандомный возраст ";


   }

}
