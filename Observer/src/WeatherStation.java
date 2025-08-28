import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable {

    private int maxTemp = 45;
    private int minTemp = -50;
    private int temperature;
    Random rand = new Random();
    private List<Observer> observers =  new ArrayList<Observer>();
    boolean running = true;


    public  WeatherStation() {
        this.temperature = rand.nextInt(maxTemp-minTemp)+minTemp;
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer o : observers){
            o.update(temperature);
        }
    }

    public void stop(){
        running = false;
    }

    @Override
    public void run() {
        while(running){
            try{
                Thread.sleep(rand.nextInt(5000-1000)+1000);
                int change =rand.nextBoolean()?1:-1;
                temperature += change;

                if(temperature > maxTemp){
                    temperature = maxTemp;
                }
                if(temperature < minTemp){
                    temperature = minTemp;
                }
                notifyObservers();
            }catch(InterruptedException e){
                break;
            }
        }
    }
}
