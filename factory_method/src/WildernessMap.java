import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WildernessMap extends Map{
    private List<Tile> cityTiles = Arrays.asList(
            new SwampTile(),
            new WaterTile(),
            new ForestTile()
    );

    @Override
    public Tile createTile(){
        Tile random = cityTiles.get(new Random().nextInt(cityTiles.size()));
        return random;
    }

}
