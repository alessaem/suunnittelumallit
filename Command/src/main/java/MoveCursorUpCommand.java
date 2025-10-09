public class MoveCursorUpCommand implements Command {
    private Cursor cursor;
    public MoveCursorUpCommand(Cursor cursor) { this.cursor = cursor; }
    public void execute() { cursor.moveUp(); }
}
