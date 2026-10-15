package Mastery;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
public class SchoolInfo
{
	private JFrame frame;
	private JTextField firstName;
	private JTextField lastName;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					SchoolInfo window = new SchoolInfo();
					window.frame.setVisible(true);
				}
				
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	public SchoolInfo()
	{
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		ImageIcon allImage = new ImageIcon("../Chapter10/src/Mastery/all.jpg");
		ImageIcon ChImage = new ImageIcon("../Chapter10/src/Mastery/Ch.png");
		ImageIcon jfImage = new ImageIcon("../Chapter10/src/Mastery/jf.png");
		ImageIcon ntImage = new ImageIcon("../Chapter10/src/Mastery/nt.png");
		ImageIcon placeholderImage = new ImageIcon("../Chapter10/src/Mastery/placeholder.gif");
		ImageIcon resizedall = new ImageIcon(allImage.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
		ImageIcon resizedCh = new ImageIcon(ChImage.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
		ImageIcon resizedjf = new ImageIcon(jfImage.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
		ImageIcon resizednt = new ImageIcon(ntImage.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
		ImageIcon resizedPlaceholder = new ImageIcon(placeholderImage.getImage().getScaledInstance(240, 170, Image.SCALE_SMOOTH));
		JLabel images = new JLabel("");
		images.setBounds(20, 170, 270, 177);
		images.setIcon(resizedPlaceholder);
		images.setBackground(new Color(255, 255, 255));
		panel.add(images);
		JButton submit = new JButton("Submit");
		submit.setBounds(300, 30, 111, 163);
		panel.add(submit);
		firstName = new JTextField();
		firstName.setBounds(20, 25, 125, 20);
		firstName.setText("Enter first name");
		firstName.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				if (firstName.getText().equals("Enter first name"))
				{
					firstName.setText("");
				}
			}
		});
		panel.add(firstName);
		firstName.setColumns(10);
		lastName = new JTextField();
		lastName.setBounds(155, 25, 125, 20);
		lastName.setText("Enter last name");
		lastName.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				if (lastName.getText().equals("Enter last name"))
				{
					lastName.setText("");
				}
			}
		});
		panel.add(lastName);
		lastName.setColumns(10);
		JComboBox grade = new JComboBox();
		
		grade.setBounds(20, 63, 80, 28);
		grade.setModel(new DefaultComboBoxModel(new String[] {"My grade", "10", "11", "12"}));
		panel.add(grade);
		grade.addPopupMenuListener(new PopupMenuListener()
		{
			public void popupMenuCanceled(PopupMenuEvent e)
			{		
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
			{		
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e)
			{
				grade.removeItem("My grade");
			}
		});
		
		JComboBox school = new JComboBox();
		
		school.setBounds(161, 63, 119, 28);
		school.setModel(new DefaultComboBoxModel(new String[] {"My School", "All Saints", "Crescent", "James Fowler", "North Trail"}));
		panel.add(school);
		
		school.addPopupMenuListener(new PopupMenuListener()
		{
			public void popupMenuCanceled(PopupMenuEvent e)
			{
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
			{
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e)
			{
				school.removeItem("My School");
			}
		});
		JTextArea info = new JTextArea();
		info.setWrapStyleWord(true);
		info.setLineWrap(true);
		info.setBounds(20, 99, 260, 61);
		panel.add(info);
		school.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (school.getSelectedItem().equals("All Saints"))
				{
					images.setIcon(resizedall);
				}
				else if (school.getSelectedItem().equals("Crescent"))
				{
					images.setIcon(resizedCh);
				}
				else if (school.getSelectedItem().equals("James Fowler"))
				{
					images.setIcon(resizedjf);
				}
				else if (school.getSelectedItem().equals("North Trail"))
				{
				    images.setIcon(resizednt);
				}
			}
		});
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String fn = firstName.getText();
				String ln = lastName.getText();
				String gr = grade.getSelectedItem().toString();
				String sch = school.getSelectedItem().toString();
				info.setText(fn + " " + ln + " is in grade " + gr + " and goes to " + sch + " highschool");
			}
		});
	}
}



