- map, filter, reduce algorithm
- lot of focus on the reduce
- how to implement this algorithm in the JDK

- the map step takes a list of persons and returns a list of interger
   i.e takes a list of a certain type and return a list of another type but the size is constant

- the filter step takes a list of integers and returns a list of integers
  i.e it does not change the type of the list it processes but it changes the number of element in the list 
  that do not match a given predicate

- the reduce step is just like a sequel aggregation

using Optional on JDK 8:
An Optional is a wrapper type that may be empty

-How can we design an API to implement the Map/filter/reduce algorithm ?


STREAMS API
- its an intermediate call, defined on the Collection interface, it returns a stream which is a new interface in java 8
 specially designed to implement the map, filter, reduce and other things too.
