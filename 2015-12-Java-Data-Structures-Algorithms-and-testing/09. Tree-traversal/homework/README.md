1. Define classes `File { string name, int size }` and `Folder { string name, File[] files, Folder[] childFolders }` and using them build a tree keeping example files and folders on the hard drive starting from `C:\WINDOWS`. 

2. Implement a method that calculates the sum of the file sizes in given subtree of the tree from task 1. and test it accordingly. Use recursive DFS traversal.

3.* You are given a **tree of N nodes** represented as a set of `N-1` pairs of nodes (parent node, child node), each in the range (`0..N-1`).
   Example:
   
   ![Tree](images/Problem3_Tree.png)
   
   Write a program to read the tree and find:
   
    <ol type="a">
       <li>the root node</li>
       <li>all leaf nodes</li>
       <li>all middle nodes</li>
       <li>the longest path in the tree</li>
       <li>(*) all paths in the tree with given sum `S` of their nodes</li>
       <li>(*) all subtrees with given sum `S` of their nodes</li>
    </ol>