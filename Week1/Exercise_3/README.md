
# Sorting Customer Orders


## Step 1:  Understand Sorting Algorithms
## Bubble Sort:

### Description: 
A simple comparison-based algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
### Time Complexity:
1.Best Case: O(n) (when the list is already sorted)

2.Average Case: O(n²)

3.Worst Case: O(n²)
### Characteristics: 
Inefficient on large lists, but easy to understand and implement.

## Insertion Sort:

### Description: 
Builds the final sorted array one item at a time. It picks the next item and inserts it into its correct position among the previously sorted items.
### Time Complexity:
1.Best Case: O(n) (when the list is already sorted)

2.Average Case: O(n²)

3.Worst Case: O(n²)
### Characteristics: 
 More efficient than Bubble Sort for small datasets or nearly sorted data.

## Quick Sort:

### Description: 
A divide-and-conquer algorithm. It picks a pivot element and partitions the array into two halves, with elements less than the pivot on one side and greater on the other. It then recursively sorts the partitions.
### Time Complexity:
1.Best Case: O(n log n)

2.Average Case: O(n log n)

3.Worst Case: O(n²) (when the pivot is the smallest or largest element each time)
### Characteristics: 
 Generally faster and more efficient for large datasets. Can be optimized with different pivot selection strategies.

 ## Merge Sort:

### Description: 
A divide-and-conquer algorithm. It divides the array into two halves, recursively sorts them, and then merges the sorted halves.
### Time Complexity:
1.Best Case: O(n log n)

2.Average Case: O(n log n)

3.Worst Case: O(n log n)
### Characteristics: 
 Stable sort with predictable performance. Requires additional space for the merge process.




## Step 2: Setup

Create a class Order with attributes orderId, customerName, and totalPrice.

## Step 3: Implementation

The detailed code files are present in the code repository.

## Step 4: Analysis

### Performance Comparison:

#### 1.Bubble Sort:


##### Time Complexity:
1.Best Case: O(n) (when the list is already sorted)

2.Average Case: O(n²)

3.Worst Case: O(n²)

4.Bubble Sort is inefficient for large datasets due to its quadratic time complexity.

#### 2.Quick Sort:

### Time Complexity:
1.Best Case: O(n log n)

2.Average Case: O(n log n)

3.Worst Case: O(n²) (when the pivot is the smallest or largest element each time)

4.Quick Sort is generally much faster for large datasets due to its divide-and-conquer approach. Its average time complexity is significantly better than Bubble Sort.

### Why Quick Sort is Preferred:

Quick Sort is generally preferred over Bubble Sort because it has a much better average-case time complexity of O(n log n) compared to Bubble Sort's O(n²). Quick Sort is highly efficient for large datasets, especially when using good pivot selection strategies (e.g., median-of-three or random pivot). While its worst-case performance is O(n²), this scenario can be mitigated with proper pivot selection and optimizations. Bubble Sort, on the other hand, consistently performs poorly for large datasets and is generally only used for educational purposes or small, nearly sorted datasets.






