package org.launchcode.studio7;
import java.util.ArrayList;
import java.util.HashMap;
import  java.util.Map;

public class DVD extends BaseDisc implements OpticalDisk {
    private HashMap<Integer, String> data=new HashMap<>();

    public DVD(double storageCapacity, String title) {
        super(storageCapacity, title);
        this.setDataType("Universal");
        this.setSpinSpeed(500);
        this.setStorageCapacity(15);
    }

    @Override
    public void spinDisc() {
        System.out.println("This dvd spins at "+this.getSpinSpeed()+" rotations per minute");
    }

    public void addData(Integer newKey, String newValue ){
        this.data.put(newKey,newValue);

    }
    @Override
    public void readData() {
        for (Map.Entry<Integer,String> data: data.entrySet()){
            System.out.println(data.getKey()+": "+data.getValue());
        }
    }

    @Override
    public void reportData() {
        System.out.println(this.getTitle()+ " Details: ");
        System.out.println("Data type: " +this.getDataType());
        System.out.println("Max Storage Capacity: "+this.getStorageCapacity()+"gb");
        System.out.println("On this dvd: ");
        this.readData();
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
