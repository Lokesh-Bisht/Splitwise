package factory;

import models.Expense;
import models.User;

import java.util.List;

public class PercentageExpenseFactory implements ExpenseFactory {

    @Override
    public Expense createExpense(double totalAmount, List<User> participants) {
        return new PercentageExpense(totalAmount, participants);
    }
}
