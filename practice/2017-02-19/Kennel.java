public class Kennel {
    private Animal[] animals;

    public Kennel(Animal ... animals) {
        this.animals = animals;
    }

    public void soundOff() {
        for (Animal animal : animals) {
            System.out.println(animal.getName()
                               + " says " + animal.speak() + "!");
        }
    }
}
