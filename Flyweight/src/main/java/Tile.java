import javafx.scene.image.Image;

public interface Tile {
    String getCharacter();
    String getType();
    void action();
    Image getImage();
}
