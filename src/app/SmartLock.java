package app;

public class SmartLock implements SmartDevice, LockBattery {
    double batteryConsumption;
    @Override
    public void connectToWifi() {
        System.out.println("connecting to wifi");
    }

    @Override
    public void setBatteryConsumption(double consumption) {
        batteryConsumption = consumption;
    }

    @Override
    public double getBatteryConsumption() {
        return batteryConsumption;
    }
}
