inventory ={("capacitor", 12,200.99),
            ("resistor", 5, 49.50),
            ("screw",20,10.00),
            ("wrench" , 2 ,375.25),
            ("arduino",9,1549.90)
}
def inventory_report():
#	a) Display the order list in a readable format.
    for name,quantity,price in inventory:
        print(f"Product Name: {name}\t Stock: {quantity}\t Price: {price}")
        
    total_rev = (quantity * price)
    print(f"\nTotal inventory Revenue: {total_rev}")
# b) Find and display the most expensive product based on price per unit.

#c) Sort the order list alphabetically by product name and display the sorted list

#d) Calculate and display the total revenue (Total Revenue = Quantity × Price per Unit).

#e) Allow the user to add a new product (with name, quantity, and price) and display the updated list.

def main():
    inventory_report()
    
    
if '___name___'==main():
    main()    