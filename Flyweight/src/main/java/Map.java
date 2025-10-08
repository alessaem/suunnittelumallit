import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public abstract class Map {
    protected TileGraphicFactory factory;
    protected List<TileInstance> tileInstances = new ArrayList<>();
    protected int size = 5;

    public Map(TileGraphicFactory graphicFactory) {
        this.factory = graphicFactory;
    }

    public abstract Tile createTile();

    public void generate() {
        tileInstances.clear();
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                Tile tile = createTile();
                tileInstances.add(new TileInstance(tile, x, y));
            }
        }
    }

    public List<TileInstance> getTileInstances() {
        return tileInstances;
    }

    public void display(GraphicsContext gc, int tileSize) {
        for (TileInstance instance : tileInstances) {
            Tile tile = instance.getTile();
            Image img = tile.getImage();
            int x = instance.getX();
            int y = instance.getY();
            gc.drawImage(img, x * tileSize, y * tileSize, tileSize, tileSize);
        }
    }
}
