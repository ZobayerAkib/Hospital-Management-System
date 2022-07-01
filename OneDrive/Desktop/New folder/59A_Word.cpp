#include<bits/stdc++.h>
using namespace std;
int main()
{

    string s;
    int c=0,k=0;
    cin>>s;
    for(int i=0;i<s.length();i++)
    {
        if(isupper(s[i]))
        {
            c++;
        }
        else
            k++;
    }
    //cout<<c<<" "<<k<<endl;

    if(c>k)
    {
            transform(s.begin(), s.end(), s.begin(), ::toupper);
            cout << s << endl;
    }
    else
        {

            transform(s.begin(), s.end(), s.begin(), ::tolower);
            cout << s << endl;
        }

}
