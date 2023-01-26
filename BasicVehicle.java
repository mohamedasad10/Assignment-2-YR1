public class BasicVehicle {
    private double latitude;
    private double longitude;
    private double altitude ;
    private String registration;

    //default constructor
    BasicVehicle(){
        registration = "unknown";
        altitude = 0.0;
        longitude = 0.0;
        latitude = 0.0;
    }

    //overloaded constructor
    BasicVehicle(String registration, double latitude, double longitude, double altitude){
        this.registration = registration;
        this.altitude = altitude;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    //setting the values
    public void setRegistration(String s) {
        this.registration = s;
    }
    public void setAltitude(double v) {
        this.altitude = v;
    }
    public void setLatitude(double v) {
        this.latitude = v;
    }
    public void setLongitude(double v) {
        this.longitude = v;
    }

    public void printInfo(){

        System.out.println("Registration:" + registration);

        System.out.println("Current position: ");

        System.out.println("Alt: " + altitude);

        System.out.println("Lat: " + latitude);

        System.out.println("Long: " + longitude);
    }
    //calculating the distance
    public double distanceTo(BasicVehicle vehicleCS1, BasicVehicle vehicleC0S){

        double distance = Math.sqrt(Math.pow(vehicleCS1.altitude - vehicleC0S.altitude,2) + Math.pow(vehicleCS1.longitude - vehicleC0S.longitude,2) + Math.pow(vehicleCS1.latitude - vehicleC0S.latitude,2));
        return distance;
    }
}