public abstract class Birds {

    String name;
    String type;

    public Birds(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract void fly();
    abstract void iAm();


}
