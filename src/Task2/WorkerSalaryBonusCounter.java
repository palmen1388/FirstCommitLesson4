package Task2;

public class WorkerSalaryBonusCounter extends SalaryBonusCounter {

    @Override
    public int countSalaryBonus(){
        super.salaryBonus = salaryFond/100*10;
        return salaryBonus;
    }
}
