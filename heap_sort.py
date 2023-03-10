
def heap(a,n,i):
	maxi=i
	l=2*i+1
	r=2*i+2

	if l<n and a[i]<a[l]:
		maxi=l

	if r<n and a[maxi]<a[r]:
		maxi=r
	if maxi!=i:
		(a[i],a[maxi])=(a[maxi],a[i])
		heap(a,n,maxi)

def hSort(a):
	n=len(a)

	for i in range(n//2-1,-1,-1):
		heap(a,n,i)

	for i in range(n-1,0,-1):
		(a[i],a[0])=(a[0],a[i])
		heap(a,i,0)


#Drivercode
l=[int(i)for i in input().split()]
hSort(l)
print(l)

