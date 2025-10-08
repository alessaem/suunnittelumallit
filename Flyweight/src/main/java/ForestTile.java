import javafx.scene.image.Image;

public class ForestTile implements Tile {
    private final String type = "Forest";
    private final String character = "F";
    private final Image image;

    public ForestTile(Image image) {
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
