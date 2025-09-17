package app;

public class BrandA extends SmartdeviceFactory {
    @Override
    public SmartBulb createSmartBulb() {
        return new SmartBulb("BrandA");
    }

    @Override
    public SmartLock createSmartLock() {
        return new SmartLock("BrandA");
    }
}
