public class Dog extends Animal implements Sniff, Jawable {

    private String name;

    private Breed breed;
    //dog breed

    //constructor
    public Dog(String name, Breed breed) {
        this.name = name;
        this.breed = breed;
    }

    //конструктор по умолчанию
    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public void talk() {
        System.out.println(this.name + " say: Gaw - gaw - gav");
    }

    @Override
    public void sniff(Animal animal) {
        System.out.println(this.name + " sniffing " + animal.getName());
    }

    @Override
    public int hashCode() {
        final int prime = 32;
        int res = 1;
        res = prime * res + ((name == null) ? 0 : name.hashCode());
        res = prime * res + ((breed ==null) ? 0 : breed.hashCode());
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj .getClass() != this.getClass()) return false;

        Dog dog = (Dog) obj;
        return (
                name == dog.name
                        || (name != null && name.equals(dog.getName()) && (breed == dog.getBreed()
                        || (breed != null && breed.equals(dog.getBreed())))
                ));
    }

    @Override
    public String toString() {
        return this.name + " " + this.breed;
    }
}
