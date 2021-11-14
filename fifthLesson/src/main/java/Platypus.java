import java.util.Objects;

public class Platypus  implements CanSwim, CanEat {

    String name;
    String type;

    public Platypus(String name, String type) {
        this.name = name;
        this.type = type;
    }


    @Override
    public void canSwim() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platypus platypus = (Platypus) o;
        return Objects.equals(name, platypus.name) && Objects.equals(type, platypus.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Platypus{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void canEat() {
    }
}