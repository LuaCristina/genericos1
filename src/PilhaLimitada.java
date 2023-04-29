import java.util.List;
import java.util.ArrayList;

public class PilhaLimitada <T>{
    private List<T> pilha = new ArrayList<>();
    private int limite = 15;

    public void empilhar(T elemento){
        if (pilha.size() <= limite) {
            pilha.add(elemento);
        }
        else System.out.println("lista completa");
    }

    public T topo(){
        return pilha.get(pilha.size()-1);
    }

    public T desempilhar(){
        return pilha.remove(pilha.size()-1);
    }

    public boolean estaVazia() {
        return pilha.isEmpty();
    }

}
