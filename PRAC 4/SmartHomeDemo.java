class Device {
    int deviceId;
    String deviceName;
    boolean powerStatus;

    public Device(int id, String name) {
        deviceId = id;
        deviceName = name;
        powerStatus = false; // OFF by default
    }

    public void togglePower() {
        powerStatus = !powerStatus;
        System.out.println(deviceName + " is now " + (powerStatus ? "ON" : "OFF"));
    }

    public void displayDeviceInfo() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Power: " + (powerStatus ? "ON" : "OFF"));
    }
}

// Single Inheritance
class SmartLight extends Device {
    int brightnessLevel;
    String colorMode;

    public SmartLight(int id, String name, int brightness, String color) {
        super(id, name); // Calls base class constructor
        brightnessLevel = brightness;
        colorMode = color;
    }

    public void changeBrightness(int level) {
        brightnessLevel = level;
        System.out.println(deviceName + " brightness set to " + brightnessLevel + "%");
    }

    // Overriding display to include light-specific info
    @Override
    public void displayDeviceInfo() {
        super.displayDeviceInfo(); 
        System.out.println("Brightness: " + brightnessLevel + "%");
        System.out.println("Color Mode: " + colorMode);
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartLight light = new SmartLight(101, "Living Room Hue", 50, "Warm White");
        
        System.out.println("--- Initial Status ---");
        light.displayDeviceInfo();
        
        System.out.println("\n--- Performing Actions ---");
        light.togglePower();
        light.changeBrightness(80);
        
        System.out.println("\n--- Updated Status ---");
        light.displayDeviceInfo();
    }
}