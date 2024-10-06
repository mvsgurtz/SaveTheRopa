package theSaveTheRopa.domain;

public class Tshirt extends  Clothing{
    public Tshirt(String brand, String model) {
        super(brand, model);
    }



    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

}
