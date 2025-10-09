import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class PixelArtEditor extends Application {

    private static final int GRID_SIZE = 8;
    private static final int CELL_SIZE = 40;

    private PixelGrid pixelGrid = new PixelGrid(GRID_SIZE);
    private Cursor cursor = new Cursor(GRID_SIZE);
    private Rectangle[][] cells = new Rectangle[GRID_SIZE][GRID_SIZE];

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(2);
        gridPane.setVgap(2);

        for (int y = 0; y < GRID_SIZE; y++) {
            for (int x = 0; x < GRID_SIZE; x++) {
                Rectangle cell = new Rectangle(CELL_SIZE, CELL_SIZE);
                cell.setFill(Color.WHITE);
                cell.setStroke(Color.GRAY);
                cells[y][x] = cell;
                gridPane.add(cell, x, y);
            }
        }

        Button generateButton = new Button("Create Code");
        generateButton.setOnAction(e -> {
            Command generateCode = new GenerateCodeCommand(pixelGrid);
            generateCode.execute();
        });

        VBox root = new VBox(10, gridPane, generateButton);
        Scene scene = new Scene(root);
        updateGrid();

        scene.setOnKeyPressed(event -> {
            Command command = null;
            if (event.getCode() == KeyCode.UP) {
                command = new MoveCursorUpCommand(cursor);
            } else if (event.getCode() == KeyCode.DOWN) {
                command = new MoveCursorDownCommand(cursor);
            } else if (event.getCode() == KeyCode.LEFT) {
                command = new MoveCursorLeftCommand(cursor);
            } else if (event.getCode() == KeyCode.RIGHT) {
                command = new MoveCursorRightCommand(cursor);
            } else if (event.getCode() == KeyCode.SPACE) {
                command = new TogglePixelCommand(pixelGrid, cursor);
            }

            if (command != null) {
                command.execute();
                updateGrid();
            }
        });

        primaryStage.setTitle("Pixel Art Editor");
        primaryStage.setScene(scene);
        primaryStage.show();
        root.setFocusTraversable(true);
        root.requestFocus();
    }

    private void updateGrid() {
        for (int y = 0; y < GRID_SIZE; y++) {
            for (int x = 0; x < GRID_SIZE; x++) {
                int value = pixelGrid.getPixel(x, y);
                Rectangle cell = cells[y][x];
                if (value == 1) {
                    cell.setFill(Color.BLACK);
                } else {
                    cell.setFill(Color.WHITE);
                }

                if (cursor.getX() == x && cursor.getY() == y) {
                    cell.setStroke(Color.RED);
                    cell.setStrokeWidth(3);
                } else {
                    cell.setStroke(Color.GRAY);
                    cell.setStrokeWidth(1);
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
