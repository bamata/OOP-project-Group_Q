/*
        Group members
        =============
        Name                                 Registration Number
        ====                                 ===================
        BAMATA WA BAMATA Maurice             18/420/BSSE-S
        NDAHURA BASARA Moses                 19/231/BIT-S
        ALLY KALIMA                          18/1097/BIT-S
        NANNYUNJA NOELINA                    19/536/BSCS-S
        HUSSAIN AKIL BHARMAL                 18/563/BIT-S
        DANIEL AKEEN ATER                    19/632/BIT-S
 */

package org.iuea.oop.view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import org.iuea.oop.modall.Student;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class MainView extends JFrame{
			
	public MainView() {		
		
		//LABELS FOR ADD VIEW
		JLabel label_first_name; 
	
		JLabel label_last_name ;
		
		JTextField field_first_name ;
		
		JTextField field_last_name ;
		
		JLabel label_regNo;
		
		JTextField regNo;
		
		JLabel courseName;
	
		JTextField courseField;
		
		JLabel label_sex;
		
		JComboBox sex;
		
		JButton submit;
		
		JButton cancel;
		
		//INITIALIZATION
		 label_first_name = new JLabel("First Name :");
		 label_first_name.setBounds(0, 0, 90, 50 );
		 
		 label_last_name = new JLabel("Last Name  :");
		 label_last_name.setBounds(0, 50, 90, 50);

		 field_first_name = new JTextField(20);
		 field_first_name.setBounds(100, 10, 150, 30);
	
		 field_last_name = new JTextField(20);
		 field_last_name.setBounds(100, 60, 150, 30);
		 
		 label_regNo= new JLabel("Registration No :");
		 label_regNo.setBounds(0, 70, 100, 100);
		
		 regNo = new JTextField(20);
		 regNo.setBounds(100, 100, 150, 30);
		
		 courseName= new JLabel("Course :");
		 courseName.setBounds(0, 110, 100, 90);
		 
		 courseField = new JTextField(20);
		 courseField.setBounds(100, 140, 150, 30);
		
		String [] sexItems = {"Male","Female"};
		
		label_sex = new JLabel("Sex :");
		label_sex.setBounds(0, 175, 30, 30);
		
		 sex = new JComboBox(sexItems);	
		 sex.setBounds(100, 175, 80, 30); 
		 
		 submit = new JButton("Submit");
		 submit.setBounds(20, 250, 90, 30);
		 submit.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));
		 submit.setBackground(Color.green);
		 submit.setForeground(Color.white);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(170, 250, 90, 30);
		cancel.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));
		cancel.setBackground(Color.orange);
		cancel.setForeground(Color.white);

		JPanel form = new JPanel(null);

		//adding components
		form.add(label_first_name);
		form.add(field_first_name);
		form.add(label_last_name);
		form.add(field_last_name);
		form.add(label_sex);
		form.add(sex);
		form.add(label_regNo);
		form.add(regNo);
		form.add(courseName);
		form.add(courseField);
		form.add(submit);
		form.add(cancel);
		
				
		// EDIT OBJECTS
		JLabel elabel_first_name; 
		
		JLabel elabel_last_name ;
		
		JTextField efield_first_name ;

		JTextField efield_last_name ;
		
		JLabel elabel_regNo;

		JTextField eregNo;
		
		JLabel ecourseName;
		
		JTextField ecourseField;
		
		JLabel elabel_sex;
		
		JComboBox esex;

		JButton esubmit;
		
		JButton ecancel;

		/*
		 * ===========
		 * EDIT VIEW
		 * ===========
		 * 
		 * */

		 elabel_first_name = new JLabel("First Name :");
		 elabel_first_name.setBounds(0, 0, 90, 50 );
		 
		 elabel_last_name = new JLabel("Last Name  :");
		 elabel_last_name.setBounds(0, 50, 90, 50);
		
		 efield_first_name = new JTextField(20);
		 efield_first_name.setBounds(100, 10, 150, 30);
		 
		 efield_last_name = new JTextField(20);
		 efield_last_name.setBounds(100, 60, 150, 30);
	
		 elabel_regNo= new JLabel("Registration No :");
		 elabel_regNo.setBounds(0, 70, 100, 100);

		 eregNo = new JTextField(20);
		 eregNo.setBounds(100, 100, 150, 30);

		 ecourseName= new JLabel("Course :");
		 ecourseName.setBounds(0, 110, 100, 90);
		 
		 ecourseField = new JTextField(20);
		 ecourseField.setBounds(100, 140, 150, 30);
		
		String [] esexItems = {"Male","Female"};
		
		elabel_sex = new JLabel("Sex :");
		elabel_sex.setBounds(0, 175, 30, 30);
		
		 esex = new JComboBox(sexItems);	
		 esex.setBounds(100, 175, 80, 30);
		 
		 esubmit = new JButton("Submit");
		 esubmit.setBounds(20, 250, 90, 30);
		 esubmit.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));
		 esubmit.setBackground(Color.green);
		 esubmit.setForeground(Color.white);
		
		ecancel = new JButton("Cancel");
		ecancel.setBounds(170, 250, 90, 30);
		ecancel.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));
		ecancel.setBackground(Color.orange);
		ecancel.setForeground(Color.white);
		
		// CREATE PANEL FOR EDIT
		JPanel ePanel = new JPanel(null);
		ePanel.add(elabel_first_name);
		ePanel.add(efield_first_name);
		ePanel.add(elabel_last_name);
		ePanel.add(efield_last_name);
		ePanel.add(elabel_sex);
		ePanel.add(esex);
		ePanel.add(elabel_regNo);
		ePanel.add(eregNo);
		ePanel.add(ecourseName);
		ePanel.add(ecourseField);
		ePanel.add(esubmit);
		ePanel.add(ecancel);
		
		//FRAME
		new JFrame();
		
		//MENU PANEL
		JPanel menuBarPanel = new JPanel();
	
		//MENU BAR
		JMenuBar menuBar = new JMenuBar();
		
		//ACTION MENU
		JMenu actionMenu = new JMenu("Action");
		menuBar.add(actionMenu);

		//HELP MENU
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		//LOGOUT MENU ITEM 
		JMenuItem logOut = new JMenuItem("Logout");

		actionMenu.add(logOut);
		
		menuBarPanel.add(menuBar);
		menuBarPanel.setLayout(new FlowLayout(5));
		menuBarPanel.setBorder(new LineBorder(Color.black, 3));
		
		//OPTIONS
		JButton student = new JButton("Student");
		student.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));

		JButton course = new JButton("Course");
		course.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));

		JButton courseUnits = new JButton("Course Units");
		courseUnits.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));

		JButton lecturers = new JButton("Lecturers");
		lecturers.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));

		JPanel optionPanel = new JPanel();
		optionPanel.setLayout(new GridLayout(4, 0, 0, 0));

		//PANEL
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(4, 4, 4));
		panel.add(optionPanel);
		panel.setBorder(new LineBorder(Color.black, 3));
		
		//OPTION PANEL
		optionPanel.add(student);
		optionPanel.add(course);
		optionPanel.add(courseUnits);
		optionPanel.add(lecturers);

		//FOOTER
		JLabel footer = new JLabel("Copy right groupq 2019");	

		JPanel panelfooter = new JPanel();
		panelfooter.add(footer);
		
		//CENTER PANEL
		JPanel centerPanel = new JPanel(); 
		centerPanel.setLayout(new BorderLayout());
		
		//MAIN PANEL
		JPanel mainPanel = new JPanel( new BorderLayout(8, 6));
		mainPanel.add(panelfooter, BorderLayout.SOUTH);
		mainPanel.add(menuBarPanel, BorderLayout.NORTH);
		mainPanel.add(panel, BorderLayout.WEST);
		mainPanel.add(centerPanel, BorderLayout.CENTER);

		//ADD, EDI, DELETE, AND TABLE PANEL
		JPanel add_delete_edit_table = new JPanel();
		add_delete_edit_table.setLayout(new FlowLayout(40, 100, 20));
		
		add_delete_edit_table.setVisible(false);
		
		//ADD BUTTON
		JButton addStudent = new JButton("Add");
		addStudent.setBackground(Color.green);
		addStudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,20,20,25));
		
		//EDIT BUTTON
		JButton editBtn = new JButton("Edit");
		editBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,20,20,25));
		editBtn.setBackground(Color.orange);
		
		//DELETE BUTTON
		JButton delete = new JButton("Delete");
		delete.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,20,20,25));
		delete.setBackground(Color.red);
		
		add_delete_edit_table.add(addStudent);
		add_delete_edit_table.add(editBtn);
		add_delete_edit_table.add(delete);
		
		//TABLE 
		JTable studentInfo = new JTable();
		
		//TABLE HEADER
		Object [] columns = { "FirstName", "LastName", "Sex", "Course", "Resgistration"};
		
		String data [][] = {{"Cell 1","Cell 2","Cell 3", "Cell 4", "Cell 5" },{"Cell 6","Cell 7","Cell 8", "Cell 9", "Cell 10" }};
		
		DefaultTableModel model = new DefaultTableModel();
		
		model.setDataVector( data, columns);
	
		studentInfo.setModel(model);
		
		Object[] row = new Object[5];
		
		studentInfo.setRowHeight(30);
		studentInfo.setBackground(Color.white);
		studentInfo.setForeground(Color.black);
		Font font = new Font("", 1, 12);
		studentInfo.setFont(font);
		System.out.println(studentInfo);;
		JScrollPane scrollPane = new JScrollPane(studentInfo);
		studentInfo.setFillsViewportHeight(true);
		
		JPanel tablePane = new JPanel();

		tablePane.add(scrollPane);
		
		logOut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				  LoginView log = new LoginView(); 
				  setVisible(false); 
				  log.setVisible(true);	 
			}

		});
		
		// Student button event
		student.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				centerPanel.add(add_delete_edit_table, BorderLayout.NORTH);
				centerPanel.add(tablePane, BorderLayout.CENTER);
				
				ePanel.setVisible(false);
				form.setVisible(false);
				tablePane.setVisible(true);
				add_delete_edit_table.setVisible(true);
				
			}
			
		});
				// MAKING TABLE CLICKABLE
				studentInfo.addMouseListener( new MouseAdapter() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						int selectedRow = studentInfo.getSelectedRow();
						
						field_first_name.setText(model.getValueAt(selectedRow, 0).toString());
						field_last_name.setText(model.getValueAt(selectedRow, 1).toString());
						sex.setSelectedItem(model.getValueAt(selectedRow, 2).toString());
						regNo.setText(model.getValueAt(selectedRow, 3).toString());
						courseField.setText(model.getValueAt(selectedRow, 4).toString());	
					}
				});
				
				// EDIT EVENT
				editBtn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						int i = studentInfo.getSelectedRow();
						
						if (i >= 0) {
							
						} else {
							
							JOptionPane.showMessageDialog(MainView.this, "Please select a row to edit", "Error", JOptionPane.ERROR_MESSAGE);
							return;
							
						}
						
						efield_first_name.setText(field_first_name.getText());
						efield_last_name.setText(field_last_name.getText());
						esex.setSelectedItem(sex.getSelectedItem());
						eregNo.setText(regNo.getText());
						ecourseField.setText(courseField.getText());
						
						centerPanel.add(ePanel);
						
						add_delete_edit_table.setVisible(false);
						tablePane.setVisible(false);
						form.setVisible(false);
						ePanel.setVisible(true);
						
					}
				});
							// EVENT FOR SUBMIT BUTTON UNDER EDIT BUTTON
							esubmit.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								
								form.setVisible(false);
								add_delete_edit_table.setVisible(true);
								tablePane.setVisible(true);
								ePanel.setVisible(false);
								
								int i = studentInfo.getSelectedRow();
								
								if (i >= 0) {
													
									model.setValueAt(efield_first_name.getText(), i, 0);
									model.setValueAt(efield_last_name.getText(), i, 1);
									model.setValueAt(esex.getSelectedItem(),i, 2);
									model.setValueAt(eregNo.getText(), i, 3);
									model.setValueAt(ecourseField.getText(), i, 4);				
								
								} else {
																
								}
							}
							
						});
						
						// EVENT FOR CANCEL BUTTON UNDER EDIT
						ecancel.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								ePanel.setVisible(false);
								add_delete_edit_table.setVisible(true);
								tablePane.setVisible(true);
								
							}
							
						});
				
				//CANCEL BUTTON EVENT UNDER ADD BUTTON
				cancel.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						form.setVisible(false);
						add_delete_edit_table.setVisible(true);
						tablePane.setVisible(true);
					}
					
				});
				
		// ADD BUTTON EVENT
		addStudent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				centerPanel.add(form);
														
				add_delete_edit_table.setVisible(false);
				tablePane.setVisible(false);
				form.setVisible(true);
				
				field_first_name.setText("");
				field_last_name.setText("");
				sex.setSelectedItem("");
				regNo.setText("");
				courseField.setText("");				
			}
			
		});
		
		// SUBMIT EVENT
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				form.setVisible(false);
				add_delete_edit_table.setVisible(true);
				tablePane.setVisible(true);
				
				row[0] = field_first_name.getText();
				row[1] = field_last_name.getText();
				row[2] = sex.getSelectedItem();
				row[3] = regNo.getText();
				row[4] = courseField.getText();
				
				model.addRow(row);		
			}
			
		});
		
		// DELETE EVENT
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
					int selectedRow = studentInfo.getSelectedRow();
					if (selectedRow >= 0 ) {
						
						model.removeRow(selectedRow);
					} else {
						
						JOptionPane.showMessageDialog(MainView.this, "Please select a row to DELETE", "Error", JOptionPane.ERROR_MESSAGE);
					}
			}		
			
		});		
			setTitle("Welcome");
			setLocation(300, 100);
			setSize(800, 500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().add(mainPanel);
			setVisible(true);
			}

			private Border BorderFactory(int i, int j, int k, int l) {
				// TODO Auto-generated method stub
				return null;
		}
			
	}
