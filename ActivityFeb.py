""""1.) Start
2.) Display student's name and grades.
3.) Compute and show each student's avg grade.
4.) Display the avg grade lowest to highest.
5.) Find the student with the highest grade
6.) Compute the class average 
7.) Prompt the user to add new student
8.) End"""""
import array
#kahit ilagay niyo rito or yung summary ng program mo
# Given student data
students = {
    "Alice": [85, 90, 88, 92, 87],
    "Bob": [78, 75, 80, 82, 79],
    "Charlie": [95, 97, 94, 96, 98],
    "David": [65, 70, 68, 72, 74],
    "Eve": [88, 85, 90, 84, 86]
}

def compute_average(grades):
    """Compute the average of a list of grades."""
    return sum(grades) / len(grades)

def display_report():
    """Display the student grades report."""
    print("\nStudent Grades Report")
    print("=" * 40)
    
    # Compute student averages and store in a list
    student_averages = [(name, compute_average(grades)) for name, grades in students.items()]
    
    # Sort by average grade (highest to lowest)
    student_averages.sort(key=lambda x: x[1], reverse=True)
    
    # Display student grades and averages
    for name, avg in student_averages:
        print(f"{name}: Grades = {students[name]}, Average = {avg:.2f}")
    
    # Find top-performing student
    top_student = student_averages[0]
    print("\nTop-Performing Student:")
    print(f"{top_student[0]} with an average of {top_student[1]:.2f}")
    
    # Compute and display class average
    class_average = sum(avg for _, avg in student_averages) / len(student_averages)
    print(f"\nClass Average: {class_average:.2f}")
    print("=" * 40)

def add_student():
    """Add a new student and update the report."""
    name = input("\nEnter new student's name: ")
    grades = list(map(int, input("Enter student's grade: ").split()))
    
    # Add new student to dictionary
    students[name] = grades
    print(f"{name} has been added successfully!")

# Main program loop
while True:
    display_report()
    
    choice = input("\nDo you want to add a new student? (yes/no): ").strip().lower()
    if choice == "yes":
        add_student()
    if choice == "no":
        print("\nFinal Report: ")
        display_report()
        break
    else:
        display_report()
        break