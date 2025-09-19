package app;



public class BrandB extends SmartdeviceFactory {
    private final String name = "BrandB";
    @Override
    public Bulb createSmartBulb() {
        SmartBulb bulb = new SmartBulb(name);
        bulb.setPowerUsage(readDoubleFromFile("brandBData.txt", 0));
        return bulb;
    }

    @Override
    public Lock createSmartLock() {
        SmartLock lock = new SmartLock(name);
        lock.setBatteryConsumption(readDoubleFromFile("brandBData.txt", 1));
        return lock;
    }
}