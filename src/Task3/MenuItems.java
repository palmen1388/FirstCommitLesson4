package Task3;

public enum MenuItems {

    NEWGAME("Новая игра"),
    CONTINUE("Продолжить"),
    SETTINGS("Настройки"),
    EXIT("Выход");


    protected String item;

    MenuItems(String item) {
        this.item = item;
    }
}
