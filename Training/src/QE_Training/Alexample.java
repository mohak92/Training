package QE_Training;
import java.util.ArrayList;
import java.util.Scanner;

public class Alexample {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        //Create array
        ArrayList<String> bookList = new ArrayList<String>();

        //Add a few books to the array bookList
        bookList.add("A Game of Thrones");
        bookList.add("A Clash of Kings");
        bookList.add("A Storm of Swords");
        bookList.add("A Feast for Crows");
        bookList.add("A Dance with Dragons");

        //Display the items in bookList array and their indices.
        System.out.println("******** The Book List ********");
        for (int index = 0; index < bookList.size(); index++)
        {System.out.println("Index:  " + index + "    Name: " + bookList.get(index));}
        System.out.print("\n");


        //declaring variables
        int menuID = 0;
        int changeIndex = 0;
        int delIndex = 0;
        String addTitle = "";
        String corrTitle = "";


        //Menu
        System.out.println("Enter 1 to add a book to the list");
        System.out.println("Enter 2 to edit a book in the list");
        System.out.println("Enter 3 to remove a book from the list");
        System.out.println("Enter 4 display the list of books");
        System.out.println("Enter 5 to quit");
        System.out.println("Enter a menu number (1-4 or 5 to Exit): ");
        menuID = input.nextInt();

        while (menuID != 0)
        {

            if (menuID >=1 && menuID <= 4)
            {
                switch (menuID)
                {
                    case 1:
                        System.out.println("Enter the book to add: ");
                        addTitle = keyboard.nextLine();
                        bookList.add(addTitle);

                        System.out.print("\n");
                        System.out.println("******** The Book List ********");
                        for (int index = 0; index < bookList.size(); index++)
                        {System.out.println("Index:  " + index + "    Name: " + bookList.get(index));}
                        break;

                    case 2:
                        System.out.println("Enter index number of the book to change: ");
                        changeIndex = keyboard.nextInt();

                        System.out.println("Enter the corrected book name: ");
                        corrTitle = keyboard.nextLine();

                        bookList.set(changeIndex, corrTitle);

                        System.out.println("******** The Book List ********");
                        for (int index = 0; index < bookList.size(); index++)
                        {System.out.println("Index:  " + index + "    Name: " + bookList.get(index));}
                        break;

                    case 3:
                        System.out.println("Enter index number of the book to remove: ");
                        delIndex = keyboard.nextInt();
                        bookList.remove(delIndex);

                        System.out.println("******** The Book List ********");
                        for (int index = 0; index < bookList.size(); index++)
                        {System.out.println("Index:  " + index + "    Name: " + bookList.get(index));}
                        break;

                    case 4:
                        System.out.println("******** The Book List ********");
                        for (int index = 0; index < bookList.size(); index++)
                        {System.out.println("Index:  " + index + "    Name: " + bookList.get(index));}
                        break;

                    case 5:
                        System.out.println("Goodbye!");
                        break;
                }}
            else if (menuID >=1 && menuID <= 4)
                System.out.println("You must enter a number 1-5:");
            System.out.println("Enter a menu number (1-4 or 5 to Exit): ");
            menuID = input.nextInt();

        }
        keyboard.close();
        input.close();
    }
}