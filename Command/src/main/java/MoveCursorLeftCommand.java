public class MoveCursorLeftCommand implements Command {
    private Cursor cursor;
    public MoveCursorLeftCommand(Cursor cursor) { this.cursor = cursor; }
    public void execute() { cursor.moveLeft(); }

}
