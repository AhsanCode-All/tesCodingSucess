const operasi = document.getElementById("display");

function munculkanLayar(input){
    operasi.value += input;
}

function hasil(input){
    try {
        operasi.value = eval(operasi.value);
    } catch(error) {
        operasi.value = "Error";
    }
}

function bersihkanLayar(input){
    operasi.value = "";
}