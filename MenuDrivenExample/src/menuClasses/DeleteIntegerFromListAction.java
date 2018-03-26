package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteIntegerFromListAction implements Action{

    @Override
    public void execute(Object arg) {
        IOComponent io = IOComponent.getComponent();
        DMComponent dm = (DMComponent) arg;
        String name = io.getInput("Enter the name of the list to remove ");
        int value = Integer.parseInt(io.getInput("Enter the value to remove: "));
        dm.removeElementFromList(name, value);
    }
}
