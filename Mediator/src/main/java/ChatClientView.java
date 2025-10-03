import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatClientView extends VBox{
    private ChatClientController controller;
    private TextArea chatArea = new TextArea();
    private ComboBox<String> recipientBox = new ComboBox<>();
    private TextArea messageField = new TextArea();
    private Stage stage = new Stage();

    public ChatClientView(ChatClientController controller) {
        this.controller = controller;
        initUI();
    }

    private void initUI() {
        chatArea.setEditable(false);

        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> {
            String to = recipientBox.getValue();
            String msg = messageField.getText();
            if (to != null && !msg.isEmpty()) {
                controller.sendMessage(to, msg);
                messageField.clear();
            }
        });

        VBox ChatBox = new VBox();
        ChatBox.getChildren().add(messageField);
        messageField.setPrefRowCount(2);
        messageField.setWrapText(true);

        VBox root = new VBox(5, chatArea, recipientBox, ChatBox, sendButton);
        stage.setTitle(controller.getUsername());
        stage.setScene(new Scene(root, 300, 400));
    }

    public void show() {
        stage.show();
    }

    public void appendMessage(String msg) {
        chatArea.appendText(msg + "\n");
    }

    public void updateRecipients(Iterable<String> usernames) {
        recipientBox.getItems().clear();
        for (String u : usernames) {
            if (!u.equals(controller.getUsername())) {
                recipientBox.getItems().add(u);
            }
        }
    }
}
