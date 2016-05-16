package hee.springPractice.FristIOC;

import java.util.Date;
import java.util.Random;
/**
 * 冒泡排序是最简单的排序之一了，其大体思想就是通过与相邻元素的比较和交换来把小的数交换到最前面。这个过程类似于水泡向上升一样，因此而得名。举个栗子，
 * 对5,3,8,6,4这个无序序列进行冒泡排序。首先从后向前冒泡，4和6比较，把4交换到前面，序列变成5,3,8,4,6。同理4和8交换，变成5,3,4,8,6,3和4无需交换。
 * 5和3交换，变成3,5,4,8,6,3.这样一次冒泡就完了，把最小的数3排到最前面了。对剩下的序列依次冒泡就会得到一个有序序列。
 * 冒泡排序的时间复杂度为O(n^2)。
 * 冒泡排序
 * 两个版本
 * @author 华兴
 *
 */
public class BubbleSort {
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
		bubleSort2_0(arr);
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
	/*  pay time   	swapCounter
	 *  0
		8
		270
		18974   	2507614912
	 */
	public static void bubleSort(int[] arr){
		if(arr==null || arr.length == 0 ){
			return;
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=arr.length-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					swap(arr,j-1,j);
				}
			}
		}
	}
	/*  pay time	swapCounter
	 *  0
		6
		176
		12075		611803750
	 */
	
	public static void bubleSort2_0(int[] arr){
		if(arr==null || arr.length == 0 ){
			return;
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=arr.length-1;j>i;j--){
				if(arr[j]<arr[i]){
					swap(arr,i,j);
				}
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
