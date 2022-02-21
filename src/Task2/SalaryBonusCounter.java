package Task2;

import java.util.Scanner;

public class SalaryBonusCounter {

    protected int salaryBonus = 0;
    protected int salaryFond = 1000000;

    public int getSalaryFond() {
        return salaryFond;
    }

    public int getSalaryBonus() {
        return salaryBonus;
    }

    public int countSalaryBonus(){
        return salaryBonus;
    }

    public int countBonus(){
        Scanner scanner = new Scanner(System.in);
        UserPosition userPosition = new UserPosition();
        userPosition.setUserPosition(scanner.nextLine());
        Positions[] positions = Positions.values();
        SalaryBonusCounter[] salaryBonusCounter = {new WorkerSalaryBonusCounter(),new AssistantSalaryBonusCounter(),new DirectorSalaryBonusCounter()};
        for (int i = 0; i < salaryBonusCounter.length;i++){
            if (i == userPosition.getUserPosition().ordinal()){
                return salaryBonusCounter[i].countSalaryBonus();
            }
        }
        return 0;
    }
}
