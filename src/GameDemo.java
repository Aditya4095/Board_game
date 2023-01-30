import java.awt.*;
import java.util.*;
public class GameDemo {
    public static void main(String[] args) {

        Piece p;               // Piece
        Board b = new Board(); // new board


        Scanner in = new Scanner(System.in);
        String input;
        String name;
        String color;


        System.out.println("Enter a command (type help for details): ");
        input = in.nextLine();


        /**
         * Performs all the conditions till the user enters exit as the command
         */
        while (!input.equals("exit")) {
            //Using split to break the input to get the integer and string seprately
            String str[] = input.split(" ");

            //Conditions to create and add a new piece at the given location

            if (str[0].equals("create")) {

//

                    System.out.println("Input a name: ");
                    name = in.next();
                    System.out.println("Input a colour for the new piece:");
                    color = in.next();
//

                    int x = Integer.parseInt(str[1]);
                    int y = Integer.parseInt(str[2]);
                    if (str.length == 3) {
                        p = new SlowPiece(name, color, new Point(x, y));
                        b.addPiece(p, new Point(x, y));


                    }
                    if (str.length == 4 && str[3].equals("fast")) {
                        p = new FastPiece(name, color, new Point(x, y));
                        b.addPiece(p, new Point(x, y));

                    }
                    if (str.length == 4 && str[3].equals("flexible")) {
                        p = new SlowFlexible(name, color, new Point(x, y));
                        b.addPiece(p, new Point(x, y));

                    }
                    if (str.length == 5) {
                        p = new FastFlexible(name, color, new Point(x, y));
                        b.addPiece(p, new Point(x, y));
                    }
                    System.out.println("Enter a command (type help for details): ");


                }

                ////Conditions to move a piece at the given location

                if (str[0].equals("move")) {
                    Point pos = new Point(Integer.parseInt(str[1]), Integer.parseInt(str[2]));
                    if (str.length == 4) {
                        b.move(pos, str[3], 1);


                    }
                    if (str.length == 5) {
                        b.move(pos, str[3], Integer.parseInt(str[4]));
                    }
                    System.out.println("Enter a command (type help for details): ");

                }

                if (str[0].equals("print")) {
                    b.Display();
                    System.out.println("Enter a command (type help for details):");
                }
                if (str[0].equals("help")) {
                    System.out.println("Possible commands are as follows :");
                    System.out.println("create location [fast][flexible]: Creates a new piece.");
                    System.out.println("move location direction [spaces]: Moves a piece.");
                    System.out.println("print: Displays the board.");
                    System.out.println("help: Displays help.");
                    System.out.println("exit: Exits the program.");

                }
                input = in.nextLine();


            }


        }
    }
