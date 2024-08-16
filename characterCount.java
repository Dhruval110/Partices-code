/*The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.

*/

import java.util.Map;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
      
      Map<Character,Integer> characterCount = new HashMap<Character,Integer>();
      
      for(int i = 0 ; i < str.length();i++){
        int count = 1 ;
        char letter = str.charAt(i);
        
        if(characterCount.containsKey(letter)){
          characterCount.put(letter,characterCount.get(letter)+1);
        }
        else{
          characterCount.put(letter,1);
        }
        
      }
        return characterCount;
    }
}

@Test
    @Order(6)
    public void testDifferentCharacters() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = Kata.count("aabb");
        assertEquals(expected, actual);
    }

}
//question from codewars
