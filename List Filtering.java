/*In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out. from codewars*/
/*example 
  Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
  Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
  Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)*/

import java.util.List;
import java.util.ArrayList;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
    // Return the List with the Strings filtered out
    List<Object> result = new ArrayList<Object>();
    
    for(Object var : list){
      if(var instanceof Integer){
        result.add(var);
      }
    }
    return result;
  }
}
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTests {

  @Test
  public void examples() {
    assertEquals(List.of(1, 2), Kata.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
    assertEquals(List.of(1, 0, 15), Kata.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
    assertEquals(List.of(1, 2, 123), Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");    
  } 
}
