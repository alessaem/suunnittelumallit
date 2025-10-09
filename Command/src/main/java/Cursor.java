public class Cursor {
    private int x = 0;
    private int y = 0;
    private final int gridSize;

    public Cursor(int gridSize) {
        this.gridSize = gridSize;
    }

    public void moveUp() {
        if (y > 0) y--;
    }

    public void moveDown() {
        if (y < gridSize - 1) y++;
    }

    public void moveLeft() {
        if (x > 0) x--;
    }

    public void moveRight() {
        if (x < gridSize - 1) x++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
