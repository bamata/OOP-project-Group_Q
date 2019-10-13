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
	
			// create object for add button

				//label for first name
				JLabel label_first_name; 
				
				//label for last name
				JLabel label_last_name ;
				
				//field for first name
				JTextField field_first_name ;
				
				//field for last name
				JTextField field_last_name ;
				
				//label for regNo
				JLabel label_regNo;
				
				//field for regNO
				JTextField regNo;
				
				//label for course
				JLabel courseName;
				
				//field for course
				JTextField courseField;
				
				
				JLabel label_sex;
				
				JComboBox sex;
				
				// Create Buttons
				JButton submit;
				
				JButton cancel;

	public MainView() {

		//create frame
		new JFrame();
		
		// Menu bar Panel
		JPanel menuBarPanel = new JPanel();

		// Create a menuBar;
		JMenuBar menuBar = new JMenuBar();
		
		// Create Action Menu
		JMenu actionMenu = new JMenu("Action");
		menuBar.add(actionMenu);

		// Create Help Menu
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		// Create a logout Menu Item
		JMenuItem logOut = new JMenuItem("Logout");

		actionMenu.add(logOut);
		
		menuBarPanel.add(menuBar);
		menuBarPanel.setLayout(new FlowLayout(5));
		menuBarPanel.setBorder(new LineBorder(Color.black, 3));
		
		//create options
		JButton student = new JButton("Student");
		student.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));

		JButton course = new JButton("Course");
		course.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));

		JButton courseUnits = new JButton("Course Units");
		courseUnits.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));

		JButton lecturers = new JButton("Lecturers");
		lecturers.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));

		//GridBagConstraints constraints = new GridBagConstraints(); 
		JPanel optionPanel = new JPanel();
		optionPanel.setLayout(new GridLayout(4, 0, 0, 0));

		// Temporary panel
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(4, 4, 4));
		panel.add(optionPanel);
		panel.setBorder(new LineBorder(Color.black, 3));
		
		// add student to the optionPanel
		optionPanel.add(student);
		optionPanel.add(course);
		optionPanel.add(courseUnits);
		optionPanel.add(lecturers);

		// create footer label
		JLabel footer = new JLabel("Copy right groupq 2019");	

		JPanel panelfooter = new JPanel();
		panelfooter.add(footer);
		
		// create center panel
		JPanel centerPanel = new JPanel(); 
		centerPanel.setLayout(new BorderLayout());
		
		// Create Main panel
		JPanel mainPanel = new JPanel( new BorderLayout(8, 6));
		mainPanel.add(panelfooter, BorderLayout.SOUTH);
		mainPanel.add(menuBarPanel, BorderLayout.NORTH);
		mainPanel.add(panel, BorderLayout.WEST);
		mainPanel.add(centerPanel, BorderLayout.CENTER);

		// create panel for add, edit and delete buttons and table
		JPanel add_delete_edit_table = new JPanel();
		add_delete_edit_table.setLayout(new FlowLayout(40, 100, 20));
		
		add_delete_edit_table.setVisible(false);
		
		// create add
		JButton addStudent = new JButton("Add");
		addStudent.setBackground(Color.green);
		addStudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,20,20,25));
		
		// create edit
		JButton editBtn = new JButton("Edit");
		editBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,20,20,25));
		editBtn.setBackground(Color.orange);
		
		// create delete 
		JButton delete = new JButton("Delete");
		delete.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,20,20,25));
		delete.setBackground(Color.red);
		
		add_delete_edit_table.add(addStudent);
		add_delete_edit_table.add(editBtn);
		add_delete_edit_table.add(delete);
		//add_delete_edit_table.setBorder(new LineBorder(Color.black, 3));
		
		// create a default table model 
		JTable studentInfo = new JTable();
		
		// create table and its attributes
		String [] columns = { "FirstName", "LastName", "Sex", "Course", "Resgistration"};
		
		DefaultTableModel model = new DefaultTableModel();
		
		model.setColumnIdentifiers(columns);
	
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
		
		//tablePane.setBorder(new LineBorder(Color.black, 3));
		
		logOut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				  LoginView log = new LoginView(); 
				  setVisible(false); 
				  log.setVisible(true);	 
			}

		});
		// Create the panel for all adding components
		JPanel addComponents = new JPanel(new GridLayout(7, 1,1,1));

		// Final panel for addcomponents pane
		
		JPanel finalPanel = new JPanel();
		finalPanel.setLayout(new FlowLayout(0, 10, 10));

		finalPanel.add(addComponents);
		//finalPanel.setBorder(new LineBorder(Color.black, 3));
				
		// Student button event
		student.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				centerPanel.add(add_delete_edit_table, BorderLayout.NORTH);
				centerPanel.add(tablePane, BorderLayout.CENTER);
				
				tablePane.setVisible(true);
				add_delete_edit_table.setVisible(true);
				
				// Add button Event		
				addStudent.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						//addStudent();
						centerPanel.add(finalPanel, BorderLayout.CENTER);
																
						add_delete_edit_table.setVisible(false);
						tablePane.setVisible(false);
						addComponents.setVisible(true);
						
						field_first_name.setText("");
						field_last_name.setText("");
						sex.setSelectedItem("");
						regNo.setText("");
						courseField.setText("");
						
					}
					
				});
				
				// Delete Event
				delete.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
							int selectedRow = studentInfo.getSelectedRow();
							if (selectedRow >= 0 ) {
								
								model.removeRow(selectedRow);
							} else {
								
								JOptionPane.showMessageDialog(finalPanel, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
							}
						
					}
					
				});
			
				// Adding mouse Event to the table
				studentInfo.addMouseListener( new MouseAdapter() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						int selectedRow = studentInfo.getSelectedRow();
						
						field_first_name.setText(model.getValueAt(selectedRow, 0).toString());
						field_last_name.setText(model.getValueAt(selectedRow, 1).toString());
						sex.setSelectedItem(model.getValueAt(selectedRow, 2).toString());
						regNo.setText(model.getValueAt(selectedRow, 3).toString());
						courseName.setText(model.getValueAt(selectedRow, 4).toString());
						
					}
				});
				
				// Edit Event
				editBtn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
					}
				});
				
				
				// create submit event
				submit.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						//JOptionPane.showMessageDialog(null, "add");
						
						row[0] = field_first_name.getText();
						row[1] = field_last_name.getText();
						row[2] = sex.getSelectedItem();
						row[3] = regNo.getText();
						row[4] = courseField.getText();
						
						model.addRow(row);
						
						addComponents.setVisible(false);
						add_delete_edit_table.setVisible(true);
						tablePane.setVisible(true);
					}
					
				});
				//cancel event button
				cancel.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						addComponents.setVisible(false);
						add_delete_edit_table.setVisible(true);
						tablePane.setVisible(true);
					}
					
				});
			}
			});
		
						// create label for first name
						 label_first_name = new JLabel("First Name :");
						
						// create label for last name
						 label_last_name = new JLabel("Last Name  :");
						
						// create field for first name
						 field_first_name = new JTextField(20);
						
						//create field for last name
						 field_last_name = new JTextField(20);
						
						// create label for regNo
						 label_regNo= new JLabel(" Registration Number :");
						
						// create field for regNO
						 regNo = new JTextField(20);
						
						//create label for course
						 courseName= new JLabel("  Course :");
						
						// create field for course
						 courseField = new JTextField(20);
						
						// Create Buttons
						 submit = new JButton("Submit");
							
						//Create sex items
						String [] sexItems = {"Male","Female"};
						
						// create JCombox
						 sex = new JComboBox(sexItems);			
						
						
						cancel = new JButton("Cancel");
						
						//create Label for sex
						label_sex = new JLabel("Sex :");
						
						//adding components
						addComponents.add(label_first_name);
						addComponents.add(field_first_name);
						addComponents.add(label_last_name);
						addComponents.add(field_last_name);
						addComponents.add(label_sex);
						addComponents.add(sex);
						addComponents.add(label_regNo);
						addComponents.add(regNo);
						addComponents.add(courseName);
						addComponents.add(courseField);
						addComponents.add(submit);
						addComponents.add(cancel);
					
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
