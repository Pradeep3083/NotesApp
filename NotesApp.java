import java.io.*;
import java.util.Scanner;

public class NotesApp{
    private static final String file_name = "notes.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n==== Notes Manager ====");
            System.err.println("1. Add a Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 -> addNote(sc);
                case 2 -> viewNotes();
                case 3 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while(choice != 3);
    }

    public static void addNote(Scanner sc){
        System.out.println("Enter your note: ");
        String note = sc.nextLine();

        try (FileWriter fw = new FileWriter(file_name, true);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(note);
            bw.newLine();
            System.out.println("Note saved Successfully");
        } catch (IOException e) {
            System.out.println("Error writing to file: "+e.getMessage());
        }
    }

    public static void viewNotes() {
        try (FileReader fr = new FileReader(file_name);
             BufferedReader br = new BufferedReader(fr)){
            
            String line;
            System.out.println("\n--- YOur Note ---");
            boolean empty = true;

            while((line = br.readLine()) != null){
                System.out.println("- "+line);
                empty = false;
            }
            if(empty){
                System.out.println("No more found!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes file found! Please add a note first.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}