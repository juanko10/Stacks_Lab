package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg;
		IOComponent io = IOComponent.getComponent();
		io.output("\nRemoving list of Integer values from the system:\n");
		String listName = io.getInput("\nEnter name of list: ");
		dm.removeList(listName);
	}

}
