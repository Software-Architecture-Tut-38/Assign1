package app;

public class SmartLock implements Lock {
    private double batteryConsumption;
    private String company;

    public SmartLock(String company) {
        this.company = company;
        System.out.println("Smart lock created by " + company);
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
