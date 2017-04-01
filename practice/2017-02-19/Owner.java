public class Owner {
    public static void main(String[] args) {
        Kennel kennel = new Kennel(new Dog("Rex"),
                                   new Dog("Doggo"),
                                   new Dog("Pupper"),
                                   new Dog("Spike"),
                                   new Dog("Fido"),
                                   new Dog("Rover"),
                                   new Cat("Misty"));
        kennel.soundOff();
    }
}
