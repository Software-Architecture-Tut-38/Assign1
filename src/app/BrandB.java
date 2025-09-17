package app;



public class BrandB extends SmartdeviceFactory {
    private final String name = "BrandB";
    @Override
    public SmartBulb createSmartBulb() {
        SmartBulb bulb = new SmartBulb(name);
        bulb.setPowerUsage(700);
        return bulb;
    }

    @Override
    public SmartLock createSmartLock() {
        SmartLock lock = new SmartLock(name);
        lock.setBatteryConsumption(40);
        return lock;
    }
}