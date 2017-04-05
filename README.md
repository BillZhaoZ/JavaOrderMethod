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
     * 第一趟比较前两个数，然后把第二个数按大小插入到有序表中； 第二趟把第三个数据与前两个数从前向后扫描，
       把第三个数按大小插入到有序表中；
     * 依次进行下去，进行了(n-1)趟扫描以后就完成了整个排序过程。
     * <p>
     * 直接插入排序是由两层嵌套循环组成的。外层循环标识并决定待比较的数值。内层循环为待比较数值确定其最终位置。直接插入排序是将待比较的数
     * 值与它的前一个数值进行比较，所以外层循环是从第二个数值开始的。当前一数值比待比较数值大的情况下继续循环比较，直到找到比待比较数值小
     * 的并将待比较数值置入其后一位置，结束该次循环。


快速排序（冒泡排序的改进型）
     * <p>
     * 1）选择一个基准元素,通常选择第一个元素或者最后一个元素,
     * 2）通过一趟排序讲待排序的记录分割成独立的两部分，其中一部分记录的元素值均比基准元素值小。另一部分记录的 元素值比基准值大。
     * 3）此时基准元素在其排好序后的正确位置
     * 4）然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序。

二分查找
          * <p>
          * 折半查找的算法思想是将数列按有序化(递增或递减)排列，查找过程中采用跳跃式方式查找，即先以有序数列的中点位置为比较对象，
          * 如果要找的元素值小 于该中点元素，则将待查序列缩小为左半部分，否则为右半部分。通过一次比较，将查找区间缩小一半。
          * 折半查找是一种高效的查找方法。它可以明显减少比较次数，提高查找效率。但是，折半查找的先决条件是查找表中的数据元素必须有序。
          * <p>
          * 折半查找法的优点是比较次数少，查找速度快，平均性能好;其缺点是要求待查表为有序表，且插入删除困难。
          * 因此，折半查找方法适用于不经常变动而查找频繁的有序列表。
          * <p>

   二分算法步骤描述:
          * ① 首先确定整个查找区间的中间位置 mid = （ left + right ）/ 2
          * ② 用待查关键字值与中间位置的关键字值进行比较；
          * 若相等，则查找成功
          * 若大于，则在后（右）半个区域继续进行折半查找
          * 若小于，则在前（左）半个区域继续进行折半查找
          * ③ 对确定的缩小区域再按折半公式，重复上述步骤。
          * 最后，得到结果：要么查找成功， 要么查找失败。折半查找的存储结构采用一维数组存放。 折半查找算法举例
          * 对给定数列（有序）{ 3,5,11,17,21,23,28,30,32,50,64,78,81,95,101}，按折半查找算法，查找关键字值为81的数据元素。
          *
          * @param srcArray

 归并排序
      * <p>
      * 归并排序是建立在归并操作上的一种有效的排序算法,该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
      * 将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为二路归并。
      * 归并过程为：比较a[i]和a[j]的大小，若a[i]≤a[j]，则将第一个有序表中的元素a[i]复制到r[k]中，并令i和k分别加上1；
      * 否则将第二个有序表中的元素a[j]复制到r[k]中，并令j和k分别加上1，如此循环下去，直到其中一个有序表取完，
      * 然后再将另一个有序表中剩余的元素复制到r中从下标k到下标t的单元。归并排序的算法我们通常用递归实现，先把待排序区间[s,t]以中点二分，
      * 接着把左边子区间排序，再把右边子区间排序，最后把左区间和右区间用一次归并操作合并成有序的区间[s,t]。