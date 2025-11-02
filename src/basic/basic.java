package basic;

public class basic {
    public static void main(String[] args) {
        int age = 21;
        String name = "Tushar Gupta";
        System.out.println(name);

        double pie = 3.14;
        float pie2 = 3.14f;
        float pie3 = 3.144567898765434567898765f;
        System.out.println(pie);
        System.out.println(pie2);
        System.out.println(pie3);
    }

    public static class typeConversion {
        public static void main(String[] args) {

            //implicit type conversion
            int a = 1234;
            double b = a;
            System.out.println(b);

            //explicit type conversion
            long digit1 = 123;
            int digit2 = (int)digit1; //lossy conversion but we can explicit convered by aplling the (dataType)
            System.out.println(digit2);
        }
    }
}