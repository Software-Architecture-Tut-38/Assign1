package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SmartdeviceFactory brandA = new BrandA();
        SmartdeviceFactory brandB = new BrandB();

        Bulb bulbA =  brandA.createSmartBulb();
        Bulb bulbB = brandB.createSmartBulb();

        Lock lockA = brandA.createSmartLock();
        Lock lockB = brandB.createSmartLock();

        System.out.println("Bulb A power usage: " + bulbA.getPowerUsage());
        System.out.println("Lock B battery consumption: " + lockB.getBatteryConsumption());
    }
}
