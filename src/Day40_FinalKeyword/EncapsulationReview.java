package Day40_FinalKeyword;

import Day39_Recap.ShapeTask.Circle;
import Day39_Recap.ShapeTask.Square;

public class EncapsulationReview {
    private Circle circle;
    private Square square;

    public Square getSquare() { //access modifier if be default this methos use only this class and if be private this method or variables can not use anywhere
        return square;
    }
    //default access modofier can not write
    // exp:
    // public Square getSquare ---> public access mod
    // Square getSquare ---> default access mod


    public void setSquare(Square square) {
        this.square = square;
    }

    public Circle getCircle(){
        return circle;
    }
    public void setCircle(Circle circle){
        if (circle.getRadius()<5){
            return;
        }
      this.circle=circle;
    }
}
