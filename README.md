# JavaOrderMethod
Java排序算法（冒泡排序、选择排序、插入排序）

冒泡排序（交换排序）
     * <p>
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     
选择排序
     * <p>
     * 第一趟比较：程序将记录定位在数组的第一个位置，拿第一个数据与后面的每个数据对比，
     * 用一个变量mix记录比第一个数小的数据的索引，通过比较不断更新mix，最后得到整个数组中最小的元素的索引，
     * 将第一个数与第mix个数交换，则最小数位于数组的其实位置了，
     * <p>
     * 第二趟比较：程序将记录定位在数组的第二个位置，拿第二个数据与后面的每个数据对比，
     * 得到从第二个数据开始，数组中最小的数，并与第二个数交换位置。
     * <p>
     * 一共进行n-1次比较，每次都会在剩下的无序数组中选择出一个最小的数。
     
     
插入排序
     * <p>
     * 每次从无序表中取出第一个元素，把它插入到有序表的合适位置，使有序表仍然有序。
     * 第一趟比较前两个数，然后把第二个数按大小插入到有序表中； 第二趟把第三个数据与前两个数从前向后扫描，把第三个数按大小插入到有序表中；
     * 依次进行下去，进行了(n-1)趟扫描以后就完成了整个排序过程。
     * <p>
     * 直接插入排序是由两层嵌套循环组成的。外层循环标识并决定待比较的数值。内层循环为待比较数值确定其最终位置。直接插入排序是将待比较的数
     * 值与它的前一个数值进行比较，所以外层循环是从第二个数值开始的。当前一数值比待比较数值大的情况下继续循环比较，直到找到比待比较数值小
     * 的并将待比较数值置入其后一位置，结束该次循环。
