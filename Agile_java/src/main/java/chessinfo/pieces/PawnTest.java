package main.java.chessinfo.pieces;
import junit.framework.TestCase;

/**
 * Created by wyqin on 3/15/16.
 */
public class PawnTest extends TestCase {
    public void testCreate() {
         final String firstColor = "white";
         final String secondColor = "Black";
         final String thirdColor  = "white";

         Pawn firstPawn = new Pawn(firstColor);
         assertEquals(firstColor, firstPawn.getColor());

         Pawn secondPawn = new Pawn(secondColor);
         assertEquals(secondColor, secondPawn.getColor());

         Pawn thirdPawn = new Pawn();
         assertEquals(thirdColor, thirdPawn.getColor());
    }
}
