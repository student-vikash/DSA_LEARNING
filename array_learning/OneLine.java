package array_learning;

public class OneLine {
    public static void main(String[] args) {
        int [][][] x={{{2,3,4,4},{4,2,3,6},{5,3,2,3}},{{2,9,2,4},{1,5,2,6},{6,3,23,6}}};
        System.out.println(x[0][0][0]);  // 2
        System.out.println(x[0][0][1]);  // 3
        System.out.println(x[0][0][2]);  // 4
        System.out.println(x[0][0][3]);  // 4
        System.out.println();

        System.out.println(x[0][1][0]); // 4
        System.out.println(x[0][1][1]);  // 2
        System.out.println(x[0][1][2]);  // 3
        System.out.println(x[0][1][3]);  // 6
        System.out.println();

        System.out.println(x[0][2][0]); // 5
        System.out.println(x[0][2][1]);   // 3
        System.out.println(x[0][2][2]);   // 2
        System.out.println(x[0][2][3]);  // 3
        System.out.println();

        System.out.println(x[1][0][0]);  // 2
        System.out.println(x[1][0][1]); // 9
        System.out.println(x[1][0][2]);  // 2
        System.out.println(x[1][0][3]);  // 3
        System.out.println();

        System.out.println(x[1][1][0]);  // 1
        System.out.println(x[1][1][1]);  // 5
        System.out.println(x[1][1][2]); // 2
        System.out.println(x[1][1][3]);  // 6
        System.out.println();

        System.out.println(x[1][2][0]);  // 6
        System.out.println(x[1][2][1]); // 3
        System.out.println(x[1][2][2]); // 23
        System.out.println(x[1][2][3]);  // 6
        System.out.println();
     }
}