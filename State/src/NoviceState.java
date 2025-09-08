import java.util.ArrayList;
import java.util.List;

public class NoviceState extends State {
    private static int experienceThreshold = 50;

    public NoviceState(GameCharacter character) {
        super(character);
    }

    @Override
    public void train() {
        character.setExperience(character.getExperience()+10);
        if (character.getExperience() >= experienceThreshold) {
            character.setState(new IntermediateState(character));
            character.setLevel("Intermediate");
            System.out.println("You have reached the next level: "+character.getLevel());

        }
    }

    @Override
    public void meditate() {
        System.out.println("You cant meditate at this level");
    }

    @Override
    public void fight() {
        System.out.println("You cant fight at this level");
    }

    @Override
    public List<String> getAvailableActions() {
        List<String> availableActions = new ArrayList<String>();
        availableActions.add("train");
        return availableActions;

    }
}
