package Homework3;

public class Homework_Country {
    // პრაივატ ტიპის ფილდები
    private String name;
    private int population;
    private String nationality;
    private String region;
    private double highestPoint;

    // არა არგუმენტიანი კონსტრუქტორი
    public Homework_Country() {
    }

    // კონსტრუქტორი ყველა არგუმენტით
    public Homework_Country(String name, int population, String nationality, String region, double highestPoint) {
        this.name = name;
        this.population = population;
        this.nationality = nationality;
        this.region = region;
        this.highestPoint = highestPoint;
    }

    // გეთერები (დასეტვამდე თუ გამოვიძახებ დაბრუნდება დეფოლტი მნიშვნელობები)
    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getNationality() {
        return nationality;
    }

    public String getRegion() {
        return region;
    }

    public double getHighestPoint() {
        return highestPoint;
    }

    // სეთერები
    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setHighestPoint(double highestPoint) {
        this.highestPoint = highestPoint;
    }

}
