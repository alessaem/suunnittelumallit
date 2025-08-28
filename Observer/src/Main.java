public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Thread weatherStationThread = new Thread(weatherStation);
        weatherStationThread.start();

        Observer observera = new ObserverA();
        Observer observerb = new ObserverB();
        Observer observerc = new ObserverC();

        weatherStation.registerObserver(observera);
        weatherStation.registerObserver(observerb);
        weatherStation.registerObserver(observerc);

        try{
            Thread.sleep(10000);
            weatherStation.removeObserver(observera);
            Thread.sleep(5000);
            weatherStation.stop();
        }catch(InterruptedException e){
            System.out.println("thread interrupted");
        }

    }
}
