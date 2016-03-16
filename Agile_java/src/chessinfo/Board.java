package chessinfo;
import chessinfo.pieces.Pawn;
import java.util.*;
/**
 * Created by wyqin on 3/15/16.
 */
public class Board {

    private ArrayList<Pawn> pawns = new ArrayList<Pawn>();

    Board(){

    }
    int getPawn() {
        return 0;
    }
    void enroll(Pawn pawn) {
        pawns.add(pawn);
    }
    Pawn get(int index){
        return pawns.get(index);

    }

    int getNumberOfPawns(){
        return pawns.size();
    }
}
