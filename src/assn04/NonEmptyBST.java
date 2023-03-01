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

	@Override
	public BST<T> insert(T element) {
		if (element.compareTo(_element) > 0){
			_right = _right.insert(element);
		}
		else if (element.compareTo(_element) < 0) {
			_left = _left.insert(element);
		}
		return this;
	}

	@Override
	public BST<T> remove(T element) {
		if(element.compareTo(_element) > 0) { _right = _right.remove(element); }
		else if (element.compareTo(_element) < 0) { _left = _left.remove(element); }

		else { //found BST holding element to be deleted
			if(_left.isEmpty() && _right.isEmpty()) { return new EmptyBST<>(); }
			if(_left.isEmpty() && !_right.isEmpty()) { return _right; }
			if(!_left.isEmpty() && _right.isEmpty()) { return _left; }

			else {
				T successor = RSuccessor();
				_right = _right.remove(successor);
				_element = successor;
			}
		}
		return this;
	}

	//Finds smallest element in right tree
	private T RSuccessor() {
		T element;
		BST<T> it = this.getRight();
		while (!it.getLeft().isEmpty()){
			it = it.getLeft();
		}
		element = it.getElement();
		return element;
	}

	//Finds largest element in left tree
	private T LSuccessor() {
		T element;
		BST<T> it = this.getLeft();
		while (!it.getRight().isEmpty()){
			it = it.getRight();
		}
		element = it.getElement();
		return element;
	}

	// TODO: printPreOrderTraversal
	@Override
	public void printPreOrderTraversal() {
		if (!this.isEmpty()) {
			System.out.print(_element);
			System.out.print(" ");
		}
		_left.printPreOrderTraversal();
		_right.printPreOrderTraversal();
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
