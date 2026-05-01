# CSIS 2430 — Project 4 Test Results
## Monopoly Simulation

---

## Test Summary

Testing for this project is being completed incrementally as each feature is implemented. The purpose of testing is to confirm that the Monopoly simulation correctly handles movement, dice rolls, doubles, jail behavior, Chance cards, Community Chest cards, landing counts, and final output formatting.

---

## Current Test Status

| Test Area | Status | Notes |
|----------|--------|-------|
| Program compiles | Pending | Will verify after pulling/running locally |
| Main simulation runs | Pending | Expected to run from Main.java |
| Dice rolling | In Progress | Dice class has two six-sided dice |
| Player movement | In Progress | Player moves around 40-space board |
| Board wrapping | In Progress | Uses modulo logic to wrap around board |
| Doubles detection | In Progress | Dice class tracks doubles |
| Three doubles rule | In Progress | Simulation sends player to jail after three doubles |
| Go To Jail space | In Progress | Space 30 sends player to Jail |
| Jail behavior | In Progress | Player can leave by doubles or after 3 turns |
| Chance cards | In Progress | Movement-based Chance cards added |
| Community Chest cards | In Progress | Movement-based Community Chest cards added |
| Landing counts | In Progress | Landing counts tracked for all 40 spaces |
| Output formatting | In Progress | Results include space index, name, count, and percentage |

---

## Expected Run Command

javac src/*.java  
java -cp src Main

---

## Expected Output

The program should print landing frequency results for all 40 Monopoly board spaces.

Example format:

Landing Frequencies:  
 0 - GO                        :   ### landings (##.##%)  
 1 - Mediterranean Avenue      :   ### landings (##.##%)  
 2 - Community Chest           :   ### landings (##.##%)  

---

## Verification Notes

- The simulation should complete without crashing  
- The output should include all 40 board spaces  
- Landing percentages should total approximately 100%  
- Jail / Just Visiting is expected to have a higher landing frequency due to multiple ways of being sent there  
- Chance and Community Chest spaces may have lower final counts because some cards move the player again  

---

## Issues Found

No confirmed issues yet. Full local testing still needs to be completed after implementation is pulled and run locally.

---

## Next Testing Steps

- Run the program locally  
- Confirm the program compiles successfully  
- Capture console output as evidence  
- Verify that all 40 spaces are displayed  
- Review whether landing frequencies appear reasonable  
- Update this document with final screenshots or copied console output  
