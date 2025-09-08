import java.util.List;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your character's name: ");
        String name =  scanner.nextLine();
        GameCharacter character = new GameCharacter(name);

        boolean gameOver = false;

        while (!gameOver) {

            System.out.println("=== Character Status ===");
            System.out.println("Name: " + character.getName());
            System.out.println("HP: " + character.getHealth());
            System.out.println("XP: " + character.getExperience());
            System.out.println("Level: " + character.getLevel());

            List<String> actions = character.getState().getAvailableActions();
            System.out.println("Available actions:");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println((i + 1) + ". " + actions.get(i));
            }

            if (character.getState() instanceof MasterState) {
                System.out.println("You are a Master! Game over.");
                break;
            }

            System.out.print("Choose action: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= actions.size()) {
                String action = actions.get(choice - 1);
                switch (action) {
                    case "train" -> character.train();
                    case "meditate" -> character.meditate();
                    case "fight" -> character.fight();
                }
            } else {
                System.out.println("Invalid choice. Try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
