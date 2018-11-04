package HomeWork9;

import java.util.Objects;

//Один из классов на выбор должен содержать перегруженные связанные друг с другом конструкторы (используя this) и создаваться с их помощью.
public class Planet extends StarSystem {
    String name;
    double yearDuration;
    boolean hasAtmosphere;

    public Planet() {
    }

    public Planet(String name) {
        this.name = name;
    }

    public Planet(String name, boolean hasAtmosphere) {
        this(name);
        this.hasAtmosphere = hasAtmosphere;
    }

    public double yearDurationInMonths (){
        int monthsInYear = 12;
        return this.yearDuration / monthsInYear;
    }

    public boolean hasAtmosphere(){
        return hasAtmosphere;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return hasAtmosphere == planet.hasAtmosphere &&
                Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasAtmosphere);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", yearDuration=" + yearDuration +
                ", hasAtmosphere=" + hasAtmosphere +
                '}';
    }
}