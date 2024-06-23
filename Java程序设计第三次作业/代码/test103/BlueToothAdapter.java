package test103;

public class BlueToothAdapter {
    private static BlueToothAdapter instance;

    private BlueToothAdapter() {
        System.out.println("BlueToothAdapter instance created suceesfully");
    }

    public static BlueToothAdapter getInstance() {
        if (instance == null) {
            instance = new BlueToothAdapter();
        }
        return instance;
    }
    public void connect() {
        System.out.println("Connecting to Bluetooth device...");
    }
}

