<?php
    // \n baris baru di terminal, <br> di browser
    echo "ingin tidur wkwk \n";
    $ultimateYuzhong = "Black dragon form";
    $umurYuzhong = 1000;
    echo "nama ultimate hero gua : " .$ultimateYuzhong ."<br>";
    echo "umur Yuzhong sendiri sudah " .$umurYuzhong ." tahun <br><br>";

    // kita coba percabangan (if else dan switch)
    $uangGua = 325000;
    $guaKaya = "uang gua banyak";
    $guaSederhana = "uang gua pas pasan brooo";
    $guaMiskin = "gua miskin";

    echo "kondisi gua saat ini : ";
    if ($uangGua > 500000) {
        echo $guaKaya;
    } else if ($uangGua = 500000) {
        echo $guaSederhana;
    } else {
        echo $guaMiskin;
    }

    switch ($uangGua) {
        case 200000 :
            echo "<br>" .$guaMiskin;
            break;
        
        case 500000 :
            echo "<br>" .$guaSederhana;
            break;

        case 700000 :
            echo "<br>" .$guaKaya;
            break;
            
        default :
            echo "<br>" ."uang anda mungkin tidak di angka 200, 500, 700";
            break;
    }

    // percabangan ternary operator
    $uangSaya = $uangGua <= 500000 ? $guaMiskin : $guaKaya;
    echo "<br>" .$uangSaya;
    echo "<br /> <br/>";

    // perulangan / looping sama saja
    echo "LOOPING / PERULANGAN <br/>";
    $panjangTali = 0;
    $maksPanjang = 10;
    for ($panjangTali; $panjangTali <= $maksPanjang; $panjangTali++){
        echo "ini tali panjangnya " .$panjangTali ." cm";
        echo "<br />";
    }
    echo "<br/><br/>";

    // Array
    echo "ARRAY DALAM PHP <br/>";
    $heroFighter = ["Aldous", "Leomord", "Yu Zhong", "Khaleed", "Jawhead"];
    echo $heroFighter[3];
    echo "<br/>";
    echo $heroFighter[0];
    echo "<br/>";
    for ($hero = 0; $hero < 5; $hero++){
        echo "ini array untuk hero : " .$heroFighter[$hero];
        echo "<br/>";
    }