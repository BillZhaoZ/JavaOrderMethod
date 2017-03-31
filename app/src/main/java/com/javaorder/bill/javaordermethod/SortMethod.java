package com.javaorder.bill.javaordermethod;

/**
 * 排序算法
 * Created by Bill on 2017/3/31.
 */
public class SortMethod {

    /**
     * 冒泡排序（交换排序）
     * <p>
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */
    public int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    // 交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    /**
     * 选择排序
     * <p>
     * 第一趟比较：程序将记录定位在数组的第一个位置，拿第一个数据与后面的每个数据对比，
     * 用一个变量mix记录比第一个数小的数据的索引，通过比较不断更新mix，最后得到整个数组中最小的元素的索引，
     * 将第一个数与第mix个数交换，则最小数位于数组的其实位置了，
     * <p>
     * 第二趟比较：程序将记录定位在数组的第二个位置，拿第二个数据与后面的每个数据对比，
     * 得到从第二个数据开始，数组中最小的数，并与第二个数交换位置。
     * <p>
     * 一共进行n-1次比较，每次都会在剩下的无序数组中选择出一个最小的数。
     *
     * @param array
     * @return
     */
    public int[] chooseSort(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            //mix用来保存数组中最小元素的索引值
            int mix = i; //选择当前的数组元素作为最小值，遍历到最后，找到最小的数组元素的索引，和当前位置交换

            for (int j = i + 1; j < arrayLength; j++) {
                if (array[j] < array[mix]) {
                    mix = j;
                }
            }

            //每趟最多交换一次
            if (mix != i) {
                //如果mix不等于当前的i,让最小值的和当前位置的值交换
                int temp = array[mix];
                array[mix] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }


    /**
     * 插入排序
     * <p>
     * 每次从无序表中取出第一个元素，把它插入到有序表的合适位置，使有序表仍然有序。
     * 第一趟比较前两个数，然后把第二个数按大小插入到有序表中； 第二趟把第三个数据与前两个数从前向后扫描，把第三个数按大小插入到有序表中；
     * 依次进行下去，进行了(n-1)趟扫描以后就完成了整个排序过程。
     * <p>
     * 直接插入排序是由两层嵌套循环组成的。外层循环标识并决定待比较的数值。内层循环为待比较数值确定其最终位置。直接插入排序是将待比较的数
     * 值与它的前一个数值进行比较，所以外层循环是从第二个数值开始的。当前一数值比待比较数值大的情况下继续循环比较，直到找到比待比较数值小
     * 的并将待比较数值置入其后一位置，结束该次循环。
     *
     * @param array
     * @return
     */
    public int[] insertSort(int[] array) {

        int length = array.length; //数组长度
        int j;               //当前值的位置
        int i;               //指向j前的位置
        int key;             //当前要进行插入排序的值

        //从数组的第二个位置开始遍历值
        for (j = 1; j < length; j++) {

            key = array[j];
            i = j - 1;

            //a[i]比当前值大时，a[i]后移一位,空出i的位置，好让下一次循环的值后移
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i]; //将a[i]值后移
                i--;         //i前移
            }

            //跳出循环(找到要插入的中间位置或已遍历到0下标)
            array[i + 1] = key;    //将当前值插入
        }
        return array;
    }

    /**
     * 二分查找
     *
     * @param array
     * @return
     */
    public int[] halfSort(int[] array) {


        return array;
    }
}
