package Adminiterztor;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class enter extends JFrame implements ActionListener{
	
	JLabel tx1;
	private JLabel tx2,tx3;
	private JTextField im1;
	private JPasswordField im2;
	private JButton jb;
	
	public enter() {
		super();
		this.setLocation(500,300);
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		denglu();
	}

	private void denglu() {
		// TODO Auto-generated method stub
		this.setLayout(null);
		
		tx1=new JLabel("Name:");
		tx2=new JLabel("Password:");
		tx3=new JLabel(" ");
		im1=new JTextField();
		im2=new JPasswordField();
		jb=new JButton("OK");
		
		tx1.setFont(new Font("隶书",1,20));
    	tx2.setFont(new Font("隶书",1,20));
    	tx3.setFont(new Font("隶书",1,20));
    	jb.setFont(new Font("隶书",1,25));
    	
   		
   		tx1.setBounds(105, 80, 150, 20);
    	tx2.setBounds(70, 120, 150, 20);
    	tx3.setBounds(100, 150, 150, 20);
    	im1.setBounds(200, 80, 150, 25);
    	im2.setBounds(200, 120, 150, 25);
    	jb.setBounds(200, 150, 120, 30);
   		
   		this.add(tx1);
   		this.add(tx2);
   		this.add(tx3);
   		this.add(im1);
   		this.add(im2);
   		this.add(jb);
   		
   		
   		jb.addActionListener(this);
   		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("OK")) {
		    if(im1.getText().equals("admin") && String.valueOf(im2.getPassword()).equals("123456")){
			     examine examine= new examine();
			     examine.setVisible(true);
			     this.setVisible(false);
		    }else{
		    	JOptionPane.showMessageDialog(null,"您当前还没有账号，是否需要注册？","温馨提示！",JOptionPane.ERROR_MESSAGE);
			    im1.grabFocus();
			}
		
		}
	}

	
		
}


