package app;

public class SmartLock implements SmartDevice, LockBattery {
    private double batteryConsumption;
    private String company;

    public SmartLock(String company) {
        this.company = company;
        System.out.println("Smart lock created by " + company);
    }

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
