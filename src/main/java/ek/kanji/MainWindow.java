package ek.kanji;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class MainWindow extends JFrame 
{
	private JLabel lblKanji;
	private JLabel lblKana;
	private JLabel lblEnglish; 
	
	public MainWindow()
	{
		super("KanjiMem");
	
		getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(40,40,40));
	    //getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.white);
		
		setSize(1000, 800);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initContent(getContentPane());
		
		lblEnglish.setVisible(false);
	}
	
	private void initContent(Container con)
	{
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		lblKanji = new JLabel("館");
		lblKanji.setFont(lblKanji.getFont().deriveFont(250f));
		lblKanji.setAlignmentX(Component.CENTER_ALIGNMENT);
		//lblKanji.setBorder(new EmptyBorder(50,0,0,0));
		con.add(lblKanji);

		lblKana = new JLabel("やかた");
		lblKana.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblKana.setFont(lblKana.getFont().deriveFont(80f));
		lblKana.setBorder(new EmptyBorder(50,0,0,0));
		con.add(lblKana);

		lblEnglish = new JLabel("building");
		lblEnglish.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblEnglish.setFont(lblEnglish.getFont().deriveFont(50f));
		lblEnglish.setBorder(new EmptyBorder(50,0,0,0));
		con.add(lblEnglish);
	}
	
}
