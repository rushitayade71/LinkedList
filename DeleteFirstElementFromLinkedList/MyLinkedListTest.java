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
        Assertions.assertEquals(myThirdNode, myLinkedList.head);
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
	    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToInBetween() {
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
}
