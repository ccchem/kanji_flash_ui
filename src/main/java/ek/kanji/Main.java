package ek.kanji;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;

public class Main 
{

	private static void createUI()
	{
		MainWindow win = new MainWindow();
		win.setVisible(true);
	}
	
	public static void main(String[] args) throws Exception
	{
		UIManager.setLookAndFeel( new FlatDarkLaf());
		JFrame.setDefaultLookAndFeelDecorated(true);
		Runnable run = () -> { createUI(); };		
		SwingUtilities.invokeLater(run);
	}

}
