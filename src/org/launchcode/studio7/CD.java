package org.launchcode.studio7;

import java.util.HashMap;
import java.util.Map;

public class CD extends BaseDisc implements OpticalDisk{
    private HashMap<String, String> songs=new HashMap<>();
    private String artist;
    private int runtimeInMin;


    public CD(double storageCapacity, String title, String artist, int runtimeInMin) {
        super(storageCapacity, title);
        this.setDataType("Audio");
        this.setSpinSpeed(2345678);
        this.artist=artist;
        this.runtimeInMin=runtimeInMin;
    }

    public HashMap<String, String> getSongs() {
        return songs;
    }

    public void setSongs(HashMap<String, String> songs) {
        this.songs = songs;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void addSongs(String newKey, String newValue){
        this.songs.put(newKey,newValue);
    }

    public int getRuntimeInMin() {
        return runtimeInMin;
    }

    @Override
    public void spinDisc() {
        System.out.println("this CD spins at "+this.getSpinSpeed()+" rotations per minute");
    }
    @Override
    public void readData() {
        for (Map.Entry<String, String> song: songs.entrySet()){
            System.out.println(song.getKey()+" - "+song.getValue());
        }

    }

    @Override
    public void reportData() {
        System.out.println(this.getTitle());
        System.out.println("By: "+this.getArtist());
        System.out.println(this.getRuntimeInMin()+" minutes");
        this.readData();

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
