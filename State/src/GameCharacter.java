public class GameCharacter {

    private String name;
    private String level;
    private int health;
    private int experience;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.level = "Novice";
        this.health = 100;
        this.experience = 0;
        this.state = new NoviceState(this);
    }

    public void train() {
        state.train();
    }

    public void meditate() {
        state.meditate();
    }

    public void fight() {
        state.fight();
    }


    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String getName() {
        return name;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }




}
