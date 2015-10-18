import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HomePage extends JFrame {
	
	private static final String FILE_PATH = "C:/Users/kn/workspace/Choi/images/";
	private ImageIcon icon = new ImageIcon("images/GWNU.jpg");
	private Container c = getContentPane();
	 
	String [] year = {"년도", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997"};
	String [] month = {"월", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	String [] day = {"일", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	String [] mail = {" ", "naver.com", "daum.net", "google.com", "nate.com", "yahoo.com"};
	String [] hp = {"통신사", "SKT", "KT", "LG"};
	HomePage() {
		setTitle("회원가입 홈페이지");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		
		JLabel label = new JLabel("강릉원주대학교 회원가입 홈페이지");
		label.setLocation(60, 230);
		label.setSize(500, 100);
		label.setFont(new Font("궁서", Font.ITALIC, 30));
		c.add(label);
		
		JLabel label1 = new JLabel("ID");
		label1.setLocation(100, 330);
		label1.setSize(100, 30);
		c.add(label1);
		
		JTextField tf1 = new JTextField("아이디를 입력하세요.");
		tf1.setLocation(140, 330);
		tf1.setSize(200, 30);
		tf1.setForeground(Color.RED);
		c.add(tf1);
		
		JButton bt1 = new JButton("Check");
		bt1.setBackground(Color.WHITE);
		bt1.setForeground(Color.BLACK);
		bt1.setFont(new Font("Arial", Font.ITALIC , 9));
		bt1.setLocation(380, 330);
		bt1.setSize(70, 30);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("아이디를 입력하세요.");
				if(name != null)
					tf1.setText(name);
			}
		});
		c.add(bt1);
		
		JLabel label2 = new JLabel("Password");
		label2.setLocation(60, 380);
		label2.setSize(100, 30);
		c.add(label2);
		
		JTextField tf2 = new JTextField("비밀번호를 입력하세요");
		tf2.setLocation(140, 380);
		tf2.setSize(200, 30);
		tf2.setForeground(Color.RED);
		c.add(tf2);
		
		JLabel label3 = new JLabel("Confirm");
		label3.setLocation(70, 430);
		label3.setSize(100, 30);
		c.add(label3);
		
		JTextField tf3 = new JTextField("비밀번호를 다시 한번 입력하세요");
		tf3.setLocation(140, 430);
		tf3.setSize(200, 30);
		tf3.setForeground(Color.RED);
		c.add(tf3);
		c.add(new JTextField(20));
		
		JLabel label4 = new JLabel("이름");
		label4.setLocation(60, 490);
		label4.setSize(50, 20);
		c.add(label4);
		
		JLabel label10 = new JLabel("닉네임");
		label10.setLocation(300, 490);
		label10.setSize(50, 20);
		c.add(label10);
		
		JTextField tf8 = new JTextField();
		tf8.setLocation(350, 490);
		tf8.setSize(120, 25);
		c.add(tf8);
		
		JTextField tf4 = new JTextField();
		tf4.setLocation(100, 490);
		tf4.setSize(80, 25);
		c.add(tf4);
			
		JLabel Logo = new JLabel(icon);
		Logo.setSize(200,200);
		Logo.setLocation(180, 40);
		c.add(Logo);
		
		JLabel label5 = new JLabel("생년월일");
		label5.setLocation(40, 550);
		label5.setSize(60, 20);
		c.add(label5);
		
		JComboBox cb1 = new JComboBox(year);
		cb1.setSize(80, 20);
		cb1.setLocation(100, 550);
		c.add(cb1);
		
		JComboBox cb2 = new JComboBox(month);
		cb2.setSize(80, 20);
		cb2.setLocation(200, 550);
		c.add(cb2);
		
		JComboBox cb3 = new JComboBox(day);
		cb3.setSize(80, 20);
		cb3.setLocation(300, 550);
		c.add(cb3);
		
		JLabel label6 = new JLabel("성별");
		label6.setLocation(60, 590);
		label6.setSize(60, 20);
		c.add(label6);
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton male = new JRadioButton("남성");
		male.setSize(60, 20);
		male.setLocation(100, 590);
		male.setBackground(Color.WHITE);
		c.add(male);
		
		JRadioButton female = new JRadioButton("여성");
		female.setSize(80, 20);
		female.setLocation(160, 590);
		female.setBackground(Color.WHITE);
		c.add(female);
		
		g.add(male);
		g.add(female);
		
		JLabel label7 = new JLabel("E-mail");
		label7.setLocation(50, 630);
		label7.setSize(60, 20);
		c.add(label7);
		
		JTextField tf5 = new JTextField();
		tf5.setLocation(100, 630);
		tf5.setSize(130, 20);
		c.add(tf5);
		
		JLabel label8 = new JLabel("@");
		label8.setLocation(240, 623);
		label8.setSize(30, 30);
		c.add(label8);
		
		JComboBox cb4 = new JComboBox(mail);
		cb4.setSize(100, 20);
		cb4.setLocation(260, 630);
		c.add(cb4);
		
		JTextField tf6 = new JTextField("직접입력");
		tf6.setLocation(380, 630);
		tf6.setSize(110, 20);
		c.add(tf6);
		
		JLabel label9 = new JLabel("휴대폰");
		label9.setLocation(50, 660);
		label9.setSize(50, 50);
		c.add(label9);
		
		JComboBox cb5 = new JComboBox(hp);
		cb5.setSize(70, 20);
		cb5.setLocation(100, 675);
		c.add(cb5);
		
		JTextField tf7 = new JTextField("직접입력");
		tf7.setLocation(180, 675);
		tf7.setSize(110, 20);
		c.add(tf7);
		
		JButton bt2 = new JButton("회원가입");
		bt2.setBackground(Color.WHITE);
		bt2.setForeground(Color.BLACK);
		bt2.setLocation(150, 750);
		bt2.setSize(90, 30);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "정말 가입하시겠습니까?", "회원가입", JOptionPane.YES_NO_OPTION);
				
			
			}
		});
		c.add(bt2);
		
		JButton bt3 = new JButton("취소");
		bt3.setBackground(Color.WHITE);
		bt3.setForeground(Color.BLACK);
		bt3.setLocation(320, 750);
		bt3.setSize(90, 30);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?", "취소", JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.YES_OPTION)
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				else
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		c.add(bt3);
		
		setSize(600,900);
		setVisible(true);
		
	}
		
		
		
	
public static void main(String[] args) {
		new HomePage();
	
	}

}



	
	
	
	
		
		
	
	
	
	
	




