/*
 * Auther: Techit Wongkiti
 * Student ID: 672115020
 */



import java.util.*;
import java.io.*;
 
class Data {
    private String id;
    private String firstName;
    private String lastName;
 
    public Data(String id, String firstName, String lastName) {
        this.id = id.strip();
        this.firstName = firstName.strip();
        this.lastName = lastName.strip();
    }
 
    public String getID() {
        return id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName;
    }
}
 
public class csvSorting {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\Admin\\dev-project\\class_roaster67.csv"));
        Scanner input = new Scanner(System.in);
        Vector<Data> vec = new Vector<>();

        for (int x = 0; x < 7; x++) {
            if (file.hasNextLine()) {
                file.nextLine();
            }
        }

        while (file.hasNextLine()) {
            String line = file.nextLine();
            StringTokenizer token = new StringTokenizer(line,",");
            token.nextToken();
            vec.addElement(new Data(token.nextToken(), token.nextToken(), token.nextToken()));
        }   
        file.close();

        System.out.println("Options for functions:");
        System.out.println("-n for sorting the student by ID");
        System.out.println("-f for sorting the student by First name");
        System.out.println("-l for sorting the student by Last name");
        System.out.println("-s for searching the student by First name");
 
        System.out.print("Choose function: ");
        String functions = input.nextLine().toLowerCase();
 
        switch (functions) {
            case "-n":
                vec.sort(Comparator.comparing(Data::getID));
                vec.forEach(System.out::println);
                break;
            case "-f":
                vec.sort(Comparator.comparing(Data::getFirstName));
                vec.forEach(System.out::println);
                break;
            case "-l":
                vec.sort(Comparator.comparing(Data::getLastName));
                vec.forEach(System.out::println);
                break;
            case "-s":
                System.out.print("Enter name to search: ");
                String name = input.nextLine().toUpperCase();
                int index = findIndex(vec, name);
                if (index != -1) {
                    System.out.println("Found at index: " + index);
                } 
                else {
                    System.out.println("Not found");
                }
                break;
            default:
                System.out.println("Invalid function. Please enter -n, -f, -l, or -s only.");
                break;
        }
        input.close();
    }
 
    static int findIndex(Vector<Data> vec, String name) {
        for (int i = 0; i < vec.size(); i++) {
            if (name.equals(vec.get(i).getFirstName().toUpperCase())) {
                return i;
            }
        }
        return -1;
    }
}