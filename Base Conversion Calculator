/*
Group 1
Nathanael Selvaraj
Johvonne Keane
Hanzalla Naveed
*/

#include <iostream>
#include <string>
using namespace std;

bool IsBinary(string b);
void BinToOct(string b);
void BinToDec(string b);
void BinToHex(string b);

bool IsOctal(string o);
void OctToBin(string o);
void OctToDec(string o);
void OctToHex(string o);

bool IsDecimal(string d);
void DecToBin(string d);
void DecToOct(string d);
void DecToHex(string d);

bool IsHexa(string h);
void HexToBin(string h);
void HexToOct(string h);
void HexToDec(string h);

int main()
{



    cout << "Welcome to the Numbering System Calculator!" << endl;
    cout << "-------------------------------------------------------" << endl;


    bool Continue = true;

    do {
        string input;
        int sourceBase;
        int targetBase;
        char ans;

        cout << "Please Enter the following inputs:\nThe number to convert:" << endl;
        cin >> input;
        cout << endl;

        cout << "Enter the source base  (i.e., the base to convert From)" << endl;
        cin >> sourceBase;
        cout << endl;

        cout << "Enter the target base  (i.e., the base to convert To)" << endl;
        cin >> targetBase;
        cout << endl;

        if (sourceBase == 2 && targetBase == 8) {
            BinToOct(input);
        }

        else if (sourceBase == 2 && targetBase == 10) {
            BinToDec(input);
        }

        else if (sourceBase == 2 && targetBase == 16) {
            BinToHex(input);
        }




        else if (sourceBase == 8 && targetBase == 2) {
            OctToBin(input);
        }

        else if (sourceBase == 8 && targetBase == 10) {
            OctToDec(input);
        }

        else if (sourceBase == 8 && targetBase == 16) {
            OctToHex(input);
        }




        else if (sourceBase == 10 && targetBase == 2) {
            DecToBin(input);
        }

        else if (sourceBase == 10 && targetBase == 8) {
            DecToOct(input);
        }

        else if (sourceBase == 10 && targetBase == 16) {
            DecToHex(input);
        }

             


        else if (sourceBase == 16 && targetBase == 2) {
            HexToBin(input);
        }
 
        else if (sourceBase == 16 && targetBase == 8) {
            HexToOct(input);
        }

        else if (sourceBase == 16 && targetBase == 10) {
            HexToDec(input);
        }




        else {
            cout << "You may have entered a wrong base input for conversion" << endl;
        }
        cout << endl;

        cout << "Do you want to continue with other numbers?" << endl;
        cout << "Enter (Y) to continue    \nEnter (N) to quit" << endl;
        cin >> ans;
        cout << endl;

        if (ans == 'Y' || ans == 'y') {
            Continue = true;
        }

        else if (ans == 'N' || ans == 'n') {
            cout << "Quitting Calculator...Thank You!" << endl;
            Continue = false;
        }

        else {
            cout << "You didn't enter a valid answer \nQuitting Calculator Anyway";
            Continue = false;
        }
        cout << endl;

    } while (Continue == true);

}




















// Checks if the selected Binary input is a valid binary input
bool IsBinary(string b) {
bool bin = true;
    for (int i = 0; i < b.length(); i++) {
        if (b[i] != '1' && b[i] != '0') {
            bin = false;
        }
    }
    return bin;
}




// Binary to Octal
void BinToOct(string b) {
  
    int ans = 0;   
     
    if (IsBinary(b) == true) {    

        while (b.length() % 3 != 0) {
            b.insert(0, "0");
        }
        
        string ans;

        for (int i = 0; i < b.length(); i = i + 3) {
            int tot = 0;
            string sub = b.substr(i, (i + 3) - i);

            for (int j = 0; j < sub.length(); j++) {
                if (sub[j] == '1') {
                    tot += pow(2, (3 - j - 1));
                }
            }
            ans += to_string(tot);
        }

        cout << "The result of converting the number " << b << " from base 2 to base 8 is: " << ans << endl;
    }


    else {
        cout << b << " is an invalid binary input" << endl;
    }
}




// Binary to Decimal
void BinToDec(string b) {

    int sum = 0;
    if (IsBinary(b) == true) { 

        for (int i = 0; i < b.length(); i++) {
            if (b[i] == '1') {

                sum = sum + pow(2, ((b.length() - 1) - i));
            }
        }
        cout << "The result of converting the number " << b << " from base 2 to base 10 is: " << sum << endl;
    }

    else {
        cout << b << " is an invalid binary input" << endl;
    }
}





// Binary to Hexadecimal
void BinToHex(string b) {

    string ans;

    if (IsBinary(b) == true) {

        while (b.length() % 4 != 0) {
            b.insert(0, "0");
        }

        char Hex[16] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        string Bin[16] = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };

        for (int i = 0; i < b.length(); i = i + 4) {

            string sub = b.substr(i, (i + 4) - i);
            for (int j = 0; j < 16; j++) {
                if (sub == Bin[j]) {
                    ans += Hex[j];
                }
            }
        }
        cout << "The result of converting the number " << b << " from base 2 to base 16 is: " << ans << endl;    
    }


    else {
        cout << b << " is an invalid binary input" << endl;
    }
}












// Checks if the input is a valid octal
bool IsOctal(string o) {
    bool oct = true;
    for (int i = 0; i < o.length(); i++) {
        if (o[i] != '0' && o[i] != '1' && o[i] != '2' && o[i] != '3' && o[i] != '4' && o[i] != '5' && o[i] != '6' && o[i] != '7') {
            oct = false;
        }
    }
    return oct;
}



// Octal to Binary
void OctToBin(string o) {

    if (IsOctal(o) == true) {
        string ans;
        char oct[8] = { '0', '1', '2', '3', '4', '5', '6', '7' };
        string bin[8] = { "000", "001", "010", "011", "100", "101", "110", "111" };

        for (int i = 0; i < o.length(); i++) {
            for (int j = 0; j < 8; j++) {
                if (o[i] == oct[j]) {
                 ans += bin[j];
                }
            }
        }

        cout << "The result of converting the number " << o << " from base 8 to base 2 is: " << ans << endl;
    }

    else {
        cout << o << " is an invalid octal input" << endl;
    }
}



// Octal to Decimal
void OctToDec(string o) {
    if (IsOctal(o) == true) {

        int ans = 0;

        char oct[8] = { '0', '1', '2', '3', '4', '5', '6', '7' };

        for (int i = 0; i < o.length(); i++) {

            for (int j = 0; j < 8; j++) {

                if (o[i] == oct[j]) {
                    ans += j * pow(8, (o.length() - 1)-i);
                }

            }
        }
        cout << "The result of converting the number " << o << " from base 8 to base 10 is: " << ans << endl;
    }

    else {
        cout << o << " is an invalid octal input" << endl;
    }
}




// Octal to Hexadecimal
void OctToHex(string o) {
    if(IsOctal(o) == true) {

        string ans1;
        char oct[8] = { '0', '1', '2', '3', '4', '5', '6', '7' };
        string bin[8] = { "000", "001", "010", "011", "100", "101", "110", "111" };

        for (int i = 0; i < o.length(); i++) {
            for (int j = 0; j < 8; j++) {
                if (o[i] == oct[j]) {
                    ans1 += bin[j];
                }
            }
        }

        string ans2;

        if (ans1.length() % 4 != 0 && (ans1[0] == '0' && ans1[1] == '0')) {
            while (ans1.length() % 4 != 0) {
                ans1.insert(0, " ");
            }
        }
        
        else if(ans1[0] == '1' || ans1[1] == '1' ){
            while (ans1.length() % 4 != 0) {
                ans1.insert(0, "0");
            }
        }

        char Hex[16] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        string Bin[16] = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };

        for (int i = 0; i < ans1.length(); i = i + 4) {

            string sub = ans1.substr(i, (i + 4) - i);
            for (int j = 0; j < 16; j++) {
                if (sub == Bin[j]) {
                    ans2 += Hex[j];
                }
            }
        }

        cout << "The result of converting the number " << o << " from base 8 to base 16 is: " << ans2 << endl;
    }

    else {
        cout << o << " is an invalid octal input" << endl;
    }
}













// Checks if the input is a valid decimal value
bool IsDecimal(string d) {
    bool dec = true;
    for(int i = 0; i < d.length(); i++){
        if(d[i] != '0' && d[i] != '1' && d[i] != '2' && d[i] != '3' && d[i] != '4' && 
           d[i] != '5' && d[i] != '6' && d[i] != '7' && d[i] != '8' && d[i] != '9') {
            dec = false;
        }
    }
    return dec;
}




// Decimal to Binary
void DecToBin(string d) {
   
    if (IsDecimal(d) == true) {
        int x = stoi(d);
        string ans;
        for (int i = 0; x > 0; i++) {

            if (x % 2 == 1) {
                ans += '1';

            }

            else if (x % 2 == 0) {
                ans += '0';

            }

            x = x / 2;
        }

        reverse(ans.begin(), ans.end());

        cout << "The result of converting the number " << d << " from base 10 to base 2 is: " << ans << endl;

    }
    
    else if (IsBinary(d) == false) {
        cout << d << " is an invalid decimal input" << endl;
    }
}


// Decimal to Octal
void DecToOct(string d) {
    if (IsDecimal(d) == true) {
        int x = stoi(d);
        string ans;
        for (int i = 0; x > 0; i++) {

            if (x % 2 == 1) {
                ans += '1';

            }

            else if (x % 2 == 0) {
                ans += '0';

            }

            x = x / 2;
        }

        reverse(ans.begin(), ans.end());

        int sum = 0;

        for (int i = 0; i < ans.length(); i++) {
            if (ans[i] == '1') {

                sum = sum + pow(2, ((ans.length() - 1) - i));
            }
        }
        cout << "The result of converting the number " << d << " from base 10 to base 8 is: " << sum << endl;

    }

    else {
        cout << d << " is an invalid decimal input" << endl;
    }
}


// Decimal to Hexadecimal
void DecToHex(string d) {
    if (IsDecimal(d) == true) {
        string ans;
        int x = stoi(d);
        for (int i = 0; x > 0; i++) {

            if (x % 2 == 1) {
                ans += '1';

            }

            else if (x % 2 == 0) {
                ans += '0';

            }

            x = x / 2;
        }

        reverse(ans.begin(), ans.end());

        string ans2;

        while (ans.length() % 4 != 0) {
            ans.insert(0, "0");
        }

        char Hex[16] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        string Bin[16] = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };

        for (int i = 0; i < ans.length(); i = i + 4) {

            string sub = ans.substr(i, (i + 4) - i);
            for (int j = 0; j < 16; j++) {
                if (sub == Bin[j]) {
                    ans2 += Hex[j];
                }
            }
        }
        cout << "The result of converting the number " << d << " from base 10 to base 16 is: " << ans2 << endl;
    }

    else {
        cout << d << " is an invalid decimal input" << endl;
    }
}







// Checks if the input is a valid hexadecimal
bool IsHexa(string h) {
    bool hex = true;
    for (int i = 0; i < h.length(); i++) {
        if (h[i] != '0' && h[i] != '1' && h[i] != '2' && h[i] != '3' && 
            h[i] != '4' && h[i] != '5' && h[i] != '6' && h[i] != '7' && 
            h[i] != '8' && h[i] != '9' && h[i] != 'A' && h[i] != 'B' && 
            h[i] != 'C' && h[i] != 'D' && h[i] != 'E' && h[i] != 'F') {
            hex = false;
        }
    }
    return hex;
}



//Hexadecimal to Binary
void HexToBin(string h) {
    if (IsHexa(h) == true) {

        string ans;
        char Hex[16] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        string Bin[16] = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };

        for (int i = 0; i < h.length(); i++) {

            for (int j = 0; j < 16; j++) {
                if (h[i] == Hex[j]) {
                    ans += Bin[j];
                }
            }
        }

        cout << "The result of converting the number " << h << " from base 16 to base 2 is: " << ans << endl;
    }

    else {
        cout << h << " is an invalid hexadecimal input" << endl;
    }
}


// Hexadecimal to Octal
void HexToOct(string h) {
    if (IsHexa(h) == true) {

        //converts to binary first
        string ans;
        char Hex[16] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        string Bin[16] = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };

        for (int i = 0; i < h.length(); i++) {

            for (int j = 0; j < 16; j++) {
                if (h[i] == Hex[j]) {
                    ans += Bin[j];
                }
            }
        }



        while (ans.length() % 3 != 0) {
            ans.insert(0, "0");
        }



        string ans2;
        for (int i = 0; i < ans.length(); i = i + 3) {
            int tot = 0;
            string sub = ans.substr(i, (i + 3) - i);

            for (int j = 0; j < sub.length(); j++) {
                if (sub[j] == '1') {
                    tot += pow(2, (3 - j - 1));
                }
            }
            ans2 += to_string(tot);
        }

        cout << "The result of converting the number " << h << " from base 16 to base 8 is: " << ans2 << endl;


    }

    else {
        cout << h << " is an invalid hexadecimal input" << endl;
    }
}



// Hexadecimal to Decimal
void HexToDec(string h) {
    if (IsHexa(h) == true) {


        int result = 0;
        char Hex[16] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        int Dec[16] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 ,15 };
        for (int i = 0; i < h.length(); i++) {

            for (int j = 0; j < 16; j++) {
                if (h[i] == Hex[j]) {
                    result += Dec[j];
                }
            }

           
        }
        cout << "The result of converting the number " << h << " from base 16 to base 10 is: " << result << endl;

    }

    else {
        cout << h << " is an invalid hexadecimal input" << endl;
    }
}
