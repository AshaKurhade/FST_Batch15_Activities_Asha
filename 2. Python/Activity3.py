# player names
user1 = input("Enter Player 1's name? ")
user2 = input("Enter Player 2's name? ")

while True:	
# users choices
user1_answer = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
user2_answer = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()
	
# Run the algorithm to see who wins	
if user1_answer == user2_answer:
	
    print("It's a tie!")
	
elif user1_answer == 'rock':
	
    if user2_answer == 'scissors':
	
        print(user1 + "input Rock wins!")
	
    else:
	
        print(user2 + "Paper wins!")
	
elif user1_answer == 'scissors':
	
    if user2_answer == 'paper':
	
        print("Scissors win!")
	
    else:
	
        print("Rock wins!")
	
elif user1_answer == 'paper':
	
    if user2_answer == 'rock':
	
        print("Paper wins!")
	
    else:
	
        print("Scissors win!")
	
else:
	
    print("Invalid! You have not entered rock, paper or scissors, try again.")


play_again = input("do you want to play again?")

if (play_again == "yes"):
    pass
elif (play_again == "no"):
    raise SystemExit
else:
    print("invalid option")
    raise SystemExit

