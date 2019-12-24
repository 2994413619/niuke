package 牛客;

import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * @author 喻超
 * @date 2019年10月23日 下午11:44:11
 * @Description ac:100%
 *
 */
public class A45扑克牌顺子 {

	public boolean isContinuous(int [] numbers) {
		
		//牌没有5张
		if(numbers.length < 5) {
			return false;
		}
		
		Arrays.sort(numbers);
		int count = 0;//记录大王小王的张数
		for(int i = 0; i < numbers.length - 1; i++) {
			if(numbers[i] == 0) {//牌是大小王
				count++;
			} else {//牌不是大小王
				if(numbers[i] + 1 != numbers[i + 1]) {//第i张和第i+1两张牌不连续
					
					//如果存在对子
					if(numbers[i]== numbers[i + 1]) {
						return false;
					}
					
					if(count > 0) {//存在大小王
						numbers[0] = numbers[i] + 1;//把大小王变为数字
						Arrays.sort(numbers);//重新排序
						i--;
						count--;
					} else {
						return false;
					}
					
				}
			}
		}
		return true;
    }
	
	@Test
	public void test() {
		int[] array = {1,0,0,5,0};
		System.out.println(isContinuous(array));
	}
}
/**
题目描述
LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...他随机从中抽出了5张牌,想测测自己的手气,
看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,
他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),
“So Lucky!”。LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何， 如果牌能组成顺子就输出true，
否则就输出false。为了方便起见,你可以认为大小王是0。
*/