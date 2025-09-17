package app;

public class BrandA extends SmartdeviceFactory {
    @Override
    public SmartBulb createSmartBulb() {
        SmartBulb bulb = new SmartBulb("BrandA");
        bulb.setPowerUsage(500);
        return bulb;
    }

    @Override
    public SmartLock createSmartLock() {
        SmartLock lock = new SmartLock("BrandA");
        lock.setBatteryConsumption(20);
        return lock;
    }
}
