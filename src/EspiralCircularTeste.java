import javax.swing.JFrame;

public class EspiralCircularTeste {

	public static void main(String[] args) {
		
		EspiralCircular panel = new EspiralCircular();
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(panel);
		aplicacao.setSize(400, 250);
		aplicacao.setVisible(true);

	}

}
