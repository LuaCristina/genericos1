public class Main {
    public static void main(String[] args) {

        PilhaLimitada <Integer> pilhaInteger = new PilhaLimitada<>();

        pilhaInteger.empilhar(1);

        pilhaInteger.empilhar(2);

        System.out.println(pilhaInteger.topo());

        pilhaInteger.empilhar(1);
        pilhaInteger.empilhar(2);
        pilhaInteger.empilhar(3);

        System.out.println(pilhaInteger.topo());



    }
}