package java_testcases.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import java_programs.LCS_LENGTH;
import com.google.gson.JsonParser;

public class LCS_LENGTH_TEST {
  /**
   * Junit test case for LCS_LENGTH generated by tests generator.
   */
  @Test(timeout = 100)
  public void lcs_length_test1() {
    try {
      Object actual = LCS_LENGTH.lcs_length((java.lang.String)"witch",(java.lang.String)"sandwich");
      assertEquals("2",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void lcs_length_test2() {
    try {
      Object actual = LCS_LENGTH.lcs_length((java.lang.String)"meow",(java.lang.String)"homeowner");
      assertEquals("4",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void lcs_length_test3() {
    try {
      Object actual = LCS_LENGTH.lcs_length((java.lang.String)"fun",(java.lang.String)"");
      assertEquals("0",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void lcs_length_test4() {
    try {
      Object actual = LCS_LENGTH.lcs_length((java.lang.String)"fun",(java.lang.String)"function");
      assertEquals("3",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void lcs_length_test5() {
    try {
      Object actual = LCS_LENGTH.lcs_length((java.lang.String)"cyborg",(java.lang.String)"cyber");
      assertEquals("3",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void lcs_length_test6() {
    try {
      Object actual = LCS_LENGTH.lcs_length((java.lang.String)"physics",(java.lang.String)"physics");
      assertEquals("7",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void lcs_length_test7() {
    try {
      Object actual = LCS_LENGTH.lcs_length((java.lang.String)"space age",(java.lang.String)"pace a");
      assertEquals("6",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void lcs_length_test8() {
    try {
      Object actual = LCS_LENGTH.lcs_length((java.lang.String)"flippy",(java.lang.String)"floppy");
      assertEquals("3",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void lcs_length_test9() {
    try {
      Object actual = LCS_LENGTH.lcs_length((java.lang.String)"acbdegcedbg",(java.lang.String)"begcfeubk");
      assertEquals("3",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

}
