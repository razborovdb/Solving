An amazon fullfillment associate has a set of items that need to be packed in two boxes, 
given an array of item weights (arr) to be placed, divide the item weights in to two subsets A and B for packing into 
associate boxes while respecting the folowing conditions.

The conditions:
A Fulfillment Associate is tasked with packing items into two boxes, A and B. Here's what we must achieve:
🚫 The intersection of A and B is null.
🤝 The union of A and B equals the original array.
🎛️ Subset A must be minimal in size.
⚖️ The sum of A's weights is greater than the sum of B's weights.

Examples:
• n = 5, arr = [3, 7, 5, 6, 2], so A = [6, 7]
• n = 6, arr = [4, 5, 2, 3, 1, 2], so A = [4, 5]
• n = 6, arr = [1, 2, 2, 2, 3, 4], so A = [1, 3, 4]
• n = 4, arr = [2, 2, 2, 3], so A = [2, 2, 2]
• n = 9, arr = [1,1,1,1,4,4,4,7,8], so A = [4,4,4,8]

this is the sde2 oa question i got from some external thread, i have solved this question using recursion. i am getting answers as per test cases.