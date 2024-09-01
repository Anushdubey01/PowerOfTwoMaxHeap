# PowerOfTwoMaxHeap


---

## Power of Two Max Heap

### Overview

The Power of Two Max Heap is an advanced data structure that extends the traditional max heap concept. Unlike a standard binary heap, where each parent node has exactly two children, the Power of Two Max Heap allows each parent node to have \(2^k\) children. Here, \(k\) is a configurable parameter, enabling the heap to adapt to various use cases by adjusting its branching factor. This structure can offer significant performance benefits depending on the context in which it's used.

### Key Concepts

#### Max Heap Property

The Power of Two Max Heap adheres to the max-heap property, which is crucial for maintaining order within the heap:
- **Max-Heap Property:** For every node \(N\) in the heap, the value of \(N\) is greater than or equal to the values of its children. This ensures that the largest element in the heap is always at the root, allowing efficient access and removal of the maximum element.

#### Degree of Nodes

The degree of a node in the Power of Two Max Heap is determined by:
\[ \text{degree} = 2^k \]
where \(k\) is specified during the heap's construction. This parameter allows flexibility in the heap's structure:
- **\(k = 1\):** The heap behaves like a traditional binary heap, where each node has 2 children.
- **\(k = 2\):** The heap functions as a quad heap, with 4 children per node.
- **Higher values of \(k\):** Result in an exponentially increasing number of children per node. For example, \(k = 3\) would create an octa heap with 8 children per node.

### Use Cases

The Power of Two Max Heap is particularly useful in scenarios where its unique properties can be leveraged for optimal performance:
- **Batch Processing:** In tasks involving large datasets or batch operations, a higher branching factor can reduce the number of levels in the heap. This can potentially minimize the number of operations required for heapification or for extracting the maximum element.
- **Parallel Computing:** The increased branching factor can improve parallel processing by distributing the heap’s nodes more evenly, facilitating efficient parallel algorithms.
- **Memory and Cache Optimization:** A higher degree reduces the depth of the heap, which can enhance memory and cache utilization. This structure can decrease cache misses by keeping more elements in close proximity in memory.

### Implementation Details

#### Class Structure

**`PowerOfTwoMaxHeap.java`** is the primary class implementing this data structure. It utilizes an `ArrayList` for storing heap elements in a cache-friendly manner.

**Key Methods:**

- **Constructor:**
  ```java
  public PowerOfTwoMaxHeap(int degreeParam)
  ```
  Initializes the heap with \(2^k\) children per node, where \(k\) is provided as `degreeParam`.

- **Insert Method:**
  ```java
  public void insert(int value)
  ```
  Adds a new element to the heap. The insertion process involves adding the element at the end of the heap and then "bubbling up" the element to maintain the heap property. This operation ensures that the new element is placed in a position where the max-heap property is preserved.

- **Pop Max Method:**
  ```java
  public int popMax()
  ```
  Removes and returns the maximum element (the root) from the heap. After removal, the last element in the heap replaces the root. The heap is then restored to its valid state by "bubbling down" this element, ensuring that the max-heap property is maintained.

### Algorithmic Operations

**Insert Operation:**
1. **Insert at the End:** The new element is appended to the end of the heap (i.e., the last position in the array representation).
2. **Bubble Up:** Compare the inserted element with its parent. If the new element is larger, it is swapped with its parent. This process repeats until the element is in a position where the heap property is satisfied.
   - **Time Complexity:** \(O(\log n)\) in the worst case, due to the height of the heap.

**Pop Max Operation:**
1. **Replace Root:** The root element (the maximum) is removed and replaced with the last element in the heap.
2. **Bubble Down:** Compare the new root with its children. If any child is larger, swap the root with the largest child. Continue this process until the heap property is restored.
   - **Time Complexity:** \(O(\log n)\) in the worst case, due to the height of the heap.

### Testing

**Unit Tests:**
- **Test Case 1:** Verify that inserting multiple elements into the heap and then calling `popMax` returns elements in descending order.
- **Test Case 2:** Ensure that operations such as popping from an empty heap are handled correctly.
- **Test Case 3:** Validate the heap's behavior with different degrees, including binary heaps, quad heaps, and others.

Tests are implemented in `PowerOfTwoMaxHeapTest.java` and can be executed using JUnit 5 to ensure the correctness and robustness of the heap operations.

### License

The project is licensed under the MIT License. See the LICENSE file for details.

### Setup Instructions

1. **Create Project Folders:** Establish the required directory structure as specified.
2. **Add Files:** Populate the project with the provided source files.
3. **Compile and Run:**
   - Import the project into an IDE like IntelliJ IDEA or Eclipse as a Maven project.
   - Execute the `Main.java` class to observe the heap in operation.
   - Run `PowerOfTwoMaxHeapTest.java` to perform unit testing.

For further assistance or inquiries, please reach out.

--- 
Feel free to adjust any details or add more specific instructions based on your project's needs!
