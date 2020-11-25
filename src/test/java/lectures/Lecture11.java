package lectures;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class Lecture11 {

  @Test
	public void joiningStrings() throws Exception {
		List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");

		String concatenado = "";
		for (String name : names) {
			concatenado += name + ",";

		}

		System.out.println(concatenado.substring(0,concatenado.length()-1));
	}

  @Test
  public void joiningStringsWithStream() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");

    String join = names.stream()
    		.map(String::toUpperCase)
    		.collect(Collectors.joining("|"));
    
    System.out.println(join);
  }
}
