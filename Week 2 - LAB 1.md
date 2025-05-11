UML - I (Wednesday and Thursday morning)
Goals 
Get familiar with the following UML concepts:
- classes, attributes, and methods;
- association and inheritance.

### Exercise 1 
Consider an agenda to manage compromises. An agenda must contain the actual date, with the respective day, month, year, hour, and minute. It must save two different types of compromises: meetings and tasks. Both compromises must save a reminder date (usually hours, days, or weeks before the meeting or the task overdue). A meeting must also contain a brief description, the meeting local, the meeting date, and a list of participants. A task must also have a short description and the task's due date. 
Model in UML the presented system. 


- Task e Meeting são compromises e têm em comum a data

- Does a Meeting have a date? If it does it's an association.
	Associação, exemplo:Um meeting tem participantes (é só um traço)

- Task and Meeting are inheriting Compromise. (é uma seta)
	Because a meeting and a task are a Compromise

- Classe abstrata é para definir atributos e constantes. I.e. quando há dois atributos diferentes c descrições diferentes
	`Compromise` is marked as `<abstract>` because:
	- It represents **shared structure** between `Meeting` and `Task`.

**Resposta**
![[Pasted image 20250511120158.png]]




### Exercise 2  
Consider a movie shop where users can buy and rent movies. The title, the year, and the movie’s director identify a film. A movie-shop user may or not be a movie-shop subscriber. A user contains a name and an ID. A subscriber is a user that also includes a mobile number and an address.  Only subscribers can hire a movie; users, subscribers or not, can always buy a film. When a movie is not available to sell, it is ordered. In this case, the movie shop maintains a list of orders of movies to buy; an order may be related to more than one movie to buy. The user and the ordering date identify the order. The list of purchased and hired movies should be stored in the respective user and/or subscriber.  A subscriber has its own card from the movie shop. The card has a code and points. The movie shop maintains a list of the issued cards. 
Model in UML the presented system.

**Resposta**
![[Pasted image 20250511120233.png]]