package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import food.FoodInput;
import manager.FoodMenuManager;

public class FoodViewer extends JPanel {
	
	WindowFrame frame;
	
	FoodMenuManager foodmenumanager;

	public FoodViewer(WindowFrame frame, FoodMenuManager foodmenumanager) {
		this.frame = frame;
		this.foodmenumanager = foodmenumanager;
		
		// 저장된 음식의 수를 출력
		System.out.println("***" + foodmenumanager.size() + "***");
		
		// 정보에 대한 행을 생성
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Telephone");
		
		// 입력된 정보를 GUI속 하나의 row에 순서대로 추가하는 함수
		for (int i=0; i<foodmenumanager.size(); i++) {
			Vector row = new Vector();
			FoodInput fi = foodmenumanager.get(i);
			row.add(fi.getNumber());
			row.add(fi.getName());
			row.add(fi.getAddress());
			row.add(fi.getTelephone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		// 패널에 sp(스크롤 팬)를 추가
		this.add(sp);
	}

}
