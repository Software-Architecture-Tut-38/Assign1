package app;


interface SmartDevice {
    void connectToWifi();

}

interface BulbPower {
    void setPowerUsage(double usage);
    double getPowerUsage();
}

interface LockBattery {
    void setBatteryConsumption(double consumption);
    double getBatteryConsumption();
}







