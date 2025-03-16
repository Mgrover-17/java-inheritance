class Device{
    String deviceId;
    String status;

    Device(String deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }

    void displayStatus(){
        System.out.println("device id: "+deviceId);
        System.out.println("device status: "+status);
    }
}

class Thermostat extends Device{
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        System.out.println("calling thermostat constructor");
        this.temperatureSetting=temperatureSetting;
    }

    void displayStatus(){
        super.displayStatus();
        System.out.println("temperature setting: "+temperatureSetting);
    }
}


public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH123", "On", 22.5);
        thermostat.displayStatus();
    }
}
