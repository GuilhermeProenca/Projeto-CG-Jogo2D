/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CódigosFonteJogo2D;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author user
 */
public class GeradorBolhas {

    public ArrayList<Bolhas> gerarBubbles(int width) {
        ArrayList<Bolhas> bubbles = new ArrayList<>();

        int qtdPorLinha = 10;
        int posX = (width - 50) / qtdPorLinha;
        int tam = posX - 2;
        int margemEsquerda = 10;
        int posY = 50;
        Color c;
        Random r = new Random();
        
        Color[] colors = new Color[] {
            Color.BLUE,
            Color.GREEN,
            Color.RED,
            Color.ORANGE,
            Color.YELLOW,
            Color.LIGHT_GRAY,
            Color.MAGENTA
        };

        for (int linha = 0; linha < 3; linha++, posY += tam) {

            if (linha % 2 == 0) {
                margemEsquerda = 10;
            } else {
                margemEsquerda = 10 + (tam / 2);
            }

            for (int i = 0; i < qtdPorLinha; i++) {

                c = colors[r.nextInt(colors.length)];
                bubbles.add(new Bolhas((posX * i) + margemEsquerda, posY, tam, tam, c));
            }
        }

        return bubbles;
    }
}
