   // select employee order by salary for each dept. We can also find 3rd highest salary of each dept
package com.practice.streams.streamsquestions;

   import com.practice.streams.Employee;
   import com.practice.streams.util.OutputPrinter;

   import java.util.List;
   import java.util.Map;
   import java.util.Optional;
   import java.util.stream.Collectors;

   import static java.util.Comparator.comparingInt;
   import static java.util.stream.Collectors.maxBy;

   public class StreamsQuestion {
   public static void main(String[] args) {
      List<com.practice.streams.Employee> allEmployees = List.of(
              new com.practice.streams.Employee("Ram",3002,"IT"),
              new com.practice.streams.Employee("Sita",8373,"IT"),
              new com.practice.streams.Employee("Josi",9271,"HR"),
              new com.practice.streams.Employee("Geeta",4203,"IT"),
              new com.practice.streams.Employee("Panku",2023,"Sales"),
              new com.practice.streams.Employee("naku",12023,"Sales"),
              new com.practice.streams.Employee("Deep",2994,"HR"));

      Map<String, com.practice.streams.Employee> topEmployees =
              allEmployees.stream()
                      .collect(Collectors.groupingBy(
                              com.practice.streams.Employee::getDepartment,
                              Collectors.collectingAndThen(maxBy(comparingInt(Employee::getSalary)), Optional::get)
                      ));

     OutputPrinter.printMap(topEmployees);
   }
}


