package linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {
	 @Test
	    void given3Numbers_whenAddedToLinkedList_ShouldAppearOnTop() {
	        MyNode<Integer> myFirstNode = new MyNode<>(70);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(56);
	        MyLinkedList myLinkedList = new MyLinkedList();

	        myLinkedList.add(myFirstNode);
	        myLinkedList.add(mySecondNode);
	        myLinkedList.add(myThirdNode);
	        myLinkedList.printNodes();

	        Assertions.assertEquals(myThirdNode.getKey(), myLinkedList.head.getKey());
	    }

	    @Test
	    void given3Numbers_whenAppendedToLinkedList_ShouldAddAtLast() {
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);
	        MyLinkedList myLinkedList = new MyLinkedList();

	        myLinkedList.append(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.printNodes();

	        boolean result = myLinkedList.head.equals(myFirstNode) &&
	                myLinkedList.head.getNext().equals(mySecondNode) &&
	                myLinkedList.tail.equals(myThirdNode);
	        Assertions.assertTrue(result);
	    }

	    @Test
	    public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToBetween() {
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);
	        MyLinkedList myLinkedList = new MyLinkedList();

	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.insert(myFirstNode,mySecondNode);
	        myLinkedList.printNodes();

	        boolean result=myLinkedList.head.equals(myFirstNode) &&
	                myLinkedList.head.getNext().equals(mySecondNode) &&
	                myLinkedList.tail.equals(myThirdNode);
	        Assertions.assertTrue(result);
	    }


	    @Test
	    public void given3Numbers_WhenDeletedFirstElement_ShouldPassLinkedListResult() {
	        MyNode<Integer>myFirstNode = new MyNode<>(56);
	        MyNode<Integer>mySecondNode = new MyNode<>(30);
	        MyNode<Integer>myThirdNode = new MyNode<>(70);
	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.pop();
	        myLinkedList.printNodes();

	        boolean result = myLinkedList.head.equals(mySecondNode)&&
	                myLinkedList.head.getNext().equals(myThirdNode);
	        Assertions.assertTrue(result);
	    }
	    
	    @Test
	    public void given3Numbers_WhenDeletedLastElement_ShouldPassLinkedListResult() {
	        MyNode<Integer>myFirstNode = new MyNode<>(56);
	        MyNode<Integer>mySecondNode = new MyNode<>(30);
	        MyNode<Integer>myThirdNode = new MyNode<>(70);
	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.popLast();
	        myLinkedList.printNodes();

	        boolean result=myLinkedList.head.equals(myFirstNode) &&
	                myLinkedList.head.getNext().equals(mySecondNode);
	        Assertions.assertTrue(result);
	    }
	    @Test
	    public void given3Numbers_WhenSearchElement_LinkedListResult() {
	        MyNode<Integer>myFirstNode = new MyNode<>(56);
	        MyNode<Integer>mySecondNode = new MyNode<>(30);
	        MyNode<Integer>myThirdNode = new MyNode<>(70);
	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.printNodes();

	        boolean result = myLinkedList.search(30);
	        Assertions.assertTrue(result);
	    }
	    
	    @Test
	    public void given3Numbers_WhenSearchAndInsertElement_LinkedListResult() {
	        MyNode<Integer>myFirstNode = new MyNode<>(56);
	        MyNode<Integer>mySecondNode = new MyNode<>(30);
	        MyNode<Integer>myThirdNode = new MyNode<>(70);
	        MyNode<Integer>myNewNode = new MyNode<>(40);
	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.searchAndInsert(30, myNewNode);
	        myLinkedList.printNodes();
	        boolean result = myLinkedList.head.getNext().equals(mySecondNode) &&
	        		mySecondNode.getNext().equals(myNewNode);
	        Assertions.assertTrue(result);
	    }
	    
	    @Test
	    public void Given3Numbers_WhenSearchAndDeleteAnd_SizeOfLinkedList() {
	    	MyNode<Integer>myFirstNode = new MyNode<>(56);
		    MyNode<Integer>mySecondNode = new MyNode<>(30);
		    MyNode<Integer>myThirdNode = new MyNode<>(70);
		    MyNode<Integer>myNewNode = new MyNode<>(40);
		    MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.searchAndInsert(30, myNewNode);
	        myLinkedList.searchAndDelete(40);
	        myLinkedList.printNodes();
	        System.out.println("Size :- " + myLinkedList.size());
	        boolean res = myLinkedList.head.getNext().equals(mySecondNode) &&
	                mySecondNode.getNext().equals(myThirdNode);
	        Assertions.assertTrue(res);
	    }
	}