public class Animal {
    private String name;
    private String dob;
    private AnimalType animalType;
    private String species;

    public Animal(String name, String dob, AnimalType animalType, String species) {
        this.name = name;
        this.dob = dob;
        this.animalType = animalType;
        this.species = species;
    }

    public void speak() {
        System.out.println("Hi, my name is " + this.name + ". I am an animal!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", animalType='" + animalType + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
