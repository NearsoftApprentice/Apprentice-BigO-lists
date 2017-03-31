package apprentice.stack;


import apprentice.lits.doublelinked.MyDoubleList;

public class MyStack {

    private MyDoubleList list = new MyDoubleList();

    public void push(String data){
        list.addFirst(data);
    }

    public String pop(){
        String data;
        try {
           data = list.get(0);
        }catch (IndexOutOfBoundsException e){
            return null;
        }
        list.delete(0);
        return data;
    }

    public void print(){
        list.print();
    }

    public static void main( String ... args){
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.print();

        System.out.println("---------");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("---------");
    }


}
