Here’s the updated `README.md` using code blocks for matrices:

---

# Matrix Operations - Programming 1

This repository contains Java programs for performing various matrix operations. The following tasks demonstrate how to implement basic matrix operations such as element-wise addition, multiplication, and transposition. Each task includes the mathematical explanation of the operation.

## Tasks

### 1. **Matrix Element-Wise Addition**  
**Description:**  
This program performs element-wise addition of two matrices \( A \) and \( B \), producing a resulting matrix \( C \).

**Mathematical Explanation:**  
For two matrices \( A \) and \( B \) of the same dimensions \( m \times n \):  
\[
C[i][j] = A[i][j] + B[i][j], \quad \forall \, 0 \leq i < m, \, 0 \leq j < n
\]  

**Example:**  
Given matrices:  
```plaintext
A = [ 1  2  3 ]
    [ 4  5  6 ]

B = [ 7  8  9 ]
    [10 11 12 ]
```
Resulting matrix:  
```plaintext
C = [  8  10  12 ]
    [ 14  16  18 ]
```

---

### 2. **Matrix Multiplication**  
**Description:**  
This program multiplies two matrices \( A \) and \( B \), producing a resulting matrix \( C \) if the number of columns in \( A \) equals the number of rows in \( B \).

**Mathematical Explanation:**  
For two matrices \( A \) of dimensions \( m \times p \) and \( B \) of dimensions \( p \times n \):  
\[
C[i][j] = \sum_{k=0}^{p-1} A[i][k] \cdot B[k][j], \quad \forall \, 0 \leq i < m, \, 0 \leq j < n
\]  

**Example:**  
Given matrices:  
```plaintext
A = [ 1  2  3 ]
    [ 4  5  6 ]

B = [ 7  8 ]
    [ 9 10 ]
    [11 12 ]
```
Resulting matrix:  
```plaintext
C = [ 58  64 ]
    [139 154 ]
```

---

### 3. **Transpose of a Matrix**  
**Description:**  
This program computes the transpose of a given matrix \( A \), producing a new matrix \( T \), where rows become columns and columns become rows.

**Mathematical Explanation:**  
For a matrix \( A \) of dimensions \( m \times n \), the transpose \( T \) has dimensions \( n \times m \), and:  
\[
T[j][i] = A[i][j], \quad \forall \, 0 \leq i < m, \, 0 \leq j < n
\]  

**Example:**  
Given matrix:  
```plaintext
A = [ 1  2  3 ]
    [ 4  5  6 ]
```
Transpose:  
```plaintext
T = [ 1  4 ]
    [ 2  5 ]
    [ 3  6 ]
```

---

## How to Run the Programs

1. Clone the repository:  
   ```bash
   git clone https://github.com/kretekarfolyam/Programming1_kretek.git
   cd Programming1_kretek/matrices
   ```
2. Navigate to the specific task directory and open the Java file.  
3. Compile and run the program using your preferred Java environment or command line:  
   ```bash
   javac MatrixElementWise.java
   java MatrixElementWise
   ```
   Repeat for the other tasks by replacing the class name as needed.  

---

## License

This project is open-source under the MIT License.

---
