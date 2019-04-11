import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener
{
    JButton przycisk;
    public void guiLaunch()
    {
        JFrame ramka = new JFrame();

        przycisk = new JButton("Wykonaj");
        przycisk.addActionListener(this);

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(500,500);
        ramka.setTitle("Wyswietlanie zawartosci folderu");
        
        ramka.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
    }
}
