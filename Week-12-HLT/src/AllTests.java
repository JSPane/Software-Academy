
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AttackValueTest.class, CurrentHealthTest.class, CurrentMoraleTest.class, CurrentXTest.class,
		CurrentYTest.class, DefenceValueTest.class, MaxHealthTest.class, MaxMoraleTest.class,
		MovementDistanceTest.class, MoveTest.class, NameTest.class })
public class AllTests {

}
