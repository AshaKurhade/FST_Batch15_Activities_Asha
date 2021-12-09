
fruit_shop = {
    "apple" : 20,
    "banana" : 12,
    "gvaha" : 3
}

your_input = input ("What fruit you want:?").lower() 


if your_input in fruit_shop:
    print("yes, fruit is available")
else:
    print("No, fruit is not available")
