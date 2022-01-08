package AggregationFile;

public class Test {
    public static void main(String args[]){
        Ink InkObject = new Ink();
        InkObject.setCompanyInk("Dollar");
        InkObject.setColor("Blue");
        InkObject.setPrice(30);

        Ink InkObject2 = new Ink();
        InkObject2.setCompanyInk("Dollar");
        InkObject2.setColor("Red");
        InkObject2.setPrice(20);


        Pen PenObject = new Pen();
        PenObject.setCompany("Signature");
        PenObject.setName("Dollar");
        PenObject.setPrice(50);
        PenObject.setInk(InkObject);

        Pen PenObject1 = new Pen();
        PenObject1.setCompany("Signature");
        PenObject1.setName("Dollar 2");
        PenObject1.setPrice(100);
        PenObject1.setInk(InkObject2);

        System.out.println("Company :"+PenObject.getCompany());
        System.out.println("Name :"+PenObject.getName());
        System.out.println("Pen Price :"+PenObject.getPrice());
        System.out.println("Color of ink :"+PenObject.getInk().getInkColor());
        System.out.println("Company :"+PenObject.getInk().getCompanyInk());
        System.out.println("Price of ink :"+PenObject.getInk().getPrice());
            // 2nd pen
        System.out.println("------------------------");
        System.out.println("\t 2nd Pen ");
        System.out.println("------------------------");
        System.out.println("Company :"+PenObject1.getCompany());
        System.out.println("Name :"+PenObject1.getName());
        System.out.println("Pen Price :"+PenObject1.getPrice());
        System.out.println("Color of ink :"+PenObject1.getInk().getInkColor());
        System.out.println("Company :"+PenObject1.getInk().getCompanyInk());
        System.out.println("Price of ink :"+PenObject1.getInk().getPrice());

    }
}
