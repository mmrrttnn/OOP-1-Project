package bg.tu_varna.sit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insert a command");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        System.out.println("You chose " + command);
        while(!command.equals("exit")) {
            switch (command){
                case "addevent":
                    System.out.println("addevent");
                    break;
                case "freeseats":
                    System.out.println("freeseats");
                    break;
                case "book":
                    System.out.println("book");
                    break;
                case "unbook":
                    System.out.println("unbook");
                    break;
                case "buy":
                    System.out.println("buy");
                    break;
                case "bookings":
                    System.out.println("bookings");
                    break;
                case "check":
                    System.out.println("check");
                    break;
                case "report":
                    System.out.println("report");
                    break;
                case "help":
                    System.out.println("The following commands are supported:\n" +
                            "open <file>                                opens <file>\n" +
                            "close                                      closes currently opened file\n" +
                            "save                                       saves the currently open file\n" +
                            "saveas <file>                              saves the currently open file in <file>\n" +
                            "help                                       prints this information\n" +
                            "exit                                       exits the program\n" +
                            "addevent  <date> <hall> <name>             adds a new event\n" +
                            "freeseats <date> <name>                    shows free seats of an event\n" +
                            "book <row> <seat> <date> <name> <note>     books a ticket for an event\n" +
                            "unbook <row> <seat> <date> <name>          unbooks a ticket for an event\n" +
                            "buy <row> <seat> <date> <name>             buys a ticket for an event\n" +
                            "bookings [<date>] [<name>]                 shows info about booked tickets\n" +
                            "check <code>                               checks validity of ticket\n" +
                            "report <from> <to> [<hall>]                shows info about bought tickets\n");
                    break;
                case "exit":
                    System.out.println("exit");
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
            command = sc.nextLine();
            System.out.println("Insert a command");
            System.out.println("You chose " + command);
        }
    }
}
