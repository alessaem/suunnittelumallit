public class PixelGrid {
    private final int[][] grid;
    private final int gridSize;

    public PixelGrid(int gridSize) {
        this.gridSize = gridSize;
        this.grid = new int[gridSize][gridSize];
    }

    public void togglePixel(int x, int y) {
        if (isValid(x, y)) {
            grid[y][x] = (grid[y][x] == 0) ? 1 : 0;
        }
    }

    public int getPixel(int x, int y) {
        return isValid(x, y) ? grid[y][x] : 0;
    }

    public int[][] getGrid() {
        return grid;
    }

    private boolean isValid(int x, int y) {
        return x >= 0 && x < gridSize && y >= 0 && y < gridSize;
    }
}
