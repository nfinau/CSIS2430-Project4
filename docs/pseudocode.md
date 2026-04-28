# CSIS 2430 — Project 4 Pseudocode  
## Monopoly Simulation

## Program Goal

Simulate Monopoly player movement to collect landing frequency data for each board space. The simulation will focus on dice movement, doubles, jail rules, Chance cards, Community Chest cards, and landing probability results.

---

## Main Program

START PROGRAM

Create Monopoly board with 40 spaces  
Create player starting at GO  
Create dice  
Create Chance deck  
Create Community Chest deck  
Create landing count tracker for all board spaces  

Set totalTurns to a large number, such as 100000  

FOR each turn from 1 to totalTurns:

    Run one player turn

    Record the final space where the player ends the turn

END FOR

Calculate landing percentage for each board space  

Sort or display board spaces by landing frequency  

Print results  

END PROGRAM

---

## Board Setup

CREATE list of 40 Monopoly spaces:

    0 = GO
    1 = Mediterranean Avenue
    2 = Community Chest
    3 = Baltic Avenue
    4 = Income Tax
    5 = Reading Railroad
    6 = Oriental Avenue
    7 = Chance
    8 = Vermont Avenue
    9 = Connecticut Avenue
    10 = Jail / Just Visiting
    11 = St. Charles Place
    12 = Electric Company
    13 = States Avenue
    14 = Virginia Avenue
    15 = Pennsylvania Railroad
    16 = St. James Place
    17 = Community Chest
    18 = Tennessee Avenue
    19 = New York Avenue
    20 = Free Parking
    21 = Kentucky Avenue
    22 = Chance
    23 = Indiana Avenue
    24 = Illinois Avenue
    25 = B&O Railroad
    26 = Atlantic Avenue
    27 = Ventnor Avenue
    28 = Water Works
    29 = Marvin Gardens
    30 = Go To Jail
    31 = Pacific Avenue
    32 = North Carolina Avenue
    33 = Community Chest
    34 = Pennsylvania Avenue
    35 = Short Line Railroad
    36 = Chance
    37 = Park Place
    38 = Luxury Tax
    39 = Boardwalk

---

## Player Turn

FUNCTION takeTurn(player):

    IF player is in jail:
        Handle jail turn
        RETURN player position

    doublesCount = 0
    turnIsActive = true

    WHILE turnIsActive is true:

        Roll two dice
        total = die1 + die2

        IF die1 equals die2:
            doublesCount = doublesCount + 1
        ELSE:
            turnIsActive = false

        IF doublesCount equals 3:
            Move player to Jail
            Set player as in jail
            turnIsActive = false
            RETURN player position

        Move player forward by total spaces

        IF player lands on Go To Jail:
            Move player to Jail
            Set player as in jail
            turnIsActive = false
            RETURN player position

        IF player lands on Chance:
            Draw Chance card
            Apply Chance card effect

        IF player lands on Community Chest:
            Draw Community Chest card
            Apply Community Chest card effect

        IF card effect sends player to Jail:
            Set player as in jail
            turnIsActive = false
            RETURN player position

    RETURN player position

END FUNCTION

---

## Movement Logic

FUNCTION movePlayer(player, spaces):

    newPosition = currentPosition + spaces

    IF newPosition is greater than 39:
        newPosition = newPosition MOD 40

    Set player position to newPosition

END FUNCTION

---

## Jail Logic

FUNCTION handleJailTurn(player):

    Roll two dice

    IF dice are doubles:
        Move player forward by dice total
        Set player as not in jail
        Reset jail turn count

        IF player lands on Chance:
            Draw and apply Chance card

        IF player lands on Community Chest:
            Draw and apply Community Chest card

        IF player lands on Go To Jail:
            Move player to Jail
            Set player as in jail

    ELSE:
        Increase jail turn count by 1

        IF jail turn count equals 3:
            Move player forward by dice total
            Set player as not in jail
            Reset jail turn count

        ELSE:
            Player remains in jail

END FUNCTION

---

## Chance Card Logic

FUNCTION applyChanceCard(player, card):

    IF card is Advance to GO:
        Move player to space 0

    ELSE IF card is Go to Jail:
        Move player to space 10
        Set player as in jail

    ELSE IF card is Go to Illinois Avenue:
        Move player to space 24

    ELSE IF card is Go to St. Charles Place:
        Move player to space 11

    ELSE IF card is Go to nearest Railroad:
        Move player to nearest railroad space

    ELSE IF card is Go to nearest Utility:
        Move player to nearest utility space

    ELSE IF card is Go back 3 spaces:
        Move player back 3 spaces

        IF new space is Community Chest:
            Draw and apply Community Chest card

        IF new space is Go To Jail:
            Move player to Jail
            Set player as in jail

    ELSE:
        No movement effect

END FUNCTION

---

## Community Chest Card Logic

FUNCTION applyCommunityChestCard(player, card):

    IF card is Advance to GO:
        Move player to space 0

    ELSE IF card is Go to Jail:
        Move player to space 10
        Set player as in jail

    ELSE:
        No movement effect

END FUNCTION

---

## Nearest Railroad Logic

FUNCTION moveToNearestRailroad(player):

    IF current position is less than 5 OR greater than 35:
        Move player to space 5

    ELSE IF current position is less than 15:
        Move player to space 15

    ELSE IF current position is less than 25:
        Move player to space 25

    ELSE:
        Move player to space 35

END FUNCTION

---

## Nearest Utility Logic

FUNCTION moveToNearestUtility(player):

    IF current position is less than 12 OR current position is greater than 28:
        Move player to space 12

    ELSE:
        Move player to space 28

END FUNCTION

---

## Landing Count Logic

FUNCTION recordLanding(position):

    Increase landing count for that board space by 1

END FUNCTION

---

## Results Logic

FUNCTION printResults():

    FOR each board space:

        percentage = landingCount / totalTurns * 100

        Print space number, space name, landing count, and percentage

    END FOR

    Identify highest landing spaces

END FUNCTION
