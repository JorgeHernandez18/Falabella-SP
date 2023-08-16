package co.com.falabella.utils;

public class Random {
    public static int getRandom(int random){
        java.util.Random r = new java.util.Random();
        return r.nextInt(random);
    }
}
