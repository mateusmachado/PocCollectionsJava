# PocCollectionsJava

Java Collections

LIST: A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements. Elements can be inserted or accessed by their position in the list, using a zero-based index.

- ArrayList
  - Advantage: Search
  - Disadvantage: Insert and Delete

- LinkedList
  - Advantage: Insert and Delete
  - Disadvantage: Search

- Vector
  - Advantage: Vector is synchronized which means it is suitable for thread-safe operations
  - Disadvantage: Poor performance when used in multi-thread environment

SET: A Set is a Collection that cannot contain duplicate elements. There are three main implementations. Not thread-safe

- HashSet
  - Advantage: Insert And Search
  - Disadvantage: 

- LinkedHashSet
  - Advantage: Elements gets sorted in the same sequence in which they have been added to the Set.
  - Disadvantage:

- TreeSet
  - Advantage: Elements gets sorted in the same sequence in which they have been added to the Set.
  - Disadvantage: If you don’t supply a Comparator to define the ordering you want, TreeSet requires a Comparable implementation on the item class to define the natural order
  
MAP: A Map is an object that maps keys to values. A map cannot contain duplicate keys. There are three main implementations of Map interfaces

- HashMap
  - Advantage: Used for storing Key & value pairs. permits nulls(null values and null key)
  - Disadvantage: There's also the potential for collisions. The cost of writing and/or executing the hashing-function could be high if the requirement for collision avoidance is strict, or if you have a small hash-space.

- TreeMap
  - Advantage: Is that it allows to store the key-value mappings in a sorted order. Treemap internally uses red black tree.
  - Disadvantage: No guarantees concerning the order of iteration.
  
- LinkedHashMap
  - Advantage: Allows predictable iteration order
  - Disadvantage: Memory usage and probably higher insertion cost 


  
