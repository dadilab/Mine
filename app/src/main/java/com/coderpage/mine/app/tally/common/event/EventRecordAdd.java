package com.coderpage.mine.app.tally.common.event;

import com.coderpage.mine.app.tally.data.ExpenseItem;

/**
 * @author abner-l. 2017-03-19
 */
public class EventRecordAdd {
    private final ExpenseItem mExpenseItem;

    public EventRecordAdd(ExpenseItem expenseItem) {
        mExpenseItem = expenseItem;
    }

    public ExpenseItem getExpenseItem() {
        return mExpenseItem;
    }
}
