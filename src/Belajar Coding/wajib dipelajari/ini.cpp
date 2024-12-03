#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
    vector<string> msg {"Halooo ahsan nurfauzi", "Kamu sangat hebat"};

    for (const string& word : msg)
    {
        cout << word << " ";
    }
    cout << endl;
}