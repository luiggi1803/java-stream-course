package lectures;

import static junit.framework.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.Comparators;
import com.google.common.collect.ImmutableList;

import junit.framework.Assert;

import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class Lecture3 {

  @Test
  public void min() throws Exception {

      final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);

//    int min = numbers.stream().max((a,b)->b.compareTo(a)).get();
      int min = numbers.stream().min(Comparator.naturalOrder()).get();

      assertEquals(1, min);
      System.out.println("minimo: " + min);
  }

  @Test
	public void max() throws Exception {
		final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
//    int max = numbers.stream().max((a,b)->a.compareTo(b)).get();
		int max = numbers.stream().max(Comparator.naturalOrder()).get();
		assertEquals(100, max);
		System.out.println("maximo: " + max);
	}
}
