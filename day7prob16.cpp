#include <iostream>
using namespace std;
bool isPalindrome(int x) {
        if(x<0) return false;
        int temp = x;
        int result = 0;
        while(x!=0){
            
            result = result*10 + x%10;
            x=x/10;
        }
        if(result == temp) return true;
        return false;
    }
int main(){
    cout << isPalindrome(123);


}