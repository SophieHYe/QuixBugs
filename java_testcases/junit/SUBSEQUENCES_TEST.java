package java_testcases.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import java_programs.SUBSEQUENCES;
import com.google.gson.JsonParser;

public class SUBSEQUENCES_TEST {
  /**
   * Junit test case for SUBSEQUENCES generated by tests generator.
   */
  @Test(timeout = 100)
  public void subsequences_test1() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)1,(int)5,(int)3);
      assertEquals("[[1,2,3],[1,2,4],[1,3,4],[2,3,4]]",actual.toString().replace(" ", "") );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test2() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)30,(int)-2,(int)3);
      assertEquals("[]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test3() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)30,(int)2,(int)3);
      assertEquals("[]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test4() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)4,(int)10,(int)4);
      assertEquals("[[4,5,6,7],[4,5,6,8],[4,5,6,9],[4,5,7,8],[4,5,7,9],[4,5,8,9],[4,6,7,8],[4,6,7,9],[4,6,8,9],[4,7,8,9],[5,6,7,8],[5,6,7,9],[5,6,8,9],[5,7,8,9],[6,7,8,9]]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test5() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)4,(int)10,(int)6);
      assertEquals("[[4,5,6,7,8,9]]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test6() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)1,(int)10,(int)2);
      assertEquals("[[1,2],[1,3],[1,4],[1,5],[1,6],[1,7],[1,8],[1,9],[2,3],[2,4],[2,5],[2,6],[2,7],[2,8],[2,9],[3,4],[3,5],[3,6],[3,7],[3,8],[3,9],[4,5],[4,6],[4,7],[4,8],[4,9],[5,6],[5,7],[5,8],[5,9],[6,7],[6,8],[6,9],[7,8],[7,9],[8,9]]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test7() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)1,(int)10,(int)6);
      assertEquals("[[1,2,3,4,5,6],[1,2,3,4,5,7],[1,2,3,4,5,8],[1,2,3,4,5,9],[1,2,3,4,6,7],[1,2,3,4,6,8],[1,2,3,4,6,9],[1,2,3,4,7,8],[1,2,3,4,7,9],[1,2,3,4,8,9],[1,2,3,5,6,7],[1,2,3,5,6,8],[1,2,3,5,6,9],[1,2,3,5,7,8],[1,2,3,5,7,9],[1,2,3,5,8,9],[1,2,3,6,7,8],[1,2,3,6,7,9],[1,2,3,6,8,9],[1,2,3,7,8,9],[1,2,4,5,6,7],[1,2,4,5,6,8],[1,2,4,5,6,9],[1,2,4,5,7,8],[1,2,4,5,7,9],[1,2,4,5,8,9],[1,2,4,6,7,8],[1,2,4,6,7,9],[1,2,4,6,8,9],[1,2,4,7,8,9],[1,2,5,6,7,8],[1,2,5,6,7,9],[1,2,5,6,8,9],[1,2,5,7,8,9],[1,2,6,7,8,9],[1,3,4,5,6,7],[1,3,4,5,6,8],[1,3,4,5,6,9],[1,3,4,5,7,8],[1,3,4,5,7,9],[1,3,4,5,8,9],[1,3,4,6,7,8],[1,3,4,6,7,9],[1,3,4,6,8,9],[1,3,4,7,8,9],[1,3,5,6,7,8],[1,3,5,6,7,9],[1,3,5,6,8,9],[1,3,5,7,8,9],[1,3,6,7,8,9],[1,4,5,6,7,8],[1,4,5,6,7,9],[1,4,5,6,8,9],[1,4,5,7,8,9],[1,4,6,7,8,9],[1,5,6,7,8,9],[2,3,4,5,6,7],[2,3,4,5,6,8],[2,3,4,5,6,9],[2,3,4,5,7,8],[2,3,4,5,7,9],[2,3,4,5,8,9],[2,3,4,6,7,8],[2,3,4,6,7,9],[2,3,4,6,8,9],[2,3,4,7,8,9],[2,3,5,6,7,8],[2,3,5,6,7,9],[2,3,5,6,8,9],[2,3,5,7,8,9],[2,3,6,7,8,9],[2,4,5,6,7,8],[2,4,5,6,7,9],[2,4,5,6,8,9],[2,4,5,7,8,9],[2,4,6,7,8,9],[2,5,6,7,8,9],[3,4,5,6,7,8],[3,4,5,6,7,9],[3,4,5,6,8,9],[3,4,5,7,8,9],[3,4,6,7,8,9],[3,5,6,7,8,9],[4,5,6,7,8,9]]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test8() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)1,(int)10,(int)4);
      assertEquals("[[1,2,3,4],[1,2,3,5],[1,2,3,6],[1,2,3,7],[1,2,3,8],[1,2,3,9],[1,2,4,5],[1,2,4,6],[1,2,4,7],[1,2,4,8],[1,2,4,9],[1,2,5,6],[1,2,5,7],[1,2,5,8],[1,2,5,9],[1,2,6,7],[1,2,6,8],[1,2,6,9],[1,2,7,8],[1,2,7,9],[1,2,8,9],[1,3,4,5],[1,3,4,6],[1,3,4,7],[1,3,4,8],[1,3,4,9],[1,3,5,6],[1,3,5,7],[1,3,5,8],[1,3,5,9],[1,3,6,7],[1,3,6,8],[1,3,6,9],[1,3,7,8],[1,3,7,9],[1,3,8,9],[1,4,5,6],[1,4,5,7],[1,4,5,8],[1,4,5,9],[1,4,6,7],[1,4,6,8],[1,4,6,9],[1,4,7,8],[1,4,7,9],[1,4,8,9],[1,5,6,7],[1,5,6,8],[1,5,6,9],[1,5,7,8],[1,5,7,9],[1,5,8,9],[1,6,7,8],[1,6,7,9],[1,6,8,9],[1,7,8,9],[2,3,4,5],[2,3,4,6],[2,3,4,7],[2,3,4,8],[2,3,4,9],[2,3,5,6],[2,3,5,7],[2,3,5,8],[2,3,5,9],[2,3,6,7],[2,3,6,8],[2,3,6,9],[2,3,7,8],[2,3,7,9],[2,3,8,9],[2,4,5,6],[2,4,5,7],[2,4,5,8],[2,4,5,9],[2,4,6,7],[2,4,6,8],[2,4,6,9],[2,4,7,8],[2,4,7,9],[2,4,8,9],[2,5,6,7],[2,5,6,8],[2,5,6,9],[2,5,7,8],[2,5,7,9],[2,5,8,9],[2,6,7,8],[2,6,7,9],[2,6,8,9],[2,7,8,9],[3,4,5,6],[3,4,5,7],[3,4,5,8],[3,4,5,9],[3,4,6,7],[3,4,6,8],[3,4,6,9],[3,4,7,8],[3,4,7,9],[3,4,8,9],[3,5,6,7],[3,5,6,8],[3,5,6,9],[3,5,7,8],[3,5,7,9],[3,5,8,9],[3,6,7,8],[3,6,7,9],[3,6,8,9],[3,7,8,9],[4,5,6,7],[4,5,6,8],[4,5,6,9],[4,5,7,8],[4,5,7,9],[4,5,8,9],[4,6,7,8],[4,6,7,9],[4,6,8,9],[4,7,8,9],[5,6,7,8],[5,6,7,9],[5,6,8,9],[5,7,8,9],[6,7,8,9]]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test9() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)1,(int)10,(int)1);
      assertEquals("[[1],[2],[3],[4],[5],[6],[7],[8],[9]]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test10() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)5,(int)13,(int)7);
      assertEquals("[[5,6,7,8,9,10,11],[5,6,7,8,9,10,12],[5,6,7,8,9,11,12],[5,6,7,8,10,11,12],[5,6,7,9,10,11,12],[5,6,8,9,10,11,12],[5,7,8,9,10,11,12],[6,7,8,9,10,11,12]]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test11() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)5,(int)13,(int)0);
      assertEquals("[[]]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void subsequences_test12() {
    try {
      Object actual = SUBSEQUENCES.subsequences((int)1,(int)5,(int)0);
      assertEquals("[[]]",actual.toString().replace(" ", ""));
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

}
