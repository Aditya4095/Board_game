import java.awt.*;

public class SlowFlexible extends SlowPiece{

    public SlowFlexible(String Name, String Colour, Point pos) {
        super(Name, Colour, pos);
    }

    /**
     *
     * @param direction  left or right
     */

    public void move(String direction){

        super.move(direction);
        //Condition to check if the move requested is up or down and within the bounds and moves the piece by 1 space in the direction
        if(direction.equals("down") && getPosition().y < 8 && getPosition().y >=0){
            this.setPosition(new Point(getPosition().x, getPosition().y + 1));
        }
        if(direction.equals("up") && getPosition().y< 8 && getPosition().y >=0){
            this.setPosition(new Point(getPosition().x, getPosition().y-1));
        }
        else{
            return;
        }
    }

    @Override
    public String toString() {
        return this.getName() + this.getColour() + "SF";
    }
}
