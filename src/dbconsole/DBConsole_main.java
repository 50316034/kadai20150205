package dbconsole;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int day,out,in;
			ResultSet rs;
			
			MySQL mysql = new MySQL();
			rs = mysql.selectAll();
		
			try {
				  while(rs.next()){
					day = rs.getInt("day");
					out = rs.getInt("out");
					in = rs.getInt("in");
					System.out.println("ì˙ït:" + day);
					System.out.println("éxèo:" + out);
					System.out.println("é˚ì¸:" + in);
				  } 
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			FrameController controller = new FrameController();
			FrameView frame = new FrameView(controller);
			frame.setBounds(5,5,655,455);
			frame.setVisible(true);
			
			GraphView graph = new GraphView();
			graph.setBounds(5,5,655,455);
			graph.setVisible(true);
			}
	

}


