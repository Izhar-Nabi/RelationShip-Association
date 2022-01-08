package AssociationFile;

public class Pen {
   private String Name;
   private int Price;
   private String Company;
   private Ink ink;
   public String getName(){
      return Name;
   }
   public void setName(String Name){
      this.Name=Name;
   }
   public String getCompany(){
      return Company;
   }
   public void setCompany(String CompanyName){
      Company=CompanyName;
   }
   public int getPrice(){
      return Price;
   }
   public void setPrice(int price){
      Price=price;
   }

   public Ink getInk() {
      return ink;
   }

   public void setInk(Ink ink) {
      this.ink = ink;
   }
}
