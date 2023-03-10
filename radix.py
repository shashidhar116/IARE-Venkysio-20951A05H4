
def countSort(a,exp):
	n=len(a)
	o=[0]*(n)
	c=[0]*(10)
	for i in range(0,n):
		idx=(a[i]/exp)
		c[int((idx)%10)]+=1
	for i in range(1,10):
		c[i]+=c[i-1]
	i=n-1
	while i>=0:
		idx=(a[i]/exp)
		o[c[int((idx)%10)]-1]=a[i]
		c[int((idx)%10)]-=1
		i-=1
	i=0
	for i in range(0,len(a)):
		a[i]=o[i]
def rSort(a):
	max1=max(a)
	e=1
	while max1//e>0:
		countSort(a,e)
		e*=10

#Drivercode
l=[int(i)for i in input().split()]
rSort(l)
print(l)