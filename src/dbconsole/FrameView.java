package dbconsole;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameView extends Frame implements ActionListener,WindowListener{
    private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("",10);
	private TextField text3 = new TextField("",10);
	private Button button1 = new Button("Š|‚¯ŽZ");
	
	private TextField text4 = new TextField("",10);
	private TextField text5 = new TextField("",10);
	private TextField text6 = new TextField("",10);
	private Button button2 = new Button("Š„‚èŽZ");
	
	private Calculation_lib clib;

 public FrameView(FrameController controller){
		addWindowListener(this);
		setTitle("math");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(new Label("“š‚¦"));
		add(text3);
		button1.addActionListener(this);
		
		add(text4);
		add(text5);
		add(button2);
		add(new Label("“š‚¦"));
		add(text6);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
 }
 
 @Override
 public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1){
			int val1 = Integer.parseInt(text1.getText());
			int val2 = Integer.parseInt(text2.getText());
			//text3.setText(String.valueOf(val1*val2))
			Calculation_lib clib = new Calculation_lib(val1,val2);
			text3.setText(String.valueOf(clib.getMultiple()));
		}else if(e.getSource() == button2){
			int val3 = Integer.parseInt(text4.getText());
			int val4 = Integer.parseInt(text5.getText());
			//text6.setText(String.valueOf(val4/val5));
			Calculation_lib clib = new Calculation_lib(val3,val4);
			text6.setText(String.valueOf(clib.getDivide()));
			
		}
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}



