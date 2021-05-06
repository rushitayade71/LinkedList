package linkedList;

public interface INode<K> {
	 K getKey();
	    void setKey();

	    INode getNext();
	    void setNext(INode next);

}
