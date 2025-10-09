public class GenerateCodeCommand implements Command {
    private PixelGrid grid;
    public GenerateCodeCommand(PixelGrid grid) { this.grid = grid; }
    public void execute() {
        int[][] pixels = grid.getGrid();
        System.out.println("int[][] pixelArt = {");
        for (int[] row : pixels) {
            System.out.print("    {");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length - 1) System.out.print(", ");
            }
            System.out.println("},");
        }
        System.out.println("};");
    }
}
