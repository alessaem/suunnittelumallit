import java.io.IOException;

public class JokeClient {

    public static void main(String[] args) {
        JokeFacade facade = new JokeFacade();
        try {
            String joke = facade.getAttributeFromJson("https://api.chucknorris.io/jokes/random","value");
            System.out.println(joke);
            String rates = facade.getAttributeFromJson("https://api.fxratesapi.com/latest","rates");
            System.out.println(rates);
        } catch (IllegalArgumentException | IOException e ) {
            System.out.println("an error occurred");
        }
    }
}