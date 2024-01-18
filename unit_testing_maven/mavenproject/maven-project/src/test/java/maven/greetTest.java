package maven;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
// import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;



import org.junit.*;

public class greetTest {

   greet gre = new greet();

   @Test
   public void test() {
      Assert.assertEquals("helo", gre.says());
   }

   @Test
   public void testsum() {
      int expected = 4;
      int actual = gre.sum(2, 2);
      assertEquals(expected, actual);
   }

   // @Test
   // public void isEven(){
   // // boolean expected=true;
   // boolean actual= gre.iseven(2);
   // assertTrue( actual);

   // }

   @ParameterizedTest
   @ValueSource(ints = { 2, -4, -100000, 200000 })

   public void isEven(int number) {
      // boolean expected=true;
      boolean actual = gre.iseven(number); 
      assertTrue(actual);

   }

   @Test
   public void isnotEven() {
      // boolean expected=true;
      boolean actual = gre.iseven(1);
      assertFalse(actual);

   }

   @Test
   public void testincrementArray() {
      int[] expected = new int[] { 2, 3, 4 };

      int[] actual = gre.incrementArray(new int[] { 1, 2, 3 });

      assertArrayEquals(expected, actual);

   }

   @Test
   public void testdividebyzero() {
      Exception exception = assertThrows(IllegalArgumentException.class, () -> gre.divide(1, 0));

      String expected = "divisor couldnt be zero";

      String actual = exception.getMessage();

      assertEquals(expected, actual);

   }

   @Test
   public void testgetopeningdays() {

      String[] expected = new String[] { "monday", "tuesday" };
      String[] actual = gre.getopeningday();
      assertArrayEquals(expected, actual);
   }


   @Test
   public void testsalonisopenonmonday() {
      assertTrue(gre.isopen("monday"));
   }

   @Test
   public void testsaloniscloseonwednesday() {
      assertFalse(gre.isopen("wednesday"));
   }

   @Test
   public void testexceptionisthrownifweekdaydoesnotendinday() {
      Exception exception = assertThrows(IllegalArgumentException.class, () -> gre.isopen("hello"));

      String expected = "weekday should be end with 'day'";
      String actual = exception.getMessage();
      assertEquals(expected, actual);

   }

   @Test
   public void testapplydiscount() {
      calculator calculator = new calculator();
      assumeTrue(calculator.divide(gre.gethaircutprice(), 2) == 15);
      int expected = 20;

      int actual = gre.applydiscount();
      assertEquals(expected, actual);
   }


@Test
public void getoprningdays(){
greet.day[] expected =new greet.day[]{greet.day.monday,greet.day.tuesday};
greet.day[] actual = gre.getopeningdays();
assertArrayEquals(expected, actual);
}

   @Test 
   public void testopenonmonday(){
      assertTrue(gre.isopen(greet.day.monday));
   }
   @Test 
   public void testisnotopenonmonday(){
      assertFalse(gre.isopen(greet.day.wednesday));
   }

   // @Test 
   // public void testnull(){
   //    assertFalse(gre.isopen(null));
   // }

@ParameterizedTest
@EnumSource(value = greet.Month.class, names ={"JANUARY","MARCH","MAY","JULY","AUGUST","OCTOBER","DECEMBER"})

public void testhas31day(greet.Month month){

assertTrue(gre.has31day(month));
}


@ParameterizedTest
@EnumSource(value = greet.Month.class, names ={"FEBRUARY","APRIL","JUNE","SEPTEMBER","NOVEMBER"})

public void testdoesnothas31day(greet.Month month){

assertFalse(gre.has31day(month));
}




}


