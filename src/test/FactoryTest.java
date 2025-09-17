package test;

import app.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryTest {
    SmartBulb bulb;
    SmartLock lock;

    BrandA factoryA = new BrandA();
    BrandB factoryB = new BrandB();

    @Test
    public void testCreateBulbA(){
        bulb = factoryA.createSmartBulb();
        assertEquals(500, bulb.getPowerUsage(), 0.1);
    }

    @Test
    public void testCreateBulbB(){
        bulb = factoryB.createSmartBulb();
        assertEquals(700, bulb.getPowerUsage(), 0.1);
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
