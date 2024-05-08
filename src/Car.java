public class Car {
    private  String CarId;
    private  String CarModel;
    private  String CarBrand;
    private  Double BasePricePerDay;
    private Boolean isAvailable;

    public Car(String CarId, String CarModel, String CarBrand,Double BasePricePerDay)
    {
        this.CarId=CarId;
        this.CarModel=CarModel;
        this.CarBrand=CarBrand;
        this.BasePricePerDay=BasePricePerDay;
        this.isAvailable=true;

    }
    public String getCarId()
    {
        return CarId;

    }
    public String getCarModel()
    {
        return CarModel;

    }
    public String getCarBrand()
    {
        return CarBrand;

    }
    public Double CalculatePrice(int noofdays)
    {
        return BasePricePerDay* noofdays;

    }
    public Boolean isAvailable()
    {
        return isAvailable;
    }
    public void rent()
    {
        isAvailable=false;
    }
    public void returnCar()
    {
        isAvailable=true;
    }



}
