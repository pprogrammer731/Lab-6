/**
 * Created by mohamed Alshamsi on 01/25//22.
 */
public class Singlylist<E> {

    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;


    public Singlylist() {

    }
public boolean isEmpty(){
 return size==0;
}

public int size(){
    return size;
}

public E first(){
        if (isEmpty())return null;
        return head.getElement();
}

public E last(){
    if (isEmpty())return null;
    return tail.getElement();
}

    public E All(){
        if (isEmpty())return null;
        E all=head.getElement();
        head=head.getNext();
      return all;
    }
public void addfirst(E e){
  head= new Node<E>(e,head);
  if (size==0)
      tail=head;
    size++;
}

public void addLast(E e){
    Node<E>newest=new Node<E>(e,null);
    if (isEmpty())
        head=newest;
    else
        tail.setNext(newest);
    tail=newest;
    size++;
}

public E removefirst(){
        if (isEmpty())return null;
        E deleted=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return deleted;
}
public void rotate(){
        if (tail!=null)
           tail=tail.getNext();
    }



    public static class Node<E> {

        private E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }


        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
