package factory;

import models.Expense;
import models.User;

import java.util.List;

public interface ExpenseFactory {

    Expense createExpense(double totalAmount, List<User> participants);
}
