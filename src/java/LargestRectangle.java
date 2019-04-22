import java.util.Stack;

class LargestRectangle {
    /*
    We go through left to right on every item in the array.
    For a given item, we want to ensure the stack has heights that are less than or equal to this item.

    As we traverse:
        1. If the current height <= the last stored height, add this position to the stack
        2. Else, we "iterate backwards" until we find a value in the stack smaller than the current value.
            a. We do this because the stack is sorted in increasing order.  We want to pop off
                values that are bigger than the current item so we don't use them in future calculations.
            b. We stop at items in the stack that are the same size or smaller than the ith item
                so that we can use them to calculate rectangles going forward.
        3. Because we go through every item once (adding to the stack), and then removing every item exactly
            once by popping off the stack, we go through 2*n times or O(n)
     */
    static long largestRectangle(int[] h) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int height;
        int width;
        int topIndex;
        int i = 0;
        while( i < h.length) {
            if(stack.isEmpty() || h[stack.peek()] <= h[i]) {
                stack.push(i);
                i++;
            } else {
                topIndex = stack.pop();
                height = h[topIndex];
                width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, width*height);
            }
        }

        while(!stack.isEmpty()) {
            topIndex = stack.pop();
            height = h[topIndex];
            width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, width*height);
        }

        return maxArea;
    }
}
