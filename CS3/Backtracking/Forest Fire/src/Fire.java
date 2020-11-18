import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/*
    this is the Controller component
*/

class Fire extends JFrame
{

    private FireView view;
    private FireModel model;

    Fire()
    {
        super("Forest Fire");

        // build the view
        view = new FireView();
        view.setBackground(Color.white);
        Container c = getContentPane();
        c.add(view, BorderLayout.CENTER);

        // build the model
        model = new FireModel(view);
        model.solve();
    }

    public static void main(String[] args)
    {
        Fire smokey = new Fire();
        smokey.addWindowListener(new WindowAdapter()
                                 {
                                     public void windowClosing(WindowEvent e)
                                     {
                                         System.exit(0);
                                     }
                                 }
                                );
        smokey.setSize(570, 640);
        //smokey.show();
        smokey.setVisible(true);
    }
}
