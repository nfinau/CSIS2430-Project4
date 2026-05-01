# CSIS 2430 — Project 4 Test Plan
## Monopoly Simulation

---

## Purpose

The purpose of this test plan is to verify that the Monopoly simulation works correctly and produces reasonable landing frequency results. Testing will focus on movement logic, dice behavior, jail rules, special board spaces, Chance cards, Community Chest cards, and output formatting.

---

## Features to Test

### Dice Rolling

Verify that the dice roll produces values between 2 and 12.

Expected result:  
Each roll should be within the valid range for two six-sided dice.

---

### Doubles Detection

Verify that the program can detect when both dice show the same value.

Expected result:  
If both dice are equal, the roll should count as doubles.

---

### Player Movement

Verify that the player moves forward by the dice total.

Expected result:  
The player’s position should increase by the number rolled.

---

### Board Wrapping

Verify that the player wraps around the board after passing space 39.

Expected result:  
If the player moves past Boardwalk, the position should wrap back to the beginning of the board.

---

### Go To Jail Space

Verify that landing on space 30 sends the player to Jail.

Expected result:  
The player should move to space 10 and be marked as in jail.

---

### Three Doubles Rule

Verify that rolling doubles three times in a row sends the player to Jail.

Expected result:  
The player should be moved to space 10 and marked as in jail.

---

### Jail Exit by Doubles

Verify that a player in jail can leave by rolling doubles.

Expected result:  
The player should be released from jail and move forward by the dice total.

---

### Jail Exit After Three Turns

Verify that a player leaves jail after three unsuccessful jail turns.

Expected result:  
After three non-double rolls, the player should be released and moved forward.

---

### Chance Cards

Verify that Chance card movement effects are applied correctly.

Expected result:  
Movement cards should move the player to the correct board space, such as GO, Jail, Illinois Avenue, Boardwalk, nearest railroad, nearest utility, or back three spaces.

---

### Community Chest Cards

Verify that Community Chest movement effects are applied correctly.

Expected result:  
Advance to GO and Go to Jail cards should move the player to the correct space. Non-movement cards should leave the player in place.

---

### Landing Counts

Verify that each completed turn records a landing space.

Expected result:  
Landing counts should increase after each turn, and the final output should show landings for all 40 spaces.

---

### Output Formatting

Verify that results display the space index, board space name, landing count, and percentage.

Expected result:  
The output should be readable and clearly show landing frequencies.

---

## Edge Cases

The following edge cases will be checked:

- Player starts on GO  
- Player passes GO  
- Player lands exactly on Go To Jail  
- Player rolls doubles while in jail  
- Player rolls three doubles in a row  
- Chance card sends player to Jail  
- Community Chest card sends player to Jail  
- Chance card sends player back three spaces  
- Card movement lands player on another special space  
- Large simulation runs without crashing  

---

## Verification Evidence

Verification results will be documented in:

`docs/test_results.md`

Evidence may include:

- Console output screenshots  
- Notes comparing expected vs. actual behavior  
- Sample simulation output  
- Summary of top landing spaces  

---

## Test Status

Testing will be completed incrementally as each feature is implemented.
