n = int(input("Enter the number of customers: "))
print("Enter the customer IDs in sorted order:")
customer_ids = [int(input()) for _ in range(n)]
search_id = int(input("Enter customer ID to search: "))
low = 0
high = n - 1
found = -1
# Binary Search
while low <= high:
    mid = (low + high) // 2

    if customer_ids[mid] == search_id:
        found = mid
        break
    elif customer_ids[mid] < search_id:
        low = mid + 1
    else:
        high = mid - 1
if found != -1:
    print("Customer ID found at index:", found)
else:
    print("Customer ID not found")