import java.awt.*;

public class SlowPiece extends Piece {

    //SlowPiece Constructor
    public SlowPiece(String Name, String Colour, Point pos) {
        super(Name, Colour, pos);
    }

//    public SlowPiece() {
//        super();
//    }

    /**
     *
     * @param direction  left or right
     */
    public void move(String direction){

        //Condition to check if the move requested is within the bounds and moves the piece by one step
        if(direction.equals("right") && this.getPosition().y < 8 ){
            this.setPosition(new Point(getPosition().x+1, getPosition().y));//

        }
        else if(direction.equals("left") && this.getPosition().x < 8){
            this.setPosition(new Point(getPosition().x-1, getPosition().y));

        }
        else{
            return;
        }
    }

    @Override
    public String toString() {
        return this.getName() + this.getColour() + "S";
    }
}
