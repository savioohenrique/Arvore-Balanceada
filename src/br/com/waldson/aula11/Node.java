package br.com.waldson.aula11;

public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }

    public int qtdLeft(Node root){
        int qtd = 0;
        if(root.getLeft() != null){
            qtd++;
            qtd += qtdLeft(root.getLeft());
        }
        //System.out.println("'" + this.value + "'" + " QTD Left: " + qtd);
        return qtd;
    }

    public int qtdRight(Node root){
        int qtd = 0;
        if(root.getRight() != null){
            qtd++;
            qtd += qtdRight(root.getRight());
        }
        //System.out.println("'" + this.value + "'" + " QTD Right: " + qtd);
        return qtd;
    }
}
