package hee.springPractice.FristIOC;

import java.util.Date;
import java.util.Random;

/**
 * 插入排序不是通过交换位置而是通过比较找到合适的位置插入元素来达到排序的目的的。相信大家都有过打扑克牌的经历，特别是牌数较大的。在分牌时可能要整理自己的牌，
 * 牌多的时候怎么整理呢？就是拿到一张牌，找到一个合适的位置插入。这个原理其实和插入排序是一样的。举个栗子，对5,3,8,6,4这个无序序列进行简单插入排序，
 * 首先假设第一个数的位置时正确的，想一下在拿到第一张牌的时候，没必要整理。然后3要插到5前面，把5后移一位，变成3,5,8,6,4.想一下整理牌的时候应该也是这样吧。
 * 然后8不用动，6插在8前面，8后移一位，4插在5前面，从5开始都向后移一位。注意在插入一个数的时候要保证这个数前面的数已经有序。
 * 简单插入排序的时间复杂度也是O(n^2)。
 * @author 华兴
 *
 */
public class InsertSort {
	private static long swapCounter = 0;
	public static void main(String[] args) {
		int[] arr = new int[100];
		//生成数组,输出数组序列
		Random random = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=random.nextInt(100);
			System.out.print(arr[i]+",");
		}
		System.out.println();
		Date date = new Date();
		//调用排序算法
		insertSort2_0(arr);
		Date date1 = new Date();
		//输出排序结构
		System.out.println("---------------------------------------- I am Split Line ----------------------------------------");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println(date1.getTime()-date.getTime());
		System.out.println(swapCounter);
	}
	public static void insertSort(int[] arr){
		if(arr == null || arr.length ==0){
			return;
		}
		for(int i = 1;i<arr.length;i++){
			int j = i;
			int target = arr[i];
			while(j>0 && target <arr[j-1]){
				arr[j] = arr[j-1];
				j--;
				swapCounter ++;
			}
			arr[i]=target;
		}
	}
	public static void insertSort2_0(int[] arr){
		if(arr == null || arr.length ==0){
			return;
		}
		for(int i=1;i<arr.length;i++){
			int target = arr[i];
			if(i>1){
				for(int j=i;j>0;j--){
					if(target<arr[j-1]){
						arr[j] = arr[j-1];
						arr[j-1] = target;
					}else{
						arr[j] = target;
					}
				}
			}
		}
	}
}
