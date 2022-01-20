package day40;

import day39_Recap.Shape.Circle;
import day39_Recap.Shape.Square;

public class EncapsulationReview {

    private Circle circle;
    private Square square;


    public Circle getCircle(){
        return circle;
    }

    public void setCircle( Circle circle){
        if(circle.getRadius() < 5){
            return;
        }

        this.circle=circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
