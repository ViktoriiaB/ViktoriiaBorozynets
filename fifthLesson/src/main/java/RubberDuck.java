import java.util.Objects;

public class RubberDuck extends Birds implements CanSwim{


    String material;
    String beak;

    public RubberDuck(String name, String type, String material, String beak) {
        super(name, type);
        this.material = material;
        this.beak = beak;

    }

    @Override
    void fly() {
    }

    @Override
    void iAm() {
        System.out.println("RubberDuck is a bird");
    }

    @Override
    public void canSwim() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RubberDuck that = (RubberDuck) o;
        return Objects.equals(material, that.material) && Objects.equals(beak, that.beak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, beak);
    }

    @Override
    public String toString() {
        return "RubberDuck{" +
                "material='" + material + '\'' +
                ", beak='" + beak + '\'' +
                '}';
    }
}
