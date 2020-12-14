# What Worked
- Randomized dealing of playing cards
- The use of a Singleton Pattern for a single Deck
- The use of a Factory Pattern to create two players with even card distribution
- The comparison of Card Ranks using enum.ordinal() and Integer.compareTo()
# What Kind-of Worked
- The switch case on the output of Integer.compareTo for round states
- Announcer being notified of Player.getCard(), when !hidden
# What definitely didn't work
- Finding a clean way to implement Observer pattern for all player interactions
- Designing a functional and clean main loop for the primary game logic
- Implementing a Memento Pattern, primarily due to not having a functional main loop
- Breathing, every now and then
- Taking power-naps