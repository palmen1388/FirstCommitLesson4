package Task2;

public class UserPosition {
    private String userPosition;

    public Positions getUserPosition() {
        Positions[] positions = Positions.values();
        if (userPosition.equalsIgnoreCase("Рабочий")) {
            return Positions.WORKER;
        }
        if (userPosition.equalsIgnoreCase("Помощник")) {
            return Positions.ASSISTANT;
        }
        return Positions.DIRECTOR;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }
}
