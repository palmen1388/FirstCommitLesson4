package Task2;

public class DirectorSalaryBonusCounter extends SalaryBonusCounter {

    @Override
    public int countSalaryBonus(){
        super.salaryBonus = salaryFond/100*50;
        return salaryBonus;
    }
}
