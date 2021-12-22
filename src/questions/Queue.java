package questions;


//--- Description
//Create a queue data structure.  The queue
//should be a class with methods 'add' and 'remove'.
//Adding to the queue should store an element until
//it is removed
//--- Examples
//  const q = new Queue();
//  q.add(1);
//  q.remove(); // returns 1;
import exceptions.EmptyDataStructureException;

public class Queue<E> {
	private Node first;
	private Node last;
	private boolean isEmpty = true;
	private int size = 0;

	// Deletion operation. Removes first element
	public E remove() throws EmptyDataStructureException {
		if (isEmpty) {
			throw new EmptyDataStructureException("Queue", "remove");
		}

		E removedVal = first.data;

		if (size == 1) {
			first = last = null;

		} else {

			first = first.next;

		}

		// Update size
		setSize(size - 1);

		return removedVal;
	}

	// Insertion operation. Inserts element at top
	public void add(E data) {
		Node newNode = new Node(data);
		if (isEmpty) {
			first = last = new Node(data);

		} else if (size == 1) {
			last = newNode;

			first.next = last;

		} else {
			last.next = newNode;
			last = newNode;

		}

		// Update size
		setSize(size + 1);

	}

	// Peek operation. Returns last element

	public E peek() throws EmptyDataStructureException {
		if (isEmpty)
			throw new EmptyDataStructureException("Queue", "peek");
		return last.data;
	}

	// Get size operation
	public int getSize() {
		return size;
	}

	// Set size operation
	public void setSize(int size) {
		this.size = size;
		if (size == 0) {
			isEmpty = true;
		} else {
			isEmpty = false;
		}
	}

	// Node nested class
	private class Node {
		E data;
		Node next;

		Node(E data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return String.valueOf(data);
		}

	}

	public void print() {
		if(isEmpty) {
			System.out.println("{}");
			return;
		}
		Node traversalNode = first;
		System.out.print("{"+first + " ");
		while(traversalNode.next!=null) {
			System.out.print(traversalNode.next + " ");
			traversalNode = traversalNode.next;
		}
		System.out.println("}");
	}

}
