# QuickLink-Shortener

This Java application provides basic functionality for shortening URLs and retrieving the original URLs based on a shortened version.

## Features
- **Shorten URL**: Takes an original URL as input and generates a shortened URL.
- **Retrieve Original URL**: Based on the shortened URL, retrieves the original URL.
- Uses a basic in-memory storage using `HashMap` to map shortened URLs to their original URLs.

## How it Works
1. **Shorten URL**: A unique ID is generated using `UUID` and the first 8 characters of this ID are appended to the base URL `http://short.ly/`. This shortened URL is then mapped to the original URL.
2. **Retrieve Original URL**: Given a shortened URL, the program looks it up in the HashMap and retrieves the corresponding original URL.

## Running the Application
1. Compile the Java program:
   ```bash
   javac LinkShortener.java
   ```

2. Run the Java program:
   ```bash
   java LinkShortener
   ```

3. The program will present three options:
   - Shorten URL
   - Retrieve Original URL
   - Exit

## Example
1. When you choose **Shorten URL**, you will be prompted to enter the original URL. For example:
   ```
   Enter the original URL: https://www.example.com
   ```
   The program will generate a shortened URL like:
   ```
   Shortened URL: http://short.ly/1a2b3c4d
   ```

2. To retrieve the original URL, choose **Retrieve Original URL** and enter the shortened URL:
   ```
   Enter the shortened URL: http://short.ly/1a2b3c4d
   ```
   The program will output:
   ```
   Original URL: https://www.example.com
   ```

## Notes
- The shortened URLs are stored in memory and will be lost when the program exits.
- This is a basic implementation and does not include persistence to a database or any form of URL validation.

## Requirements
- Java Development Kit (JDK) 8 or higher
- You must have Java installed on your system. You can download it from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
- A terminal or IDE to run the Java program

## License
This project is licensed under the MIT License.
