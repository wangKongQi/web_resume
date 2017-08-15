package work;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WriterTo extends JFrame implements ActionListener{
	JButton b;JTextField t;
	public WriterTo(){
		super("文本框内容写入文件");
		JLabel l=new JLabel("请输入内容：");
		t=new JTextField(30);
		b=new JButton("写入");
		b.addActionListener(this);
		this.add(l);
		this.add(t);
		this.add(b);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b){
			if(t.getText().equals("")){
				JOptionPane.showMessageDialog(null,"请输入内容~","错误",JOptionPane.ERROR_MESSAGE);
				t.grabFocus();
			}else{
				write(t.getText());
				JOptionPane.showMessageDialog(null,"写入成功","提示",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	public void write(String line){
		try{
			Date datatime = new Date();
			SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd");
			File f=new File("E:/"+data.format(datatime)+".txt");//向指定文本框内写入
			FileWriter fw=new FileWriter(f);
			fw.write(line);
			fw.close();
		}catch(Exception e){

		}
	}
	public static void main(String[] args) {
		new WriterTo();
	}

}
