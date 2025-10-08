import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Game extends Application {
    @Override
    public void start(Stage stage) {
        int mapSize = 5;
        int tileSize = 32;

        TileGraphicFactory graphicFactory = new TileGraphicFactory();
        Map map = new WildernessMap(graphicFactory);
        map.generate();

        Canvas canvas = new Canvas(mapSize * tileSize, mapSize * tileSize);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        map.display(gc, tileSize);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("RPG Map Viewer");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
