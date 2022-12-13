

public class Main {
    public static void main(String[] args) {

        //Задача 3.

        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        for (int i = massive1.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(massive1[i] + ", ");
            } else {
                System.out.println(massive1[i]);
            }
        }


        double[] massive2 = {1.57, 7.654, 9.986,};
        for (int a = massive2.length - 1; a >= 0; a--) {
            if (a > 0) {
                System.out.print(massive2[a] + ", ");
            } else {
                System.out.println(massive2[a]);
                }
            }


            String[] massive3 = {"one", "two", "three"};
        for (int i = massive3.length-1; i >= 0 ; i--) {
            if (i > 0) {
                System.out.print(massive3[i] + ", ");
            } else {
                System.out.println(massive3[i]);
            }

        }

        // Задача 4.

        int[] massive4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i =0; i <= massive4.length - 1; i++) {
            if (i % 2 == 0) {
                i += 1;
                System.out.println(i);
            }
        }

    }
}