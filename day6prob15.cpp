#include <iostream>
using namespace std;
int main(){
    int x = 5;
    int result = 0;
    while(x != 0){
        result = result*10 + x%10;
        x=x/10;
    }
    cout << result;
}