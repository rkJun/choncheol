package com.appspot.choncheol;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.appspot.choncheol.comm.db.CommonPMF;
import com.appspot.choncheol.jdo.MemoriesJDO;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class ChoncheolServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		controller(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		controller(req, resp);		
	}
	
	/**
	 * get, post 접근시 controller 의 역할을 소화
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException 
	 */
	private void controller(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String strUriValue = req.getRequestURI();
		strUriValue=strUriValue.replace("/", "");	// 슬러시 제거 
		
		System.out.println("controller START ===== actionMethod:"+strUriValue);

		try {
			// URI 값 존재하지 않으면 인덱스 첫화면
			if(strUriValue == null || "".equals(strUriValue)) {
				doMain(req,resp);
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
			// write 글쓰기 화면 
			else if ("write".equals(strUriValue)) {
				doWrite(req,resp);
				req.getRequestDispatcher("write.jsp").forward(req, resp);
			}
			// list 글 목록 
			else if ("list".equals(strUriValue)) {
				doList(req,resp);
				req.getRequestDispatcher("list.jsp").forward(req, resp);
			}
		}catch (ServletException se) {
			se.printStackTrace();
		}
	}
	
	private void doMain(HttpServletRequest req, HttpServletResponse resp) {
		PersistenceManager pm = CommonPMF.get().getPersistenceManager();
		
		String selectQuery = "select from "; 
		selectQuery += MemoriesJDO.class.getName();
		selectQuery += " where isDelete == false";
		selectQuery += " order by writeDate DESC range 0,1";

		@SuppressWarnings("unchecked")
		List<MemoriesJDO> resultList = (List<MemoriesJDO>) pm.newQuery(selectQuery).execute();

		MemoriesJDO resultJdo = (MemoriesJDO) resultList.get(0);
		
		req.setAttribute("resultJdo", resultJdo);
		
	}
	private void doList(HttpServletRequest req, HttpServletResponse resp) {
		
		PersistenceManager pm = CommonPMF.get().getPersistenceManager();
		
		String selectQuery = "select from "; 
		selectQuery += MemoriesJDO.class.getName();
		selectQuery += " where isDelete == false ";
		selectQuery += "order by writeDate DESC ";

		@SuppressWarnings("unchecked")
		List<MemoriesJDO> resultList = (List<MemoriesJDO>) pm.newQuery(selectQuery).execute();

		req.setAttribute("resultList", resultList);
		
	}

	private void doWrite(HttpServletRequest req, HttpServletResponse resp) {

		String wiseContent = req.getParameter("wiseContent");
		String wiseContentOrg = req.getParameter("wiseContentOrg");
		String wiseAuthor = req.getParameter("wiseAuthor");
		String wiseAuthorOrg = req.getParameter("wiseAuthorOrg");
		Date writeDate = new Date();
		
		/**
		 * 글 안들어오면, 일단 reject.
		 * 글쓰기화면 초기 표시될 때.
		 */
		if (wiseContent == null || "".equals(wiseContent)) {
			return;
		}

		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
				
		//String writeUser = user.getUserId();
		String writeUser = "rkJun";
		
		Date updateDate = null;
		String updateUser = "";
		boolean isDelete = false;

		MemoriesJDO memoriesJdo = new MemoriesJDO(wiseContent, wiseContentOrg,
				wiseAuthor, wiseAuthorOrg, writeDate, writeUser, updateDate,
				updateUser, isDelete);


		
		PersistenceManager pm = CommonPMF.get().getPersistenceManager();

		try {
			pm.makePersistent(memoriesJdo);
		} finally {
			pm.close();
		}
		System.out.println("inserted:"+memoriesJdo.getId());
	}

}
