n=int(input("Enter the number of customers:"))
print("Enter the customer IDs in sorted order:")
customer_ids=[int(input()) for _ in range(n)]
found=-1
search_id=int(input("Enter customer ID to search:"))
for i in range(n):
    if customer_ids[i]==search_id:
        found=i
        break
if found!=-1:
    print("Customer ID found at index:",i)
else:
    print("Customer00 ID not found")