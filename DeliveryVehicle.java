
import java.util.Arrays;

public class DeliveryVehicle extends BasicVehicle{
    public String[] cargoList;
    private int numItems;

    DeliveryVehicle(String registration, int maxCapacity){
        super.setRegistration(registration);    //the super keyword points to the BasicVehicle class
        cargoList = new String[maxCapacity];    //creating an array
    }
    public boolean isFull(){
        if(cargoList == null) { //in the beginning, the contents in array is [null, null, null, null, null] so yes it is false that the array is full
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(cargoList == null) { //in the beginning, the contents in array is [null, null, null, null, null] so yes it is true that the array is empty
            return false;
        } else {
            return true;
        }
    }

    public void loadCargo(String description){
        cargoList[0] = description;
        System.out.println(cargoList[0]);
    }

    public void printInfo(){
        if (cargoList[0] == "null") {
            System.out.println("No cargo yet.");
        }else{
            System.out.println(Arrays.toString(cargoList));
        }
    }
}