import javax.swing.*;

public class GUI
{
    public static void guiLaunch()
    {
        JFrame ramka = new JFrame();
        JButton przycisk = new JButton("Wykonaj");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(300,500);
        ramka.setVisible(true);
    }
}
