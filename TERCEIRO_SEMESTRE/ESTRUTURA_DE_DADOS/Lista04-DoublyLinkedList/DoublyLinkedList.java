public class DoublyLinkedList<T extends Comparable<T>> {
	
	private Node<T> head;
	   private Node<T> tail;
	   private int size;

	   // Construtor
	   public DoublyLinkedList() {
	       this.head = null;
	       this.tail = null;
	       this.size = 0;
	   }
	   
	   // Inserir nó no final da lista
	   public void insertAtEnd(T data) {
	       Node<T> newNode = new Node<>(data);
	       if (head == null) {
	           head = newNode;
	           tail = newNode;
	       } else {
	           tail.next = newNode;
	           newNode.prev = tail;
	           tail = newNode;
	       }
	       size++;
	   }
	   
	   // Inserir nó no início da lista
	   public void insertAtBeginning(T data) {
	       Node<T> newNode = new Node<>(data);
	       if (head == null) {
	           head = newNode;
	           tail = newNode;
	       } else {
	           newNode.next = head;
	           head.prev = newNode;
	           head = newNode;
	       }
	       size++;
	   }

	   // Remover nó da lista (primeira ocorrência)
	   public void deleteNode(T data) {
	       Node<T> current = head;
		// Busca pelo nó a ser removido
	       while (current != null && !current.data.equals(data)) {
	           current = current.next;
	       }
	       if (current == null) {
	           System.out.println("Nó não encontrado.");
	           return;
	       }
	       if (current == head) { // Caso o nó seja a cabeça
	           head = head.next;
	           if (head != null) {
	               head.prev = null;
	           }
	       }
	       else if (current == tail) { // Caso o nó seja a cauda
	           tail = tail.prev;
	           tail.next = null;
	       }
	       else {
	           current.prev.next = current.next;
	           current.next.prev = current.prev;
	       }
	       size--;  
	   }

	   // inserir em ordem crescente
	   public void insertInOrder(T data) {
	       Node<T> newNode = new Node<>(data);
	       if (head == null) {  // Caso a lista esteja vazia
	           head = newNode;
	           tail = newNode;
	       }
	       else if (newNode.data.compareTo(head.data) <= 0) { // inserir no início
	           newNode.next = head;
	           head.prev = newNode;
	           head = newNode;
	       }
	       else if (newNode.data.compareTo(tail.data) >= 0) {  // inserir no fim
	           tail.next = newNode;
	           newNode.prev = tail;
	           tail = newNode;
	       }
	       else {						// Inserção no meio 
	           Node<T> current = head;
	           while (current != null && current.data.compareTo(newNode.data) < 0) {
	               current = current.next;
	           }

	           newNode.prev = current.prev;
	           newNode.next = current;
	           current.prev.next = newNode;
	           current.prev = newNode;
	       }
	       size++; 
	   }

	   // Verifica se a lista está vazia
		public boolean isEmpty() {
			return size == 0;
		}
	   
		// Obtém o tamanho da lista
		public int size() {
			return size;
		}
		
		// Verificar se um elemento está presente na lista. Retorna true se encontrar o elemento e false caso contrário.
		public boolean contains(T data) {
			for (Node<T> current = head; current != null; current = current.next) {
				if (current.data.equals(data)) {
					return true;
				}
			}
			return false;
		}
		
		// Imprimir os elementos da lista a partir do último elemento.
		public void printReverso() {
			Node<T> current = tail;
			
			while(current != null) {
				System.out.println(current.data);
				current = current.prev;
			}
			
		}
		
		// Remover o primeiro elemento da lista e retornar os dados. Se a lista estiver vazia, retorna null
		public T removeFirst() {
			if (isEmpty()) {
				return null;
			}
			
			T data = head.data;
			head = head.next;
			
			if(head != null) {
				head.prev = null;
			} else {
				tail = null;
			}
			
			size--;
			return data;
		}

		// Remover o último elemento da lista e retornar os dados. Se a lista estiver vazia, retorna null 
		public T removeLast() {
			if (isEmpty()) {
				return null;
			}
			
			T data = tail.data;
			tail = tail.prev;
			
			if (tail != null) {
				tail.next = null;
			} else {
				head = null;
			}
			
			
			size --;
			return data;
		}

		// Retornar o primeiro elemento da lista sem removê-lo. Se a lista estiver vazia, retorna null
		public T getFirst() {
			
			if (isEmpty()) {
				return null;
			}
			
			return head.data;
		}
		
		// Retorna o último elemento da lista sem removê-lo. Se a lista estiver vazia, retorna null
		public T getLast() {
			
			if (isEmpty()) {
				return null;
			}
			
			return tail.data;
		}
		
		// Retornar o primeiro elemento repetido encontrado na lista. Se não houver elementos repetidos, retorna null.
		public T findFirstDuplicate() {

			for (Node<T> current = head; current != null; current = current.next) {
				for (Node<T> runner = current.next; runner != null; runner = runner.next) {
					if (current.data.equals(runner.data)) {
						return current.data; // Retorna o primeiro valor repetido
					}
				}
			}

			return null;
		}

}
