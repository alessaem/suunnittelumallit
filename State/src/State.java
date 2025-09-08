import java.util.List;

public abstract class State {
    protected GameCharacter character;

    public State(GameCharacter character) {
        this.character = character;
    }

    public abstract void train();
    public abstract void meditate();
    public abstract void fight();

    public abstract List<String> getAvailableActions();
}
