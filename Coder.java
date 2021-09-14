// Iahub likes chess very much. He even invented a new chess piece named Coder. A Coder can move (and attack) one square horizontally or vertically. More precisely, 
// if the Coder is located at position (x, y), he can move to (or attack) positions (x + 1, y), (x–1, y), (x, y + 1) and (x, y–1).

// Iahub wants to know how many Coders can be placed on an n × n chessboard, so that no Coder attacks any other Coder.

// Input
// The first line contains an integer n (1 ≤ n ≤ 1000).

// Output
// On the first line print an integer, the maximum number of Coders that can be placed on the chessboard.

// On each of the next n lines print n characters, describing the configuration of the Coders. For an empty cell print an '.', and for a Coder print a 'C'.

// If there are multiple correct answers, you can print any.

// Examples
// inputCopy
// 2
// outputCopy
// 2
// C.
// .C
_____________________________________________________________________________________________________________
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

//  for checking whether the no is perfect square or not...
bool isPerfectSquare(long double x)
{
    if (x >= 0) {
 
        long long sr = sqrt(x);
        return (sr * sr == x);
    }
    return false;
}


int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
    int n;
       cin>>n;
      
       
       if(!(n&1))
       {
           cout<<(n/2)*n<<endl;
       }
       else
       {
             int x=ceil(n/2);
             cout<<((x*x)+(n-x)*(n-x))<<endl;
       }
      for(int i=0;i<n;i++)
      {
             for(int j=0;j<n;j++)
              {
                 if((i%2==0 && j%2==0) || (i%2==1 && j%2==1))
                 cout<<"C";
                 else 
                 cout<<".";
              }
              cout<<endl;
      }
    

     
     
	return 0;
}
