# PowerOfTwoMaxHeap

Certainly! Here's a `README.md` file for the Power of Two Max Heap project. You can copy and save this content into a file named `README.md` for your project.

```markdown
# Power of Two Max Heap

## Introduction

The Power of Two Max Heap is a variant of the traditional max heap data structure. Unlike a standard binary heap where each parent node has exactly two children, this heap allows each parent node to have \(2^k\) children, where \(k\) is a configurable parameter. This flexibility can provide performance benefits in scenarios where a higher branching factor is advantageous for the data or the operations being performed.

## Heap Property

The Power of Two Max Heap maintains the max-heap property:
- For every node \(N\), the value of \(N\) is greater than or equal to the values of its children.
- This ensures that the largest element in the heap is always at the root node, allowing efficient access and removal of the maximum value.

## Degree of Nodes

The degree (number of children per node) is determined by the formula:
\[ \text{degree} = 2^k \]
where \(k\) is provided as a parameter during the heap's construction. This allows for fine-tuning of the heap's structure:
- **\(k = 1\)**: Traditional binary heap (2 children per node).
- **\(k = 2\)**: Quad heap (4 children per node).
- **Higher values of \(k\)**: Increase the number of children exponentially.

## Use Cases

- **Batch Processing**: A higher branching factor can reduce the number of levels in the heap, leading to potentially fewer operations for heapifying or extracting the maximum element.
- **Data Structures for Parallel Computing**: The increased branching factor can be beneficial for dividing and processing the structure in parallel.
- **Memory and Cache Optimization**: A higher degree can better utilize memory and cache by reducing the depth of the heap, thus decreasing cache misses.

## Implementation Details

### Class Structure

**`PowerOfTwoMaxHeap.java`**

This class implements the Power of Two Max Heap. It uses an `ArrayList` to store the heap elements in a compact and cache-friendly manner.

**Key methods:**
- **Constructor:**
  ```java
  public PowerOfTwoMaxHeap(int degreeParam)
  ```
  Initializes the heap with \(2^k\) children per node, where \(k\) is the provided `degreeParam`.

- **Insert:**
  ```java
  public void insert(int value)
  ```
  Inserts a new element into the heap, maintaining the heap property by "bubbling up" the inserted element if necessary.

- **Pop Max:**
  ```java
  public int popMax()
  ```
  Removes and returns the maximum element from the heap. The last element replaces the root, and the heap is restored by "bubbling down" this element.

### Algorithmic Operations

**Insert Operation**
1. **Insert at the End:** The new element is added to the end of the heap (the last position in the array).
2. **Bubble Up:** The element is compared with its parent node. If it's greater, the elements are swapped. This process continues until the element is in a valid position where the heap property is satisfied.
   - **Time Complexity:** \(O(\log n)\) in the worst case.

**Pop Max Operation**
1. **Replace Root:** The maximum element (root) is removed and replaced with the last element in the heap.
2. **Bubble Down:** The new root element is compared with its children. If any child is greater, the element is swapped with the largest child. This process continues until the element is in a valid position.
   - **Time Complexity:** \(O(\log n)\) in the worst case.

## Testing

### Unit Tests

- **Test Case 1:** Insert multiple elements and ensure that `popMax` returns them in descending order.
- **Test Case 2:** Test edge cases such as popping from an empty heap.
- **Test Case 3:** Verify heap behavior with different degrees (binary heap, quad heap, etc.).

All tests are provided in `PowerOfTwoMaxHeapTest.java` and can be run using JUnit 5.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Instructions for Download

1. **Create Project Folders:** Create the directory structure as specified in the locations above.
2. **Add Files:** Copy the provided content into the corresponding files in your project.
3. **Compile and Run:**
   - If using an IDE like IntelliJ IDEA or Eclipse, import the project as a Maven project.
   - Run the `Main.java` class to see the heap in action.
   - Run `PowerOfTwoMaxHeapTest.java` to execute unit tests.

## Contact

For any questions or further assistance, feel free to reach out.

```

Feel free to make any additional modifications as needed!
