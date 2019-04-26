import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainClassTest extends MainClass
{

    @BeforeEach
    public void typeStartTest()
    {
        System.out.println("Start Test");
    }

    @AfterEach
    public void typeFinishText()
    {
        System.out.println("Finish Test");
    }

    @Test
    public void testGetLocalNumber()
    {


        if (getLocalNumber()==14)
        {
            System.out.println("метод getLocalNumber возвращает число 14 - метод getLocalNumber="+getLocalNumber());

        }else  System.out.println("метод getLocalNumber не возвращает число 14 - метод getLocalNumber="+getLocalNumber());




    }




    @Test
    public void testGetClassNumber()
    {



        if (getClassNumber()>45)
        {
            System.out.println("метод getClassNumber возвращает число больше 45 - мутод getClassNumber="+getClassNumber());
        }

        else  System.out.println("метод getLocalNumber не возвращает число 45 - мутод getClassNumber="+getClassNumber());

    }
}
