# CSIS 2430 — Project 4 Pseudocode
## Monopoly Simulation

---

## Main Program

START program  
Create Simulation object with total turns  
Run simulation  
Print results  
END program  

---

## Simulation Setup

Initialize Player  
Initialize Dice  
Initialize CardDeck  
Create array of size 40 for landing counts  
Set total number of turns  

---

## Main Simulation Loop

FOR each turn:

    IF player is in jail:
        Handle jail turn
        Resolve board space
        Record landing
        CONTINUE

    SET doublesCount = 0

    DO:
        Roll dice

        IF roll is doubles:
            increment doublesCount
        ELSE:
            reset doublesCount

        IF doublesCount == 3:
            send player to jail
            record landing
            END turn

        Move player forward

        Resolve board space

        IF player is sent to jail:
            record landing
            END turn

    WHILE roll is doubles

    Record final landing

END FOR

---

## Jail Logic

Roll dice

IF doubles:
    release player from jail
    move player
ELSE:
    increment jail turn counter

    IF jail turns >= 3:
        release player
        move player

---

## Board Space Resolution

IF position == Go To Jail:
    send player to jail

ELSE IF position is Chance:
    draw Chance card
    update player position

    IF new position == Jail:
        send to jail

ELSE IF position is Community Chest:
    draw Community Chest card
    update player position

    IF new position == Jail:
        send to jail

---

## Card Logic

Chance cards may:
- Move to GO
- Move to Jail
- Move to specific space
- Move to nearest railroad
- Move to nearest utility
- Move back 3 spaces

Community Chest cards may:
- Move to GO
- Move to Jail
- Or do nothing

---

## Output

FOR each board space:
    Print:
        index
        name
        landing count
        percentage

END
