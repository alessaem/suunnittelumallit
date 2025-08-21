import java.util.ArrayList;

public abstract class Map {
    public abstract Tile createTile();

    public void display() {
        int size = 5;
        ArrayList<ArrayList<String>> allTiles = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < size; i++) {
            ArrayList<String> innerTiles = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                Tile tile = createTile();
                innerTiles.add(tile.getCharacter());
            }

            allTiles.add(new ArrayList<>(innerTiles));

            innerTiles.clear();
        }

        for (ArrayList<String> row : allTiles) {
            for (String tile : row) {
                System.out.print(tile + " ");
            }
            System.out.println();
        }

    }
}
