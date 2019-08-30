public class Player extends Grid{
    public int coordX;
    public int coordY;

    public Player(int rows, int collumns) {
        super(rows, collumns);
    }

    public Player() {
        super();
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public void move(String input) {
        if (input == "N") {
            coordY += 1;
        } else if (input == "S") {
            coordY -= 1;
        } else if (input == "W") {
            coordX -= 1;
        } else if (input == "E") {
            coordX += 1;
        }
    }

    public void spawn() {
        int spawnPosX = (int) Math.random();
        int spawnPosY = (int) Math.random();
        coordX=spawnPosX;
        coordY=spawnPosY;
    }


}

