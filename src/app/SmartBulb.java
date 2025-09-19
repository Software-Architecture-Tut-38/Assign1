package app;



public class SmartBulb implements Bulb{
    private double PowerUsage;
    private String company;

    public SmartBulb(String company) {
        this.company = company;
        System.out.println("Smart Bulb created from " + company);
    }

    @Override
    public double getPowerUsage() {
        return PowerUsage;
    }

    @Override
    public void setPowerUsage(double usage) {
        PowerUsage = usage;
    }



    

}

