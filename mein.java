public class mein {
    // Başına static ekledik ki main içinden çağrılabilsin
    public static class ucak {
        //fuel
        double fuel = 7500.0;
        String fuel_name = "L";
        //Speed
        double speed = 74.3;
        String speed_name = "km/h";
        //time
        int day = 5;
        int month = 9;
        int year = 2026;
    }

    public static void main(String[] args) {
        ucak plane = new ucak();
        
        // System kelimelerini büyük harfle düzelttik
        System.out.println("Fuel: " + plane.fuel + " " + plane.fuel_name);
        System.out.println("Speed: " + plane.speed + " " + plane.speed_name);
        System.out.println("Date: " + plane.day + "/" + plane.month + "/" + plane.year);
    }
}
