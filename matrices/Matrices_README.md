# Matrices Tasks - Programming 1  

This folder contains programs demonstrating basic operations on matrices, including element-wise addition, multiplication, and transposition. Each task focuses on a key mathematical concept and its implementation in Java.  

---

## Tasks Overview  

### 1. **Matrix Element-Wise Addition**  
- **Description:**  
  This program performs element-wise addition of two matrices \( A \) and \( B \), producing a resulting matrix \( C \).  
- **Mathematical Explanation:**  
  For two matrices \( A \) and \( B \) of the same dimensions \( m \times n \):  
  \[
  C[i][j] = A[i][j] + B[i][j], \quad \forall \, 0 \leq i < m, \, 0 \leq j < n
  \]  
- **Example:**  
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
- **Description:**  
  This program multiplies two matrices \( A \) and \( B \), producing a resulting matrix \( C \) if the number of columns in \( A \) equals the number of rows in \( B \).  
- **Mathematical Explanation:**  
  For two matrices \( A \) of dimensions \( m \times p \) and \( B \) of dimensions \( p \times n \):  
  \[
  C[i][j] = \sum_{k=0}^{p-1} A[i][k] \cdot B[k][j], \quad \forall \, 0 \leq i < m, \, 0 \leq j < n
  \]  
- **Example:**  
  Given matrices:  
  \[
  A = \begin{bmatrix} 1 & 2 & 3 \\ 4 & 5 & 6 \end{bmatrix}, \quad B = \begin{bmatrix} 7 & 8 \\ 9 & 10 \\ 11 & 12 \end{bmatrix}
  \]  
  Resulting matrix:  
  \[
  C = A \cdot B = \begin{bmatrix} 58 & 64 \\ 139 & 154 \end{bmatrix}
  \]  

---

### 3. **Transpose of a Matrix**  
- **Description:**  
  This program computes the transpose of a given matrix \( A \), producing a new matrix \( T \), where rows become columns and columns become rows.  
- **Mathematical Explanation:**  
  For a matrix \( A \) of dimensions \( m \times n \), the transpose \( T \) has dimensions \( n \times m \), and:  
  \[
  T[j][i] = A[i][j], \quad \forall \, 0 \leq i < m, \, 0 \leq j < n
  \]  
- **Example:**  
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

1. **Clone the Repository:**  
   ```bash
   git clone https://github.com/kretekarfolyam/Programming1_kretek.git
   cd Programming1_kretek/matrices
