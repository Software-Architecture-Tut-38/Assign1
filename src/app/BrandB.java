package app;



public class BrandB extends SmartdeviceFactory {
    private final String name = "BrandB";
    @Override
    public SmartBulb createSmartBulb() {
        SmartBulb bulb = new SmartBulb(name);
        bulb.setPowerUsage(readDoubleFromFile("brandBData.txt", 0));
        return bulb;
    }

    @Override
    public SmartLock createSmartLock() {
        SmartLock lock = new SmartLock(name);
        lock.setBatteryConsumption(readDoubleFromFile("brandBData.txt", 1));
        return lock;
    }
}