import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WildernessMap extends Map{
    private TileGraphicFactory factory = new TileGraphicFactory();
    private List<String> types = Arrays.asList("Swamp", "Water", "Forest");

    public WildernessMap(TileGraphicFactory factory) {
        super(factory);
    }

    @Override
    public Tile createTile() {
        String type = types.get(new Random().nextInt(types.size()));
        return factory.getTile(type);
    }
}