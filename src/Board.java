import java.awt.*;
import java.util.*;
public class Board {
   public static Piece[][] gameBoard; // Board of type Piece



   //Board Constructor
   public Board(){
       gameBoard = new Piece[8][8];
   }

    /**
     *
     * @param p Piece
     * @param P Point
     * @return String Representation of the entered string if none exist at that location
     */
    public String addPiece(Piece p, Point P){
        if(gameBoard[P.getLocation().x ][ P.getLocation().y]==null){
            gameBoard[p.getPosition().x ][ p.getPosition().y] =p;
            return p.toString();
        }
        else {
            return "Piece cannot be added";

        }
   }

    /**
     *
     * @param point Point
     * @param direction left or right
     * @param n number of spaces
     */

   public void move(Point point, String direction, int n) {

       //Conditions to move the Piece in the given direction by given spaces by checking the type of Piece
       if (gameBoard[point.getLocation().x][point.getLocation().y] == null) {
           System.out.println("Cannot move");
       }

       else {


           Piece P = gameBoard[point.x][point.y];

           if (P instanceof SlowPiece) {
//               if(P instanceof SlowFlexible){
//                   gameBoard[point.x][point.y] = null;
//                   ((SlowFlexible) P).move(direction);
//                   gameBoard[P.position.x][P.position.y] = P;
//
//               }
               gameBoard[point.x][point.y] = null;
               ((SlowPiece) P).move(direction);
               gameBoard[P.position.x][P.position.y] = P;

           }
//       else {
//
//           System.out.println("cannot move");
//       }
           if (P instanceof FastPiece) {

               gameBoard[point.x][point.y] = null;
               ((FastPiece) P).move(direction,n);
               gameBoard[P.position.x][P.position.y] = P;

           }
//       else{
//           System.out.println("Piece cannot be moved");
//       }
           //  if(P instanceof )


       }
   }

    /**
     * displays the game board to the user
     */
    public void Display(){
           for (int i=0 ; i<8; i++){
               for(int j=0; j<8; j++ ){
                   if(gameBoard[j][i]==null){
                       System.out.print(" -  ");
                   }
                   else{
                       System.out.print(gameBoard[j][i]);
                   }
               }
               System.out.println();
           }

       }








}
