public class Rental  {
    private Car car;
    private Customer cus;
    private int days;

    public Rental(Car car, Customer cus, int days)
    {
        this.car=car;
        this.cus=cus;
        this.days=days;
    }
    public Car getCar()
    {
        return car;
    }
    public Customer getCustomer()
    {
        return cus;
    }
    public int getDays()
    {
        return days;
    }
}
