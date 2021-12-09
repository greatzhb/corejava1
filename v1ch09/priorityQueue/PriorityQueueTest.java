package priorityQueue;

import java.util.*;
import java.time.*;

/**
 * This program demonstrates the use of a priority queue.
 * @version 1.02 2015-06-20
 * @author Cay Horstmann
 */
public class PriorityQueueTest
{
   public static void main(String[] args)
   {
      var pq = new PriorityQueue<LocalDate>();
      // G. Hopper
      pq.add(LocalDate.of(1906, 12, 9));
      // A. Lovelace
      pq.add(LocalDate.of(1815, 12, 10));
      // J. von Neumann
      pq.add(LocalDate.of(1903, 12, 3));
      // K. Zuse
      pq.add(LocalDate.of(1910, 6, 22));

      System.out.println("Iterating over elements . . .");
      for (LocalDate date : pq) {
         System.out.println(date);
      }
      System.out.println("Removing elements . . .");
      while (!pq.isEmpty()) {
         System.out.println(pq.remove());
      }
   }
}
