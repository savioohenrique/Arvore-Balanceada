package br.com.waldson.aula11;

public class ArvoreBinariaBusca {
    private Node raiz = null;

    public boolean isEmpty() {
        return raiz == null;
    }

    public Node getRoot() {
        return raiz;
    }

    public void insert(Node node) {
        if (raiz == null) {
            raiz = node;
            return;
        }
        raiz.insert(node);
    }

    public void insert(int value) {
        Node n = new Node(value);
        insert(n);
    }

    public Node search(int key) {
        if (raiz == null) {
            return null;
        }
        return raiz.search(key);
    }

    public void balanceada(){
        if(balanceada(raiz) == 0){
            System.out.println("A árvore está balanceada!");
        }else{
            System.out.println("A árvore não está balanceada!");
        }
    }


    public int balanceada(Node raiz){
        if (raiz.qtdLeft(raiz) - raiz.qtdRight(raiz) >= 0 && raiz.qtdLeft(raiz) - raiz.qtdRight(raiz) <= 1 || raiz.qtdRight(raiz) - raiz.qtdLeft(raiz) <= 1 && raiz.qtdRight(raiz) - raiz.qtdLeft(raiz) >= 0){
            //System.out.println("A árvore está balanceada!");
            System.out.println("Nó" + "'" + raiz.getValue() + "': ");
            System.out.println("Qtd Left: " + raiz.qtdLeft(raiz));
            System.out.println("Qtd Right: "+ raiz.qtdRight(raiz));
            if(raiz.getLeft() != null) {
                if(balanceada(raiz.getLeft()) == -1){
                    return -1;
                }
            }

            if(raiz.getRight() != null){
                if(balanceada(raiz.getRight()) == -1){
                    return -1;
                }
            }
            return 0;
        }
        System.out.println("Retornando falso");
        return -1;
    }

}
