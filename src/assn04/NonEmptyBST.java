package assn04;


import java.util.LinkedList;
import java.util.Queue;

public class NonEmptyBST<T extends Comparable<T>> implements BST<T> {
	private T _element;
	private BST<T> _left;
	private BST<T> _right;

	public NonEmptyBST(T element) {

		_left = new EmptyBST<T>();
		_right = new EmptyBST<T>();
		_element = element;
	}

	// TODO: insert
	@Override
	public BST<T> insert(T element) {
		System.out.println("Call");
		if (element.compareTo(_element) > 0){
			_right = _right.insert(element);
			return this;
		}
		else if (element.compareTo(_element) < 0) {
			_left = _left.insert(element);
			return this;
		}
		return this;
	}

	// TODO: remove
	@Override
	public BST<T> remove(T element) {
		return null; //added to remove error for compiler
	}

	// TODO: printPreOrderTraversal
	@Override
	public void printPreOrderTraversal() {

	}

	// TODO: printPostOrderTraversal
	@Override
	public void printPostOrderTraversal() {

	}

	// TODO: printBreadthFirstTraversal
	@Override
	public void printBreadthFirstTraversal() {

	}

	// GetHeight of A Tree

	@Override
	public int getHeight() {
		   return Math.max(_left.getHeight(), _right.getHeight())+1;
	}


	@Override
	public BST<T> getLeft() {
		return _left;
	}

	@Override
	public BST<T> getRight() {
		return _right;
	}

	@Override
	public T getElement() {
		return _element;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

}
