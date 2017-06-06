package musai;

import musai.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class Delete extends JFrame {

	
	char[] map=new char[1000];
	
	private JPanel contentPane;

	//Launch the application.
	public static void main(String[] args) {
		Delete frame = new Delete();
		frame.setVisible(true);
	}

	 //Create the frame.
	public Delete() {
		
		///////////////////////////////삭제 확인창 전체 프레임
		setBounds(100, 100, 426, 165);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//삭제하시겠습니까 레이블
		JLabel lblNewLabel = new JLabel("삭제하시겠습니까?");
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		lblNewLabel.setBounds(105, 12, 197, 39);
		contentPane.add(lblNewLabel);
				
		//확인버튼
		JButton button = new JButton("확인");
		button.setForeground(new Color(128, 128, 128));
		button.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		button.setBounds(66, 63, 105, 41);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//삭제 기능 구현 하기
			String msg;
			String str;
			String str1;
	        BufferedWriter bw = null;
	        try {
	        	bw = new BufferedWriter(new FileWriter("data.dt"));
//	        	for(i=0;i<=;i++)
	        	
	        	
	            bw.flush();
	            bw.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            if(bw != null) try {bw.close(); } catch (IOException e) {}
	        }
	        try {
				Mainframe ma = new Mainframe();
				ma.setVisible(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				dispose();
			}});
				
					
		//취소 버튼
		JButton btnNewButton = new JButton("취소");
		btnNewButton.setForeground(new Color(128, 128, 128));
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		btnNewButton.setBounds(237, 63, 105, 41);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
	}
}
