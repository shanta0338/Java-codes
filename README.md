# Java-codes

A personal collection of standalone Java programs written for practice — covering core syntax, arrays, sorting algorithms, dynamic programming, and small object-oriented design exercises. Each file is generally self-contained and can be compiled and run independently.

## Contents

### Sorting Algorithms
| File | Description |
|---|---|
| `Bubble_sort.java` | Bubble sort with an early-exit optimization flag |
| `Selection_sort.java` | Selection sort implementation |
| `Insertion_Sort.java` | Insertion sort implementation |
| `QuickSort.java` | Quicksort using Lomuto-style partitioning |
| `M_QuickSort.java` | Alternate/modified quicksort implementation |
| `Merge_Sort.java` | Merge sort with user input via `Scanner` |
| `Binary_search.java` | Binary search on a sorted array |

### Dynamic Programming
| File | Description |
|---|---|
| `Knapsack.java` | 0/1 Knapsack problem (tabulation, fixed inputs) |
| `Re_Knapsack.java` | 0/1 Knapsack with user-provided input via `Scanner` |
| `coinChangeways.java` | Counts the number of ways to make change for a target amount using given coins |

### Arrays, Strings & Basics
| File | Description |
|---|---|
| `Array.java` | Reverses a string |
| `ArrayLine.java` | Minimal "Hello, World" program |
| `Function.java` | Demonstrates swapping array elements via a static method |
| `Matrix.java` | Reads a matrix and prints its transpose |
| `Swap.java` | Swaps two elements in an `ArrayList` by user-given indices |
| `Switch.java` | Simple calculator using a `switch` statement (+, −, ×, ÷) |
| `Syntax.java` | `ArrayList` sorting and summation practice |

### Object-Oriented Design Exercises
| File | Description |
|---|---|
| `Transport.java` | Interface defining a delivery transport contract |
| `Air.java` | Implements `Transport` for air delivery |
| `Seatransport.java` | Implements `Transport` for sea delivery |
| `DeliverySystem.java` | Abstract class defining a courier service contract |
| `Pathao.java` | Concrete courier implementation (`Pathao`) extending `DeliverySystem` |
| `RedX.java` | Concrete courier implementation (`RedX`) extending `DeliverySystem` |
| `Vehicle.java` | Base class with shared vehicle properties and behavior |
| `Car.java` | Extends `Vehicle`, demonstrates inheritance |
| `Main2.java` | `Pen` and `Student` classes demonstrating constructors, including a copy constructor |

## Requirements

- Java Development Kit (JDK) 8 or later
- No external dependencies — plain `javac`/`java` is sufficient

## How to Run

Each file with a `main` method can be compiled and run on its own, for example:

```bash
javac Bubble_sort.java
java Bubble_sort
```

For files split across related classes (e.g. `Transport.java`, `Air.java`, `Seatransport.java`, `DeliverySystem.java`, `Pathao.java`, `RedX.java`, or `Vehicle.java`/`Car.java`), compile the related files together:

```bash
javac Transport.java Air.java Seatransport.java
javac DeliverySystem.java Pathao.java RedX.java
java Pathao
```

Some programs (`Merge_Sort.java`, `Matrix.java`, `Re_Knapsack.java`, `Switch.java`, `Swap.java`) read input from the console via `Scanner` — run them interactively and supply the requested values when prompted.

## Notes

- Files are organized as flat, independent `.java` files without package declarations, so they should be compiled from the same directory.
- This repository is intended as a learning/practice log rather than a single cohesive application — file naming and style vary by topic and by when each exercise was written.
- `Main.class` is a compiled artifact left in the repo; it can be safely deleted and regenerated with `javac`.

## Author

Shanta
