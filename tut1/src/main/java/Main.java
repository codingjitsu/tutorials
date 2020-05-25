public class Main {
    public static void main(String[] args) {
        // initialze animals
        Animal a1 = new Animal("bobby", "25/05/2020", AnimalType.MAMMALS, "Egyptian Cat");
        Animal a2 = new Animal("johnny", "18/05/2020", AnimalType.BIRDS, "Eagle");

        // toString output; description of the data members
        System.out.println(a1);
        System.out.println(a2);

        // speak method for each animal
        a1.speak();
        a2.speak();
    }
}
