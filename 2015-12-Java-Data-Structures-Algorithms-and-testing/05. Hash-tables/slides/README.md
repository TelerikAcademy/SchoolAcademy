<!-- section start -->
<!-- attr: { class:'slide-title', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# Hash tables
## Map, HashMap, HashSet
<div class="signature">
    <p class="signature-course">Java DSA</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>


<!-- section start -->
<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# Table of Contents
- The `Map<K,V>` Interface
- `HashMap<K,V>`
- The `Set<E>` Interface
- `HashSet`

<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # The `Map<K,V>` Interface -->

<!-- attr: { hasScriptWrapper:true } -->
# The `Map<K,V>` interface
- `Map` is an object that maps keys to values
  - Cannot contain duplicate keys
  - Each key can map to at most one value
- Basic operations:
  - `put`, `get`, `remove`, `containsKey`, `containsValue`, `size`
- Bulk operations: 
  - `putAll`, `clear`
- Collections views:
  - `keySet`, `entrySet`, `values`


<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # `HashMap<K,V>` -->

<!-- attr: { hasScriptWrapper:true } -->
# `HashMap<K,V>`
- Hash table based implementation of the Map interface
  - Permits `null` values and the `null` key
- Makes no guarantees as to the order of the map
  - It does not guarantee that the order will remain constant over time
- _Note_: This implementation is not synchronized
- [Class HashMap<K,V> documentation](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)

<!-- attr: { hasScriptWrapper:true, style:'font-size:0.95em' } -->
# `HashMap<K,V>`
- Basic operations:
  - `size()` - returns the number of key-value mappings in this map
  - `get(key)` - returns the value to which the specified key is mapped
  - `put(key, value)`
    - associates the specified value with the specified key in this map
    - if the map previously contained a mapping for the key, the old value is replaced
  - `containsKey(key)` - returns true if this map contains a mapping for the specified key

<!-- attr: { hasScriptWrapper:true, style:'font-size:0.95em' } -->
# `HashMap<K,V>`
- Basic operations:
  - `remove(key)` - removes the mapping for the specified key from this map if present
  - `clear()` - removes all of the mappings from this map
  - `keySet()` - returns a set view of the keys contained in this map
  - `values()` - returns a set view of the mappings contained in this map
  - `entrySet()` - returns a set view of the mappings contained in this map

<!-- attr: { class:'slide-section demo', showInPresentation:true } -->
<!-- # `HashMap<K,V>` -->
## [Demo]()


<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # The `Set<K,V>` Interface -->

<!-- attr: { hasScriptWrapper:true } -->
# The `Set<K,V>` Interface
- A `Set` is a `Collection` that cannot contain duplicate elements
- Implementations in Java
  -  `HashSet`, `TreeSet`, and `LinkedHashSet`
  -  `HashSet` is the best-performing implementation
    -  stores its elements in a hash table
  -  `TreeSet` - orders its elements
    -  stores its elements in a red-black tree

<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # `HashSet<E>` -->

<!-- attr: { hasScriptWrapper:true } -->
# `HashSet<E>`
- Implements the Set interface
  - Backed by a hash table
- It makes no guarantees as to the iteration order of the set
- Constant time performance for the basic operations
- _Note_: this implementation is not synchronized
- [Class HashSet<E> documentation](http://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html)

<!-- attr: { hasScriptWrapper:true, style:'font-size:0.95em' } -->
# `HashSet<E>`
- Basic operations:
  - `size()` - returns the number of elements in this set
  - `contains(Object o)` - returns true if this set contains the specified element
  - `add(E e)` - adds the specified element to this set if it is not already present
    - returns `true` if this set did not already contain the specified element
  - `remove(Object o)` - removes the specified element from this set if it is present
  - `clear()` - removes all of the elements from this set

<!-- attr: { hasScriptWrapper:true } -->
# `HashSet<E>`

```java
Set<String> set = new HashSet<>();
    set.add("Jordan");
    set.add("Steven");
    set.add("Mike");
    set.add("Jordan");

    System.out.println(set); //[Mike, Jordan, Steven]
```




<!-- attr: { class:'slide-section demo', showInPresentation:true } -->
<!-- # `HashSet<E>` -->
## [Demo]()


<!-- section start -->
<!-- attr: { id:'questions', class:'slide-section' } -->
# Questions
## Data tructures and Algorithms
[link to Telerik Academy Forum](http://telerikacademy.com/Forum/Category/12/telerik-school-academy)