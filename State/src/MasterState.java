import java.util.ArrayList;
import java.util.List;

public class MasterState extends State {

    public MasterState(GameCharacter character) {
        super(character);
    }

    @Override
    public void train() {
        System.out.println("You have reached the master level and won the game.");
    }

    @Override
    public void meditate() {
        System.out.println("You have reached the master level and won the game.");
    }

    @Override
    public void fight() {
        System.out.println("You have reached the master level and won the game.");
    }

    @Override
    public List<String> getAvailableActions() {
        List<String> availableActions = new ArrayList<String>();

        return availableActions;

    }
}
