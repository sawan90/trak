package initial.in.personalexpense.entity;

/**
 * Created by pushpendra on 10/5/15.
 */
public class Income extends Budget implements IBuget {
    private Category[] category;
    private Double income;

    @Override
    public void addition(Double amount) {

    }

    @Override
    public void deduction(Double amount) {

    }
}
