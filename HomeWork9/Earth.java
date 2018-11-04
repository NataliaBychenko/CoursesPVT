package HomeWork9;
//Третий - перегруженные, но не связанные друг с другом конструкторы и создаваться при помощи одного из них на выбор.
public class Earth extends Planet {
    int population;
    int age;
    int distanceToStar;

    public Earth() {
    }

    public Earth(int population) {
        this.population = population;
    }

    public Earth(int population, int age, int distanceToStar) {
        this.population = population;
        this.age = age;
        this.distanceToStar = distanceToStar;
    }

    public void printDistance(){
        System.out.println("Distance to star "+distanceToStar);
    }
    public int getMass(int density, int volume){
        return density * volume;
    }

}
