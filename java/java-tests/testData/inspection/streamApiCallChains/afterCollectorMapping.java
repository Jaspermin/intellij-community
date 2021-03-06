// "Replace Stream.collect(mapping()) with Stream.map().collect()" "true"

import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public List<Integer> sizes(List<String> data) {
    return data.stream().filter(x -> x.startsWith("xyz")).map(String::length).collect(Collectors.toList());
  }
}