package maven;

public class Testisisbnumvalidate {
    
 isisbnumvalidate isbn=new isisbnumvalidate();

@Test
public void validating(){
    boolean  actual=isbn.isbnnumvalid("9780134851234");
    assertTrue("first check",actual);

    actual=isbn.isbnnumvalid("9780134851235");
    assertTrue("second check",actual);
}


}
