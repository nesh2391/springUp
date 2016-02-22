package org.twang.userController;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.twang.Model.Pojos.MovieGenre;

@Transactional
public class MovieImpl {
	 	
		@Autowired
		private SessionFactory sessionFactory;	 

		public void save(MovieGenre p) {	
			Session session = this.sessionFactory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.persist(p);
	        tx.commit();
	        session.close();
	    }
		
		
		 public void list() {
		        Session session = this.sessionFactory.openSession();
		        @SuppressWarnings("unchecked")
				List<MovieGenre> personList = session.createQuery("from MovieGenre").list();
		        System.out.println(personList.size());
		        session.close();
		    }
}
