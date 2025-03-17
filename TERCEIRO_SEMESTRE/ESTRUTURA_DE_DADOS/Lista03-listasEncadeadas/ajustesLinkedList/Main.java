package exo;

public class Main {

    public static void main(String[] args) {

        LinkedList <String> lista = new LinkedList<>();

        lista.addFirst("Hermione");
        lista.addFirst("Elsa");

        lista.addLast("Harry Potter");
        lista.addLast("Darth Vader");


        lista.addAt(3, "Mario");
        lista.print();
        lista.removeAt(2);


        System.out.println("---------");
        lista.addLast("Darth Vader");
        lista.removeFirst();
        lista.removeLast();

        lista.print();

        System.out.println(lista.getFirst());

        System.out.println(lista.getLast());

        System.out.println(lista.isEquals());
    }

}
