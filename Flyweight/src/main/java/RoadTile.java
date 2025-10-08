import javafx.scene.image.Image;

public class RoadTile implements Tile {
    private final String type = "Road";
    private final String character = "R";
    private final Image image;

    public RoadTile(Image image) {
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
