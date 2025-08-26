import java.awt.*;
public class Cell {
    private int x1;
    private int y1;
    static int size=35;


public Cell(int x,int y){
    x1=x;
    y1=y;
   
}
public void paint(Graphics g, Point mouse){
    if (highlight(mouse)){
        g.setColor(Color.GRAY);
    }else{
        g.setColor(Color.WHITE);
    }

             g.fillRect(x1,y1,size,size);
              g.setColor(Color.BLACK);
            g.drawRect(x1, y1, size, size);
        }
           

    
    public boolean highlight(Point mouse){
        if (mouse!=null){
            if (mouse.x>=x1 && mouse.x<=x1+35){
            if (mouse.y>=y1 && mouse.y<=y1+35){
                return true;
            }
        }
    }
        return false;
    
}
}
