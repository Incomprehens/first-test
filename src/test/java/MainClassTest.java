import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MainClassTest extends MainClass {

    @BeforeEach
    public void typeStartTest() {
        System.out.println("Start Test");
    }

    @AfterEach
    public void typeFinishText() {
        System.out.println("Finish Test");
    }

    @Test
    public void testGetLocalNumber()
    {
        assertEquals(14, getLocalNumber());

      /* if (getLocalNumber()==14)
        {
            System.out.println("метод getLocalNumber возвращает число 14 - метод getLocalNumber="+getLocalNumber());

        }else Assertions.fail("метод getLocalNumber не возвращает число 14 - метод getLocalNumber"+getLocalNumber());
*/


    }


    @Test
    public void testGetClassNumber()
    {

        assertFalse( getClassNumber()<46, "метод getClassNumber возвращает число меньше 45");
/*
        if (getClassNumber() > 45) {
            System.out.println("метод getClassNumber возвращает число больше 45 - мутод getClassNumber=" + getClassNumber());
        } else
            Assertions.fail("метод getLocalNumber не возвращает число 45 - мутод getClassNumber=" + getClassNumber());*/

    }


    @Test
    public void testGetClassString()
    {
        assertFalse(get);

        /*
        Boolean a = getClassString().contains("Hello");
        Boolean b = getClassString().contains("hello");

        if (a == true || b == true) {
            System.out.println("Есть слово Hello или hello");
        } else Assertions.fail("нет ни одной из подстрок Hello или hello - тест падает");*/
    }


}
