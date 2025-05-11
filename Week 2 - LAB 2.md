UML - II (Thursday afternoon and Friday)
Goals 
Get familiar with the following UML concepts:
- interfaces and generic types;
- exceptions;
- objects.

### Exercise 1 

Consider a package that makes available a class of generic queues. A generic queue is a FIFO structure (First In First Out), where we can:
- add an element at the end of the queue;
- get the first element of the queue;
- remove an element of the queue;
- verify if the queue is empty;
- compute its length.
 A queue is built empty, and an underflow exception is thrown whenever an element is removed from an empty queue. The package should make available limited and unlimited queues. The first should be implemented via an array initialised with the maximum number of elements. An overflow exception is thrown if one tries to add an element to a limited queue with the maximum number of elements. The second should be implemented via a linked list. All exceptions should have a cause, and this cause must be accessible outside the exception class only by modifiers and selectors.  
a) Model the class diagram in UML, including constructors. 
b) Present the object diagram of one unlimited queue of String, with the strings “one” and “two” inserted in this order. 

#### Notas:
- The "T" on the top right corner of classes or interfaces in UML typically indicates that the class or interface is **generic**, and `T` is the type parameter.
	Nota da Nota:
	- A **generic class/interface** allows you to define logic once and reuse it for any type `T`. It provides flexibility and type safety, making code **cleaner**, **reusable**, and **less error-prone**.
- An **interface** is a **contract** that defines a set of methods that a class must implement, but it does **not provide the implementation** of those methods.
	In this case:
	- The `<<interface>> Queue<T>` defines **what** a queue can do (methods like `enqueue`, `dequeue`, etc.), while `LimitedQueue<T>` and `UnlimitedQueue<T>` define **how** it does it (with array or linked list, respectively).


#### Different Types of Arrows:

| Arrow Type                | Meaning                                  |
| ------------------------- | ---------------------------------------- |
| Solid line with ▵         | Inheritance (class extends a class)      |
| Dashed line with ▵        | Realization (class implements interface) |
| Plain solid line          | Association (has a reference to)         |
| Solid line with diamond ◇ | Aggregation ("has a" part-whole)         |
| Solid line with ●         | Composition (strong part-whole)          |

#### What is Realization?
**Realization = A class implementing all the methods of an interface**.

**Analogy** :
- An interface is a **blueprint**.
- A class is the **building** constructed using that blueprint.
- **Realization** is the act of **building** something based on the blueprint.



**Visibility of attributes and methods**
- public: visible outside of the class (+) 
- private: visible only inside the class (-) 
- protected: visible in class and subclasses (#) 
- package: visible in all classes of the same package (~)

**Resposta**
  ![[Pasted image 20250511121546.png]]
### Exercise 2 

The previous package should also make available limited and unlimited priority queues. A priority element is placed at the beginning of all non-priority elements in the queue. Suppose the limited priority queue is complete, and its last element is not a priority one. In that case, when a priority element is added, the last element of the queue is removed, and a disposal exception is thrown. 
Suggestion: Consider an interface Prior with a method is Prior that returns true if the argument is a priority element.  
Model the class diagram in UML, including constructors.

Notes:
- Now on the LimitedPQ and UnlimitedPQ the add() function receives the boolean value that indicates weather it should be placed on the beginning or in the end. 
- Also the LimitedPQ has an exception, referring to the last case of the problem.
- `<<interface>> Prior<T>` , **is an interface**, because we want different ways to define what is “priority” without locking that logic into the queue.

**Resposta**
![[Pasted image 20250511122504.png]]