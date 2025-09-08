public class Player {
    private String name;
    private int card;

    public Player(String name) {
        this.name = name;
        this.card = -1;
    }

    public String getName() {
        return name;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }
}
