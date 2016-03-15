package chessinfo;
import junit.framework.TestCase;

/**
 * Created by wyqin on 3/15/16.
 */
public class PawnTest extends TestCase {
    public void testCreate() {
         Pawn firstPawn = new Pawn("white");
         String firstPawnColor = firstPawn.getColor();
         assertEquals("white", firstPawnColor);

         Pawn secondPawn = new Pawn("Black");
         String secondPawnColor = secondPawn.getColor();
         assertEquals("Black", secondPawnColor);
    }
}
