package app;

public class BrandA extends SmartdeviceFactory {
    @Override
    public SmartBulb createSmartBulb() {
        SmartBulb bulb = new SmartBulb("BrandA");
        bulb.setPowerUsage(readDoubleFromFile("brandAData.txt", 0));
        return bulb;
    }

    @Override
    public SmartLock createSmartLock() {
        SmartLock lock = new SmartLock("BrandA");
        lock.setBatteryConsumption(readDoubleFromFile("brandAData.txt", 1));
        return lock;
    }
}
