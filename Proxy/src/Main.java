import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Library lib =  new Library();

        UUID public1 =   lib.addDocument("im not a secret document");
        UUID public2 =   lib.addDocument("everyone can see me");

        UUID secret1 =  lib.addProtectedDocument("shhh im a secret document");
        UUID secret2 = lib.addProtectedDocument("only a selected few can read me");
        UUID secret3 = lib.addProtectedDocument("only user 1 can read me");

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        AccessControlService accessControl = AccessControlService.getInstance();

        accessControl.addAccess(secret1, user1.getUsername());
        accessControl.addAccess(secret3, user1.getUsername());
        accessControl.addAccess(secret2, user2.getUsername());


        IDocument doc1 = lib.getDocument(public1);
        try {
            System.out.println("Public 1 document: " + doc1.getContent(user1));
        } catch (DocumentAccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        IDocument doc2 = lib.getDocument(public2);
        try {
            System.out.println("Public 2 document: " + doc2.getContent(user2));
        } catch (DocumentAccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        IDocument doc3 = lib.getDocument(secret1);
        try {
            System.out.println("Secret 1 document: " + doc3.getContent(user2));
        } catch (DocumentAccessDeniedException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Secret 1 document: " + doc3.getContent(user1));
        } catch (DocumentAccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        IDocument doc4 = lib.getDocument(secret2);
        try {
            System.out.println("Secret 2 document: " + doc4.getContent(user2));
        } catch (DocumentAccessDeniedException e) {
            System.out.println(e.getMessage());

        }

        IDocument doc5 = lib.getDocument(secret3);
        try {
            System.out.println("Secret 3 document: " + doc5.getContent(user2));
        } catch (DocumentAccessDeniedException e) {
            System.out.println(e.getMessage());

        }
        try {
            System.out.println("Secret 3 document: " + doc5.getContent(user1));
        } catch (DocumentAccessDeniedException e) {
            System.out.println(e.getMessage());
        }


    }
}
