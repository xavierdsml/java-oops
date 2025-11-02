package OOPSInheritance;

public class box {
   int length, width, height;

   public box(){
       length=width=height=-1;
   }

   public box(int length, int width, int height){
       this.length=length;
       this.width=width;
       this.height=height;
   }

   void information(){
       System.out.println("Welcome, To the PARENT Class constructor");
   }
}
