package app.vistaPrincipal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Esteban Olaya
 * @author Christian Galindo
 */
public class VistaPrincialTemplate extends JFrame{
    
    private JButton bEnviar;
    private JTextField tNombre;
    private JLabel lnombre;
    
    public VistaPrincialTemplate(){
        super("Vista princial");
        this.saludar();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200,700);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }
    
    public void saludar(){
        String mensaje = "Hola Mundo";
        System.out.println(mensaje);
    }
}
