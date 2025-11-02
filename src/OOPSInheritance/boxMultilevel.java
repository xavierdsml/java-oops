package OOPSInheritance;

public class boxMultilevel extends boxExtends{
    int boxPrice;
    String boxColor;

    public static void main(String[] args) {
        boxMultilevel obj = new boxMultilevel();
        obj.information();
        obj.information("boxMultilevel class");

        boxMultilevel obj2 = new boxMultilevel(4,5,6,7,100,"black");
        obj2.print();
    }



    boxMultilevel(){
        this.boxPrice=-1;
        this.boxColor="No colour";
    }

    boxMultilevel(int length, int width, int height, int w, int price, String boxColor) {
        super(length, width, height, w);
        this.boxPrice = price;
        this.boxColor = boxColor;
    }

    void information(String className){
        System.out.println("There is a OVERRIDING of the parent class in to the "+className);
    }

    void print(){
        System.out.println("length = "+this.length+
                ",\nwidth = "+this.width+
                ",\nheight = "+this.height+
                ",\nw = "+this.w+
                ",\nprice = "+this.boxPrice+
                ",\ncolour = "+this.boxColor);
    }

}
