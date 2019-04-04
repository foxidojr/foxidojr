public abstract class Animal {

    private String name;

    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 32;
        int res = 1;
        res = prime * res + ((name == null) ? 0 : name.hashCode());
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj .getClass() != this.getClass()) return false;

        Animal animal = (Animal) obj;
        return name == animal.name ||
                (name != null && name.equals(animal.getName()));
    }

    @Override
    public String toString() {
        return this.name;
    }
}
