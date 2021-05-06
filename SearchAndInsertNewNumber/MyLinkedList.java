package linkedList;

public class MyLinkedList<K> {

	 public INode head;
	    public INode tail;

	    public MyLinkedList() {
	        this.head = null;
	        this.tail = null;
	    }

	    public void add(INode myNewNode) {
	        if(this.tail == null) {
	            this.tail = myNewNode;
	        }if (this.head == null){
	            this.head = myNewNode;
	        }else {
	            INode tempNode = this.head;
	            this.head = myNewNode;
	            this.head.setNext(tempNode);
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


	    public void append(INode myNewNode) {
	        if(this.head == null) {
	            this.head = myNewNode;
	        }
	        if(this.tail == null){
	            this.tail = myNewNode;
	        }else {
	            this.tail.setNext(myNewNode);
	            this.tail = myNewNode;

	        }
	    }

	    public void insert(INode myNode,INode myNewNode) {
	        INode tempNode = myNode.getNext();
	        myNode.setNext(myNewNode);
	        myNewNode.setNext(tempNode);
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
	    
	    public void searchAndInsert(int num, INode myNewNode){
	        INode tempNode = head;
	        while (tempNode.getNext() != null){
	            if(tempNode.getKey().equals(num)) {
	                INode temp = tempNode.getNext();
	                tempNode.setNext(myNewNode);
	                myNewNode.setNext(temp);
	            }
	            tempNode = tempNode.getNext();
	        }
	    }


	}