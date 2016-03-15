package chessinfo;
import junit.framework.TestCase;

/**
 * Created by wyqin on 3/15/16.
 */
public class PawnTest extends TestCase {
    public void testCreate() {
         final String firstColor = "white";
         final String secondColor = "Black";

         Pawn firstPawn = new Pawn(firstColor);
         assertEquals(firstColor, firstPawn.getColor());

         Pawn secondPawn = new Pawn(secondColor);
         assertEquals(secondColor, secondPawn.getColor());
    }
}
