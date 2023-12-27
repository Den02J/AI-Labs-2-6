package Lab6;

public class Company {
    public int monthIncome;
    public int monthCost;
    public int  profit;
    public String levelOfBankruptcy = "Analysis needed";

    public Company(int monthIncome, int monthCost) {
        this.monthIncome = monthIncome;
        this.monthCost = monthCost;
    }

    public void analysis() {
        profit = ((monthIncome * 100) / monthCost) - 100;
        if (monthIncome <= monthCost * 2) {
            levelOfBankruptcy = "Cosmic";
        }
        if (monthIncome <= monthCost) {
            levelOfBankruptcy = "Very High";
        }
        if (monthIncome >= monthCost) {
            levelOfBankruptcy = "High";
        }
        if (monthIncome >= monthCost * 1.3) {
            levelOfBankruptcy = "Medium";
        }
        if (monthIncome >= monthCost * 1.7) {
            levelOfBankruptcy = "Low";
        }
        if (monthIncome >= monthCost * 2.5) {
            levelOfBankruptcy = "None";
        }
        System.out.println("Level of Bankruptcy: " + levelOfBankruptcy + " \nProfit (%): " + profit);
    }

    public int getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(int monthIncome) {
        this.monthIncome = monthIncome;
    }

    public int getMonthCost() {
        return monthCost;
    }

    public void setMonthCost(int monthCost) {
        this.monthCost = monthCost;
    }

}
