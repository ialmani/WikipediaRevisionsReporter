Iqra Almani

## Challenge #1 Complete

I changed binding in the QueryEngineModule class from FakeQueryEngine to WikipediaQueryEngine.

## Challenge #2 Complete

I added RevisionFormatterModule that injects the correct dependency at runtime and RevisionFormatterInterface that is implemented by all formatters. I also created AlternativeRevisionFormatter that presents the revision information in a more user-friendly way. 

## Challenge #3 Complete

I used mapping to get rid of the for loop. I used the Collect method to return the list as a new list.

## Reflection Question #1: Functional vs OO

I prefer the iterative approach because I'm more fimiliar with it. However, I am getting to learn more about Functional approach this semester, and I think it would be good to learn more of it because it is very useful in many ways. Iterative approach at the moment is easier for me to read and understand.

## Reflection Question #2: Polymorphism and Dependency Inversion

Polymorphism allowed me to switch out a generic query engine for more specific query engines and a generic revision fomatted for more specific revision formatters. This allows for dependency inversion because we can inject whatever revision formatter or query engine we want.

