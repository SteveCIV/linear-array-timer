# linear-array-timer
Compares speed of adding to ends of different array types

Will time how long it takes to add items to the left and right of four types of linear array types
Array
ArrayList
LinkedList
DoublyCircularLinkedList

Producing a result similiar to ...

Timings for filling a structure with n items (integers from 1 to n)
(all timings are in milliseconds):

Linear Structure Type 
                    Array                 ArrayList           LinkedList       DoublyCircularLinkedList
               Start        End      Start        End      Start        End      Start        End

Value of N
      10          7          0          1          0         35          0          6          0
     100          0          0          0          0          2          0          0          0
    1000          0          0          1          0          6          0          1          3
   10000          1          1          7          0         54          0          1        120
  100000          3          4        453          4       5222          2          3      14846
