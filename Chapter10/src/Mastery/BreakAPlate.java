package Mastery;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class BreakAPlate implements ActionListener

{
	
	ImageIcon allplates  = new ImageIcon("../Chapter10/src/Mastery/plates.gif");
	ImageIcon allBroken = new ImageIcon("../Chapter10/src/Mastery/plates_all_broken.gif");
	ImageIcon twoBroken = new ImageIcon("../Chapter10/src/Mastery/plates_two_broken.gif");
	ImageIcon tiger = new ImageIcon("../Chapter10/src/Mastery/tiger_plush.gif");
	ImageIcon sticker = new ImageIcon("../Chapter10/src/Mastery/sticker.gif");
	ImageIcon placeholder = new ImageIcon("../Chapter10/src/Mastery/placeholder.gif");
	
	private GameBooth BreakAPlate =
	new GameBooth(0, FIRST_PRIZE, CONSOLATION_PRIZE);
	private static final String FIRST_PRIZE = "tiger";
	private static final String CONSOLATION_PRIZE = "sticker";
	private JFrame frame;
	private JPanel contentPane;
	private JButton play;
	private JLabel plates, prizeWon;
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public BreakAPlate()
	{
		
		frame = new JFrame();
		frame.setTitle("Break A Plate");
		frame.setBounds(100, 100, 350, 268);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		play = new JButton("Play");
		play.setBounds(53, 169, 89, 23);
		play.addActionListener(this);
		contentPane.add(play);
		plates = new JLabel();
		plates.setBounds(27, 27, 281, 86);
		plates.setIcon(allplates);
		contentPane.add(plates);
		prizeWon = new JLabel();
		prizeWon.setBounds(183, 124, 125, 94);
		prizeWon.setIcon(placeholder);
		contentPane.add(prizeWon);
	}
	public void actionPerformed(ActionEvent event) {  String eventName = event.getActionCommand();

    if (eventName.equals("Play"))
    {
        String prize = BreakAPlate.start();

        if (prize.equals(FIRST_PRIZE)) {
            plates.setIcon(allBroken);
            prizeWon.setIcon(tiger);
        } else {
            plates.setIcon(twoBroken);
            prizeWon.setIcon(sticker);
        }

        play.setText("Play Again");
        play.setActionCommand("Play Again");

    } else if (eventName.equals("Play Again"))
    {
        plates.setIcon(allplates);
        prizeWon.setIcon(placeholder);

        play.setText("Play");
        play.setActionCommand("Play");
    }
    }
	private static String start()
	{
		Random random = new Random();
		int result = random.nextInt(2);
		if (result == 0) {
			return FIRST_PRIZE;
		} else {
			return CONSOLATION_PRIZE;
		}
	}
}

