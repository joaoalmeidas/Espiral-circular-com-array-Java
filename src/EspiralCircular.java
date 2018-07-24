import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class EspiralCircular extends JPanel {
	
	public EspiralCircular(){
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//int raio = 50;
		int[] pontoInicial = {getWidth()/2, getHeight()/2};
		int posicao = 180;
		
		g.setColor(Color.RED);
		
		for(int raio = 20; raio <= getWidth(); raio += 10){
			
			posicao = posicao * -1;
			
			if(raio%20 == 0){
				g.drawArc(pontoInicial[0] - raio/2 - 5, pontoInicial[1] - raio/2, raio, raio, 0, posicao);
			}else{
				g.drawArc(pontoInicial[0] - raio/2, pontoInicial[1] - raio/2, raio, raio, 0, posicao);
			}
			

			
		}
		
		//g.drawArc(getWidth()/2, getHeight()/2, raio, raio, 0, 180);
		
		//g.drawArc(getWidth()/2 - raio, getHeight()/2 - raio/2, raio*2, raio*2, 0, -180);
		
		//g.drawArc(getWidth()/2 - raio, getHeight()/2 - raio -20, raio*4, raio*4, 0, 180);
		
	}
	
}
