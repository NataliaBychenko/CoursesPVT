package HomeWork9;

public class HomeWork9_Main {
    public static void main(String[] args) {
        Star star = new Star();
        star.printCountPlanetAndStars();
        Planet planet = new Planet();
        planet.printCountPlanetAndStars();
        star.setName("NewStar");
        System.out.println(planet.hashCode());
        System.out.println(planet.toString());
    }
}
