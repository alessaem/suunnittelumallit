import javafx.scene.image.Image;

public class WaterTile implements Tile {
    private final String type = "Water";
    private final String character = "W";
    private final Image image;

    public WaterTile(Image image) {
        this.image = image;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void action() {

    }

    @Override
    public Image getImage() {
        return image;
    }
}
