package exercitiu_lab2;

import java.util.Scanner;

public class ReadFromKeyword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ok = true;
        while (ok) {
            System.out.println("Enter command >>> ");
            String command = scanner.nextLine();

            if(command.equals("create")) {
                System.out.println("Command received: create");
                create();
            }

            else if(command.equals("read")) {
                System.out.println("Command received: read");
                read();
            }

            else if(command.equals("update")) {
                System.out.println("Command received: update");
                update();
            }

            else if(command.equals("delete")) {
                System.out.println("Command received: delete");
                delete();
            }

            else if(command.equals("help")) {
                System.out.println("Command received: help");
                System.out.println("Accepted commands");
                System.out.println("create - create object");
                System.out.println("read - show objects");
                System.out.println("update - update object");
                System.out.println("delete - delete object");
                System.out.println("help - receive instructions");
                System.out.println("quit - quit application");
            }

            else if(command.equals("quit")) {
                System.out.println("Command received: quit");
                ok = false;
            }
        }
    }
    public static void create() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: >>> ");
        String username = scanner.nextLine();

        System.out.println("Sold: >>> ");
        double sold = scanner.nextDouble();

        boolean found = false;
        for(User user : DataStorage.list) {
            if(user.getUsername().equals(username)) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("User already exists");
        }
        else {
            DataStorage.list.add(new User(username, sold));
        }
    }
    public static void read() {
        for(User user : DataStorage.list) {
            System.out.println("Username: " + user.getUsername() + " Sold: " + user.getSold());
        }
    }
    public static void update() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: >>> ");
        String username = scanner.nextLine();

        boolean found = false;

        for(int i = 0; i < DataStorage.list.size(); i++) {
            if(DataStorage.list.get(i).getUsername().equals(username)) {
                found = true;

                System.out.println("Sold: >>> ");
                double sold = scanner.nextDouble();

                DataStorage.list.get(i).setSold(sold);
                System.out.println("The sold was updated for user " + DataStorage.list.get(i).getUsername() + " " + sold);
                break;
            }
        }

        if(!found) {
            System.out.println("User not found");
        }
    }
    public static void delete() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: >>> ");
        String username = scanner.nextLine();

        boolean found = false;

        for(int i = 0; i < DataStorage.list.size(); i++) {
            if(DataStorage.list.get(i).getUsername().equals(username)) {
                found = true;

                DataStorage.list.remove(i);
                break;
            }
        }

        if(!found) {
            System.out.println("User not found");
        }
    }
}