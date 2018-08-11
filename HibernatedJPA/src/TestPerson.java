import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Book;
import lti.pojo.Person;
import lti.util.HibernateUtil;

public class TestPerson {

	@Test

	public void testSavePerson() {

		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Person p = new Person(new Person.Id("China", 1239), "Bruce Lee", 30);
		session.save(p);
		tx.commit();
	}

//	 @Test
//	 public void testGetPerson() {
//	
//	 Session session = HibernateUtil.getSession();
//	 Person ps = (Person) session.byNaturalId(Person.Id.class);
//	 System.out.println(ps);
//	 }
	

//	@Test

//	public void testGetPerson() {
//
//		Session session = HibernateUtil.getSession();
//		Criteria criteria = session.createCriteria(Person.class);
//		List<Person> list = criteria.list();
//		for (Person test : list) {
//			System.out.println(test.getName() + " " + test.getAge());
//		}
//	}
}
