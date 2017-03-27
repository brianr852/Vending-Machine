# Vending-Machine
This program simulates a vending machine
* read item price
 * read bill value
 * subtract item price from bill value to calculate change due
 * set pennies to (change due / .01)
 * cast pennies to integer
 * set integer   part of ( pennies / 50 ) to half dollars
 * set remainder part of ( pennies / 50 ) to half dollars
 * set integer   part of ( pennies / 25 ) to quarters
 * set remainder part of ( pennies / 25 ) to pennies
 * set integer   part of ( pennies / 10 ) to dimes
 * set remainder part of ( pennies / 10 ) to pennies
 * set integer   part of ( pennies /  5 ) to nickels
 * set remainder part of ( pennies /  5 ) to pennies 
 * output half dollars, quarters, dimes, nickels, and pennies
 
 Enter cost of item >50.00<br />
Enter amount paid > 47.39<br />
The item cost is $50.00<br />
You paid $47.39<br />
Your change is $2.61 : 5 halfdollars, 0 quarters, 1 dimes, 2 nickles, 0 pennies.<br />
 
 
