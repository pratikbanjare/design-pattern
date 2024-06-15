# Decorator Design Pattern

## Dynamic feature addition to Game Character 

Inspiring from Skyrim Game, where a character can learn various abilities to its arsenal as it progresses through the game and choices it makes 

- An interface class 'IGameCharacter' defining functions of a character
    - showStats()
    - addStats(String stats)
- A concrete implementation of 'IGameChracter' - 'GameChracter'
- An abstract class 'BasicCharacterDecorator' defining the features and implementing functions of a character as well as Composition of 'IGameCharacter'
  - name
  - list of features
- Decorator classes to add functionality to character 