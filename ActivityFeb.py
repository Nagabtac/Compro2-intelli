""""1.) Start
2.) Display student's name and grades.
3.) Compute and show each student's avg grade.
4.) Display the avg grade lowest to highest.
5.) Find the student with the highest grade
6.) Compute the class average 
7.) Prompt the user to add new student
8.) End"""""

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
    print("\nStudent Grades ")
    print("------------------")
    print("sorted")
    student_averages = [(name, compute_average(grades)) for name, grades in students.items()]
    
    print("Assorted")
    for name, grades in students.items():
        print(f"Name: {name} Grades: {grades}")
    
    print("\nStudent average")
    class_average = sum(avg for _, avg in student_averages) / len(student_averages)
    print(f"\nClass Average: {class_average:.2f}")

def add_newStudent():
    choice =input("Do you want to add new Student?")
    if choice == "yes":
        print("new Student added")
    if choice == "no":

def main():
    display_report()





if __name__ == "__main__":
    main()
