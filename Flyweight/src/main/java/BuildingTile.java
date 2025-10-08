import javafx.scene.image.Image;

public class BuildingTile implements Tile {
    private final String type = "Building";
    private final String character = "B";
    private final Image image;

    public BuildingTile(Image image) {
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
