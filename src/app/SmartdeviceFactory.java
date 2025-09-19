package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class SmartdeviceFactory {

    public abstract Bulb createSmartBulb();

    public abstract Lock createSmartLock();

    protected double readDoubleFromFile(String fileName, int lineNumber){
        try (BufferedReader br = new BufferedReader(new FileReader("src/app/" + fileName))) {
            String line;
            int current = 0;
            while ((line = br.readLine()) != null) {
                if (current == lineNumber) {
                    return Double.parseDouble(line);
                }
                current++;
            }
            return -1;
        } catch (IOException e) {
            return -1;
        }
    }
}