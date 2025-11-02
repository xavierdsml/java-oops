package arrayDS;

public class oneDArray {
    static void main() {
        // declare an array
        int array[] = {1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println();

        //iterate in the array
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();

        //for-each loop
        for(int arr:array){
            System.out.println(arr);
        }

        String cars[] = new String[]{"Volvo", "Maruti", "Haundai"};
        System.out.println(cars[0]);
    }

    static void mainn() {
        String fruits[] = {"apple", "mango", "banana", "pineapple"};
        System.out.println(fruits[0]);
    }


    public static void main(String[] args){
        mainn();
    }
}
