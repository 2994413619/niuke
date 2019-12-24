package 牛客;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

/**
 * 
 * @author 喻超
 * @date 2019年9月12日 下午11:47:50
 * @Description ac:100%
 *
 */
public class A41和为S的连续正数序列 {

	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		int i = 1,temp;
		while(i < sum) {
			if(sum % i == 0) {//sum = i * temp
				temp = sum / i;
				
				if(temp < i / 2) {//跳出循环条件
					break;
				}
				
				//分情况讨论，四种情况
				if(i % 2 == 0 && temp % 2 == 0) {//1、i:偶数；temp:偶数；无法获得序列
					i++;
					continue;
				} else if(i % 2 == 0 && temp % 2 != 0) {//2、i:偶数；temp:奇数；序列长度为2*i
					int size = i * 2;
					if(temp < size) {//长度不够组成序列
						continue;
					}
					
					ArrayList<Integer> childList = new ArrayList<Integer>();
					
					for(int j = temp / 2 - i + 1; j <= temp / 2 - i + size; j++) {//生成序列
						childList.add(j);
					}
					
					list.add(childList);
					
				} else if(i % 2 != 0) {//3、i:奇数；temp:偶数/奇数；序列长度为i
					
					int size;
					ArrayList<Integer> childList = new ArrayList<Integer>();
					
					if(i == 1 && temp % 2 != 0) {
						size = 2;
						childList.add(temp / 2);
						childList.add(temp / 2 + 1);
						list.add(childList);
					} else if(i != 1) {
						size = i;
						for(int j = temp - size / 2; j <= temp + size / 2; j++) {
							childList.add(j);
						}
						list.add(childList);
					}
					
				}
				
			}
			
			i++;
			
		}
		
		//给list排序
		Collections.sort(list, new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				if(o1.get(0) < o2.get(0)) {
					return -1;
				}
				return 1;
			}
		});
		
		
		return list;
		
	}
	
	
	@Test
	public void test() {
		FindContinuousSequence(9);
	}

}
/**
题目描述
小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
输出描述:
输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
*/