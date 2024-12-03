#include <iostream>
#include <iomanip>


int main () {
    std::string nama = "Ahsan Nurfauzi";
    int umur = 19;
    float tinggi = 175.55;
    double berat = 62.2;

    std::cout << "halo teman teman, namaku " << nama << " senang bertemu kalian." << std::endl;
    std::cout << "saya sekarang sudah berumur " << umur << std::endl;
    std::cout << "untuk tinggi saya sendiri yaitu " << tinggi << std::endl;
    std::cout << "serta berat saya itu " << std::fixed << std::setprecision(5) << berat << std::endl; 
}