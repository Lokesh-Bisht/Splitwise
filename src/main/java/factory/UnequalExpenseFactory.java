package factory;

import models.Expense;
import models.User;

import java.util.List;

public class UnequalExpenseFactory implements ExpenseFactory {

    @Override
    public Expense createExpense(double totalAmount, List<User> participants) {
        return new UnequalExpense(totalAmount, participants);
    }
}
