package Adminiterztor;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class examine extends JFrame implements ActionListener{

	private JTextArea im;
	private JButton jb1,jb2;
	
	public examine() {
		super();
		this.setLocation(500,300);
		this.setSize(560,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		liebiao();
	}
	private void liebiao() {
		// TODO Auto-generated method stub
		this.setLayout(null);
		
		im=new JTextArea();
		jb1=new JButton("查看");
		jb2=new JButton("清空");
		

		jb1.setFont(new Font("隶书",1,25));
		jb2.setFont(new Font("隶书",1,25));
		
		im.setBounds(20, 20, 500, 300);
		jb1.setBounds(130, 350, 100, 30);
		jb2.setBounds(270, 350, 100, 30);
		
		this.add(im);
		this.add(jb1);
		this.add(jb2);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("查看")) {

			 try{
			     BufferedReader br = new BufferedReader(new FileReader("F:/签到记录/text.txt"));
			     String s;
			     while ((s = br.readLine()) != null) {
                im.setText(im.getText() + "\n" + s);
			     }
			     br.close();

			 }catch(FileNotFoundException e1){
                e1.printStackTrace();
			     im.append("没有签到记录！");

			 }catch(IOException e2){

			     e2.printStackTrace();

			 }
			
		}
       if(e.getActionCommand().equals("清空")) {
       	this.setVisible(true);
       	
       	Object[] options = {"是(Y)","是否(N)","取消"};
			int n = JOptionPane.showOptionDialog(this,"是否所有清除内容？", "showConfirmDialog", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			if(n==0){
			    im.setText("");
			    File file = new File("F:/签到记录/text.txt");   
			       file.delete();   
			}
			if(n==1){
  		    	im.setText("");
			
			}
		
		}
		
	}

}
