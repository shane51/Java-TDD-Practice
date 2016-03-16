package chessinfo;

import chessinfo.pieces.Pawn;
import junit.framework.TestCase;
/**
 * Created by wyqin on 3/15/16.
 */
public class BoardTest extends TestCase {
    private Board firstBoard;

    public void setUp() {
        firstBoard = new Board();
    }
    public void testCreate() {

        assertEquals(0, firstBoard.getPawn());

        Pawn firstPawn = new Pawn("white");
        firstBoard.enroll(firstPawn);
        assertEquals(1, firstBoard.getNumberOfPawns());
        assertEquals(firstPawn,firstBoard.get(0));

        Pawn secondPawn = new Pawn("black");
        firstBoard.enroll(secondPawn);
        assertEquals(2, firstBoard.getNumberOfPawns());
        assertEquals(secondPawn,firstBoard.get(1));

    }

}
