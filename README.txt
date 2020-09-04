Name: Victoria Salinas

Class: CS 245-01

Group members: N/A

Note for Grader:

I have a lot of trouble creating object oriented classes/ methods since I am kind of rusty on that, but I tried my best to make the code easy to understand. I did not remember the rules for public/private variables so if they are used incorrectly that is the reason why. I also had some difficulty using a sudoku object to call the methods. I did my best to implement the recursion and my steps made sense to me, but I couldn't figure out why it would not try to solve any answers past row 2. 

Issues: 

It will not recursively solve past rows 0 and 1 for some reason.

What works: 

It successfully takes in a user's input and prints a sudoku board that looks like the one from the lab worksheet.

Runtime/Time Complexity: 

I think the runtime would have to be O(n^81) or O(n^(9*9)) since in the nested for loop there are 9 rows/9 columns. For each row or column there are 9 possible numbers that can be tried in an empty space, so by iterating through these columns or rows it would produce 9 exececutions. The same would go for the outer for loop therefore making (9*9) executions. So I think the answer should be O(n^(9*9))

