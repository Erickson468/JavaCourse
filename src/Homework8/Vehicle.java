package Homework8;

public class Vehicle {
        private String brand;
        private String modelName;
        private int releaseYear;

        // კონსტრუქტორი
        public Vehicle(String brand, String modelName, int releaseYear) {
            this.brand = brand;
            this.modelName = modelName;
            this.releaseYear = releaseYear;
        }

        // გეთერები (ბრენდი, მოდელი, გამოშვების წელი)
        public String getBrand() {
            return brand;
        }

        public String getModelName() {
            return modelName;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        // სეთერები (ბრენდი, მოდელი, გამოშვების წელი)
        public void setBrand(String brand) {
            this.brand = brand;
        }


        public void setModelName(String modelName) {
            this.modelName = modelName;
        }


        public void setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
        }
}


