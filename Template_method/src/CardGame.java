import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CardGame extends Game {
    private List<Player> players;
    private int turnsTaken;
    private Random random = new Random();

    @Override
    public void initializeGame(int numberOfPlayers){
        players = new ArrayList<>();
        turnsTaken = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numberOfPlayers; i++){
            System.out.println("Enter name for player "+(i+1)+":");
            String playerName = sc.nextLine();
            players.add(new Player(playerName));
        }

        System.out.println("Starting the card game...");
        System.out.println("Who ever draws the card with the highest number wins.");
    }

    @Override
    public boolean endOfGame() {
        return turnsTaken >= players.size();
    }

    @Override
    public void playSingleTurn(int playerIndex) {
        Player player = players.get(playerIndex);
        int card = random.nextInt(13) + 1;
        player.setCard(card);
        turnsTaken++;
        System.out.println(player.getName() + " drew card " + card);
    }

    @Override
    public void displayWinner() {
        int bestCard = -1;
        List<Player> winners = new ArrayList<>();

        for (Player p : players) {
            if (p.getCard() > bestCard) {
                bestCard = p.getCard();
            }
        }

        for (Player p : players) {
            if (p.getCard() == bestCard) {
                winners.add(p);
            }
        }

        if (winners.size() == 1) {
            System.out.println(winners.get(0).getName() + " wins with card " + winners.get(0).getCard()+"!");
        }else{
            System.out.println("It's a tie! The winners are: ");
            for (int i = 0; i < winners.size(); i++) {
                System.out.print(winners.get(i).getName());
                if (i < winners.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" with card " + bestCard + "!");

        }

    }

}
