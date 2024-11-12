package com.example.tugas.models

import androidx.annotation.DrawableRes
import com.example.tugas.R

data class CarItem(
    val name: String,
    @DrawableRes val imageRes: Int,
    val description: String,
    val specifications: String
)

val carList = listOf(
    CarItem(
        name = "Toyota Supra",
        imageRes = R.drawable.supra,
        description = "Toyota telah menerima cukup banyak kritik karena berkolaborasi dengan BMW untuk menghasilkan Supra generasi terbaru. Model ini berbagi sebagian besar mur dan baut dengan Z4 terbaru, dan jika ini adalah harga yang harus dibayar untuk melihat moniker kembali setelah hampir dua dekade absen, maka itu sepadan.\n" +
                "\n" +
                "Mengutip autoevolution, Supra generasi kelima ini mulai diproduksi pada kuartal pertama 2019, dan dihidupkan di pabrik Magna Steyr di Graz, Austria, seperti sepupu Jermannya.",
        specifications = """
            • Engine: 2.5L Inline-4
            • Horsepower: 203 hp
            • Top Speed: 180 km/h
            • 0-60 mph: 8.1 seconds
            • Fuel Economy: 30 MPG
        """.trimIndent()
    ),
    CarItem(
        name = "Honda",
        imageRes = R.drawable.honda,
        description = "Dalam hal ini, pemilik kendaraan sedan Civic Turbo ini melakukan perubahan pada bagian eksterior yang memang menjadi pusat perhatiannya. Mulai dari bodykit, penambahan serat karbon pada beberapa bagian. Pada sektor kaki-kaki seperti pelek, suspensi, dan Big Brake Kit (BBK) juga diubah untuk memaksimalkan keamanan berkendara. Tak lupa juga dilakukan Remap ECU untuk meningkatkan performa kendaraan.Kalau body kit itu saya custom sendiri, suspensi pake Airsus AirBFT, Exhaust pake ORD, BBK pake HSR. Sedangkan untuk kaki-kaki seperti pelek tentu pake HSR Forged yang dicustom menyesuaikan keinginan dan juga bentuk dari mobil,kata Hendra."
                ,
        specifications = """
            • Engine: 2.0L Turbocharged Inline-4
            • Horsepower: 252 hp
            • Top Speed: 200 km/h
            • 0-60 mph: 6.5 seconds
            • Fuel Economy: 34 MPG
        """.trimIndent()
    ),
    CarItem(
        name = "BMW",
        imageRes = R.drawable.bmw,
        description = "Berkat sentuhan iND Distribution, penampilan BMW M4 dibuat lebih ganteng dan agresif lewat pasokan body kit M Performance. Mulai dari aplikasi lips spoiler depan, side skirts, air vent di fender depan, serta diffuser belakang yang dibuat agresif. Seluruh body kit tersebut terbuat dari bahan serat karbon, sehingga kontras saat bersanding dengan warna putih bodi.",
        specifications = """
            • Engine: 3.0L Turbocharged Inline-6
            • Horsepower: 382 hp
            • Top Speed: 250 km/h
            • 0-60 mph: 4.4 seconds
            • Fuel Economy: 26 MPG
        """.trimIndent()
    ),
    CarItem(
        name = "Audi",
        imageRes = R.drawable.audi,
        description = "Sama seperti R8 GT RWD, ABT XGT juga menyalurkan tenaga V10 secara eksklusif ke roda belakang. Tenaganya lebih besar karena mesin 5.2 FSI telah menghasilkan tenaga 630 hp sedangkan Audi hanya 612 hp. Memanfaatkan serat karbon secara berlebihan telah berhasil menurunkan bobotnya menjadi 3.086 pon (1.400 kilogram). Itu lebih ringan 375 lbs (170 kg) dibandingkan R8 GT RWD.",
        specifications = """
            • Engine: 3.0L V6 TFSI
            • Horsepower: 335 hp
            • Top Speed: 240 km/h
            • 0-60 mph: 5.0 seconds
            • Fuel Economy: 28 MPG
        """.trimIndent()
    ),
    CarItem(
        name = "Mercedes",
        imageRes = R.drawable.merce,
        description = " barang terbaru hari ini, segar dari der Lower Rhine, dari IMSA GmbH. Mobil yang halus ini dulunya adalah Mercedes-AMG GT S biasa, yang memuntahkan tenaga standar sekitar 515bhp dan 650 Nm. Sejak awal GT S standar sendiri adalah gabungan perangkat yang sangat hidup, dan bukan mobil yang menginginkan lebih banyak tenaga, kecuali dia sebuah GT C atau GT R yang telah diupgrade, dimana juga memiliki bentuk buritan yang lebar dan punya rear-wheel steering untuk menjinakkan emosinya.",
        specifications = """
            • Engine: 3.0L Inline-6 Turbo
            • Horsepower: 362 hp
            • Top Speed: 250 km/h
            • 0-60 mph: 5.2 seconds
            • Fuel Economy: 27 MPG
        """.trimIndent()
    ),
    CarItem(
        name = "Chevrolet",
        imageRes = R.drawable.cama,
        description = "Chevrolet Camaro merupakan salah satu mobil Amerika dengan tampilan yang berotot.\n" +
                "Meski demikian, ada saja yang mengubahnya menjadi tampil lebih kandas dan gambot pakai wide body kit. Salah satu contohnya Chevrolet Camaro SS berkelir hitam ini yang tampilannya menjadi bercita rasa Jepang. Mulai dari depan terlihat spoliler lebar terpasang di bumper depan dikombinasikan dengan aksen merah. Aksen merah ini juga disematkan pada area lampu depan sehingga sorotan matanya terlihat makin tajam.Geser ke samping terpasang over fender bolt-on yang membuatnya jadi gambot dan makin terasa Jepang-nya\n",
        specifications = """
            • Engine: 6.2L V8
            • Horsepower: 455 hp
            • Top Speed: 295 km/h
            • 0-60 mph: 4.0 seconds
            • Fuel Economy: 20 MPG
        """.trimIndent()
    ),
    CarItem(
        name = "Ford Mustang",
        imageRes = R.drawable.ford,
        description = "Ford dikenal dengan model-model tangguh dan performa mesin yang bertenaga.",
        specifications = """
            • Engine: 5.0L V8
            • Horsepower: 450 hp
            • Top Speed: 250 km/h
            • 0-60 mph: 4.3 seconds
            • Fuel Economy: 24 MPG
        """.trimIndent()
    ),
    CarItem(
        name = "Nissan Gtr",
        imageRes = R.drawable.gtr,
        description = "Nissan GTR-35 yang dibuat tahun 2012 ini dinobatkan sebagai Top Secret Cleareance, oleh situs superstreetonline.com Pasalnya modifkasi mesinnya berhasil menghasilkan tenaga yang diluar dugaan, 1600 whp sebagai titik pencapaian yang cukup fenomenal. Nissan GTR-35 ini dimiliki oleh Heng Thammarat, seorang kolektor mobil di Bangkok, Thailand. Atas koleksinya, garasinya yang mewah dan berkualitas serta cukup mewakili kiprah legenda JDM. Bagaimana tidak, selain GTR-35, koleksi Skyline miliknya boleh dibilang paling lengkap, dari R30,R31,R32,R33,R34 dan R35. Tak hanya modifikasi, Heng juga berusaha untuk mengembalikan ke gaya pabrikan",
        specifications = """
            • Engine: 3.8L V6 Twin-Turbo
            • Horsepower: 565 hp
            • Top Speed: 315 km/h
            • 0-60 mph: 2.9 seconds
            • Fuel Economy: 22 MPG
        """.trimIndent()
    ),
    CarItem(
        name = "Tesla s",
        imageRes = R.drawable.tesla,
        description = "Tesla Model S modif satu ini bukan dikerjakan oleh tuning spesialis modifikasi Tesla yakni T-Sportline.\n" +
                "Mobil ini tampil baru dan terlihat eye catching buah garapan Office-K. Office-K merupakan Bengkel modifikasi spesialis body wrapping ini membuat sedan listrik ini jadi kinclong banget. Saking kinclongnya, sampai dibuat efek cermin seperti dilansir dari laman carscops.com. Metode yang digunakan yakni body wrapping dengan warna yang mencolok. Bukan cuma itu, Tesla ini juga dilengkapi dengan body kit lansiran Artisan Spirit, Jepang."
                ,
        specifications = """
            • Engine: Dual Motor Electric
            • Horsepower: 670 hp
            • Top Speed: 250 km/h
            • 0-60 mph: 3.1 seconds
            • Range: 405 miles
        """.trimIndent()
    ),
    CarItem(
        name = "American Muscle",
        imageRes = R.drawable.muscle,
        description = "American Muscle Car dikenal dengan tenaga mesinnya. " +
                "Selain itu modelnya yang dianggap klasik juga " +
                "membawa kesan tersendiri, beda dari mobil Jepang " +
                "yang sudah futuristik. Sebut saja Chevrolet Camaro SS, " +
                "Ford Mustang, atau Dodge Challenger yang bermesin V8, terbayang sudah gimana ganasnya di aspal. Nah, di antara semua muscle car ada juga yang diproduksi dalam jumlah terbatas yang membuatnya punya harga melejit"
                ,
        specifications = """
            • Engine: 1.6L Turbo Inline-4
            • Horsepower: 201 hp
            • Top Speed: 210 km/h
            • 0-60 mph: 7.0 seconds
            • Fuel Economy: 32 MPG
        """.trimIndent()
    )
)

