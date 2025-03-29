public class Main {

	public static void main(String[] args) {
		
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        
        // Testando inserção no final
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        
        // Testando inserção no início
        list.insertAtBeginning(5);
        
        // Testando inserção em ordem
        list.insertInOrder(15);
        list.insertInOrder(25);
        
        // Testando a impressão reversa
        System.out.println("Lista reversa:");
        list.printReverso();
        
        // Testando `getFirst` e `getLast`
        System.out.println("Primeiro elemento: " + list.getFirst());
        System.out.println("Último elemento: " + list.getLast());
        
        // Testando `removeFirst` e `removeLast`
        System.out.println("Removendo o primeiro elemento: " + list.removeFirst());
        System.out.println("Removendo o último elemento: " + list.removeLast());
        
        // Testando `findFirstDuplicate`
        list.insertAtEnd(10);  // Inserindo um duplicado
        System.out.println("Primeiro duplicado: " + list.findFirstDuplicate());
        
        // Testando `contains`
        System.out.println("Lista contém o 15? " + list.contains(15));
        System.out.println("Lista contém o 50? " + list.contains(50));
        
        // Testando `isEmpty` e `size`
        System.out.println("Lista está vazia? " + list.isEmpty());
        System.out.println("Tamanho da lista: " + list.size());

	}
}
