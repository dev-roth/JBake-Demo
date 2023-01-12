package org.dev_roth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

  @Test
  public void sumAddsTwoNumbers() {
    // GIVEN
    int a = 40;
    int b = 2;
    // WHEN
    int sum = MathUtils.sum(a, b);
    // THEN
    assertEquals( 42, sum);
  }

}