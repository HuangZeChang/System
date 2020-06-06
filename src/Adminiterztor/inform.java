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
		
		jb1 = new JButton("今日通知");
		jb2 = new JButton("管理员登录");
		
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
		if(e.getActionCommand().equals("今日通知")) {
			this.setVisible(false);
			message message = new message();
			message.setVisible(true);
		}
        if(e.getActionCommand().equals("管理员登录")) {
        	this.setVisible(false);
        	enter enter = new enter();
        	enter.setVisible(true);
		}
		
	}

}
