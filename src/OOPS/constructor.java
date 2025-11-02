package OOPS;

public class constructor {
    static void main() {
        Complex obj1 = new Complex();
        obj1.print();
        obj1.print(10,20);

        //constructor calling
        Complex obj2 = new Complex(5,10);
        obj2.print();

    }
}



class Complex{
    int a, b;

    // constructor creation
    public Complex(){
        a = 1;
        b = 1;
    }

    public Complex(int a, int b){
        this.a = a;
        this.b = b;
    }


    //behaviour or function or properties
    void print(){
        System.out.println(a+" + "+b+"i");
    }

    void print(int a, int b){
        System.out.println(a+" + "+b+"i");
    }
}