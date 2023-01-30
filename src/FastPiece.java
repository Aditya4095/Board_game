import java.awt.*;

public class FastPiece extends Piece {
    //FastPiece Constructor
    public FastPiece(String Name, String Colour, Point pos) {
        super(Name, Colour, pos);
    }

    /**
     *
     * @param direction left or right
     * @param n number of spaces
     */
    //Condition to check if the move requested is within the bounds and moves the piece by given number of spaces n
    public void move(String direction, int n){
        if(direction.equals("right") && getPosition().y < 8 && getPosition().y >=0){
            this.setPosition(new Point(getPosition().x+n, getPosition().y ));
        }
        if(direction.equals("left") && getPosition().x < 8 && getPosition().x >=0){
            this.setPosition(new Point(getPosition().x - n ,getPosition().y));
        }
        else {
            return;
        }

    }

    @Override
    public String toString() {
         return this.getName() + this.getColour() + "F";
    }
}
