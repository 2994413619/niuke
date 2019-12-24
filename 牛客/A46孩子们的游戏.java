package ţ��;

/**
 * 
 * @author ����
 * @date 2019��10��24�� ����10:17:15
 * @Description ac:100%
 *
 */
public class A46�����ǵ���Ϸ {

	public int LastRemaining_Solution(int n, int m) {
		if(n <= 0) {
            return -1;
        }
         
        //��С��������һ������
        Node head = new Node();
        head.setValue(0);
        Node thisNode = head;
        for(int i = 1; i < n; i++) {
            //�����½ڵ�
            Node node = new Node();
            node.setValue(i);
             
            //��һ���ڵ�ָ��ǰ�ڵ�
            thisNode.next = node;
             
            //��ǰ�ڵ�ָ����һ���ڵ�
            node.pre = thisNode;
             
            //ָ������ƶ�
            thisNode = node;
        }
         
        //����ͷβ����
        thisNode.next = head;
        head.pre = thisNode;
         
        //С��������Ϊһ��ʱ������
        Node node = head.pre;
        while(n != 1) {
             
            //ѭ���ҵ�Ҫɾ����Ԫ��
            for(int i = 0; i < m; i++) {
                node = node.next;
            }
             
            //ɾ�������е�һ��С����
            node.pre.next = node.next;
            node.next.pre = node.pre;
             
            node = node.pre;
             
            //С����������һ
            n--;
             
        }
         
        return node.getValue();
	}
}

//����һ��С����
class Node{
  int value;
  Node next;
  Node pre;
  public Node getPre() {
      return pre;
  }
  public void setPre(Node pre) {
      this.pre = pre;
  }
  public int getValue() {
      return value;
  }
  public void setValue(int value) {
      this.value = value;
  }
  public Node getNext() {
      return next;
  }
  public void setNext(Node next) {
      this.next = next;
  }
   
}

/**
 * ��Ŀ���� ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ��
 * ����,�и���Ϸ��������:����,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,
 * ���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)
 * 
 * ���û��С���ѣ��뷵��-1
 */