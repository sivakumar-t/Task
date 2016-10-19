Task:
	Write a program that takes a basket of items and outputs its total cost.
	The basket can contain one or more of the following items: Bananas, Oranges, Apples, Lemons, Peaches

Design Decision:

	1) Visitor pattern is used in this solution, so that the calculation logic is kept separated from the items and
	   if there are any future changes to the calculation logic like say apply some discount, then the change will 
	   only be in the visitor implementation and not on the actual items itself.

	2) Price per item is used for simplicity and can be enhanced with further inputs say price per kg and weight.
