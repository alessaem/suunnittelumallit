import java.util.ArrayList;
import java.util.List;

public class IntermediateState extends State {
    private static int experienceThreshold = 100;


    public IntermediateState(GameCharacter character) {
        super(character);
    }

    @Override
    public void train() {
        character.setExperience(character.getExperience()+10);
        if (character.getExperience() >= experienceThreshold) {
            character.setState(new ExpertState(character));
            character.setLevel("Expert");
            System.out.println("You have reached the next level: "+character.getLevel());
        }
    }

    @Override
    public void meditate() {
        character.setHealth(character.getHealth()+10);
    }

    @Override
    public void fight() {
        System.out.println("You cant fight at this level");
    }

    @Override
    public List<String> getAvailableActions() {
        List<String> availableActions = new ArrayList<String>();
        availableActions.add("train");
        availableActions.add("meditate");
        return availableActions;

    }
}
