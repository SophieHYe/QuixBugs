package java_testcases.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import java_programs.FLATTEN;
import com.google.gson.JsonParser;

public class FLATTEN_TEST {
  /**
   * Junit test case for FLATTEN generated by tests generator.
   */
  @Test(timeout = 100)
  public void flatten_test1() {
    try {
      Object actual = FLATTEN.flatten(new JsonParser().parse("[[1,[],[2,3]],[[4]],5]"));
      assertEquals("[1,2,3,4,5]",actual.toString().replace(" ", "") );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void flatten_test2() {
    try {
      Object actual = FLATTEN.flatten(new JsonParser().parse("[[],[],[],[],[]]"));
      assertEquals("[]",actual.toString().replace(" ", "") );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void flatten_test3() {
    try {
      Object actual = FLATTEN.flatten(new JsonParser().parse("[[],[],1,[],1,[],[]]"));
      assertEquals("[1,1]",actual.toString().replace(" ", "") );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void flatten_test4() {
    try {
      Object actual = FLATTEN.flatten(new JsonParser().parse("[1,2,3,[[4]]]"));
      assertEquals("[1,2,3,4]",actual.toString().replace(" ", "") );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void flatten_test5() {
    try {
      Object actual = FLATTEN.flatten(new JsonParser().parse("[1,4,6]"));
      assertEquals("[1,4,6]",actual.toString().replace(" ", "") );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void flatten_test6() {
    try {
      Object actual = FLATTEN.flatten(new JsonParser().parse("[\"moe\",\"curly\",\"larry\"]"));
      assertEquals("[\"moe\",\"curly\",\"larry\"]",actual.toString().replace(" ", "") );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void flatten_test7() {
    try {
      Object actual = FLATTEN.flatten(new JsonParser().parse("[\"a\",\"b\",[\"c\"],[\"d\"],[[\"e\"]]]"));
      assertEquals("[\"a\",\"b\",\"c\",\"d\",\"e\"]",actual.toString().replace(" ", "") );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

}
