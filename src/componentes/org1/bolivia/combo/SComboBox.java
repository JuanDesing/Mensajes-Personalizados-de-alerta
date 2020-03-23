package componentes.org1.bolivia.combo;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class SComboBox extends JComboBox{
 
    /** Constructor */
    public SComboBox()
    {
        Dimension dimension = new Dimension(50,32);
        setPreferredSize(dimension);
        setSize(dimension);      
        setForeground(new Color(226, 156, 69));
        setBackground(new Color(226, 156, 69));
        setBorder(BorderFactory.createLineBorder(new java.awt.Color(255, 54, 0)));
        setUI(CustomUI.createUI(this));                
        setVisible(true);
    }

}