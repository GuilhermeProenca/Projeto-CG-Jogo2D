/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CódigosFonteJogo2D;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class Bolhas {

    private int x = 0;
    private int y = 0;
    private int width;
    private int height;
    protected Color cor = Color.BLUE;
    private Color borda = Color.BLACK;
    protected boolean visivel = true;
    
    public Bolhas(int x, int y, int width, int height, Color c)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        cor = c;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public void setBorda(Color borda) {
        this.borda = borda;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getCor() {
        return cor;
    }

    public Color getBorda() {
        return borda;
    }
    
    @Override
    public String toString() {
        return "Bolhas{" + "x=" + getX() + ", y=" + getY() + ", cor=" + getCor() + ", borda=" + getBorda() + '}';
    }
    
    
    
    Color getColor() {
        return cor;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    public Rectangle getLimites() {
        return new Rectangle(x, y, width, height);
    }
}
