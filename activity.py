inventory = [
    ("Laptop", 10, 45000.0),
    ("Smartphone", 25, 25000.0),
    ("Tablet", 15, 15000.0),
    ("Headphones", 50, 5000.0),
    ("Smartwatch", 20, 12000.0),
    ("Monitor", 30, 18000.0)
]

def inventory_report():
    for product, stock,price in inventory:
        #A
        print(f"Product Name: {product}\t Stock Quantity: {stock} Price per unit: {price}")
    #C
    #most_expensive= max(stock)
    print("\n MOST EXPENSIVE")
    
    
    
    #D    
    revenue = sum({price})
    print(f"\n Total Inventory value: {revenue}" )


"""def most_expensive():
    for product, stock,price in inventory: 
        expensive = max((price)price key=lambda expr[x:2])
    print(expensive)"""
    
def add_product():
    while(True):     
        choice = input("Do you want to add new product? (yes/no): ")
        if choice=="no": 
            print("Program Ending...")
            break
        if choice == "yes":
            newProduct = input("Input the new Product Name: ")
            newStock = int(input("Input Stock quantity: "))
            newPrice = float(input("Input Price per unit: "))
            inventory.append((newProduct,newStock,newPrice))
            print("-----updated inventory Report-----")
            print(inventory_report())
        else:
            break
    

def main():
    inventory_report()
    add_product()
    

if '__name__' == main():
    main()    