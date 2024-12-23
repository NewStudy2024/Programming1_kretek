Here's a `README.md` file based on the explanations provided for the tasks:

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
Where \( i \) is the row index and \( j \) is the column index.

**Example:**  
Given matrices:  
\[
A = \begin{bmatrix} 1 & 2 & 3 \\ 4 & 5 & 6 \end{bmatrix}, \quad B = \begin{bmatrix} 7 & 8 & 9 \\ 10 & 11 & 12 \end{bmatrix}
\]  
Resulting matrix:  
\[
C = A + B = \begin{bmatrix} 8 & 10 & 12 \\ 14 & 16 & 18 \end{bmatrix}
\]  

---

### 2. **Matrix Multiplication**  
**Description:**  
This program multiplies two matrices \( A \) and \( B \), producing a resulting matrix \( C \) if the number of columns in \( A \) equals the number of rows in \( B \).

**Mathematical Explanation:**  
For two matrices \( A \) of dimensions \( m \times p \) and \( B \) of dimensions \( p \times n \):
\[
C[i][j] = \sum_{k=0}^{p-1} A[i][k] \cdot B[k][j], \quad \forall \, 0 \leq i < m, \, 0 \leq j < n
\]  
Where \( k \) iterates over the elements of the row of \( A \) and the column of \( B \).

**Example:**  
Given matrices:  
\[
A = \begin{bmatrix} 1 & 2 & 3 \\ 4 & 5 & 6 \end{bmatrix}, \quad B = \begin{bmatrix} 7 & 8 \\ 9 & 10 \\ 11 & 12 \end{bmatrix}
\]  
Resulting matrix:  
\[
C = A \cdot B = \begin{bmatrix} (1\cdot7 + 2\cdot9 + 3\cdot11) & (1\cdot8 + 2\cdot10 + 3\cdot12) \\ (4\cdot7 + 5\cdot9 + 6\cdot11) & (4\cdot8 + 5\cdot10 + 6\cdot12) \end{bmatrix}
= \begin{bmatrix} 58 & 64 \\ 139 & 154 \end{bmatrix}
\]  

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
\[
A = \begin{bmatrix} 1 & 2 & 3 \\ 4 & 5 & 6 \end{bmatrix}
\]  
Transpose:  
\[
T = A^T = \begin{bmatrix} 1 & 4 \\ 2 & 5 \\ 3 & 6 \end{bmatrix}
\]  

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
