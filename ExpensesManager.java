import java.util.ArrayList;

public class ExpensesManager {
    ArrayList<Double> expenses; // Замените массив списком

    ExpensesManager() {
        expenses = new ArrayList<>(); // Создайте список в конструкторе
    }


    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses.add(expense);

        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }



    void printAllExpenses() {

        for (Double exp: expenses){
            System.out.println("Потрачено " + exp + " рублей");
        }

        //for (int i = 0; i < expenses.size(); i++) {
        //    System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.size(i+1) + " рублей");
        //}
    }

    double findMaxExpense() {
        double maxExpense = 0;

        for (Double exp: expenses){
            if (exp > maxExpense) {
                maxExpense = exp;
                }
        }

        return maxExpense;
    }
}