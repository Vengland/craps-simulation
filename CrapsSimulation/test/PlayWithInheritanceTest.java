import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayWithInheritanceTest
{
	Die die = new Die();
	Die crookeddie1 = new CrookedDie1();
	CrookedDie1 crookeddie2 = new CrookedDie1();

	//test static Inheritance from Die to CrookedDie1
	@Test
	void test()
	{
		assertEquals(die.testStatic(), "Die.testStatic()");
		assertEquals(crookeddie2.testStatic(), "CrookedDie1.testStatic()");
		assertEquals(die.testStatic(), crookeddie1.testStatic());
		assertNotEquals(crookeddie1.testStatic(),crookeddie2.testStatic());
	}

}
