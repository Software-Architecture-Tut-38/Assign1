## Folder Structure

The workspace contains two folders, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Within the `src` folder, there are two more where:

- `app`: the folder containing the source code
- `test`: the folder containing junit tests

## UML Diagram
\
<img width="632" height="715" alt="image" src="https://github.com/user-attachments/assets/53ef3e7e-5a6b-4ae3-9930-e362c26581c1" />
\

Here is a UML diagram describing our system. 

## Tests
We designed tests using junit. These cover all bases for creating smart bulbs and locks for each brand using their respective factories. For this, three variables were created, being of types Bulb, Lock (both interfaces) and Smartdevicefactory (abstract class). These types were defined as to test inheritence/implementation.

4 individual tests are then defined for creating all variations, so Bulb and Lock for brand A and brand B. The functions follow the form of factory creation, bulb/lock creation from the factory and verifying of the power usage/consumption. 
<img width="657" height="200" alt="image" src="https://github.com/user-attachments/assets/3c94a5d1-872f-482b-8da9-b7ea1de1ee7f" />

Also, App.java contains a basic program which simply creates and prints the power usage/consumption for a brand A bulb and brand B lock.
<img width="287" height="208" alt="image" src="https://github.com/user-attachments/assets/8f333568-25b5-4fd2-8008-7ae48a5eb7c4" />
