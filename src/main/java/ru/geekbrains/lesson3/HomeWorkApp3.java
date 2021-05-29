package ru.geekbrains.lesson3;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        //1
        int[] num = new int[]{0, 1, 1, 1, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                num[i] = 1;
            } else {
                num[i] = 0;
            }
            System.out.print(num[i]);
        }
        System.out.println();
        //2
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //3
        int[] myArr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < 6) {
                myArr[i] *= 6;
            }
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        //4
        int[][] squareArray = new int[9][9];
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray.length; j++) {
                if (i == j || i + j + 1 == squareArray.length) {
                    squareArray[i][j] = 1;
                }
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //5
        int [] inArr = returningAOneDimensionalArray(5,1);
        for(int i=0;i<inArr.length;i++){
            System.out.print(inArr[i]+" ");
        }
        //6
        int[] arrSix = new int[]{12, 15, -2, 45, -70, 18};
        int max = arrSix[0];
        int min = arrSix[0];
        for (int i = 0; i < arrSix.length; i++) {
            if (arrSix[i] > max) {
                max = arrSix[i];
            }
            if (arrSix[i] < min) {
                min = arrSix[i];
            }
            System.out.println("max=" + max + "  " + "min=" + min); //проверка работы
        }
        System.out.println();
        System.out.println(summArr());
        //8
        System.out.println();
        int [] intArray8 = offsetOfArrayElements(-6);
        for (int i=0; i<intArray8.length;i++){
            System.out.println(intArray8[i]);
        }
    }

    //5
    public static int[] returningAOneDimensionalArray(int len, int initialValue) {
        int ar[] = new int[len];
        for (int i = 0; i < len; i++) {
            ar[i] = initialValue;
        }
        return ar;
    }

    //7
    public static boolean summArr() {
        int sum, sum1;
        sum = 0;
        sum1 = 0;
        int[] arr7 = new int[]{1, 15, 10, -10, 5, 20};
        for (int i = 0; i < arr7.length; i++) {
            sum += arr7[i];
        }
        for (int i = 0; i < arr7.length - 1; i++) {
            sum1 += arr7[i];
            System.out.println(sum1);
            if (sum1 == sum - sum1) {
                return true;
            }
        }
        return false;
    }

    //8
    public static int[] offsetOfArrayElements(int n) {
        int[] arr8 = new int[]{1, 2, 3, 4, 5};
        int a;
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                a = arr8[arr8.length - 1];
                for (int i = arr8.length - 2; i >-1; i--) {
                    //System.out.print(i);
                    arr8[i+1] = arr8[i];
                }
                arr8[0] = a;
            }
        }
         else{
                for (int j = 0; j< Math.abs(n); j++) {
                    a = arr8[0];
                    for (int i = 1; i <arr8.length; i++) {
                        arr8[i - 1]=arr8[i];
                    }
                    arr8[arr8.length - 1] = a;
                }
         }
        return arr8;
    }
}
