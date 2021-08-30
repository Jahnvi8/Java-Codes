// There are N people. The family name and given name of the i-th person (1≤i≤N) are S 
// i
// ​
//   and T 
// i
// ​
//  , respectively.

// Determine whether there is a pair of people with the same family and given names. In other words, determine whether there is a pair of integers (i,j) such that 1≤i<j≤N, S 
// i
// ​
//  =S 
// j
// ​
//  , and T 
// i
// ​
//  =T 
// j
// ​
//  .

// Constraints
// 2≤N≤1000
// N is an integer.
// Each of S 
// i
// ​
//   and T 
// i
// ​
//   is a string of length between 1 and 10 (inclusive) consisting of English lowercase letters.
// Input
// Input is given from Standard Input in the following format:

// N
// S 
// 1
// ​
//   T 
// 1
// ​
 
// S 
// 2
// ​
//   T 
// 2
// ​
 
// ⋮
// S 
// N
// ​
//   T 
// N
// ​
 
// Output
// If there is a pair of people with the same family and given names, print Yes; otherwise, print No.

// Sample Input 1 
// Copy
// 3
// tanaka taro
// sato hanako
// tanaka taro
// Sample Output 1 
// Copy
// Yes
// The first and third persons have the same family and given names.

// Sample Input 2 
// Copy
// 3
// saito ichiro
// saito jiro
// saito saburo
// Sample Output 2 
// Copy
// No
// No two persons have the same family and given names.

// Sample Input 3 
// Copy
// 4
// sypdgidop bkseq
// bajsqz hh
// ozjekw mcybmtt
// qfeysvw dbo
// Sample Output 3 
// Copy
// No
____________________________________________________________________________________________________________________________________________
#include<bits/stdc++.h>
#define ll long long int
#define test while(t--)
#define pb push_back
#define ub upper_bound
#define lb lower_bound
#define mp make_pair
#define xxx exit(0)
#define ain(arr) for (auto &it : arr) cin >> it;     
#define fs first
#define sec second
#define op(container) for(auto it: container)  cout<<it<<" ";
#define clr  cin.ignore(numeric_limits<streamsize>::max(), '\n')
#define yes cout<<"Yes\n";
#define no cout<<"No\n";
using namespace std;
const int inf = 1e9+7;

//   for calculating a to power b...
ll binpow(ll a, ll b)
{
    ll res = 1;
    while (b > 0)
    {
        if (b & 1)
            res = ((res%inf) * (a%inf))%inf;
        a = ((a%inf) * (a%inf))%inf;
        b >>= 1;
    }
    return (res%inf);
}
//  for calculating gcd.. 
ll  gcd(ll u, ll v)
{
    ll shift;
    if (u == 0) return v;
    if (v == 0) return u;
    shift = __builtin_ctz(u | v);
    u >>= __builtin_ctz(u);
    do {
        v >>= __builtin_ctz(v);
        if (u > v) {
          ll t = v;
            v = u;
            u = t;
        }  
        v = v - u;
    } while (v != 0);
    return u << shift;
}
//  for converting string to uppercase....
string to_upper(string a)
{
    for (int i=0;i<(int)a.size();++i) if (a[i]>='a' && a[i]<='z') a[i]-='a'-'A';
    return a;
}
//  for converting string to lowercase.... 
string to_lower(string a)
{
    for (int i=0;i<(int)a.size();++i) if (a[i]>='A' && a[i]<='Z') a[i]+='a'-'A';
    return a;
}
// for checking whether the number is power of two or not...
 bool checkPowerOfTwo(unsigned ll num)
   {
       if(!(num&(num-1)))
		 return true;
		 else
		 return false;	 
   }
   
// for calculating the no of set bits in a number   
inline int setBitCount(int i) {
    i = i - ((i >> 1) & 0x55555555);
    i = (i & 0x33333333) + ((i >> 2) & 0x33333333);
    i = (i + (i >> 4)) & 0x0f0f0f0f;
    i = i + (i >> 8);
    i = i + (i >> 16);
    return i & 0x3f;
}

//  calculating ncr value... 
ll nCr(int n,int k)
{
    ll ans=1;
    k=k>n-k?n-k:k;
    int j=1;
    for(;j<=k;j++,n--)
    {
        if(n%j==0)
        {
            ans*=n/j;
        }else
        if(ans%j==0)
        {
            ans=ans/j*n;
        }else
        {
            ans=(ans*n)/j;
        }
    }
    return ans;
}

  
int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	  int n;
	  cin>>n;
	  set<pair<string,string>>ust;
	  pair<string,string>p1;
	  bool flag=false;
	  while(n--)
	  {
	      string s1,s2;
	      cin>>s1>>s2;
	      p1.first=s1;
	      p1.second=s2;
	      if(ust.find(p1)!=ust.end())
	      flag=true;
	      
	      ust.insert(p1);
	  }
	  if(flag)
	  cout<<"Yes\n";
	  else
	  cout<<"No\n";

    return 0;
   
}
