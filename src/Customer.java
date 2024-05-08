public class Customer {
    private  String CusId;
    private  String CusName;

    public Customer( String CusId, String CusName)
    {
        this.CusId=CusId;
        this.CusName=CusName;
    }
    public String getCusId()
    {
        return CusId;
    }
    public String getCusName()
    {
        return CusName;
    }

}
