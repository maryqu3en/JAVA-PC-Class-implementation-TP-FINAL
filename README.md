<!-- how to change font of md readme file?
 -->

# PC Class Implementation
*Work done by Meriem SOUBIH and Nour El Houda ZELLAL*

## Implemented Classes
### ``Peripheral`` class:
- The  Peripheral class represents a generic peripheral device. It has the following attributes:
    - `id`: A string that represents the id of the peripheral.
    - `model`: A string that represents the model of the peripheral.
    
The methods in this class are as follows:
    - `calculatePower()`: an abstract method, it should be implemented in any subclass to calculate the power consumption of the specific peripheral.

### ``Keyboard`` class:
- A subclass  of the Peripheral class, representing a keyboard. It inherits all the attributes in the Peripheral class. In addition, it has the following attributes: 
    - 




### ``PC`` class: 
- The ``PC`` class represents a computer. It has attributes such as the brand, model number, screen size, color, RAM capacity,
- It represents a personal computer.
- Attributes :
    - brand (String): The brand of the PC.
    - model (String): The model name of the PC.
    - processor (Processor): An object of type Processor that contains information about the CPU.
    - ram (RAM): An object of type RAM which contains information about the amount of installed RAM in GB.
    - graphicsCard (GraphicCard): An object of type GraphicCard which contains information about the graphical card.
    - graphicsCard (GraphicsCard): An object of type GraphicsCard, which is used to describe the graphic card's characteristics.