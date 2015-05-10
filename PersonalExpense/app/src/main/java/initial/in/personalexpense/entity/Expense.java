package initial.in.personalexpense.entity;

/**
 * Created by pushpendra on 10/5/15.
 */
public class Expense extends Budget implements IBuget {
    private Category[] category;
    private Double expense;
    @Override
    public void addition(Double amount) {

    }

    @Override
    public void deduction(Double amount) {

    }
}
