1. You cannot use an abstract method, because they work like a blueprint. They cannot use any abstract classes directly
2. It would give an error, as it is extremely important to use these methods as the subclasses will not compile otherwise.
3. Polymorphism is used in the array, while they are all different subclasses, they all inherit from the Enemy class & type.
4. It serves as a blueprint, because not all monsters will behave the same, but will need to take damage in the same way across all monsters.
5. Yes, but interfaces cannot store actual code themselves. So you would have to write shared data that abstracts do automatically
