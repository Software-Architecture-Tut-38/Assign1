package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        BrandA brandA = new BrandA();
        BrandB brandB = new BrandB();

        SmartBulb bulbA =  brandA.createSmartBulb();
        SmartBulb bulbB = brandB.createSmartBulb();

        SmartLock lockA = brandA.createSmartLock();
        SmartLock lockB = brandB.createSmartLock();

        System.out.println("Bulb A power usage: " + bulbA.getPowerUsage());
        System.out.println("Lock B battery consumption: " + lockB.getBatteryConsumption());
    }
}
