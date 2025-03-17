package Homework3;

public class Homework_main {
    public static void main(String[] args) {
        // შევქმენი კლასის ობიექტი, ვიძახებ არა არგუმენტიან კონსტრუქტორს და ვააფდეითებ პრაივატ ფილდების დეფოლტ მნიშვნელობებს სეტერით
        Homework_Country country1 = new Homework_Country();
        country1.setName("France");
        country1.setPopulation(68000000);
        country1.setNationality("French");
        country1.setRegion("Europe");
        country1.setHighestPoint(4810.45);

        // დააფდეითებულ ფრაივათ ფილდები მომაქვს დასაბეჭდათ უკვე გეთერით
        System.out.println("Country 1:");
        System.out.println("Name: " + country1.getName());
        System.out.println("Population: " + country1.getPopulation());
        System.out.println("Nationality: " + country1.getNationality());
        System.out.println("Region: " + country1.getRegion());
        System.out.println("Highest Point: " + country1.getHighestPoint() + "m");

        System.out.println("-------------------------");

        // შევქმენი კლასის ობიექტი და ვიძახებ კონსტრუქტორს ყველა არგუმენტით, გადავცემ ქვეყნის დეტალებს
        Homework_Country country2 = new Homework_Country("Japan", 126000000, "Japanese", "Asia", 3776);

        // გეთერით ვბეჭდავ უკვე დააფდეითებულ მნიშვნელობებს: France --> Japan
        System.out.println("Country 2:");
        System.out.println("Name: " + country2.getName());
        System.out.println("Population: " + country2.getPopulation());
        System.out.println("Nationality: " + country2.getNationality());
        System.out.println("Region: " + country2.getRegion());
        System.out.println("Highest Point: " + country2.getHighestPoint() + "m");
    }
}
