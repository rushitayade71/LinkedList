package linkedList;

import static org.junit.jupiter.api.Assertions.*;

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
}
