import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {

        Management management = new Management("Nandail Soccer Club");

        System.out.println("***** Welcome to the Nandail Soccer Club *****");
        while (true) {
            System.out.println("Press keys to perform...........");
            System.out.println("(1). Add New Player");
            System.out.println("(2). List of player");

            System.out.println("(3). player's Info");

            System.out.println("(4). Delete Player");

            System.out.println("(5). Exit");

            Scanner input = new Scanner(System.in);
            int choice;
            choice = input.nextInt();
            if (choice == 1) {
                while (true) {
                    System.out.println("Player Name :");
                    String Name = input.next();

                    System.out.println("Player ID :");
                    int id = input.nextInt();

                    System.out.println("Player Age :");
                    String age = input.next();

                    System.out.println("Player Phone Number :");
                    String phone = input.next();
                    System.out.println("Player address :");
                    String address = input.next();

                    management.addPlayer(Name, id, age, phone,address);
                    System.out.println("Player Added Successfully");
                    break;

                }


            } else if (choice == 2) {
                while (true) {
                    System.out.println("Nandail soccer Club Players: ");
                    management.display();
                    break;

                }

            } else if (choice == 3) {
                while (true) {
                    System.out.println("Please Enter Player ID: ");
                    int ID = input.nextInt();
                    management.SearchPlayerInfo(ID);
                    break;
                }

            } else if (choice == 4) {
                while (true) {
                    System.out.println("Please Enter Player ID: ");
                    int ID = input.nextInt();
                    management.DeletePlayer(ID);


                    break;
                }
            }
                else if (choice== 0){

                    break;
                }
                else
                    System.out.println("Wrong key pressed! Please try again.");

            }




    }
}
