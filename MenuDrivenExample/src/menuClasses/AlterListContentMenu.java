package menuClasses;

import java.util.ArrayList;

/**
 * Created by juanhernandez on 11/25/17.
 */
public class AlterListContentMenu extends Menu{
    private static AlterListContentMenu LSM = new AlterListContentMenu();
    private AlterListContentMenu() {
        super();
        String title;
        ArrayList<Option> options = new ArrayList<Option>();
        title = "Alter List Content";
        options.add(new Option("Add a New Value to a List", new AddToListAction()));
        options.add(new Option("Delete a Position from the List", new DeleteIntegerFromListAction()));
        options.add(new Option("Show Content of a List", new ShowListAction()));
        options.add(Option.EXIT);

        super.InitializeMenu(title, options);

    }

    public static AlterListContentMenu getAlterListContentMenu() {
        return LSM;
    }
}
