import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private Map<String, Tile> tilePool = new HashMap<>();

    public Tile getTile(String type) {
        if (!tilePool.containsKey(type)) {
            Image img = loadImage(type);
            Tile tile = switch (type) {
                case "Road" -> new RoadTile(img);
                case "Building" -> new BuildingTile(img);
                case "Forest" -> new ForestTile(img);
                case "Swamp" -> new SwampTile(img);
                case "Water" -> new WaterTile(img);
                default -> throw new IllegalArgumentException("Unknown type: " + type);
            };
            tilePool.put(type, tile);
        }
        return tilePool.get(type);
    }

    private Image loadImage(String type) {
        return new Image(getClass().getResourceAsStream("/images/" + type.toLowerCase() + ".png"));
    }
}
