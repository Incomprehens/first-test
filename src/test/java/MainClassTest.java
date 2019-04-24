import org.junit.jupiter.api.Test;

public class MainClassTest {


    @Test
    public void testGetLocalNumber()
    {
        MainClass.typeStartTest();

        if (MainClass.getLocalNumber()==14)
        {
            System.out.println("метод getLocalNumber возвращает число 14 - метод getLocalNumber="+MainClass.getLocalNumber());

        }else  System.out.println("метод getLocalNumber не возвращает число 14 - метод getLocalNumber="+MainClass.getLocalNumber());

        MainClass.typeFinishTest();

    }
}
