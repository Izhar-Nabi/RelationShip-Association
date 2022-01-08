package AssociationFile;

public class Ink {
    private String InkColor;
    private String CompanyInk;
    private int price;

    public String getCompanyInk(){
        return CompanyInk;
    }
    public void setCompanyInk(String CompanyInk){
        this.CompanyInk=CompanyInk;
    }
    public String getInkColor(){
        return InkColor;
    }
    public void setColor(String Color){
        this.InkColor=Color;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
