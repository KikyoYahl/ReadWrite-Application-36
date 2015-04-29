package javaapplication24;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author Qinghui
 * 
 */
public class NotePad implements ActionListener,MouseListener
{
	JFrame frame = new JFrame("Simple NotePad");
	JFileChooser fc = new JFileChooser();
	JTextArea tf = new JTextArea();
	JMenuBar mb;//menu bar
	JMenu m,m1,m2,m3;//menu
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10;//menu items
	JScrollPane jsp = new JScrollPane(tf, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//adding scrollpane
	JButton oB,sB,dB,pB,cB,cutB,clB;//naming buttons
	static boolean b = false;

        public void actionPerformed(ActionEvent e)
	{
		JMenuItem item = (JMenuItem)e.getSource();//get resourse
		try
		{
			if(item==mi1)
			{
				b=true;
					tf.setEnabled(b);
				int select = fc.showOpenDialog(frame);
					//FileInputStream in = new FileInputStream("file.getName")
				if(select==JFileChooser.APPROVE_OPTION)
				{
					File file = fc.getSelectedFile();//set file input
					FileInputStream fil = new FileInputStream(file);//set reader
					InputStreamReader isr = new InputStreamReader(fil);
					BufferedReader bfr = new BufferedReader(isr);
					int t = JOptionPane.showConfirmDialog(frame, "Do you want to open " + file.getName(), "Open", JOptionPane.YES_NO_OPTION);//confirm dialog
					
					if(t==JOptionPane.YES_OPTION)//if yes
					{String s;
					tf.setText("");
					while((s = bfr.readLine())!=null)//read the file
					{
						tf.append(s);//show the file
						
					}
					bfr.close();
					}
				}
			}
			if(item==mi2)
			{
				int select = fc.showSaveDialog(frame);
				if(select==JFileChooser.APPROVE_OPTION)
				{
					File file = fc.getSelectedFile();
					FileOutputStream fio = new FileOutputStream(file);
					OutputStreamWriter isw = new OutputStreamWriter(fio);
					BufferedWriter bfw = new BufferedWriter(isw);
					int t = JOptionPane.showConfirmDialog(frame, "Do you want to save the file in " + file.getName(),"Save", JOptionPane.YES_NO_OPTION);//show dialog
					if(t==JOptionPane.YES_OPTION)
					{
						String s = tf.getText();//save the file into subject
						bfw.write(s);
						JOptionPane.showMessageDialog(frame, "Saving:" + file.getName(), "Save", JOptionPane.INFORMATION_MESSAGE);
						bfw.close();
					}
				}
			}
				if(item==mi3)
				{
					int select = fc.showDialog(frame, "Delete");
					if(select==JFileChooser.APPROVE_OPTION)
					{
						File file = fc.getSelectedFile();
						int t = JOptionPane.showConfirmDialog(frame, " Do you want to delete the file " + file.getName(), "Delete", JOptionPane.YES_NO_OPTION);
						if(t==JOptionPane.YES_OPTION)
						{
							file.delete();//delete the file
							JOptionPane.showMessageDialog(frame, file.getName() + "Deleted","Delete", JOptionPane.ERROR_MESSAGE);
							
						}
					}
				}
				if(item==mi4)//control copy menu
				{
					tf.copy();
					
				}
				if(item==mi5)//control paste menu
				{
					tf.paste();
					
				}
				if(item==mi6)//control cut menu
				{
					tf.cut();
					
				}
				if(item==mi7)//control help menu
				{
					JOptionPane.showMessageDialog(frame, "This NotePad can edit and operate simple documents with only words", "Help Information", JOptionPane.INFORMATION_MESSAGE);
					
				}
				if(item==mi9)//clear menu control
				{
					int t = JOptionPane.showConfirmDialog(frame, "Do you want to clear","Delete", JOptionPane.YES_NO_OPTION);
					if(t==JOptionPane.YES_OPTION)
					{
						tf.setText("");
						
					}
				}
				if(item==mi10)
				{
					b=true;
					tf.setEnabled(b);
					
				}

		}
		catch(FileNotFoundException t)
		{
			JOptionPane.showMessageDialog(frame,"File not found", "Error", JOptionPane.ERROR_MESSAGE);
			
		}
		catch(EOFException t)
		{
			JOptionPane.showMessageDialog(frame, "Input encountered error", "Error", JOptionPane.ERROR_MESSAGE);
		}
		catch(IOException t)
		{
			JOptionPane.showMessageDialog(frame, "Can not read data from the file", "Error", JOptionPane.ERROR_MESSAGE);
		}
        }
                
		public void mousePressed(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		public void mouseClicked(MouseEvent e)
		{
			try
			{
				JButton button = (JButton)e.getSource();
					if(button==oB)//open button control
					{
						int select = fc.showOpenDialog(frame);
						if(select==JFileChooser.APPROVE_OPTION)
						{
							File file = fc.getSelectedFile();
							FileInputStream fil = new FileInputStream(file);
							InputStreamReader isr = new InputStreamReader(fil);
							BufferedReader bfr = new BufferedReader(isr);
							int t = JOptionPane.showConfirmDialog(frame, "Do you want to open the file " + file.getName(), "Open", JOptionPane.YES_NO_OPTION);
							if(t==JOptionPane.YES_OPTION)
							{
								String s;
								tf.setText("");
								while((s = bfr.readLine())!=null)
								{
									tf.append(s);
								}
								bfr.close();
							}
						}
					}
					if(button==sB)//save button
					{int select = fc.showSaveDialog(frame);
					if(select==JFileChooser.APPROVE_OPTION)
					{
						File file = fc.getSelectedFile();
						FileOutputStream fio = new FileOutputStream(file);
						OutputStreamWriter isw = new OutputStreamWriter(fio);
						BufferedWriter bfw = new BufferedWriter(isw);
						int t = JOptionPane.showConfirmDialog(frame, "Do you want to save the file in" + file.getName(), "Save", JOptionPane.YES_NO_OPTION);
						if(t==JOptionPane.YES_OPTION)
						{String s = tf.getText();
						bfw.write(s);
						JOptionPane.showMessageDialog(frame,"Saving:" + file.getName(), "Save", JOptionPane.INFORMATION_MESSAGE);
						bfw.close();
						}
					}
					}
					if(button==dB)//delete button
					{
						int select = fc.showDialog(frame,"Delete");
						if(select==JFileChooser.APPROVE_OPTION)
						{
							File file = fc.getSelectedFile();
							int t = JOptionPane.showConfirmDialog(frame, "Do you want to delete the file" + file.getName(), "Delete", JOptionPane.YES_NO_OPTION);
							if(t==JOptionPane.YES_OPTION)
							{
								file.delete();
								JOptionPane.showMessageDialog(frame, file.getName() + "Deleted", "Delete",JOptionPane.ERROR_MESSAGE);
							}
						}
					}
					if(button==cB)//copy button
					{
						tf.copy();
					}
					if(button==nB)//paste button
					{
						tf.paste();
					}
					if(button==cutB)//cut botton
					{
						tf.cut();
					}
					if(button==clB)//clear button
					{
						int t = JOptionPane.showConfirmDialog(frame, "Do you want to Clear ", "Delete", JOptionPane.YES_NO_OPTION);
						if(t==JOptionPane.YES_OPTION)
						{
							tf.setText("");
							
						}
					}
			}
			catch(FileNotFoundException s)
			{
				JOptionPane.showConfirmDialog(frame, "File is not found","Error",JOptionPane.ERROR_MESSAGE);
			}
			catch(EOFException s)
			{
				JOptionPane.showMessageDialog(frame,"Input encounter error","Error",JOptionPane.ERROR_MESSAGE);
			}
			catch(IOException s)
			{
				JOptionPane.showMessageDialog(frame,"can not read data from file","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	

