

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Blob;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MembersServlet")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MemberController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberHelperDAO helper = null;
		try {
			helper = new MemberHelperDAO();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		ArrayList<Member> memberList = helper.readMembers();
		String[] nameList = new String[memberList.size()];
		String[] dateList = new String[memberList.size()];
		String[] accompList = new String[memberList.size()];
		Blob[] picList = new Blob[memberList.size()];
			
		for(int i = 0; i < memberList.size(); i++){
			nameList[i] = memberList.get(i).getName();
			dateList[i] = memberList.get(i).getBirthDate();
			String unformated = memberList.get(i).getAccomplishments();
			String formated = "";
			String[] delims = unformated.split(",");
			for(int j = 0; j < delims.length; j++){
				   formated += delims[j] + "\n";
			   }
			System.out.println("formated = " + formated);
			accompList[i] = formated;
			picList[i] = (Blob) memberList.get(i).getPicture();
		}
	
		request.setAttribute("nameList", nameList);
		request.setAttribute("dateList", dateList);
		request.setAttribute("accompList", accompList);
		request.setAttribute("picList", picList);
		request.getRequestDispatcher("/members.jsp").forward(request, response);
		
		//Closing the connection
		helper.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
