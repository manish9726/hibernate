import lti.pojo.Book;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestBook {

	@Test

	public void testSaveBook() {

		Session session = HibernateUtil.getSession();

		Transaction txn = session.beginTransaction();

		Book alc = new Book(34529, "2 states", "Chetan Bhagat", 50);
		session.save(alc);
		txn.commit();

	}

	@Test
	public void testGetBook() {

		Session session = HibernateUtil.getSession();
		Book bk = (Book) session.get(Book.class, 2);
		System.out.println(bk);
	}

	@Test
	public void testGetByIsbn() {
		Session session = HibernateUtil.getSession();
		Book bk = (Book) session.bySimpleNaturalId(Book.class).load(34526);
		System.out.println(bk);
	}

}
