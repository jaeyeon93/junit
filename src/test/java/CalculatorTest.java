import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setup() {
        cal = new Calculator();
        // test메서드가 실행되기전에 항상 before가 실행이 된다.
    }

    @Test
    public void plus() {
        int result = cal.plus(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void minus() {
        int result = cal.minus(3, 4);
        assertEquals(-1, result);
    }
    // Before => plus => minus가 아니라.
    // Before => plus => Before => minus순서로 된다.
    // why? 앞에 있는 테스트가 뒤에 있는 테스트에 영향을 미칠 수 있기때문에.

}
// 커서의 위치에 따라서 테스트런이 달라진다.
// 메서드에 위치를 하면 해당 메서드만 시작을 하고, 바깥에 위치를 하면 다 실행이 된다.
