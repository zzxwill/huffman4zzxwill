package com.test;

import java.sql.Date;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;


import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.realestate.dao.DeveloperDAO;
import com.realestate.dao.MessageDAO;
import com.realestate.dao.NoticeDAO;
import com.realestate.dao.UserDAO;
import com.realestate.pojo.Estate;
import com.realestate.pojo.Message;
import com.realestate.pojo.Notice;
import com.realestate.pojo.User;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
//		Message m=new Message();
//		m.setContent("hello world");
//		m.setDatetime(new Date(System.currentTimeMillis()));
//		
//		DeveloperDAO ddao=new DeveloperDAO();
//		Session s=ddao.getSession();
//		Transaction tr=s.getTransaction();
//		m.setDeveloper(ddao.findById(1));
//		
//		
//		m.setDirection((byte)0);
//		m.setBeRead((byte) 0);
//		m.setTitle("hello");
//		
//		UserDAO udao=new UserDAO();
//		udao.getSession();
//		m.setUser(udao.findById(1));
		
//		MessageDAO dao=new MessageDAO();
//		Session session=dao.getSession();
//		Transaction tran=session.beginTransaction();
//		dao.save(m);
//		session.flush();
//		tran.commit();
		
		
		UserDAO ddao=new UserDAO();
		Session session=ddao.getSession();
		SQLQuery sqlQuery= session.createSQLQuery("");
				List<Estate> estlist=sqlQuery.list();
				
		User user=ddao.findById(1);
		Iterator<Message> l=user.getMessages().iterator();
		while(l.hasNext()){
			System.out.println(l.next().getContent());
		}
//		List<Message> l=dao.findAll();
//		NoticeDAO ndao=new NoticeDAO();
//		Transaction tran=ndao.getSession().beginTransaction();
//		List<Notice> placardlist=ndao.findAll();
//		for(Notice d:placardlist){
//			System.out.println(d.getTitle()+":" +d.getContent());
//		}
//		System.out.println(new Date(System.currentTimeMillis()).toLocaleString());
	}

}
