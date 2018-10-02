/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CódigosFonteJogo2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author cravo
 */
public class BolhaTiro {
    
    private boolean sobeBolha;
    private int x;
    private int y;
    protected int speedY = 1;
    protected Color cor = Color.BLUE;
    protected boolean visivel = true;
    
    public BolhaTiro(int x, int y) {
        this.x = x;
        this.y = y;
        this.sobeBolha = false;
    }
    
    public void desenharTiro(Graphics g) {
        g.setColor(cor);
        g.fillOval(x, y, 35, 35);
    }
    
    /**
     *
     * @return
     */
    public double Subir() {
  
        if(isSobeBolha())
          setY(getY() - speedY);
        
        return getY();
    }

    public void setSobeBolha(boolean sobeBolha) {
        this.sobeBolha = sobeBolha;
    }

    /**
     * @return the sobeBolha
     */
    public boolean isSobeBolha() {
        return sobeBolha;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    public Rectangle getLimites() {
        return new Rectangle(x, y, 35, 35);
    }
}
