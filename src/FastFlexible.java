import java.awt.*;

public class FastFlexible extends FastPiece{

    public FastFlexible(String Name, String Colour, Point pos) {
        super(Name, Colour, pos);
    }

    /**
     *
     * @param direction left or right
     * @param n number of spaces
     */
    @Override
    public void move(String direction, int n) {
        super.move(direction, n);
        //Condition to check if the move requested is up or down and within the bounds and moves the piece by given number of spaces n in
        if(direction.equals("down") && getPosition().y < 8 && getPosition().y >=0){
            this.setPosition(new Point(getPosition().x, getPosition().y + n));
        }
        if(direction.equals("up") && getPosition().y< 8 && getPosition().y >=0){
            this.setPosition(new Point(getPosition().x, getPosition().y-n));
        }
        else{
            return;
        }
    }

    @Override
    public String toString() {
        return this.getName() + this.getColour() + "FF";
    }
}
