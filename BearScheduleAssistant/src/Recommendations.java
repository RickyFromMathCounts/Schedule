// portion should be able to 
import java.util.*; 
import javax.swing.*;
public class Recommendations {

	JFrame A;
	JTable B;
	
	
	
	public static void main(String[] args) {
		String s = "";

		new Recommendations(s);
	
	
	}
Recommendations (String major){
		
		A = new JFrame();
		//Title for the frame//
		A.setTitle("Recommendations");
		


		
//////////////////////////////////////////Accounting///////////////////////////////////////////////////////
		if(major.equalsIgnoreCase("Accounting")) {
		
		
			
		String[][] data = {
		            {"Math118", "ACCT305", "Econ201","CMST122", "MGMT110"},
		            {"Math220", "ACCT311", "Econ211","COSC220 ", "MGMT251"},
		            {"Math236", "ACCT312", "Econ202", "ACCT211", "MGMT310"},
		            {"Math109", "ACCT313", "Econ212", "ACCT212", "MGMT355"},
		            {"Math110", "ACCT315", "   -   ", "BLAW291", "MGMT256"},
		            {"Math380", "ACCT325", "   -   ", "FINA370", "MGMt405"}
		
		        };
		
		String[] rowNames = {"Math", "Accounting", "Economics", "Others", "Core"};
		
		 // Initializing the JTable
        B = new JTable(data, rowNames);
        A.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(B);
        A.add(sp);
        // Frame Size
        A.setSize(500, 200);
        // Frame Visible = true
        A.setVisible(true);
    
 	
			

		
			
		}
		

	
////////////////////////////////////////// Art and Design////////////////////////////////////////////////////////
	
else if (major.equalsIgnoreCase("Art and Design")) {
			
			
			String[][] data = {
			            {"Art104", "Art202", "Art291", "Art402"},
			            {"Art105", "Art216", "Art301", "Art416"},
			            {"Art207", "Art221", "Art302", "Art414"},
			            {"Art212", "Art232", "   -  ", "Art421"},
			            {"Art412", "Art235", "Art491", "Art432"},
			            {"   -  ", "Art240", "Art411", "Art435"},
			            {"   -  ", "Art307", "Art202", "Art440"},
			            {"   -  ", "Art336", "Art202", "Art407"}
			
			        };
			
			String[] rowNames = {"Basic Courses", "Introductory Studio", "Others", "Advanced"};
			
			 // Initializing the JTable
	        B = new JTable(data, rowNames);
	        A.setBounds(30, 40, 200, 300);
	 
	        // adding it to JScrollPane
	        JScrollPane sp = new JScrollPane(B);
	        A.add(sp);
	        // Frame Size
	        A.setSize(500, 200);
	        // Frame Visible = true
	        A.setVisible(true);
	   
			
			
		}	
		
//////////////////////////////////////////Business Administration//////////////////////////////////////////////////////
		
		
else if (major.equalsIgnoreCase("Business Administration")) {
	
	
	String[][] data = {
	            {"Math118", "ACCT211", "Econ201","CMST122", "MGMT110"},
	            {"Math220", "ACCT212", "Econ211","COSC220", "MGMT251"},
	            {"Math236", "BLAW291", "Econ202", "  -   ", "MGMT310"},
	            {"Math109", "FINA370", "Econ212", "  -   ", "MGMT355"},
	            {"Math110", "MKTG261", "   -   ", "   -  ", "MGMT356"},
	            {"Math380", "   -   ", "   -   ", "  -   ", "MGMt485"}
	
	        };
	
	String[] rowNames = {"Math", "Core", "Economics", "Others", "Managment"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Chemistry//////////////////////////////////////////////////////
		
		
else if (major.equalsIgnoreCase("Chemistry")) {
	
	
	String[][] data = {
	            {"Math236", "PHYS215", "CHEM201", "CHEM304", "CHEM322"},
	            {"Math237", "PHYS216", "CHEM202", "CHEM305", "CHEM441"},
	            {"   -   ", "PHYS261", "   -   ", "CHEM311", "CHEM445"},
	            {"   -   ", "PHYS262", "   -   ", "CHEM312", "CHEM492"},
	            {"   -   ", "   -   ", "   -   ", "CHEM320", "CHEM491"},
	            {"   -   ", "   -   ", "   -   ", "CHEM321", "CHEM495"}
	
	        };
	
	String[] rowNames = {"Math", "Physics", "Introduction", "Core Advanced", "Core Advanced"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Communications Studies//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Communications Studies")) {
	
	
	String[][] data = {
	            {"CMST122", "MCOM105", "MCOM485"},
	            {"ART207", "MCOM205", "MCOM486"},
	            {"-", "MCOM246 ", "MCOM498"},
	            {"-", "MCOM326", "MCOM447"},
	            {"-", "MCOM346", "   -   "}
	           
	
	        };
	
	String[] rowNames = {"Other", "MassCOM", "MassCom Advanced"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Computer Information Systems//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Computer Information Systems ")) {
	
	
	String[][] data = {
	            {"Math109", "COSC305", "ACCT211", "COCS300", "COCS101"},
	            {"Math110", "COCS320", "MGMT251", "COSC331 ", "COCS102"},
	            {"Math220", "COCS335", "ENGL338", "COCS380", "COCS240"},
	            {"Math236", "COCS345", "CMST102", "COCS440", "COCS241"},
	            {"Math280", "COCS350", "CMST112", "COCS460", "COCS325"},
	            {"Math380", "COCS431", "   -   ", "COCS480", "COCS365"}
	
	        };
	
	String[] rowNames = {"Math", "Electives", "Others", "Core Advanced", "Core"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
//////////////////////////////////////////Computer Information Technology//////////////////////////////////////////////////////
else if (major.equalsIgnoreCase("Computer Information Technology")) {
	
	
	String[][] data = {
			{"Math109", "COSC305", "ACCT211", "COCS300", "COCS101", "BLAW291"},
            {"Math110", "COCS320", "MGMT251", "COSC331", "COCS102", "MGMT355"},
            {"Math220", "COCS335", "ENGL338", "COCS380", "COCS240", "MGMT356"},
            {"Math236", "COCS345", "CMST102", "COCS440", "COCS241", "MGMT357"},
            {"Math280", "COCS350", "CMST112", "COCS460", "COCS325", "MKTG261"},
            {"Math380", "COCS431", "   -   ", "COCS480", "COCS365", "   -   "}

	        };
	
	String[] rowNames = {"Math", "Electives", "Other", "Advanced Core", "Core", "Buisness Electives"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
		
//////////////////////////////////////////Computer Science//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Computer Science")) {
	
	
	String[][] data = {
			{"Math470", "COSC305", "BIO149", "COCS300", "COCS101", "COCS365"},
            {"Math437", "COCS320", "Chem201", "COSC331", "COCS102", "COCS444"},
            {"Math432", "COCS335", "GEOG103", "COCS380", "COCS240", "COCS450"},
            {"Math380", "COCS345", "PHYS261", "COCS440", "COCS241", "COCS460"},
            {"Math280", "COCS350", "PHYS262", "COCS460", "COCS310", "COCS485"},
            {"Math237", "COCS431", "GEOG103", "COCS480", "COCS325", "COCS331"},
            {"Math236", "COCS431", "   -   ", "COCS480", "COCS350", "COCS489"}
	        };
	
	String[] rowNames = {"Math", "Electives", "Advanced", "Electives", "Advanced Core"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
////////////////////////////////////////// Early Childhood/ Elementary Education//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Early ChildHood")|| (major.equalsIgnoreCase("Elementary Education"))) {
	
	
	String[][] data = {
	            {"Math206", "MUSIC350", "ART110","EDUC401", "ELED494"},
	            {"Math207", "EDUC333", "ECED150","ELED307 ", "EDUC402"},
	            {"   -   ", "HPED309", "ECED293", "REED437", "REED420"},
	            {"   -   ", "   -   ", "ECED431", "-", "EDUC422"},
	            {"   -   ", "   -   ", "PSYC150", "-", "ELED495"},
	            {"   -   ", "   _   ", "PSYC210", "-", "MGMt405"}
	
	        };
	
	String[] rowNames = {"Math", "Core", "Specialization", "Assistantship", "Internship"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
//////////////////////////////////////////Earth Science//////////////////////////////////////////////////////
else if (major.equalsIgnoreCase("Earth Science")) {
	
	
	String[][] data = {
	            {"GEOG482", "GEOG310", "CHEM420", "CHEM201",  "GEOG103"},
	            {"GEOG483", "GEOG317", "CHEM420", "CHEM202 ", "GEOG113"},
	            {"GEOG486", "GEOG413", "GEOG330", "ENES102", "GEOG205"},
	            {"   -   ", "GEOG433", "GEOG340", "ENES220", "PHSC205"},
	            {"   _   ", "   -   ", "GEOG405", "PHYS215", "GEOG207"},
	            {"   -   ", "   -   ", "GEOG406", "PHYS261", "GEOG208"}
	
	        };
	
	String[] rowNames = {"Math", "Technique", "Advanced Electives", "Sciences", "Core"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Economics//////////////////////////////////////////////////////
else if (major.equalsIgnoreCase("Economics")) {
	
	
	String[][] data = {
	            {"Math109", "ECON300", "Econ201"},
	            {"Math110", "ECON495", "Econ211"},
	            {"Math118", "ECON352", "Econ202"},
	            {"Math236", "ECON491", "Econ212"},
	            {"   -   ", "ECON400", "Econ351"},
	            {"   -   ", "ECON301", "Econ460"}
	
	        };
	
	String[] rowNames = {"Math", "Electives ", "Core"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Engineering//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Engineering")) {

	
	String[][] data = {
	            {"Math236", "ENES100", "PHYS261"},
	            {"Math237", "ENES401", "PHYS262"},
	            {"Math228", "ENES271", "PHYS263"},
	            {"Math432", "ENMES272", "CHEM201"},
	            {"   -   ", "   -   ", "   -   "},
	            {"   -   ", "   -   ", "   -   "}
	
	        };
	
	String[] rowNames = {"Math", "Engineering", "Science"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
//////////////////////////////////////////Mechanical Engineering//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Mechanical Engineering")) {
	
	
	String[][] data = {
	            {"Math236", "PHYS261", "ENEGL339", "ENME232"},
	            {"Math237", "PHYS262", "ENEGL338", "ENME271"},
	            {"Math238", "PHYS263", "   -    ", "ENME272"},
	            {"Math432", "CHEM133", "   -   " , "ENME331"},
	            {"   -   ", "CHEM202", "   -   " , "ENME332"},
	            {"   -   ", "   -   ", "   -   " , "ENME350"}
	
	        };
	
	String[] rowNames = {"Math", "Sciences", "English", "Engineering"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
//////////////////////////////////////////English//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("English")) {
	
	
	String[][] data = {
	            {"ENGL330", "ENGL260"},
	            {"ENGL338", "ENGL261"},
	            {"ENGL336", "ENGL300"},
	            {"ENGL355", "ENGL306"},
	            {"ENGL360", "ENGL270"},
	            {"ENGL402", "ENGL271"}
	
	        };
	
	String[] rowNames = {"Core", "Electives"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
//////////////////////////////////////////Exercise and Sport Science//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Exercise and Sport Science")) {
	
	
	String[][] data = {
	            {"EXSS103", "EXSS306", "BIOL321","MGMT251"},
	            {"EXSS115", "EXSS315", "BIOL322","BUAD100 "},
	            {"EXSS175", "EXSS341", "BIOl149", "Chem150"},
	            {"EXSS200", "EXSS401", "Math109", "EXSS300"},
	            {"EXSS303", "EXSS410", "   -   ", "HEPD407"},
	            {"EXSS305", "EXSS411", "   -   ", "HSCI101"}
	
	        };
	
	String[] rowNames = {"Excersie ", "Excersie", "Other", "Electives"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
//////////////////////////////////////////Foreign Languages and Literature//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Foreign Languages and Literature")) {
	
	
	String[][] data = {
	            {"EDUC100", "EDUC200", "EDUC300",},
	            {"EDUC202", "REED417", "EDUC391",},
	            {"EDUC310", "SCED410", "SCED415",},
	            {"EDUC325", "SPED451", "EDUC422"},
	            {"   -   ", "   -   ", "SCED496"},
	            {"   -   ", "   -   ", "   -   "}
	
	        };
	
	String[] rowNames = {"Pre-Entrance", "Program Entrance", "Internship"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
//////////////////////////////////////////Geography//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Geography")) {
	
	
	String[][] data = {
	            {"Math109", "GEOG103 ", "GEOG335 ", "GEOG301 ", "GEOG300 "},
	            {"   -   ", "GEOG104 ", "GEOG340 ", "GEOG302 ", "GEOG324 "},
	            {"   -   ", "GEOG110 ", "GEOG405 ", "GEOG320 ", "GEOG407 "},
	            {"   -   ", "GEOG275 ", "GEOG430 ", "GEOG400 ", "GEOG410 "},
	            {"   -   ", "GEOG310 ", "GEOG431 ", "GEOG401 ", "GEOG425 "},
	            {"   -   ", "GEOG380 ", "GEOG445 ", "GEOG402 ", "GEOG427 "}
	
	        };
	
	String[] rowNames = {"Math", "Core", "Physical GEO", "Regional Geo", "Human Geo"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
//////////////////////////////////////////Health Science//////////////////////////////////////////////////////
			
else if (major.equalsIgnoreCase("Health Science")) {
	
	
	String[][] data = {
	            {"Math118", "ACCT305", "Econ201","CMST122", "MGMT110"},
	            {"Math220", "ACCT311", "Econ211","COSC220 ", "MGMT251"},
	            {"Math236", "ACCT312", "Econ202", "ACCT211", "MGMT310"},
	            {"Math109", "ACCT313", "Econ212", "ACCT212", "MGMT355"},
	            {"Math110", "ACCT315", "   -   ", "BLAW291", "MGMT256"},
	            {"Math380", "ACCT325", "   -   ", "FINA370", "MGMt405"}
	
	        };
	
	String[] rowNames = {"Math", "Accounting", "Economics", "Others", "Core"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
	
//////////////////////////////////////////HIstory//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("History")) {
	
	
	String[][] data = {
	            {"HIST103", "HIST299"},
	            {"HIST104", "HIST485"},
	            {"HIST113", "   -   "},
	            {"HIST114", "   -   "},
	            {"   -   ", "   -   "},
	            {"   -   ", "   -   "}
	
	        };
	
	String[] rowNames = {"Math", "Accounting", "Economics", "Others", "Core"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Information Technology//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Information Technology")) {
	
	
	String[][] data = {
	            {"Math280", "ITEC410", "COSC101","COSC300", "ACCT211"},
	            {"Math220", "ITEC414", "COSC100","ITEC312 ", "ACCT212"},
	            {"Math236", "ITEC442", "COSC102", "ITEC345", "ACCT305"},
	            {"Math109", "ITEC445", "COSC130", "ITEC355", "ACCT311"},
	            {"Math110", "ITEC452", "COSC305", "ITEC360", "BUAD100"},
	            {"Math380", "ITEC462", "ITEC315", "ITEC470", "MGMT405"}
	
	        };
	
	String[] rowNames = {"Math", "Electives", "Core", "Advanced", "Other"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Law//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Law")) {
	
	
	String[][] data = {
	            {"PHIL100", "PHIL300"},
	            {"PHIL301", "PHIL305"},
	            {"PHIL480", "PHIL312"},
	            {"PHIL101", "PHIL410"},
	            {"PHIL111", "PHIL302"},
	            {"PHIL102", "PHIL303"}
	
	        };
	
	String[] rowNames = {"Core", "Electives"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		

		

		
//////////////////////////////////////////Mathematics//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Mathematics")) {
	
	
	String[][] data = {
	            {"Math237", "Math432", "Math425"},
	            {"Math238", "Math440", "Math452"},
	            {"Math236", "Math451", "Math461"},
	            {"Math315", "Math470", "Math465"},
	            {"Math350", "Math491", "   -   "},
	            {"Math380", "   -   ", "   -   "}
	
	        };
	
	String[] rowNames = {"Core", "Advanced Core", "Electives"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Music//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Music")) {
	
	
	String[][] data = {
	            {"MUSC102", "MUSC308"},
	            {"MUSC103", "MUSC309"},
	            {"MUSC204", "MUSC313"},
	            {"MUSC205", "   -   "},
	            {"   -   ", "   -   "},
	            {"   -   ", "   -   "}
	
	        };
	
	String[] rowNames = {"Music Theory", "Music History"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Nursing//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Nursing")) {
	
	
	String[][] data = {
	            {"NURS120", "NURS401"},
	            {"NURS150", "NURS402"},
	            {"NURS204", "NURS403"},
	            {"NURS205", "NURS404"},
	            {"NURS206", "NURS405"},
	            {"NURS215", "NURS406"}
	
	        };
	
	String[] rowNames = {"Dual Enrollment", "RN-BSN"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Philosophy//////////////////////////////////////////////////////
		
else if (major.equalsIgnoreCase("Philosophy")) {
	
	
	String[][] data = {
	            {"PHIL100"},
	            {"PHIL301"},
	            {"PHIL480"},
	            {"PHIL101"},
	            {"PHIL111"},
	            {"PHIL112"}
	
	        };
	
	String[] rowNames = {"Core"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);

	
	
}	
		
//////////////////////////////////////////Physics//////////////////////////////////////////////////////


else if (major.equalsIgnoreCase("Physics")) {
	
	
	String[][] data = {
	            {"PHYS261", "PHYS310", "REED 517","ENES100"},
	            {"PHYS262", "PHYS312", "SPED551","MATH236 "},
	            {"PHYS263", "PHYS320", "SCED510", "Math237"},
	            {"   -   ", "PHYS420", "   -   ", "MAth238"},
	            {"   -   ", "PHYS491", "   -   ", "MATH432"},
	            {"   -   ", "PHYS492", "   -   ", "   -   "}
	
	        };
	
	String[] rowNames = {"Intoduction", "Advanced", "Electives", "Others"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);
    

}
    
//////////////////////////////////////////Political Science//////////////////////////////////////////////////////

else if (major.equalsIgnoreCase("Political Science")) {
	
	
	String[][] data = {
	            {"POSC110 ", "POSC435", "POSC321"," POSC330", "POSC341"},
	            {"POSC112 ", "POSC490", "POSC323"," POSC331", "POSC342"},
	            {"POSC113 ", "POSC492", "POSC324", "POSC332", "POSC441"},
	            {"POSC114 ", "   -   ", "POSC352", "POSC333", "POSC442"},
	            {"POSC131 ", "   -   ", "POSC361", "POSC336", "POSC443"},
	            {"   -    ", "   -   ", "POSC362", "POSC431", "   -   "}
	
	        };
	
	String[] rowNames = {"Introduction", "Capstone", "America politics", "Comparative politics", "International"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);
    

}
    
//////////////////////////////////////////Psychology//////////////////////////////////////////////////////

else if (major.equalsIgnoreCase("Psychology")) {
	
	
	String[][] data = {
	            {"PSYC150", "PSYC155", "PSYC306"},
	            {"PSYC151", "PSYC197", "PSYC386"},
	            {"PSYC201", "PSYC397", "PSYC420"},
	            {"PSYC301", "   -   ", "PSYC430"},
	            {"   -   ", "   -   ", "   -   "},
	            {"   -   ", "   -   ", "   -   "}
	
	        };
	
	String[] rowNames = {"Foundation", "Fundemental", "Biological Base"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);
    

}  
    
    
//////////////////////////////////////////Social Science//////////////////////////////////////////////////////

else if (major.equalsIgnoreCase("Social Science")) {
	
	
	String[][] data = {
	            {"HIST103", "GEOG104", "Econ201", "PSYC150", "SOCI100"},
	            {"HIST104", "GEOG114", "Econ211", "PSYC151", "SOCI111"},
	            {"HIST113", "GEOG110", "Econ202", "PSYC210", "SOCI200"},
	            {"HIST114", "GEOG301", "Econ212", "PSYC212", "SOCI224"},
	            {"   -   ", "GEOG302", "   -   ", "PSYC220", "SOCI305"},
	            {"   -   ", "   -   ", "   -   ", "   -   ", "SOCI306"}
	
	        };
	
	String[] rowNames = {"History", "Georgaphy", "Economics", "{Pyschology", "Sociology"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);
    

}  
    
    
//////////////////////////////////////////Sociology//////////////////////////////////////////////////////

else if (major.equalsIgnoreCase("Sociology")) {
	
	
	String[][] data = {
	            {"SOCI203", "SOCI100", "SOCI310"},
	            {"SOCI224", "SOCI111", "SOCI311"},
	            {"SOCI305", "SOCI200", "SOCI450"},
	            {"SOCI306", "   -   ", "SOCI451"},
	            {"SOCI307", "   -   ", "SOCI491"},
	            {"SOCI312", "   -   ", "   -   "}
	
	        };
	
	String[] rowNames = {"Math", "Accounting", "Economics", "Others", "Core"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);
    

}  
    
    
//////////////////////////////////////////Theatre//////////////////////////////////////////////////////

    
else if (major.equalsIgnoreCase("Theatre")) {
	
	
	String[][] data = {
	            {"THEA102 ", "THEA204"},
	            {"THEA103 ", "THEA206"},
	            {"THEA104 ", "THEA308 "},
	            {"THEA106 ", "THEA425 "},
	            {"THEA107 ", "THEA426 "},
	            {"THEA110 ", "THEA431 "}
	
	        };
	
	String[] rowNames = {"Core", "Core"};
	
	 // Initializing the JTable
    B = new JTable(data, rowNames);
    A.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(B);
    A.add(sp);
    // Frame Size
    A.setSize(500, 200);
    // Frame Visible = true
    A.setVisible(true);
    

}  

			
		}
}

		
		
