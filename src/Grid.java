import java.util.Arrays;

public class Grid {
    public int X;
    public int Y;


    public Grid(int rows, int collumns) {
        this.X = rows;
        this.Y = collumns;
    }

    public Grid() {

    }

    public int getX() {
        return X;
    }

    public void setX(int rows) {
        this.X = rows;
    }

    public int getY() {
        return Y;
    }

    public void setY(int collumns) {
        this.Y = collumns;
    }


}
