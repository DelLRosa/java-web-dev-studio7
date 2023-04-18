package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseDisc {
    private double storageCapacity;
    private String dataType;
//    public ArrayList<String> data;
    private String title;
    private int spinSpeed;

    public BaseDisc(double storageCapacity, String title) {
        this.storageCapacity = storageCapacity;
        this.title = title;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

//    public ArrayList<String> getData() {
//        return data;
//    }
//
//    public void setData(ArrayList<String> data) {
//        this.data = data;
//    }
    public void addData(String newData){


    }


}
