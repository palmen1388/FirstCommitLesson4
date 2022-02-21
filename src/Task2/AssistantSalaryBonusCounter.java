package Task2;

public class AssistantSalaryBonusCounter extends SalaryBonusCounter {

    @Override
    public int countSalaryBonus(){
        super.salaryBonus = salaryFond/100*20;
        return salaryBonus;
    }
}
