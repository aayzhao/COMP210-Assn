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

		//found BST holding element to be deleted
		else {
			if (_left.isEmpty() && _right.isEmpty()) {
				return new EmptyBST<>();
			} //node is leaf

			//node has one child
			else if (_left.isEmpty()) {
				return _right;
			} else if (_right.isEmpty()) {
				return _left;
			}

			//node has two children
			else {
				T successor = RSuccessor();
				_right = _right.remove(successor);
				_element = successor;
			}
		}
		return this;


	}

	//Finds smallest element in right tree (right side successor)
	private T RSuccessor() {
		T element;
		BST<T> it = this.getRight();
		while (!it.getLeft().isEmpty()){
			it = it.getLeft();
		}
		element = it.getElement();
		return element;
	}

	//Finds largest element in left tree (left side successor)
	private T LSuccessor() {
		T element;
		BST<T> it = this.getLeft();
		while (!it.getRight().isEmpty()){
			it = it.getRight();
		}
		element = it.getElement();
		return element;
	}

	@Override
	public void printPreOrderTraversal() {
		System.out.print(_element);
		System.out.print(" ");
		_left.printPreOrderTraversal();
		_right.printPreOrderTraversal();
	}

	@Override
	public void printPostOrderTraversal() {
		_left.printPostOrderTraversal();
		_right.printPostOrderTraversal();
		System.out.print(_element);
		System.out.print(" ");
	}

	@Override
	public void printBreadthFirstTraversal() {
		Queue<BST<T>> queue = new LinkedList<>();
		queue.add(this);
		queueProcessor(queue);
	}

	private void queueProcessor(Queue<BST<T>> queue){ //processor method for printBreadthFirstTraversal
		BST<T> node = queue.poll();
		if (node == null) return;
		System.out.print(node.getElement());
		System.out.print(" ");
		if(!node.getLeft().isEmpty()) { queue.add(node.getLeft()); }
		if(!node.getRight().isEmpty()) { queue.add(node.getRight()); }
		queueProcessor(queue);
	}

	@Override
	public void printInOrderTraversal() {
		_left.printInOrderTraversal();
		System.out.print(_element);
		System.out.print(" ");
		_right.printInOrderTraversal();
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
