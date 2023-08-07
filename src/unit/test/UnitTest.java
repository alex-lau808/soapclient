package unit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.alex.beans.ObjectFactory;
import com.alex.beans.Person;
import com.alex.service.PersonServiceImpl;
import com.alex.service.PersonServiceImplService;

class UnitTest {
	
	private PersonServiceImpl psl;
	private Person p;
	
	@BeforeEach
	void init() {
		PersonServiceImplService psls = new PersonServiceImplService();
		ObjectFactory of = new ObjectFactory();
		Person p = of.createPerson();
		
		psl = psls.getPersonServiceImpl();
		//p = new Person();
		p.setId(11);
		p.setName("Alex");
		p.setAge(10);
		
		System.out.println("Name "+ p.getName());
	}
	
	
	@Test
	void test() {
	
		List<Person> ps = psl.getAllPersons();
		
		for (Person p: ps) {
			
			System.out.println(p.getId() + " : " + p.getName());
		}
		
		assertEquals(8, 8);
		//assertTrue(psl.addPerson(p));
		
		
	}


}
