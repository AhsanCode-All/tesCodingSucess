console.log('Ahsan Nurfauzi');
console.log('Marinah Tri Puspa');
console.log('aku ngorok')

const hpAyang = "infinix note 30";
let namsAyangmmm = "Marnooo";
const usia = 19;
// variabel const dan let untuk menetapkan sebuah unsur
console.log(hpAyang);
console.log(namsAyangmmm);
console.log(usia)

// untuk menggabungkan bbrp console log ada 2 cara
console.log(`Hai namaku ${namsAyangmmm} dan usiaku ${usia} tahun. hpku sekarang adalah ${hpAyang}`);
console.log('Hai namaku', namsAyangmmm, 'dan usiaku', usia, 'tahun. hpku sekarang adalah', hpAyang);

const nickNameGua = "Acaaannn";
const hobiGua = "Tidur";
const laptopYangGuaPunya = "Advan";
const mottoAcan = "Air tenang menghanyutkan";
// function untuk membungkus banyak variabel agar lebih simpel
function perkenalanAcan(){
    if (laptopYangGuaPunya == "Advan") {
        console.log('Kamu orang pintar menyeleksi laptop murah gacor')
    }else {
        console.log('kamu orang bodoh')
    };
    // if ketika memenuhi syarat, else ketika tidak
    console.log(`Halo semua namaku ${nickNameGua} dan hobiku adalah ${hobiGua} . Saya disini sudah membeli laptop ${laptopYangGuaPunya} . Mottoku berkuliah disini adalah ${mottoAcan}`);
};

perkenalanAcan();

const nilaimath = document.getElementById('nilaimatematika')
console.log(nilaimath)

let nilaiUas = 93

function nilai() {
    let nilaimuuu;
    if (nilaiUas >= 95 && nilaiUas <= 100) {
        nilaimuuu = "A, nilai perfect"
    } else if (nilaiUas >= 85 && nilaiUas < 95) {
        nilaimuuu = "B, nilai bagus"
    } else if (nilaiUas >= 75 && nilaiUas < 85) {
        nilaimuuu = "C, nilai yang cukup"
    } else {
        nilaimuuu = "D, TIDAK LULUS"
    }
    return nilaimath.innerHTML = nilaimuuu
}
nilai()
// gunakan return akan lebih mudah

