Let's break down how this reversed array program works step by step with an example.

### Code Walkthrough:
1. **Scanner Input**:  
   The program uses `Scanner` to take input from the user.

2. **Array Size Input**:  
   - The user is prompted to enter the size of the array.
   - Example: The user inputs the size as `5`.

3. **Array Creation and Population**:  
   - An array of integers is created with the size entered by the user (`arr[]`).
   - The program uses a `while` loop to take input for each element of the array.
   - Example: The user enters the numbers `1, 2, 3, 4, 5`.

   ```
   arr[] = {1, 2, 3, 4, 5}
   ```

4. **Reversing the Array**:  
   The program calls the `reverse()` method to reverse the array in place.
   Here's how the reverse method works step by step:

   - The method uses a `while` loop to swap elements from the front and back of the array. It does this until it reaches the middle.
   
   - For example, with `arr[] = {1, 2, 3, 4, 5}`, the process goes like this:

   **Step 1:**  
   ```
   i = 0 (first element)
   swap = arr[0] = 1 (store first element in a temp variable)
   arr[0] = arr[4] = 5 (swap first and last element)
   arr[4] = 1 (place stored first element in last position)
   Updated arr[] = {5, 2, 3, 4, 1}
   ```

   **Step 2:**  
   ```
   i = 1 (second element)
   swap = arr[1] = 2 (store second element in a temp variable)
   arr[1] = arr[3] = 4 (swap second and second-last element)
   arr[3] = 2 (place stored second element in second-last position)
   Updated arr[] = {5, 4, 3, 2, 1}
   ```

   **Step 3:**  
   ```
   i = 2 (middle element)
   No need to swap the middle element since it's in its correct position after reversing.
   ```

   - After these steps, the array is completely reversed:  
   ```
   arr[] = {5, 4, 3, 2, 1}
   ```

5. **Displaying the Reversed Array**:  
   - Finally, the reversed array is printed using another `while` loop, which goes through each element and displays it.

### Example Execution Flow:
If the user enters:
- Size: 5
- Elements: `1, 2, 3, 4, 5`

The output would be:
```
Reversed array is:
5
4
3
2
1
```

### Summary:
- The user inputs the array size and elements.
- The program reverses the array by swapping elements from the start and end using a temporary variable to store one of the elements during the swap.
- The reversed array is printed element by element.


The condition `i < arr.length / 2` is used in the **reverse method** to ensure that the program only swaps elements from the first half of the array with those from the second half. Let’s explore why this is necessary.

### Why Swap Only Half the Elements?

1. **How Reversing Works:**
   - When you reverse an array, you want to swap the elements from the start with the elements from the end. Once you reach the middle, every element has been swapped, and there is no need to continue further. 
   - For example, if you have an array of size 5:  
     ```
     arr[] = {1, 2, 3, 4, 5}
     ```
     After swapping:
     - Swap `arr[0]` with `arr[4]`:  
       ```
       {5, 2, 3, 4, 1}
       ```
     - Swap `arr[1]` with `arr[3]`:  
       ```
       {5, 4, 3, 2, 1}
       ```
     - At this point, the middle element `arr[2] = 3` is already in its correct place, and the array is fully reversed.

2. **Reason for `arr.length / 2`:**
   - The array has `arr.length` elements.
   - To reverse the array, you only need to perform swaps for half of those elements. This is because each swap corrects two elements—one from the front and one from the back.
   - Once you've swapped half of the elements, the remaining elements are already in their reversed positions.

   **Example (Array of Size 6):**
   ```
   arr[] = {1, 2, 3, 4, 5, 6}
   ```
   - You will swap:
     - `arr[0]` with `arr[5]`
     - `arr[1]` with `arr[4]`
     - `arr[2]` with `arr[3]`
   - The loop needs to stop once `i` reaches 3 (`arr.length / 2` for an array of size 6). At this point, every element has been swapped:
   ```
   {6, 5, 4, 3, 2, 1}
   ```

### Why Not Loop through the Whole Array?

If you were to use the condition `i < arr.length` and loop through the entire array, you would end up swapping elements back to their original positions in the second half of the array. For example:

- If you continue swapping after the middle of the array, you'd reverse the reverse, bringing the array back to its original order.

Thus, **looping only to `arr.length / 2`** ensures you reverse the array properly without re-swapping elements that are already in place.

### Summary:
- **`i < arr.length / 2`** ensures that you only swap the necessary elements to reverse the array.
- Swapping more than half the array would undo the reversal.
