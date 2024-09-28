import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class LinkShortener {
  
    private static final HashMap<String, String> urlMap = new HashMap<>();
    
    //URL for shortened links
    private static final String BASE_URL = "http://short.ly/";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true)
         {
            System.out.println("1. Shorten URL");
            System.out.println("2. Retrieve Original URL");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    shortenUrl(scanner);
                    break;
                case 2:
                    retrieveOriginalUrl(scanner);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

   
    private static void shortenUrl(Scanner scanner) {
        System.out.print("Enter the original URL: ");
        String originalUrl = scanner.next();
        
        //Generate a unique identifier for the shortened URL using UUID
        String uniqueID = UUID.randomUUID().toString().substring(0, 8); // Take only the first 8 characters
        String shortUrl = BASE_URL + uniqueID;
        
        urlMap.put(shortUrl, originalUrl);
        
        System.out.println("Shortened URL: " + shortUrl);
    }

    //Method to retrieve the original URL using the shortened URL
    private static void retrieveOriginalUrl(Scanner scanner) {
        System.out.print("Enter the shortened URL: ");
        String shortUrl = scanner.next();
        
        //Check if the shortened URL exists in the HashMap
        if (urlMap.containsKey(shortUrl)) {
            
            System.out.println("Original URL: " + urlMap.get(shortUrl));
        } else {
            
            System.out.println("URL not found.");
        
        }
    }
}
