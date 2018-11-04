package HomeWork9;

import java.util.Arrays;

public class Mars extends Planet {
    String name;
    int density;
    int volume;
    String[] satellites = {"Deimos", "Phobos"};

    public int getCountSatellites(){
        return this.satellites.length;
    }

    public  void printIntroductoryText(){
        System.out.println( "Mars have "+ getCountSatellites()+ " satellites. ");
    }
    @Override
    public void printNameStarSystem() {
        System.out.println(super.name);
    }
}
