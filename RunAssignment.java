/**
 * This is a demo program for running the Assignment
 *
 * @author Julius Stopforth and edited by Mohamed Asad
 *
 * LINE 25 IS EDITED TO ACCOMODATE TWO PARAMETERS
 *
 */
public class RunAssignment{

    public static void main(String[] args) {

        BasicVehicle vehicleCS1 = new BasicVehicle();
        vehicleCS1.setRegistration("ZU-CS1");
        vehicleCS1.setAltitude(18000.0);
        vehicleCS1.setLatitude(22.0);
        vehicleCS1.setLongitude(31.0);

        vehicleCS1.printInfo();

        BasicVehicle vehicleC0S = new BasicVehicle("ZU-C0S", 10.0, 18.0, 19000.0);

        vehicleC0S.printInfo();

        System.out.println("Distance between vehicles: " + vehicleCS1.distanceTo(vehicleCS1,vehicleC0S));  //this line is edited from sirs code so that 2 parameters can be taken in

        DeliveryVehicle deliveryCA1 = new DeliveryVehicle("ZU-CA1", 5);
        deliveryCA1.printInfo();
        System.out.println("Delivery vehicle is empty: " + deliveryCA1.isEmpty());
        System.out.println("Delivery vehicle is full: " + deliveryCA1.isFull());
        deliveryCA1.loadCargo("50000 units paracetamol 500mg");
        deliveryCA1.loadCargo("2000 units melatonin 5mg");
        deliveryCA1.printInfo();

        System.out.println("Delivery vehicle is empty: " + deliveryCA1.isEmpty());
        System.out.println("Delivery vehicle is full: " + deliveryCA1.isFull());
    }
}