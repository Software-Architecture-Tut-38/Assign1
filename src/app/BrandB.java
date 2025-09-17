package app;



public class BrandB extends SmartdeviceFactory {
    private final String name = "BrandB";
    @Override
    public SmartBulb createSmartBulb() {
        return new SmartBulb(name);
    }

    @Override
    public SmartLock createSmartLock() {
        return new SmartLock(name);
    }
}