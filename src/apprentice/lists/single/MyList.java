package apprentice.lists.single;

public class MyList {

    private Node firstNode;

    public void addFirst( String data ){
        Node newNode = new Node( data, firstNode );
        firstNode = newNode;
    }

    public void addLast(String data){

        if ( firstNode == null){
            addFirst(data);
            return;
        }

        Node node = firstNode;
        while ( node.getNext() != null ){
            node = node.getNext();
        }
        Node newNode = new Node(data, null);
        node.setNext(newNode);
    }

    public void add(String data, int index){

        if ( index == 0){
            addFirst(data);
            return;
        }

        Node previousNode = getNodeByIndex(--index);
        if (previousNode.getNext() == null ){
            throw new IndexOutOfBoundsException();
        }

        Node newNode = new Node(data, previousNode.getNext());
        previousNode.setNext( newNode );
    }


    public void delete( int index){

        if ( index == 0 ){
            firstNode = firstNode.getNext();
            return;
        }

        Node previousNode = getNodeByIndex(--index);
        if (previousNode.getNext() == null){
            throw new IndexOutOfBoundsException();
        }
        previousNode.setNext( previousNode.getNext().getNext() );
    }

    private Node getNodeByIndex(int index) {
        Node currentNode = firstNode;
        for ( int i = 0; (i < index) && (currentNode != null); i++){
            currentNode = currentNode.getNext();
        }

        if (currentNode == null){
            throw new IndexOutOfBoundsException();
        }

        return currentNode;
    }

    public int search( String data ){
        int index = 0;
        Node node = firstNode;
        while ( node != null ){
            if (node.getData().equals(data)){
                return index;
            }
            node = node.getNext();
            index++;
        }
        return -1;
    }

    public void printList(){
        Node node = firstNode;
        while ( node != null ){
            System.out.println( node.getData() );
            node = node.getNext();
        }
    }

    public static void main( String ... args){
        MyList myList = new MyList();


        //myList.printList();
        myList.addLast("yo");
        myList.addLast("yo2");
        myList.addLast("yo3");
        myList.addFirst("tercero");
        myList.addFirst("segundo");
        myList.addFirst("primero");
        myList.printList();
        System.out.println("---------");

        myList.delete(0);
        myList.printList();
        System.out.println("---------");
        myList.delete(0);
        myList.printList();
        System.out.println("---------");
        myList.delete(0);
        myList.printList();

        System.out.println("---------");


        myList.add("que pedo",0);

        myList.printList();
    }

}
