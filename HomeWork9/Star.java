package HomeWork9;

//Другой - систему сеттеров и геттеров и инициализироваться при помощи их.
public class Star extends StarSystem {
    int temperature;
    int starMass;
    int brightness;


    public int getTemperature() {
        return temperature;
    }

    public int getStarMass() {
        return starMass;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setStarMass(int starMass) {
        this.starMass = starMass;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }


    public void printMassAndbrightness(){
        System.out.println("Mass the star is  "+ starMass+
                ".\n Brightness is "+ brightness);
    }
    public void printTemperatureAndStarMass(){
        System.out.println("Mass the star is  "+ starMass+
                ".\n Temperature is "+ temperature);
    }

    @Override
    public String toString() {
        return "Star{" +
                "temperature=" + temperature +
                ", starMass=" + starMass +
                ", brightness=" + brightness +
                '}';
    }

    @Override
    public void printNameStarSystem() {
        System.out.println(super.name);
    }

    @Override
    public void printCountPlanetAndStars() {
        System.out.println("Count Planet in Star System: "+ super.countOfPlanet
                + ".\nCount Stars in Star System: "+ super.countOfStars+ ".");
    }
}
