public class MoveCursorDownCommand implements Command {
    private Cursor cursor;
    public MoveCursorDownCommand(Cursor cursor) { this.cursor = cursor; }
    public void execute() { cursor.moveDown(); }

}
