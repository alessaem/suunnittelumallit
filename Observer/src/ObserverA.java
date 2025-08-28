public class ObserverA implements Observer {
    @Override
    public void update(int temperature){
        System.out.println("ObserverA: temperature = " + temperature);
    }
}
