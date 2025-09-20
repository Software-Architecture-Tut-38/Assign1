package test;


import app.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryTest {
    Bulb bulb;
    Lock lock;
    SmartdeviceFactory factory;

    @Test
    public void testCreateBulbA(){
        factory = new BrandA();
        bulb = factory.createSmartBulb();
        assertEquals(50, bulb.getPowerUsage(), 0.1);
    }

    @Test
    public void testCreateBulbB(){
        factory = new BrandB();
        bulb = factory.createSmartBulb();
        assertEquals(80, bulb.getPowerUsage(), 0.1);
    }

    @Test
    public void testCreateLockA(){
        factory = new BrandA();
        lock = factory.createSmartLock();
        assertEquals(20, lock.getBatteryConsumption(), 0.1);
    }

    @Test
    public void testCreateLockB(){
        factory = new BrandB();
        lock = factory.createSmartLock();
        assertEquals(40, lock.getBatteryConsumption(), 0.1);
    }
}
