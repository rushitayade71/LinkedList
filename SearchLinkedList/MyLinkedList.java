package linkedList;

public class MyLinkedList<K> {

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
	        while(tempNode.getNext() != null) {
	            nodes.append(tempNode.getKey());
	            if(tempNode != this.tail){
	                nodes.append("->");
	            }
	            tempNode = tempNode.getNext();
	        }
	        nodes.append(tempNode.getKey());
	        System.out.println(nodes);
	    }

	    public void append(INode myNode) {
	        if(this.head == null) {
	            this.head = myNode;
	        }
	        if(this.tail == null){
	            this.tail = myNode;
	        }else {
	            this.tail.setNext(myNode);
	            this.tail = myNode;

	        }
	    }

	    public void insert(INode myNode,INode newNode) {
	        INode tempNode = myNode.getNext();
	        myNode.setNext(newNode);
	        newNode.setNext(tempNode);
	    }

	    public INode pop() {
	        INode tempNode = this.head;
	        this.head=head.getNext();
	        return tempNode;
	    }
	    public INode popLast() {
	        INode tempNode = head;
	        while(!tempNode.getNext().equals(tail)){
	            tempNode = tempNode.getNext();
	        }
	        
	        this.tail = tempNode;
	        tempNode.setNext(null);
	        return tempNode;
	    }
	    
	    public boolean search(K key) {
	        INode tempNode = head;
	        while (tempNode != null && tempNode.getNext() != null) {
	            if(tempNode.getNext().getKey().equals(key)){
	                return true;
	            }
	        }
	        return false;
	    }

	}