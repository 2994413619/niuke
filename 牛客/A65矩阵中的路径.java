package ţ��;

import org.junit.Test;

/**
 * 
 * @author ����
 * @date 2019��12��12�� ����10:56:16
 * @Description ac:100% 
 *
 */
public class A65�����е�·�� {
	
	//��ž���
	private Character[][] myMartrix;
	
	//����ַ���
	private char[] myString;
	
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		
		//���ַ����浽��Ա����
		myString = str;
		
		Character[][] myMartrix2 = new Character[rows][cols];
		
		//���ɾ���
		int index = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				myMartrix2[i][j] = matrix[index++];
			}
		}
		myMartrix = myMartrix2;
		
		//���������ҵ����
			//�ҵ�·��������true
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
	 * @Description �ݹ���·��,�����ݹ��������1���������Ҷ��߲�ͨ;2���ҵ�·���������ݹ�
	 * @date 2019��12��12�� ����10:17:05
	 * @param i:��ǰ����λ������
	 * @param j:��ǰ����λ������
	 * @param index:��ǰƥ�䵽str���±�
	 * @return true��ʾ�Ѿ��ҵ�·��,false��ʾ�����ݹ�
	 */
	private boolean recursive(int i, int j, int index) {
		
		//1�ҵ�·��������true;
		if(index + 1 == myString.length) {
			return true;
		}
		
		//2��·��ing
		//2.1�Ѿ���ǰλ�ñ�λnull,��ʾ�Ѿ�������ͨ����
		char temp = myMartrix[i][j];
		myMartrix[i][j] = null;
		
		//2.2.1����
		if(i - 1 >= 0 && myMartrix[i - 1][j] != null && myMartrix[i - 1][j] == myString[index + 1]) {
			if(recursive(i - 1, j, index + 1)) {
				return true;
			}
		}
		
		//2.2.2����
		if(i + 1 < myMartrix.length && myMartrix[i + 1][j] != null && myMartrix[i + 1][j] == myString[index + 1]) {
			if(recursive(i + 1, j, index + 1)) {
				return true;
			}
		}
		
		//2.2.3����
		if(j - 1 >= 0 && myMartrix[i][j - 1] != null && myMartrix[i][j - 1] == myString[index + 1]) {
			if(recursive(i, j - 1, index + 1)) {
				return true;
			}
		}
		
		//2.2.4����
		if(j + 1 < myMartrix[0].length && myMartrix[i][j + 1] != null && myMartrix[i][j + 1] == myString[index + 1]) {
			if(recursive(i, j + 1, index + 1)) {
				return true;
			}
		}
		
		//2.3�ѵ�ǰλ�ô�null�ָ�
		myMartrix[i][j] = temp;
		
		//3��ʾ�������ҽԲ���ͨ��
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
��Ŀ����
�����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ�
���һ��·�������˾����е�ĳһ�����ӣ����·�������ٽ���ø��ӡ� 
���� a b c e s f c s a d e e �����а���һ���ַ���"bcced"��·����
���Ǿ����в�����"abcb"·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
 a b c e 
 s f c s 
 a d e e
*/