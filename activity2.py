sales = [ ("Milk", 120, 55.00), 
("Bread", 150, 40.00), 
("Eggs", 90, 80.00), 
("Chicken", 75, 160.00), 
("Rice", 200, 50.00), 
("Banana", 180, 25.00) 
] 

def inventory_report():
    print("-----Inventory Report----")
    for productName,units_sold,pricePerUnit in sales:
        print(f"Product Name: {productName}\t units Sold: {units_sold} Price Per/Unit: {pricePerUnit}")
    
    #totalUnitsSold = sum(units_sold)
    #print(totalUnitsSold)
    
    bestSelling = max(sales, key=lambda x: x[2])
    print(f"\nBest Selling product: {bestSelling[0]} \tSold units: {bestSelling[1]:.2f} ")
    
    #print(f"Total supermarket sales Revenue: {total_revenue}")
    

    

def addProduct():
    newProduct = input("\nEnter product name: ")
    newUnitSold = input("Enter units sold: ")
    newPrice = input("Enter price per unit: ")
    sales.append((newProduct, newUnitSold, newPrice))
    print("\n----Updated Inventory Report----")
    inventory_report()


def main():
    inventory_report()
    addProduct()


if '__name__' == main():
    main()    