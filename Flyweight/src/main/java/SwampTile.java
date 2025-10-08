import javafx.scene.image.Image;

public class SwampTile implements Tile {
    private final String type = "Swamp";
    private final String character = "S";
    private final Image image;

    public SwampTile(Image image) {
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
