n = int(input("Enter number of employees: "))
salaries = []
for i in range(n):
    salary = float(input(f"Enter salary of employee {i + 1}: "))
    salaries.append(salary)
# ---------------- Selection Sort ----------------
selection_salaries = salaries.copy()
for i in range(n - 1):
    min_index = i
    for j in range(i + 1, n):
        if selection_salaries[j] < selection_salaries[min_index]:
            min_index = j
    selection_salaries[i], selection_salaries[min_index] = \
        selection_salaries[min_index], selection_salaries[i]
print("\nSalaries using Selection Sort:")
print(selection_salaries)
# ---------------- Bubble Sort ----------------
bubble_salaries = salaries.copy()
for i in range(n - 1):
    for j in range(n - i - 1):
        if bubble_salaries[j] > bubble_salaries[j + 1]:
            bubble_salaries[j], bubble_salaries[j + 1] = \
                bubble_salaries[j + 1], bubble_salaries[j]
print("\nSalaries using Bubble Sort:")
print(bubble_salaries)
# ---------------- Top Five Salaries ----------------
top_five = bubble_salaries[-5:][::-1]
print("\nTop Five Highest Salaries:")
for salary in top_five:
    print(salary)