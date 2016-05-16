package hee.springPractice.FristIOC;

import java.util.Date;
import java.util.Random;

/**
 * 选择排序的思想其实和冒泡排序有点类似，都是在一次排序后把最小的元素放到最前面。但是过程不同，冒泡排序是通过相邻的比较和交换。
 * 而选择排序是通过对整体的选择。举个栗子，对5,3,8,6,4这个无序序列进行简单选择排序，首先要选择5以外的最小数来和5交换，
 * 也就是选择3和5交换，一次排序后就变成了3,5,8,6,4.对剩下的序列一次进行选择和交换，最终就会得到一个有序序列。
 * 其实选择排序可以看成冒泡排序的优化，因为其目的相同，只是选择排序只有在确定了最小数的前提下才进行交换，大大减少了交换的次数。
 * 选择排序的时间复杂度为O(n^2)
 * @author 华兴
 *
 */
public class SelectSort {
	private static long swapCounter = 0;
	public static void main(String[] args) {
		int[] arr = new int[100000];
		//生成数组,输出数组序列
		Random random = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=random.nextInt(100000);
			//System.out.print(arr[i]+",");
		}
		System.out.println();
		Date date = new Date();
		//调用排序算法
		selectSort(arr);
		Date date1 = new Date();
		//输出排序结构
		System.out.println("---------------------------------------- I am Split Line ----------------------------------------");
		/*for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}*/
		System.out.println();
		System.out.println(date1.getTime()-date.getTime());
		System.out.println(swapCounter);
	}
	public static void selectSort(int[] arr){
		if(arr==null||arr.length==0){
			return;
		}
		int minIdex = 0;
		for(int i=0;i<arr.length;i++){
			minIdex = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minIdex]){
					minIdex = j;
				}
			}
			if(minIdex!=i){
				swap(arr, i, minIdex);
			}
		}
	}
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		swapCounter ++;
	}
}
