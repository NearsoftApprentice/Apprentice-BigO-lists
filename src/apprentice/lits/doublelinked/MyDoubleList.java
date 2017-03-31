package apprentice.lits.doublelinked;


public class MyDoubleList {

    private Node first;
    private Node last;

    public void addFirst(String data){
        Node newNode = new Node( data, first, null);
        if ( first == null ){
            last = newNode;
        }
        if (first != null){
            first.setPrevious(newNode);
        }
        first = newNode;
    }

    public void addLast(String data){

        if ( last == null ){
            addFirst(data);
            return;
        }

        Node newNode = new Node( data, null, last);
        last.setNext( newNode );
        last = newNode;
    }

    public void add(String data, int index){
        Node currentNode = first;
        for ( int i =0; currentNode.getNext() != null; i++ ){
            if ( i == index ){
                Node newNode = new Node(data, currentNode, currentNode.getPrevious());
                currentNode.getPrevious().setNext( newNode );
                return;
            }
            currentNode = currentNode.getNext();
        }
        throw new IndexOutOfBoundsException();
    }

    public void delete(String data){

        if ( first.getData().equals(data) ){
            first.getNext().setPrevious(null);
            first = first.getNext();
            return;
        }

        Node currentNode = first;
        while (currentNode.getNext() != null ){
            if ( currentNode.getData().equals(data)){
                if ( currentNode.getNext() == null ){
                    last = currentNode.getPrevious();
                }
                currentNode.getPrevious().setNext(currentNode.getNext());
            }
            currentNode = currentNode.getNext();
        }
    }

    public void delete(int index){

        if (first == null){
            return;
        }

        if ( index == 0 ){
            if ( first.getNext() != null ){
                first.getNext().setPrevious(null);
            }
            first = first.getNext();
            return;
        }

        Node currentNode = first;
        for (int i =0; currentNode != null; i++){
            if ( i == index ){
                if ( currentNode.getNext() == null ){
                    last = currentNode.getPrevious();
                }
                currentNode.getPrevious().setNext(currentNode.getNext());
                return;
            }
            currentNode = currentNode.getNext();
        }
        throw new IndexOutOfBoundsException();
    }

    public String get(int index){
        if ( index == 0 ){
            return first.getData();
        }
        Node currentNode = first;
        for (int i =0; currentNode.getNext() != null; i++){
            if ( i == index ){
                return currentNode.getData();
            }
            currentNode = currentNode.getNext();
        }
        throw new IndexOutOfBoundsException();
    }

    public String getLast(){
        return last.getData();
    }

    public int size(){
        Node currentNode = first;
        int size = 0;
        for ( ; currentNode.getNext() != null; size++){
            currentNode = currentNode.getNext();
        }
        return size;
    }

    public int search(String data){
        Node currentNode = first;
        for ( int i = 0; currentNode.getNext() != null; i++){
            if (currentNode.getData().equals(data)){
                return i;
            }
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    public void print(){
        Node currentNode = first;
        while (currentNode != null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    public static void main( String ... args){
        MyDoubleList myList = new MyDoubleList();


        //myList.printList();
        myList.addFirst("yo");
        myList.addFirst("yo1");
        myList.addFirst("yo2");
        myList.addFirst("yo0");
        myList.addFirst("yo33");
        myList.addFirst("yo34");
        myList.addFirst("yo35");

        myList.add("nuevo",4);

        myList.print();

        System.out.println( myList.search("yo2") );

    }

}
