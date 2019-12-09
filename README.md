
### Riddler Folder
This is a git repo of various programs for solutions of Riddler problems


## Solution for 12/7/19 Classic aka song problem
* averagePresses() should be clear on method.
* avgRand() results in the average value of random button, resultin in 42.
* I decided that pressing next when 49 presses away(92[I think]) is better than pressing random(I guess I was conservative).
* runAvgPresses() is a function to bruteforce the randomness of the algorithm, I think just running random cases and the averaging that with the probability of getting such cases
* maybe better but I didn't realize that until I was in too deep. In hindsight just writing to a log file may have been better for a lot of reasons.
* Evidence of runs and average here: https://docs.google.com/spreadsheets/d/1CXpSe_QBjcGc9ZgU9Q7whlmJjvdHIhqmhTbtq7cApIQ/edit?usp=sharing
* Went with rounding to hundredths because I wanted to be very safe.
