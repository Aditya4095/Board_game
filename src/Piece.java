import java.awt.*;
import java.util.Arrays;

public class Piece {
    // Creating Instance variable name, colour and position
    String Name;
    String Colour;
//    int x;
//    int y;
    Point  position= new Point();


    // Creating a constructor of Piece type

        public Piece(String Name, String Colour, Point pos){
       // Piece P1 = new Piece();
        this.Name = Name;
        this.Colour = Colour;
        this.position = pos;
    }



    //public Piece() {}

    public String getName() {
        return Name;
    }

    public String getColour() {
        return Colour;
    }

    public Point getPosition() {
        return position;
    }



    public void setName(String name) {
        Name = name;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "Name='" + Name + '\'' +
                ", Colour='" + Colour + '\'' +
                ", position=" + position +
                '}';
    }

    public void setPosition(int x, int y) {
            this.setPosition(x, y);
    }
}
