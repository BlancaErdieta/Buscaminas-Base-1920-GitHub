import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;


/**
 * Clase que implementa el listener de los botones del Buscaminas.
 * De alguna manera tendrá que poder acceder a la ventana principal.
 * Se puede lograr pasando en el constructor la referencia a la ventana.
 * Recuerda que desde la ventana, se puede acceder a la variable de tipo ControlJuego
 * @author jesusredondogarcia
 **
 */
public class ActionBoton implements ActionListener{
	int i;
	int j;
	ControlJuego juego;
	VentanaPrincipal ventana;
	

	public ActionBoton(int i ,int j, ControlJuego juego, VentanaPrincipal ventana) {
		this.i=i;
		this.j=j;
		this.juego= juego;
		this.ventana = ventana;
	}
	
	/**
	 *Acción que ocurrirá cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (juego.abrirCasilla(i, j) == true) {
			ventana.mostrarNumMinasAlrededor(i, j);

		}else if(juego.abrirCasilla(i, j) != true)  {
			
			ventana.mostrarFinJuego(true);
			
			
		}
		ventana.actualizarPuntuacion();
		if (juego.esFinJuego()==true) {
			ventana.mostrarFinJuego(false);
		}
		
	}

}
