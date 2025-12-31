#  Number Guesser (Java)
A simple command-line number guessing game written in Java.
The player chooses a range, and the program generates a random number.
The number of attempts is calculated fairly based on the chosen range.

##  Features

- User-defined number range
- Fair attempt calculation using logarithmic logic
- Input validation for non-numeric values
- Feedback for guesses (too high / too low)
- Replay option after each game
- Proper handling of edge cases (e.g. range = 1)

## Attempt Calculation Logic

The maximum number of attempts is calculated using: ```maxAttempts = ceil(log2(maxNumber))```
This ensures the game remains fair regardless of the chosen range, similar to an optimal binary search strategy.

## 🛠 Fixes & Improvements

- Fixed incorrect "ran out of attempts" message when guessing correctly on the final attempt
- Prevented crashes caused by non-numeric input
- Improved game flow and exit handling
