package Adminiterztor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class inform extends JFrame implements ActionListener{

	private JButton jb1,jb2;
	
	public inform(){
		this.setLocation(500, 300);
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		jb1 = new JButton("����֪ͨ");
		jb2 = new JButton("����Ա��¼");
		
		this.add(jb1,BorderLayout.NORTH);
		this.add(jb2,BorderLayout.SOUTH);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	
	public static void main(String[] args) {
		 new inform();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����֪ͨ")) {
			this.setVisible(false);
			message message = new message();
			message.setVisible(true);
		}
        if(e.getActionCommand().equals("����Ա��¼")) {
        	this.setVisible(false);
        	enter enter = new enter();
        	enter.setVisible(true);
		}
		
	}

}
