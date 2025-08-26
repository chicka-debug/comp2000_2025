import java.awt.*;
public class Grid {
    Cell[][] cells=new Cell[20][20];;
public Grid(){
   for(int i=0;i<cells.length;i++){
    for(int j=0;j<cells[i].length;j++){
        cells[i][j]=new Cell(10+35*i,10+35*j);
    }
   }
}

public void paint(Graphics g, Point mouse){
    for(int i=0;i<cells.length;i++){
    for(int j=0;j<cells[i].length;j++){
        cells[i][j].paint(g, mouse);
    }
   }
	
      }
    
/*g.setColor(java.awt.Color.BLACK);
  for(int i=0;i<=20;i++){
    g.drawLine(10,10+(i*35),710,10+(i*35));

  }
  for (int j=0;j<=20;j++){
    g.drawLine(10+(j*35),10,10+(j*35),710);
  } */
	//g.drawRect(10, 10, 700, 700);
      }
    


