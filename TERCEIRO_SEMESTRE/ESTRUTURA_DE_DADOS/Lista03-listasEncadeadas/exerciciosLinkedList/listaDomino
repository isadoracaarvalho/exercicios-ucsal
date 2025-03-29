import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList<gerarPeca> lista = new LinkedList<>();

		for (int i = 0; i < 28; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			gerarPeca novaPeca = new gerarPeca(A, B);

			if(lista.isEmpty()) {
				lista.addFirst(novaPeca);
			} else {
				gerarPeca esquerda = lista.getFirst();
				gerarPeca direita = lista.getLast();

				if (novaPeca.direita == esquerda.esquerda) {
                    lista.addFirst(novaPeca);
                } else if (novaPeca.esquerda == esquerda.esquerda) {
                    lista.addFirst(new gerarPeca(novaPeca.direita, novaPeca.esquerda));
                } else if (novaPeca.esquerda == direita.direita) {
                    lista.addLast(novaPeca);
                } else if (novaPeca.direita == direita.direita) {
                    lista.addLast(new gerarPeca(novaPeca.direita, novaPeca.esquerda));
                }
			}
		}

		lista.print();
	}

}

class gerarPeca {
	int esquerda, direita;

	public gerarPeca(int esquerda, int direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	public String toString() {
		return esquerda + " " + direita;
	}
}

class LinkedList<T> {

	private Node<T> head; // Referência/Ponteiro para o primeiro nó
	private int size; // Tamanho da lista

	public LinkedList() {
		this.setHead(null); // Inicia a lista vazia apontando para null
		this.size = 0;
	}

	// Adiciona um novo nó no início da lista
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);

		newNode.next = getHead();
		setHead(newNode);
		size++;

	}

	// Adiciona um novo nó ao final da lista
	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			setHead(newNode);
		} else {
			Node<T> current = getHead();
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		size++;
	}

	// Remove o primeiro elemento da lista
	public T removeFirst() {
		if (isEmpty()) { // False
			throw new IllegalStateException("A lista está vazia.");
		}
		T data = getHead().data;
		setHead(getHead().next);
		size--;
		return data;
	}

	// Remove o último elemento da lista
	public T removeLast() {

		if (getHead() == null) { // Lista vazia
			throw new IllegalStateException();
		}
		T data;

		// Lista com apenas 1 no
		if (getHead().next == null) {
			data = getHead().data;
			setHead(null);
		} else {
			Node<T> current = getHead();

			while (current.next != null && current.next.next != null) {
				current = current.next;
			}
			data = current.next.data;
			current.next = null;
		}
		size--;
		return data;
	}

	// Obtém o tamanho da lista
	public int size() {
		return size;
	}

	// Verifica se a lista está vazia
	public boolean isEmpty() {
		return size == 0;
	}

	// Imprime a lista
	public void print() {
		if (!isEmpty()) {
			Node<T> current = getHead();
			while (current != null) { // True
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public void addAt(int index, T data) {
		// Verifica se o índice é válido (de 1 até size + 1)
		if (index >= 1 && index <= size + 1) {

			Node<T> newNode = new Node<>(data);

			// Se o índice for 1, insere no início da lista
			if (index == 1) {
				newNode.next = getHead();
				setHead(newNode);
			} else {
				Node<T> current = getHead();
				// Vai até o nó anterior à posição desejada
				for (int i = 1; i < index - 1; i++) {
					current = current.next;
				}
				newNode.next = current.next; // Faz o novo nó apontar para o próximo nó
				current.next = newNode; // O nó anterior aponta para o novo nó
			}

			size++; // Incrementa o tamanho após a inserção
		}
	}

	public T removeAt(int index) {
		if (index < 1 || index > size) {
			throw new IndexOutOfBoundsException();
		}

		T data;

		if (index == 1) { // primeiro nó
			data = getHead().data;
			setHead(getHead().next);
		} else {
			Node<T> current = getHead();

			for (int i = 1; i < index - 1; i++) {
				current = current.next;
			}

			data = current.next.data;
			current.next = current.next.next; // Nó anterior apontar para o nó após o removido
		}

		size--;
		return data;
	}

	// Retornar o primeiro elemento da lista sem removê-lo. Se a lista estiver
	// vazia, retorna null
	public T getFirst() {

		if (isEmpty()) {
			return null;
		}

		return getHead().data;
	}

	// Retorna o último elemento da lista sem removê-lo. Se a lista estiver vazia,
	// retorna null
	public T getLast() {

		if (isEmpty()) {
			return null;
		}

		for (Node<T> current = getHead(); current != null; current = current.next) {
			if (current.next == null) {

				return current.data;
			}
		}

		return null;

	}

	// Retornar o primeiro elemento repetido encontrado na lista. Se não houver
	// elementos repetidos, retorna null.

	public T isEquals() {

		for (Node<T> current = getHead(); current != null; current = current.next) {
			for (Node<T> runner = current.next; runner != null; runner = runner.next) {
				if (current.data.equals(runner.data)) {
					return current.data; // Retorna o primeiro valor repetido
				}
			}
		}

		return null;
	}

	public boolean contains(T data) {
		for (Node<T> current = getHead(); current != null; current = current.next) {
			if (current.data.equals(data)) {
				return true;
			}
		}
		return false;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

}

class Node<T> {

	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
		this.next = null;
	}

}
