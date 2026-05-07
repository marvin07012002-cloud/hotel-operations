import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void punchOut() {
        Employee dave = new Employee();
        dave.punchIn(2);
        dave.punchOut(4);

        double daveWork = dave.getRegularHours();
        Assertions.assertEquals(2,daveWork);
    }
}