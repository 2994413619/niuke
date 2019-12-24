package 牛客;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

/**
 * 
 * @author 喻超
 * @date 2019年9月7日 下午3:14:25
 * @Description ac:100%
 * 思路：全排列
 */
public class A27字符串的排列 {

	private ArrayList<String> list = new ArrayList<String>();

	public ArrayList<String> Permutation(String str) {
		char[] array = str.toCharArray();
		
		//按字典序给字符数组排序(冒泡)
		char temp;
		for(int i = array.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
			
		}

		fullSort(array, 0);
		
		//把结果集按字典序排序
		Collections.sort(list);
		return list;
	}

	// 全排列
	public void fullSort(char[] array, int now) {
		if(now == array.length - 1) {
			String string = String.valueOf(array);
			if(!list.contains(string)) {
				list.add(string);
			}
		} else {
			char temp;
			for(int i = now; i < array.length; i++) {
				
				//交换
				temp = array[i];
				array[i] = array[now];
				array[now] = temp;
				
				fullSort(array, now + 1);
				
				//交换
				temp = array[i];
				array[i] = array[now];
				array[now] = temp;
			}
		}
	}
	
	//测试排序是否成功
	@Test
	public void test() {
		ArrayList<String> permutation = Permutation("aa");
		System.out.println(permutation);
	}

}
/**
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述: 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */