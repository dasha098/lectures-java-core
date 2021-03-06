package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankTest {
	
	private Bank testInstance;
	
	@Before
	public void setUp() {
		testInstance = new Bank();
	}
	
	@Test
	public void shouldAddClientToBank() {
		Client clientToBeAdded = new Client();
		
		testInstance.addClient(clientToBeAdded);

		assertSame(clientToBeAdded, testInstance.getClients().get(0));
		System.out.println(testInstance.hashCode());
	}
	
	@Test
	public void test() {
		System.out.println(testInstance.hashCode());
	}

}
