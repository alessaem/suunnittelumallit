import javafx.application.Application;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        ChatMediator mediator = new ChatMediator();

        List<ChatClientController> clients = new ArrayList<ChatClientController>();
        ChatClientController pekka = new ChatClientController("pekka", mediator);
        ChatClientController pirkko = new ChatClientController("pirkko", mediator);
        ChatClientController kari = new ChatClientController("kari", mediator);

        clients.add(pekka);
        clients.add(pirkko);
        clients.add(kari);

        mediator.registerClient(pekka);
        mediator.registerClient(pirkko);
        mediator.registerClient(kari);

        mediator.updateAllRecipients();
        for (ChatClientController client : clients) {
            client.show();
        }

    }



    public static void main(String[] args) {
        launch(args);
    }
}
