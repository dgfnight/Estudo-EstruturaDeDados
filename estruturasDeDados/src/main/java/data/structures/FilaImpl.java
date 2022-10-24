package data.structures;

public class FilaImpl<T> implements Fila<T>{

    private final T[] elements;
    private int front;
    private int rear;


    public FilaImpl(int size) {
        if (size <= 0) throw new RuntimeException("Tamanho invalido" + size);
        this.elements = (T[]) new Object[size];
        this.front = -1;
        this.rear = -1;

    }
    @Override
    public void enqueue(T data) {
        if (isFull()){
            throw new RuntimeException("Fila está cheia");
        } else  {
            if (rear == size() - 1 && front != 0)
                rear = 0;
        }
    }

    @Override
    public T dequeue() {
        if (isEmpty()){
            throw new RuntimeException("Fila está vazia");
        } else if (front == rear){
            front = rear = -1 ;
        } else if (front == size() -1){
            front = 0;
        }

        return null;
    }

    @Override
    public T front() {
        if (front < 0) {
            throw new RuntimeException("Sem elementos na fila");
        } else {
            return elements[front];
        }
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return front < 0 && rear < 0;
    }

    @Override
    public boolean isFull() {
        return (front == 0 && rear == size() - 1) || (rear == front - 1);
    }
}
