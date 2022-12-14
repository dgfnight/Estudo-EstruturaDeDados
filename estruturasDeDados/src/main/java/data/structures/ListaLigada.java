package data.structures;

public interface ListaLigada<T> {

    void inserirInicio(T data);

    void inserirFinal(T data);

    T removerInicio();

    T removerFinal();

    void imprimir();
}
