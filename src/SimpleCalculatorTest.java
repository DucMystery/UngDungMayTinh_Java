import org.junit.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test

    public void testAdd1(){

        int x =0;
        int y =0;
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int expResult =0;

        assertEquals(expResult,simpleCalculator.add(x,y));
    }

    @Test

    public void testAdd2(){
        int x =1;
        int y =0;
        int expResult =1;

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(expResult,simpleCalculator.add(x,y));
    }
    @Test

    public void testAdd3(){
        int x =0;
        int y =1;
        int expResult =1;

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(expResult,simpleCalculator.add(x,y));
    }

    @Test

    public void testAdd4(){
        int x =5;
        int y =3;
        int expResult =8;

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(expResult,simpleCalculator.add(x,y));
    }

    @Test

    public void testSub1(){
        int x =0;
        int y =0;
        int expResult =0;

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(expResult,simpleCalculator.sub(x,y));
    }
    @Test

    public void testSub2(){
        int x =0;
        int y =1;
        int expResult =-1;

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(expResult,simpleCalculator.sub(x,y));
    }

    @Test

    public void testSub3(){
        int x =1;
        int y =0;
        int expResult =1;

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(expResult,simpleCalculator.sub(x,y));
    }

    @Test

    public void testSub4(){
        int x =5;
        int y =3;
        int expResult =2;

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(expResult,simpleCalculator.sub(x,y));
    }


}