import java.util.ArrayList;
import java.util.List;

public class ExpertState extends State {
    private static int experienceThreshold = 200;

    public ExpertState(GameCharacter character) {
        super(character);
    }

    @Override
    public void train() {
        character.setExperience(character.getExperience()+10);
        if (character.getExperience() >= experienceThreshold) {
            character.setState(new MasterState(character));
            character.setLevel("Master");
        }
    }

    @Override
    public void meditate() {
        character.setHealth(character.getHealth()+10);
    }

    @Override
    public void fight() {
        character.setExperience(character.getExperience()+10);
        character.setHealth(character.getHealth()-5);
        if (character.getExperience() >= experienceThreshold) {
            character.setState(new MasterState(character));
            System.out.println("You have reached the final level "+character.getLevel()+" and won the game!");

        }
    }

    @Override
    public List<String> getAvailableActions() {
        List<String> availableActions = new ArrayList<String>();
        availableActions.add("train");
        availableActions.add("meditate");
        availableActions.add("fight");
        return availableActions;

    }
}
