package com.eable.lesson2;

public class Lssn2 {
    public static void main(String[] args) {
        work2();

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        //   и числа меньшие 6 умножить на 2;

        // 4. Создать квадратный двумерный целочисленный массив
        //   (количество строк и столбцов одинаковое)
        //   и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
        //   (без помощи интернета);

        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        //   метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        //   Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        //       checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

        // 7. **** Написать метод, которому на вход подается одномерный массив
        //   и число n (может быть положительным, или отрицательным),
        //   при этом метод должен сместить все элементы массива на n позиций.
        //   Элементы смещаются циклично.
        //   Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        //   Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
        //    при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        //   При каком n в какую сторону сдвиг можете выбирать сами.
    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    //   Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //   С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void work1(){
        int[] arr = {1,1,1,0,1,0,0,1};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                newArr[i] = 1;
            } else if (arr[1] == 1){
                newArr[i] = 0;
            }
        }
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }

    // 2. Задать пустой целочисленный массив размером 8.
    //   С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void work2(){
        int[] arr = new int[8];
        for (int i = 1, j = 0; i < arr.length; i++, j +=3) {
            arr[i] = j + 3;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
