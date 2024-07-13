# Mediator Design Pattern

## Game Controller Mapper

Abstract Component -- An object that reads ineractions from gamepad 

Conncrete component of each gameplay keypad settings 

Interface Mediator -- abstract character 

Concrete Mediator - Playable Character

IKeypadEvent is the abstract Component which reads all key press events 
and allows us to add associated action to it.

ICharacter is the interface mediater that will have actions which can be 
performed by the character.

Character examples - tekkan characters - lee, Jin, Kaguya

