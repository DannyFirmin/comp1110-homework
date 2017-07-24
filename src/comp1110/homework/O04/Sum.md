Within the `comp1110.homework.O04` package of the `comp1110-homework` project, create an
abstract class, `Sum` that extends an `ArrayList` of `Integer` by adding a public method,
`int sum()` that returns the sum of all elements in the list of Integers (add the elements
up each time the method is called).

Enhance the above solution such that the sum is stored and maintained as a public
instance field of `Sum` (the field is public ). Now when the `sum()` method is called, it should just be able to
return the value of the sum field rather than having to add everything up. Note that many
of the standard methods of the `ArrayList` class must be overwritten so that they are able
to adjust the sum as elements are added or removed from the list. For this question you
need only override the four 'add' methods:
* `boolean add(Integer i)`,
* `void add(int index, Integer i)`,
* `boolean addAll(Collection<? extends Integer> c)`, and
* `boolean addAll(int index, Collection<? extends Integer> c)`.

Once you have it working, add and commit your work.
