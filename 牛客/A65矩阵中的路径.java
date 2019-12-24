package 牛客;

import org.junit.Test;

/**
 * 
 * @author 喻超
 * @date 2019年12月12日 下午10:56:16
 * @Description ac:100% 
 *
 */
public class A65矩阵中的路径 {
	
	//存放矩阵
	private Character[][] myMartrix;
	
	//存放字符串
	private char[] myString;
	
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		
		//将字符保存到成员变量
		myString = str;
		
		Character[][] myMartrix2 = new Character[rows][cols];
		
		//生成矩阵
		int index = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				myMartrix2[i][j] = matrix[index++];
			}
		}
		myMartrix = myMartrix2;
		
		//遍历矩阵，找到入口
			//找到路径，返回true
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(myMartrix[i][j] == str[0] && recursive(i, j, 0)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * 
	 * @Description 递归找路径,跳出递归的条件：1、上下左右都走不通;2、找到路径，结束递归
	 * @date 2019年12月12日 下午10:17:05
	 * @param i:当前矩阵位置行数
	 * @param j:当前矩阵位置列数
	 * @param index:当前匹配到str的下标
	 * @return true表示已经找到路径,false表示继续递归
	 */
	private boolean recursive(int i, int j, int index) {
		
		//1找到路径，返回true;
		if(index + 1 == myString.length) {
			return true;
		}
		
		//2找路径ing
		//2.1把矩阵当前位置标位null,表示已经不能再通过了
		char temp = myMartrix[i][j];
		myMartrix[i][j] = null;
		
		//2.2.1向上
		if(i - 1 >= 0 && myMartrix[i - 1][j] != null && myMartrix[i - 1][j] == myString[index + 1]) {
			if(recursive(i - 1, j, index + 1)) {
				return true;
			}
		}
		
		//2.2.2向下
		if(i + 1 < myMartrix.length && myMartrix[i + 1][j] != null && myMartrix[i + 1][j] == myString[index + 1]) {
			if(recursive(i + 1, j, index + 1)) {
				return true;
			}
		}
		
		//2.2.3向左
		if(j - 1 >= 0 && myMartrix[i][j - 1] != null && myMartrix[i][j - 1] == myString[index + 1]) {
			if(recursive(i, j - 1, index + 1)) {
				return true;
			}
		}
		
		//2.2.4向右
		if(j + 1 < myMartrix[0].length && myMartrix[i][j + 1] != null && myMartrix[i][j + 1] == myString[index + 1]) {
			if(recursive(i, j + 1, index + 1)) {
				return true;
			}
		}
		
		//2.3把当前位置从null恢复
		myMartrix[i][j] = temp;
		
		//3表示上下左右皆不可通行
		return false;
		
	}
	
	@Test
	public void test() {
		//"ABCESFCSADEE",3,4,"ABCCED"
		char[] matrix = {'A','B','C','E','S','F','C','S','A','D','E','E'};
		char[] str = {'A','B','C','C','E','D'};
		System.out.println(hasPath(matrix, 3, 4, str));;
	}

}
/**
题目描述
请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。 
例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bcced"的路径，
但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 a b c e 
 s f c s 
 a d e e
*/