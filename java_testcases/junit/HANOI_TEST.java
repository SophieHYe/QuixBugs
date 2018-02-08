package java_testcases.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import java_programs.HANOI;
import com.google.gson.JsonParser;

public class HANOI_TEST {
  /**
   * Junit test case for HANOI generated by tests generator.
   */
  @Test(timeout = 100)
  public void hanoi_test1() {
    try {
      Object actual = HANOI.hanoi((int)1,(int)1,(int)3);
      assertEquals("[(1,3)]",actual.toString().replace(" ", "") );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void hanoi_test2() {
    try {
      Object actual = HANOI.hanoi((int)2,(int)1,(int)3);
      assertEquals("[(1,2),(1,3),(2,3)]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void hanoi_test3() {
    try {
      Object actual = HANOI.hanoi((int)3,(int)1,(int)3);
      assertEquals("[(1,3),(1,2),(3,2),(1,3),(2,1),(2,3),(1,3)]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void hanoi_test4() {
    try {
      Object actual = HANOI.hanoi((int)4,(int)1,(int)3);
      assertEquals("[(1,2),(1,3),(2,3),(1,2),(3,1),(3,2),(1,2),(1,3),(2,3),(2,1),(3,1),(2,3),(1,2),(1,3),(2,3)]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void hanoi_test5() {
    try {
      Object actual = HANOI.hanoi((int)2,(int)1,(int)2);
      assertEquals("[(1,3),(1,2),(3,2)]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void hanoi_test6() {
    try {
      Object actual = HANOI.hanoi((int)2,(int)1,(int)1);
      assertEquals("[(1,2),(1,1),(2,1)]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void hanoi_test7() {
    try {
      Object actual = HANOI.hanoi((int)2,(int)3,(int)1);
      assertEquals("[(3,2),(3,1),(2,1)]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

}
