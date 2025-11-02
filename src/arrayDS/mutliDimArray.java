package arrayDS;

public class mutliDimArray {
    static void main() {
        int number[][] = new int[][]{{1,2,3,4},{6,7,8,9}};

        System.out.println("Using the for-each loop");
        for(int[] rows : number){
            for(int cols : rows){
                System.out.println(cols);
            }
        }

        System.out.println("using the for loop");
        for(int row = 0; row< number.length; row++){
            for(int cols=0; cols<number[row].length; cols++){
                System.out.println(number[row][cols]);
            }
        }
    }
}
