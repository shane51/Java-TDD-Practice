package chessinfo.pieces;

/**
 * Created by wyqin on 3/15/16.
 */
public class Pawn {
    private String color;
    final String whiteColor = "white";

    public Pawn(String color){
        this.color = color;
    }

    public Pawn() {
        this.color = whiteColor;
    }
    String getColor() {
        return color;
    }
}
