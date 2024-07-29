
# Task Management System


## Step 1:  Understand Linked Lists
## Types of Linked Lists:

### 1.Singly Linked List:
1.Description: Each node contains data and a reference (or link) to the next node in the sequence.

2.Structure: Node -> Node -> Node -> null

3.Advantages: Simplicity and efficient memory usage. Easier to implement compared to doubly linked lists.

### 2.Doubly Linked List:
1.Description: Each node contains data, a reference to the next node, and a reference to the previous node.

2.Structure: null <- Node <-> Node <-> Node -> null

3.Advantages: Allows traversal in both directions (forward and backward). Easier to implement operations like deletion and insertion at both ends.


## Step 2: Setup

Create a class Task with attributes like taskId, taskName, and status.

## Step 3: Implementation

The detailed code files are present in the code repository.

## Step 4: Analysis

### Time Complexity:

#### 1.Add Task:

1.Time Complexity: O(n) (for adding at the end in the worst case, O(1) if adding at the beginning)

2.Adding a task requires traversing to the end of the list, making the complexity linear in the number of tasks.

#### 2.Search Task:
1.Time Complexity: O(n)

2.Searching for a task requires traversing the list, making the complexity linear in the number of tasks.

#### 3.Traverse Tasks:
1.Time Complexity: O(n)

2.Traversing the list to display all tasks takes linear time.

#### 4.Delete Tasks:

1.Time Complexity: O(n)

2.Deleting a task requires searching for the task, making the complexity linear in the number of tasks.

### Advantages of Linked Lists Over Arrays for Dynamic Data:
1.Dynamic Size: Linked lists can grow and shrink dynamically without the need for resizing or reallocating memory, unlike arrays which have a fixed size.

2.Efficient Insertions/Deletions: Insertions and deletions (especially at the beginning or middle) are more efficient in linked lists because they do not require shifting elements, as is necessary in arrays.

3.Memory Utilization: Linked lists do not require contiguous memory allocation, which can be advantageous when dealing with large datasets.

### Limitations of Linked Lists:
1.Memory Overhead: Each node in a linked list requires additional memory for the reference to the next node.

2.No Direct Access: Linked lists do not allow direct access to elements by index, making random access slower (O(n)) compared to arrays (O(1)).

3.Increased Complexity: Linked lists are more complex to implement and manage compared to arrays, requiring careful handling of node references to avoid memory leaks and corruption.


Linked lists are preferred for scenarios where frequent insertions and deletions are needed, and the size of the data structure is not known in advance. Arrays are preferred for scenarios where fast random access is required and the size of the data structure is known and relatively static.






