package _Aula6_ED;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {
	private Node<T> head;
	private int size;

	public CustomLinkedList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public boolean isFull() {
		Node<T> aux = new Node<>();
		return aux == null;
	}

	public int getSize() {
		return size;
	}

	public Node<T> getHead() {
		return head;
	}

	public boolean addFirst(T id) {
		Node<T> aux = new Node<>(id, null);
		if (isEmpty()) {
			head = aux;
		} else {
			aux.setProx(head);
			head = aux;
		}
		size++;
		return true;
	}

	public boolean addLast(T id) {
		Node<T> aux = new Node<>(id, null);
		if (isEmpty()) {
			head = aux;
		} else {
			Node<T> pAnda = head;
			while (pAnda.getProx() != null) {
				pAnda = pAnda.getProx();
			}
			pAnda.setProx(aux);
		}
		size++;
		return true;
	}

	public void print() {
		Node<T> pAnda = head;
		while (pAnda != null) {
			System.out.println(pAnda.getDado());
			pAnda = pAnda.getProx();
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private Node<T> current = head;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public T next() {
				T data = current.getDado();
				current = current.getProx();
				return data;
			}
		};
	}

	private static class Node<T> {
		private T dado;
		private Node<T> prox;

		public Node() {}

		public Node(T dado, Node<T> prox) {
			this.dado = dado;
			this.prox = prox;
		}

		public T getDado() {
			return dado;
		}

		public void setProx(Node<T> prox) {
			this.prox = prox;
		}

		public Node<T> getProx() {
			return prox;
		}
	}
}