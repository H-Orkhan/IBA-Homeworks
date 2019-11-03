package MyClassWork.October28.Task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementationTest {

    private Implementation s;
    @Test
    public void sum() {
        String str = null;
        int result = s.sum(str);
        assertEquals(0,result);
    }
    @Test
    public void sum1() {
        String str = "1 2 3 ";
        int result = s.sum(str);
        assertEquals(6,result);
    }
    @Test
    public void sum2() {
        String str = "1a 2s 3d 4a";
        int result = s.sum(str);
        assertEquals(0,result);
    }
    @Test
    public void sum3 () {
        String str = "1 3 4a";
        int result = s.sum(str);
        assertEquals(4,result);
    }
    @Test
    public void sum4() {
        String str = "-1 2 5a";
        int result = s.sum(str);
        assertEquals(1,result);
    }

}