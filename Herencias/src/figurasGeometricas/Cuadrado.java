package figurasGeometricas;

import java.awt.*;

public class Cuadrado
{
    private int lado;
    private int xPos;
    private int yPos;
    private String color;
    private boolean visible;

    public Cuadrado(int xPos, int yPos, String color, int lado)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.color= color;
        visible = false;
        this.lado=lado;
    }
              
    public int getXPos()
    {
        return this.xPos;
    }
    public void setXPos (int xPos)
    {
        this.xPos = xPos;
    }
    
    public int getYPos()
    {
        return this.yPos;
    }
    public void setYPos (int yPos)
    {
        this.yPos = yPos;
    }   
   
    public String getColor()
    {
        return this.color;
    }
    public void setColor (String color)
    {
        this.color = color;
    }   
   
    public boolean getVisible()
    {
        return this.visible;
    }
    public void setVisible (boolean visible)
    {
        this.visible = visible;
    }
     
    public int getLado()
    {
        return lado;
    }
    public void setLado (int lado)
    {
        this.lado = lado;
    }
    
        //MOSTRAR EN PANTALLA
    public void mostrar()
    {
        setVisible(true);
        dibujar();
    }

    //OCULTAR
    public void ocultar()
    {
        borrar();
        setVisible(false);
    }

    //MOVER HORIZONTALMENTE UN NÚMERO DE PIXELS 
    public void moverHorizontal(int distancia)
    {
        borrar();
        setXPos(getXPos() + distancia);
        dibujar();
    }

    //MOVER VERTICALMENTE UN NÚMERO DE PIXELS 
    public void moverVertical(int distancia)
    {
        borrar();
        setYPos(getYPos() + distancia);
        dibujar();
    }
    
    //CAMBIAR EL COLOR
    public void cambiaColor(String color)
    {
        setColor(color);
        dibujar();
    }

    //BORRAR Y ELIMINAR HACIENDO USO DE LA CLASE Canvas
    private void borrar()
    {
        if(visible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
    //CAMBIAR EL TAMAÑO DEL CUADRADO
    public void cambiaTamaño(int lado)
    {
        borrar();
        setLado(lado);
        dibujar();
    }

    /*
     * DIBUJAR EL CUADRADO EN VENTANA GRÁFICA HACIENDO USO DE 
     * LA CLASE Canvas
     */
    private void dibujar()
    {
        if(visible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, getColor(),
                    new Rectangle(getXPos(), getYPos(), getLado(), getLado()));
            canvas.wait(10);
        }
    }

    
}
