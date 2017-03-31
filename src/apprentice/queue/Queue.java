package apprentice.queue;


import apprentice.lits.doublelinked.MyDoubleList;

public class Queue {

    private MyDoubleList list = new MyDoubleList();

    public void queue(String data){
        list.addFirst(data);
    }


    public String get(){
        String data  = list.getLast();
        list.delete( list.size() );
        return data;
    }

    public void print(){
        list.print();
    }

    public static void main( String ... args){
        Queue queue = new Queue();
        queue.queue("1");
        queue.queue("2");
        queue.queue("3");
        queue.queue("4");
        queue.queue("5");
        queue.print();

        System.out.println("---------");

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());

        System.out.println("---------");
    }

}
