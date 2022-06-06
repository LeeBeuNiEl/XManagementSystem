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
		
		// ����� ������ ���� ���
		System.out.println("***" + foodmenumanager.size() + "***");
		
		// ������ ���� ���� ����
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Telephone");
		
		// �Էµ� ������ GUI�� �ϳ��� row�� ������� �߰��ϴ� �Լ�
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
		
		// �гο� sp(��ũ�� ��)�� �߰�
		this.add(sp);
	}

}
