import javax.swing.*;

public class Formulario extends JFrame{

		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Formulario() {		
		setLayout(null);		
	}

	public static void main(String[] args) {
		
		Formulario formulario = new Formulario();
		formulario.setBounds(500, 200, 500, 300);
        formulario.setVisible(true); 
        formulario.setResizable(false);
	}

}
