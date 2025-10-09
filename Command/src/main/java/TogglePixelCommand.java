public class TogglePixelCommand implements Command {
    private PixelGrid grid;
    private Cursor cursor;
    public TogglePixelCommand(PixelGrid grid, Cursor cursor) {
        this.grid = grid;
        this.cursor = cursor;
    }
    public void execute() {
        grid.togglePixel(cursor.getX(), cursor.getY());
    }
}
