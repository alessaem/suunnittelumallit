import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CityMap extends Map{
    private List<Tile> cityTiles = Arrays.asList(
            new RoadTile(),
            new BuildingTile(),
            new ForestTile()
    );

    @Override
    public Tile createTile(){
        Tile random = cityTiles.get(new Random().nextInt(cityTiles.size()));
        return random;
    }
}
