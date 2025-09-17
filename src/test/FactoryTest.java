package test;

import app.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryTest {
    SmartBulb bulb;
    SmartLock lock;

    SmartdeviceFactory factoryA = new BrandA();
    SmartdeviceFactory factoryB = new BrandB();

    @Test
    public void testCreateBulbA(){
        bulb = factoryA.createSmartBulb();
        assertEquals(50, bulb.getPowerUsage(), 0.1);
    }

    @Test
    public void testCreateBulbB(){
        bulb = factoryB.createSmartBulb();
        assertEquals(80, bulb.getPowerUsage(), 0.1);
    }

    @Test
    public void testCreateLockA(){
        lock = factoryA.createSmartLock();
        assertEquals(20, lock.getBatteryConsumption(), 0.1);
    }

    @Test
    public void testCreateLockB(){
        lock = factoryB.createSmartLock();
        assertEquals(40, lock.getBatteryConsumption(), 0.1);
    }
}
