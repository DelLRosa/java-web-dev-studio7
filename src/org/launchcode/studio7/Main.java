package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        DVD dvd=new DVD(5.8, "Lord of the Rings");
        CD cd = new CD (8.4, "Catharsis", "Covet", 45);


        // TODO: Call each CD and DVD method to verify that they work as expected.
        dvd.spinDisc();
        dvd.addData(1,"Fellowship of the Ring");
        dvd.addData(2,"Special Features");
        dvd.addData(3,"Appendices");
        dvd.reportData();

        cd.spinDisc();
        cd.addSongs("1:30", "bronco");
        cd.addSongs("2:05", "firebird");

        cd.reportData();

    }
}
