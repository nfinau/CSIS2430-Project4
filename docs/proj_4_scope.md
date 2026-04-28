# CSIS 2430 — Project 4 Scope
## Monopoly Simulation

---

## Project Purpose

The purpose of this project is to simulate player movement in the Monopoly board game in order to analyze landing probabilities. The simulation will focus on movement-based mechanics rather than full gameplay, and will generate data showing which board spaces are landed on most frequently.

---

## In Scope (What WILL be implemented)

The following features will be implemented as part of the simulation:

### Core Simulation
- Single player simulation
- Large number of turns (e.g., thousands or more)
- Tracking landing frequency for all 40 board spaces

### Dice & Movement
- Two six-sided dice
- Dice totals between 2–12
- Detection of doubles
- Three consecutive doubles sends player to jail
- Movement around the board with wrap-around logic (passing GO)

### Board Representation
- 40 Monopoly board spaces
- Index-based movement system (0–39)
- Identification of special spaces:
  - GO
  - Jail
  - Go To Jail
  - Chance
  - Community Chest

### Jail Mechanics
- Player sent to jail via:
  - Landing on “Go To Jail”
  - Rolling three consecutive doubles
  - Card effects
- Player remains in jail until:
  - Rolling doubles, OR
  - Serving 3 turns
- Proper tracking of jail turns

### Chance Cards (Movement Only)
- Advance to GO
- Go to Jail
- Go to specific positions (e.g., Illinois Ave, St. Charles Place)
- Go back 3 spaces
- Go to nearest railroad
- Go to nearest utility

### Community Chest Cards (Movement Only)
- Advance to GO
- Go to Jail
- (Other cards without movement will be ignored)

### Data Collection
- Count how many times each space is landed on
- Store results in an array or map
- Calculate landing percentages
- Identify most frequently landed spaces

---

## Out of Scope (What will NOT be implemented)

The following features are intentionally excluded:

- Money system
- Property ownership or purchasing
- Rent calculations
- Auctions
- Trading between players
- Multiple players
- Winning/losing conditions
- Full card decks (non-movement effects)

---

## Assumptions

- Only one player is simulated
- Simulation runs for a large number of turns to approximate probabilities
- Card decks may be simplified and reused (no need for full realistic deck cycling unless required)
- Focus is on statistical outcomes, not gameplay accuracy

---

## Success Criteria

The project will be considered successful if:

- The simulation runs without errors
- Player movement follows Monopoly rules correctly
- Jail behavior is correctly implemented
- Card movement effects are correctly applied
- Landing counts are accurately tracked
- Output clearly shows most frequently landed spaces
- Results appear reasonable (e.g., Jail and nearby spaces have higher frequency)

---

## Future Improvements (Optional)

If time allows, the following enhancements could be added:

- Multiple players
- More complete card decks
- Graphical output or charts
- More detailed statistical analysis

---

## Notes

This project is being completed independently. All components including implementation, verification, and documentation are being handled by a single contributor to ensure consistency and timely completion.
