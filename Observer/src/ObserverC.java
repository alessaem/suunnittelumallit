public class ObserverC implements Observer {

    @Override
    public void update(int temperature){
        System.out.println("ObserverC: temperature changed to " + temperature);
    }
}
