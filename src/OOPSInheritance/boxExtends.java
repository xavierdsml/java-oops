package OOPSInheritance;

public class boxExtends extends box {
    int w;
    public static void main(String[] args){

        boxExtends obj = new boxExtends();
        obj.information();
        System.out.println(obj.w);


        boxExtends obj2 = new boxExtends(4,5,6,7);
        System.out.println("length = "+obj2.length+
                ",\nwidth = "+obj2.width+
                ",\nheight = "+obj2.height+
                ",\nw = "+obj2.w);

        int perimeterOFBox = obj2.setPerimeterOFBox(2,3,4);
        System.out.println("perimeter = "+perimeterOFBox);
    }



    //constructor
    public boxExtends(){
        w = -1;
    }

    public boxExtends(int length, int width, int height, int w){
        super(length, width, height); // call parent constructor which have 3 property
        this.w = w;
    }

    //behaviour
    int setPerimeterOFBox(int length, int width, int height){
        return 4*(super.length + super.height + super.width);
    }
}
