package linkedList;

public class MyLinkedList {

	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode myNode) {
		if(this.head == null && this.tail == null){
			this.head = myNode;
			this.tail = myNode;
		}else{
			INode temp = this.head;
			this.head = myNode;
			this.head.setNext(temp);
		}
	}

	public void printNodes() {
		StringBuffer nodes = new StringBuffer();
		INode tempNode = head;
		while(tempNode != tail) {
			nodes.append(tempNode.getKey());
			nodes.append("->");
			tempNode = tempNode.getNext();
		}
		nodes.append(tempNode.getKey());
		System.out.println(nodes);
	}
}