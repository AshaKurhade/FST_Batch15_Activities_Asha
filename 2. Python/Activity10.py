
input_string = input('Enter elements of a list separated by space ')
print("\n")
user_tuple = tuple(input_string.split())
# print list
print('list: ', user_tuple)


for number in user_tuple:
    if (int(number)%5 ==0):
        print(number)