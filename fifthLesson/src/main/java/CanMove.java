public interface CanMove {
     void canMove();

     default double speed(){
          double theSpeed = 0;
          return theSpeed;
     }
}

