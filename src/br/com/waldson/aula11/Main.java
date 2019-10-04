package br.com.waldson.aula11;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        /*
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            arvore.insert(
                new Node(i)
            );
        }
        */
        arvore.insert(new Node(6));
        arvore.insert(3);
        arvore.insert(4);
        arvore.insert(8);
        arvore.insert(9);
        arvore.insert(2);


        arvore.balanceada();


        JFrame frame = new JFrame("Visualizador de ABB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        ArvoreBinariaBuscaView view = new ArvoreBinariaBuscaView(arvore);
        frame.add(view);

        frame.setVisible(true);

    }
}
