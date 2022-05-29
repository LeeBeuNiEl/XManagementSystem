package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FoodViewer extends JFrame {

	public FoodViewer() {
		// 정보에 대한 행을 생성
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Telephone");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		// 프레임에 sp를 추가, 프레임 크기 설정, 프로그램의 종료와 디버깅 종료의 동시성 부여, 프로그램의 가시성 부여
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
