 class Animals {
    public Animals() {
        System.out.println("There is an animal");
    }

    public Animals(int id) {
        id = 1;
        System.out.println("Animal ID: " + id);
    }

    public Animals(int id, String species) {
        species = "Lion";
        System.out.println("Species: " + species);
    }

    public Animals(int id, String species, char category) {
        category = 'M'; 
        System.out.println("Category: " + category);
    }

    public Animals(int id, String species, char category, boolean isWild) {
        isWild = true;
        System.out.println("Is Wild: " + isWild);
    }

    public Animals(int id, String species, char category, boolean isWild, long population) {
        population = 5000L;
        System.out.println("Population: " + population);
    }

    public Animals(int id, String species, char category, boolean isWild, long population, double averageWeight) {
        averageWeight = 190.5;
        System.out.println("Average Weight: " + averageWeight);
    }

    public Animals(int id, String species, char category, boolean isWild, long population, double averageWeight, float speed) {
        speed = 80.0f;
        System.out.println("Speed (km/h): " + speed);
    }
}
