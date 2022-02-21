package Task3;

import java.util.Scanner;

public class ChoosingItem {
    private MenuItems[] menuItems = MenuItems.values();
    private int userValue;

    public MenuItems getUserValue() {
        if (userValue == 1) {
            return MenuItems.NEWGAME;
        }
        if (userValue == 2) {
            return MenuItems.CONTINUE;
        }
        if (userValue == 3) {
            return MenuItems.SETTINGS;
        }
        if (userValue == 4) {
            return MenuItems.EXIT;
        }
        return MenuItems.EXIT;
    }

    public void setUserValue(int userValue) {
        this.userValue = userValue;
    }

    public void printMenu() {
        int i = 1;
        for (MenuItems menuItem : menuItems) {
            System.out.println(i + "." + menuItem.item);
            i++;
        }
    }

    public void actMenuItem() {
        this.printMenu();
        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;
        MenuItemsAction[] menuItemsActions = {new NewGameAction(), new ContinueAction(), new SettingsAction(), new ExitAction()};
        while (isActive == true) {
            this.setUserValue(scanner.nextInt());
            this.printMenu();
            for (int i = 0; i > -1; i++) {
                if (this.getUserValue().ordinal() == i) {
                    menuItemsActions[i].actItem();
                }
                else if (this.getUserValue().ordinal() == 4){
                    isActive = false;
                }
            }
        }
    }
}
