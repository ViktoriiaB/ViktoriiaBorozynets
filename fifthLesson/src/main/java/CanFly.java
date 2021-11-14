public interface CanFly extends CanMove {

    @Override
    void canMove();

    @Override
    default double speed() {
        return CanMove.super.speed();
    }
}



