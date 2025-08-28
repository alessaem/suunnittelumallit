public class ObserverB implements Observer {
    @Override
    public void update(int temperature){
        System.out.println("ObserverB: temperature is now " + temperature);
    }
}
