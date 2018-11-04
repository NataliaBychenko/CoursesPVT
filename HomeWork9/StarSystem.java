package HomeWork9;

public abstract class StarSystem {
    String name;
    int countOfPlanet;
    int countOfStars;

  public abstract void printNameStarSystem();

  public abstract void printCountPlanetAndStars();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfPlanet() {
        return countOfPlanet;
    }

    public void setCountOfPlanet(int countOfPlanet) {
        this.countOfPlanet = countOfPlanet;
    }

    public int getCountOfStars() {
        return countOfStars;
    }

    public void setCountOfStars(int countOfStars) {
        this.countOfStars = countOfStars;
    }
}