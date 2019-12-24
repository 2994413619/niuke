package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年10月24日 下午10:17:15
 * @Description ac:100%
 *
 */
public class A46孩子们的游戏 {

	public int LastRemaining_Solution(int n, int m) {
		if(n <= 0) {
            return -1;
        }
         
        //把小朋友生成一个链表
        Node head = new Node();
        head.setValue(0);
        Node thisNode = head;
        for(int i = 1; i < n; i++) {
            //创建新节点
            Node node = new Node();
            node.setValue(i);
             
            //上一个节点指向当前节点
            thisNode.next = node;
             
            //当前节点指向上一个节点
            node.pre = thisNode;
             
            //指针向后移动
            thisNode = node;
        }
         
        //链表头尾相连
        thisNode.next = head;
        head.pre = thisNode;
         
        //小朋友数量为一得时候跳出
        Node node = head.pre;
        while(n != 1) {
             
            //循环找到要删除的元素
            for(int i = 0; i < m; i++) {
                node = node.next;
            }
             
            //删除链表中的一个小朋友
            node.pre.next = node.next;
            node.next.pre = node.pre;
             
            node = node.pre;
             
            //小朋友数量减一
            n--;
             
        }
         
        return node.getValue();
	}
}

//代表一个小朋友
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
 * 题目描述 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。
 * 其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,
 * 可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 * 
 * 如果没有小朋友，请返回-1
 */