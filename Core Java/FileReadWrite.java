// 1.11 File Read Write

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {
        String fileName = "example.txt";

        // Write to a file
        writeToFile(fileName, "Hello, this is a sample text written to a file.");

        // Read from a file
        String content = readFromFile(fileName);
        System.out.println("Content read from the file:\n" + content);
    }

    // Method to write content to a file
    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read content from a file
    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }
}
