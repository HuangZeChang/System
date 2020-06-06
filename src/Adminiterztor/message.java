package Adminiterztor;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class message extends JFrame implements ActionListener{

	private JLabel tx1,tx2,tx3;
	private JTextField im;
	private int i=0;
	private Calendar time;
	private String str;
	
	public message(){
		super();
		this.setLocation(500, 300);
		this.getContentPane().setBackground(Color.yellow);
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		wenben();
		
	}
	
	public void wenben(){
		this.setLayout(null);
		
		tx1 = new JLabel("同学们好：");
    	tx2 = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本学期的实训开始啦！我们两位老师，将伴随你们，帮助你们一起完成本次实训.<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;希望大家以轻松愉快的心情完成本次实训，并取得好成绩！</html>");
    	tx3 = new JLabel("阅读签名：");
    	im = new JTextField();
    	
    	tx1.setFont(new Font("隶书",1,20));
    	tx2.setFont(new Font("隶书",1,20));
    	tx3.setFont(new Font("隶书",1,25));
    
    	tx1.setBounds(0, 0, 150, 20);
    	tx2.setBounds(0, 30, 450, 110);
    	tx3.setBounds(100, 150, 150, 25);
    	im.setBounds(230, 150, 150, 25);
    	
    	this.add(tx1);
    	this.add(tx2);
    	this.add(tx3);
    	this.add(im);
    	
    	im.addActionListener(this);
	 }

	 public void actionPerformed(ActionEvent e) {
		
		if(im.getText().equals("")){
		    JOptionPane.showMessageDialog(null,"签名不能为空","错误提醒！",JOptionPane.ERROR_MESSAGE);
		    im.grabFocus();
		   }else{
		    write(im.getText());
		    JOptionPane.showMessageDialog(null,"签名成功","提示！",JOptionPane.INFORMATION_MESSAGE);
		   }
	 }
		
	 public void write(String line){
		 
		 FileWriter fWriter;
		 
		 time = Calendar.getInstance();
		 
		 str = time.get(time.HOUR)+":"+time.get(time.MINUTE)+":"+time.get(time.SECOND);
		 
		  try{
			  i++;
		   fWriter = new FileWriter("F:/签到记录/text.txt",true);
		   
		   fWriter.write(i + "\t" + line + ":\t" + str);
		   fWriter.write("\r\n");
		   fWriter.close();
		  }catch(Exception e){
		 
		  }
		  
	 }
	 
	 
}
