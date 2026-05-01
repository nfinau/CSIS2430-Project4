# CSIS2430 Project 4

## Overview
This project is a simulation of player movement in the classic Monopoly board game. The goal is to analyze which board spaces are landed on most frequently by simulating a large number of turns.

The simulation focuses on core movement mechanics, including dice rolls, doubles rules, jail behavior, and Chance and Community Chest card effects. It does not model money, property ownership, or full gameplay strategy.

Results from the simulation will be used to calculate landing frequencies and identify the most commonly visited spaces on the board.

## Current Status

The simulation has been implemented with the following features:

- Dice rolling with two six-sided dice  
- Doubles detection and three-doubles-to-jail rule  
- Player movement with board wrapping  
- Jail mechanics (entering, staying, and exiting jail)  
- Go To Jail space behavior  
- Chance and Community Chest movement cards  
- Landing frequency tracking for all 40 board spaces  
- Output displaying space names, counts, and percentages  

Testing and verification are currently in progress.

## How to Run
```bash
javac src/*.java
java -cp src Main
