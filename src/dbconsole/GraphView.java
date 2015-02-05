package dbconsole;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraphView  extends Frame implements ActionListener,WindowListener {
	public GraphView(){
		addWindowListener(this);
		setTitle("money");

		DefaultCategoryDataset data = new DefaultCategoryDataset();
          data.addValue(15000, "食費", "1月");
          data.addValue(12000, "食費", "2月");
          data.addValue(12000, "食費", "3月");

          data.addValue(6000, "娯楽費", "1月");
          data.addValue(4000, "娯楽費", "2月");
          data.addValue(7000, "娯楽費", "3月");


		  JFreeChart chart = ChartFactory.createLineChart("支出","月","円",data, PlotOrientation.VERTICAL,true,false,false);
		  ChartPanel cpanel = new ChartPanel(chart);
		  add(cpanel, BorderLayout.CENTER);

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
