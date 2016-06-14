# PocCollectionsJava

Java Collections

LIST: A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements. Elements can be inserted or accessed by their position in the list, using a zero-based index.

- ArrayList
  - Particularidades:
  - Vantagem: Pesquisa
  - Desvantagem: Inserir e deletar

- LinkedList
  - Particularidades:
  - Vantagem: inserir e deletar
  - Desvantagem: pesquisa

- Vector
  - Particularidades: 
  - Vantagem: Vector is synchronized which means it is suitable for thread-safe operations
  - Desvantagem: poor performance when used in multi-thread environment


SET: A Set is a Collection that cannot contain duplicate elements. There are three main implementations

- HashSet
  - Particularidades: nao insere registro duplicado
  - Vantagem: inserir e pesquisar
  - Desvantagem:

- LinkedHashSet
  - Particularidades: Elements gets sorted in the same sequence in which they have been added to the Set.
  - Vantagem: Maintains the insertion order
  - Desvantagem:

- TreeSet
  - Particularidades: insere os valores em ordem alfabetica
  - Vantagem:
  - Desvantagem:


MAP: A Map is an object that maps keys to values. A map cannot contain duplicate keys. There are three main implementations of Map interfaces

- HashMap
  - Particularidades: used for storing Key & value pairs. permits nulls(null values and null key)
  - Vantagem:
  - Desvantagem:

- TreeMap
  - Particularidades: it makes no guarantees concerning the order of iteration. 
  - Vantagem:
  - Desvantagem:

- LinkedHashMap
  - Particularidades: This linked list defines the iteration ordering, which is normally the order in which keys were inserted into the map (insertion-order). 
  - Vantagem:
  - Desvantagem:


  Reference: http://beginnersbook.com/java-collections-tutorials/
  
