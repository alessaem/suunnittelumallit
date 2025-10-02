import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Recommendation> recommendations = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Book Recommendation System ---");
            System.out.println("1. Create new recommendation");
            System.out.println("2. View recommendations");
            System.out.println("3. Clone recommendation");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: createRecommendation(); break;
                case 2: viewRecommendations(); break;
                case 3: cloneRecommendation(); break;
                case 4: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void createRecommendation() {
        System.out.print("Target audience: ");
        String audience = scanner.nextLine();
        Recommendation rec = new Recommendation(audience);

        while (true) {
            System.out.print("Add a book? (y/n): ");
            String ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("n")) break;

            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Year: ");
            String yearstring = scanner.nextLine();
            System.out.print("Genre: ");
            String genre = scanner.nextLine();
            int year = Integer.parseInt(yearstring);
            rec.addBook(new Book(title,author, year,genre));
        }

        recommendations.add(rec);
        System.out.println("Recommendation created!");
    }

    private static void viewRecommendations() {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations available.");
            return;
        }
        int i = 1;
        for (Recommendation r : recommendations) {
            System.out.println(i++ + ". Audience: " + r.getTargetAudience());
            for (Book b : r.getBooks()) {
                System.out.println("   - " + b);
            }
        }
    }

    private static void cloneRecommendation() {
        viewRecommendations();
        System.out.print("Choose recommendation to clone (number): ");
        int idx = Integer.parseInt(scanner.nextLine()) - 1;

        if (idx < 0 || idx >= recommendations.size()) {
            System.out.println("Invalid choice.");
            return;
        }

        Recommendation original = recommendations.get(idx);
        Recommendation copy = original.clone();

        System.out.print("New target audience: ");
        copy.setTargetAudience(scanner.nextLine());

        while (true) {
            System.out.print("Remove a book from clone? (y/n): ");
            String ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("n")) break;

            System.out.print("Title of book to remove: ");
            String title = scanner.nextLine();
            System.out.print("Author of book to remove: ");
            String author = scanner.nextLine();

            copy.removeBook(new Book(title,author, 0,""));
        }

        recommendations.add(copy);
        System.out.println("Cloned recommendation created!");
    }
}
